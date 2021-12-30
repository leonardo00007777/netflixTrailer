<% @Language="vbscript" codepage = "65001" %>
<%
'*******************************************************
'프로젝트: 자연이랑 모바일 웹
'프로그램: 로그인 화면
'-------------------------------------------------------
'20130311 hwkim    처음작성
'20140507 hwkim    user_agent 추가 / 로그인 시
'20150217 hwkim    로그인 시 카트 정리 추가 freeze 정보
'20150423 hwkim    무한루프 방지 처리
'20151019 sykim    휴직상태시 안내페이지 이동기능 추가.
'20160909 sykim    휴직자도 로그인을 가능하게 변경, 단, 지원금과 급여공제는 금지.
'20170308 hwkim    shopping_basket 운영방식으로 변경
'20180719 hwkim    자동로그인 정보 암호화(AES256) 적용
'20190104 hwkim    자동로그인 시 fcm 파라미터 유지 처리 강화 적용.
'20190916 sykim    로그인시 SHA함수 변경(dbo.UBHASHFunc 대신 HASHBYTES('SHA2_256'.. 함수 사용).
'20201202 chhyeon  장바구니 7일 보존에서 2달로 변경
'*******************************************************
%>
<%
    Response.Charset="utf-8"
%>
<!--#include virtual = "/m/include/ssl.asp"-->
<!--#include virtual = "/m/db/dbconn_m.asp"-->
<!--#include virtual = "/include/lib.utils.asp"-->
<!--#include virtual = "/include/lib.date.asp"-->
<!--#include virtual = "/m/cvariable.asp"-->
<!--#include virtual = "/include/enc_AES.asp"-->
<!--#include virtual = "/include/lib.database.asp"-->
<%
    fcm = Trim(Request("fcm")&"")
    usec = Request("usec")&""
    strLoginResult = Trim(Request("loginresult")&"")
    backurl = clearXSS(Trim(Request("backurl")&""),"")
    If backurl = "" Then backurl = "/m/mainm.asp?fcm="&fcm
    strUserId = sqlFilterLogin(Replace(Trim(Request("loginuserid")&""),"'","''"))
    strPassword = sqlFilter(Trim(Request("loginpassword")&""))
    autologin = sqlFilter(Trim(Request("autologin")&""))
    
    refererx = Trim(Request("refererx")&"")
    
    enc_userid = ""
    enc_password = ""
    
    'Response.Cookies("62userid").domain = "62life.com"
    'Response.Cookies("62userid").Secure = True
    'Response.Cookies("62passwd").domain = "62life.com"
    'Response.Cookies("62passwd").Secure = True
    'Response.Cookies("62autologin").domain = "62life.com"
    'Response.Cookies("62autologin").Secure = True

    If usec = "y" And Request.Cookies("62autologin") = "Y" Then
        'strUserId = Trim(Request.Cookies("62userid"))
        'strPassword = Trim(Request.Cookies("62passwd"))
        
        if Len(strPassword) > 30 then
            strUserId = AESDecrypt(strUserId, ENC_KEY_NAME)
            strPassword = AESDecrypt(strPassword, ENC_KEY_NAME)
        else
            Response.Cookies("62autologin") = ""
        end if
        
        '만약 쿠키에 저장된 로그인 정보가 없다면, 자동로그인 기능을 해제한다. (무한루프 방지)
        If strUserId = "" Or strPassword = "" Then
            Response.Cookies("62autologin") = ""
        End If
    End If

    If strUserId = "" Or strPassword = "" Then
%>
<!DOCTYPE html>
<html lang="ko">
<head>
</head>
<body>
<script type="text/javascript">

    document.location.href = "loginm.asp?backurl=<%=backurl%>";

</script>
</body>
</html>
<%
        Response.End
    End If

    Sql =       "SELECT a.memcd, a.memid, a.memname, a.memstcd "
    'Sql = Sql & "     , CASE WHEN mempw_hash = dbo.UBHASHFunc('SHA256','" & strPassword & "') Then 'Y' ELSE 'N' END passyn "
    Sql = Sql & "     , CASE WHEN mempw_hash = CONVERT(VARCHAR(1000),HASHBYTES('SHA2_256','" & strPassword & "'),2) Then 'Y' ELSE 'N' END passyn "
    Sql = Sql & "     , b.nickn,b.idurl,ISNULL(b.memlevel,'0') memlevel, b.jobtype "
    Sql = Sql & "     , b.jobname, CASE WHEN ISNULL(b.isblogger,'')='' THEN 'N' ELSE 'Y' END isblogger "
    Sql = Sql & "     , ISNULL(c.islocked,0) islocked, ISNULL(login_failed_count,0) login_failed_count "
    Sql = Sql & "  FROM mb_master a "
    Sql = Sql & "       LEFT JOIN memberprofile b ON a.memid = b.memid "
    Sql = Sql & "       LEFT JOIN logininfo c ON a.memcd = c.memcd "
    Sql = Sql & " WHERE a.memstcd NOT IN ('" & MEMST_OUT & "') "
    Sql = Sql & "   AND a.memid = '" & strUserId & "' "

    objRS.Open Sql, objCon

    If Not objRS.EOF Then
        strRSMEMCD = Trim(objRS("memcd")&"")
        strRsPassYn = Trim(objRS("passyn")&"")
        strRSMEMID = objRS("memid")&""
        strRSMEMNAME = objRS("memname")&""
        strMEMstcd = Trim(objRS("memstcd")&"") ' 회원가입상태
        strRSNickn = objRS("nickn")&""
        strRSIdUrl = objRS("idurl")&""
        strRSMemLevel = objRS("memlevel")
        strRSJobType = objRS("jobtype")&""
        strRSJobName = objRS("jobname")&""
        strRSIsblogger = objRS("isblogger")
        strRSIslocked = objRS("islocked") '잠김여부
        strRSLogin_failed_count = objRS("login_failed_count")
    Else
%>
<!DOCTYPE html>
<html lang="ko">
<head>
<title>자연이랑모바일 - 로그인</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>
<body>
<form name="mainx" action="/m/loginm.asp" method="post">
 <input type="hidden" name="loginresult" value="FAIL" />
 <input type="hidden" id="backurl" name="backurl" value="<%=backurl%>" />
</form>
<script type="text/javascript">
    document.mainx.submit();
</script>
</body>
</html>
<%
        objRS.Close
        Response.End
    End If
    objRS.Close

    '[승급요청] 중인 고객의 경우, 접근보류, 안내페이지로 이동함.
    If strMEMstcd = MEMST_UPREQ Then
%>
<!DOCTYPE html>
<html lang="ko">
<head>
<title>자연이랑모바일 - 로그인</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>
<body>
<script type="text/javascript">

    document.location.href="/m/loginholdm.asp?mode=UPREQ";
</script>
</body>
</html>
<%
        Response.End
    End If

    '[소속사휴직] 중인 고객의 경우, 접근보류, 안내페이지로 이동함.
    'If strMEMstcd = MEMST_LAYOFF Then

'<!DOCTYPE html>
'<html lang="ko">
'<head>
'<title>자연이랑모바일 - 로그인</title>
'<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
'</head>
'<body>
'<script type="text/javascript">
'    document.location.href="/m/loginholdm.asp?mode=LAYOFF";
'</script>
'</body>
'</html>
'
    '    Response.End
    'End If

    '계정이 잠겨있다면,
    If strRSIslocked = 1 Then
%>
<!DOCTYPE html>
<html lang="ko">
<head>
<title>자연이랑모바일 - 로그인</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>
<body>
<form name="mainx" action="/m/loginm.asp" method="post">
 <input type="hidden" name="loginresult" id="loginresult" value="LOCK" />
 <input type="hidden" id="backurl" name="backurl" value="<%=backurl%>" />
</form>
<script type="text/javascript">
    document.mainx.submit();
</script>
</body>
</html>
<%
        Response.End
    End If

    If strRsPassYn = "N" Then
        '비밀번호 입력 실패 횟수 저장 -----------
        If strRSIslocked <> 1 And strRSLogin_failed_count < FAILED_LOGIN_LIMIT-1 Then
            lockAccount = 0
        Else
            lockAccount = 1
        End If

        Sql =       "UPDATE logininfo "
        Sql = Sql & "   SET login_failed_count = ISNULL(login_failed_count,0) + 1 "
        Sql = Sql & "     , islocked = '" & lockAccount & "' "
        Sql = Sql & " WHERE memcd = '" & strRSMEMCD & "' "
        objCon.Execute Sql, rCount
%>
<!DOCTYPE html>
<html lang="ko">
<head>
<title>자연이랑모바일 - 로그인</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>
<body>
<form name="mainx" action="/m/loginm.asp" method="post">
 <input type="hidden" name="loginresult" id="loginresult" value="FAIL" />
 <input type="hidden" id="backurl" name="backurl" value="<%=backurl%>" />
</form>
<script type="text/javascript">
    document.mainx.submit();
</script>
</body>
</html>
<%
        Response.End
    End If

    '현재기준으로 20분 이내의 장바구니 상품을 남기고 나머지는 삭제.
    'Sql =       "DELETE FROM od_cart "
    'Sql = Sql & " WHERE memcd = '" & strRSMEMCD & "' "
    'Sql = Sql & "   AND DATEDIFF(SECOND,indt,GETDATE()) > 1200 "
    'objCon.Execute Sql

    '장바구니 정리
    '1) 담은지 7일이 넘었거나 판매중지인 상품 정리
    '2) 담은 예약주문 중, 현재 판매하지 않는 상품 정리
    '3) 잠겨 있는 장바구니 상품을 해제

    rCount = 0
    
    Sql =       "DELETE FROM od_cart "
    Sql = Sql & " WHERE memcd = '" & strRSMEMCD & "' "
    objCon.Execute Sql
    Sql =       "DELETE FROM shopping_basket "
    Sql = Sql & " WHERE memcd = '" & strRSMEMCD & "' "
    Sql = Sql & "   AND od_gubun <> '12' "
    Sql = Sql & "   AND gdcd IN (SELECT c.gdcd "
    Sql = Sql & "                  FROM shopping_basket c "
    Sql = Sql & "                       JOIN gd_master g ON g.gdcd = c.gdcd "
    Sql = Sql & "                 WHERE memcd = '" & strRSMEMCD & "' "
    Sql = Sql & "                   AND (DATEDIFF(m,c.indt,GETDATE()) > 2 OR g.useyn = 'N') ) "
    objCon.Execute Sql,rCount,1
    Sql =       "DELETE FROM shopping_basket "
    Sql = Sql & " WHERE memcd = '" & strRSMEMCD & "' "
    Sql = Sql & "   AND od_gubun = '12' "
    Sql = Sql & "   AND gdcd NOT IN ( SELECT gdcd FROM od_reservegoods "
    Sql = Sql & "                      WHERE DATEDIFF(d,od_from,GETDATE()) >= 0 "
    Sql = Sql & "                        AND DATEDIFF(d,GETDATE(),od_to) >= 0 "
    Sql = Sql & "                        AND useyn = 'Y' ) "
    objCon.Execute Sql,rCount,1
    Sql =       "UPDATE shopping_basket SET freeze = '0' "
    Sql = Sql & " WHERE memcd = '" & strRSMEMCD & "' AND freeze = '1' "
    objCon.Execute Sql,rCount,1


    Session("memcd") = strRSMEMCD
    Session("memid62") = strRSMEMID
    Session("memname62") = strRSMEMNAME
    If strRSNickn = "" Then
        Session("nickname62") = strRSMEMNAME
    Else
        Session("nickname62") = strRSNickn
    End If
    Session("memlevel62") = strRSMemLevel
    Session("jobtype62") = strRSJobType
    Session("jobname62") = strRSJobName
    Session("groupname") = strRSMEMGROUPNAME

    '회원 로그인 정보 저장, 로그인 실패 정보 초기화 ------------------
    Sql =       "UPDATE logininfo "
    Sql = Sql & "   SET last_login = GETDATE() "
    Sql = Sql & "     , islogin = 1 "
    Sql = Sql & "     , login_count = login_count + 1 "
    Sql = Sql & "     , login_failed_count = 0 "
    Sql = Sql & "     , islocked = 0 "
    Sql = Sql & " WHERE memcd = '" & strRSMEMCD & "' "

    objCon.Execute Sql, rCount

    If rCount < 1 Then
        Sql =       "INSERT INTO logininfo(memcd, last_login, last_logout, islogin, login_count, login_failed_count, islocked) "
        Sql = Sql & "VALUES('" & strRSMEMCD & "', GETDATE(), '', 1, 1, 0, 0) "
        objCon.Execute Sql
    End If

    '로그인 History 테이블 저장 ---------------------
    ipx = request.ServerVariables("REMOTE_ADDR")
    user_agent = Trim(Request.ServerVariables("HTTP_USER_AGENT"))
    If Len(user_agent) > 199 Then user_agent = Left(user_agent,199)

    Sql =       "INSERT INTO logininfo2(memcd, ipx, refererx, device, user_agent) "
    Sql = Sql & "VALUES ('"& strRSMEMCD &"', '"& ipx &"', '"& refererx &"','M', '"& user_agent & "') "
    objCon.Execute Sql
    '-----------------------------------------
    
    '외부 연계접속(T-walk)이 있을 경우 연동정보 등록 ----------------
        if Session("twalk_pid") <> "" then
            pid = Session("twalk_pid")
            rCount = 0
            Sql = "SELECT COUNT(1) RCNT FROM TWALK_MEMBER WHERE tw_memcd='"& strRSMEMCD &"' AND tw_pid='"& pid & "' "
            objRS.Open Sql, objCon
            If Not objRS.EOF Then
                rCount = objRS("RCNT")
            End if
            objRS.Close
            
            if rCount = 0 then
                Sql =       "INSERT INTO TWALK_MEMBER(tw_memcd, tw_pid, tw_indt) "
                Sql = Sql & "VALUES ('"& strRSMEMCD &"', '"& pid &"', getdate()) "
                objCon.Execute Sql
            end if
        end if

    '로그인 자동 포인트 부여 처리 시작 ===========================
    accpoint_count = 0
    rs_points = 0
    rs_memo = ""
    query =         "SELECT TOP 1 idx, ISNULL(points,0) points, memo "
    query = query & "  FROM book_accpoint "
    query = query & " WHERE used = 'N' "
    query = query & "   AND memcd = '"& strRSMEMCD &"' "
    query = query & "   AND ISNULL(apydt,getdate()) >= CONVERT(VARCHAR,GETDATE(),23) "
    query = query & " ORDER BY apydt DESC "
    objRS.Open query, objCon
    If Not objRS.EOF Then
        Do Until objRS.EOF
            rs_idx = objRS("idx")
            rs_points = objRS("points")
            rs_memo = Trim(objRS("memo")&"")
            accpoint_count = accpoint_count + 1
            objRS.MoveNext
        Loop
    Else

    End If
    objRS.Close

    rCount = 0
    If accpoint_count > 0 And rs_points > 0 Then
        '포인트 권한적립
        'rCount = setAccPointTrans(strRSMEMCD, "80", rs_memo, rs_points, "")
        rCount = depositAccPointTrans(strRSMEMCD, rs_points, "80", rs_memo, "2099-12-31", "", "E")
        If rCount > 0 Then
            query =         "UPDATE book_accpoint "
            query = query & "   SET used = 'Y', usedt = getdate() "
            query = query & " WHERE idx = "& rs_idx
            objCon.Execute query
        End If

    End If
    '로그인 자동 포인트 부여 처리 종료 ========================

%>
<!DOCTYPE html>
<html lang="ko">
<head>
<title>자연이랑모바일 - 로그인 처리</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<script src="/m/js/mainm.js"></script>
</head>
<body>
<script type="text/javascript">

    //정보 교환용 로그인 정보 저장
    setCookie("memcd", "<%=strRSMEMCD%>", 365);
    localStorage.setItem("memcd", "<%=strRSMEMCD%>");
    
    <% '자동로그인 정보 저장 처리
    if autologin = "on" and strUserId <> "" and strPassword <> "" then 
        enc_userid = AESEncrypt(strUserId, ENC_KEY_NAME)
        enc_password = AESEncrypt(strPassword, ENC_KEY_NAME) %>
    setCookie("62userid", '<%=enc_userid%>', 365);
    setCookie("62passwd", '<%=enc_password%>', 365);
    setCookie("62autologin", "Y", 365);
    <% end if %>

    <% If backurl = "" Then %>
    document.location.href="http://m.62life.com/m/mainm.asp?usec=y";
    <% Else %>
    document.location.href = unescape('<%=backurl%>');
    <% End If %>

</script>

</body>
</html>