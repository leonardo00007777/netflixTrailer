<% @Language="vbscript" codepage = "65001" %>
<%
'*******************************************************
'프로젝트: 자연이랑 모바일 웹
'프로그램: 로그인 화면
'-------------------------------------------------------
'20130311   hwkim   처음작성
'20161122   hwkim   리뉴얼
'20180719   hwkim   자동로그인 쿠키정보 암호화 처리에 따른 프로세스 변경
'20190516   hwkim   T건강걷기 안내 하단 배너 표시 루틴 추가.
'*******************************************************

    Response.Charset="utf-8"
%>
<!--#include virtual = "/m/include/ssl.asp"-->
<!--#include virtual = "/m/db/dbconn_m.asp"-->
<!--#include virtual = "/include/lib.utils.asp"-->
<!--#include virtual = "/include/lib.date.asp"-->
<!--#include virtual = "/m/cvariable.asp"-->
<!--#include virtual = "/include/enc_AES.asp"-->
<%

    Dim programTitle: programTitle = "로그인"
    Dim programTitleBar: programTitleBar = "로그인"
    Dim headerIconHide : headerIconHide = "Y"
    Dim headerFlag : headerFlag = "Y"

    strLoginResult = Trim(Request("loginresult")&"")
    backurl = clearXSS(Trim(Request("backurl")&""),"")

    refererx = Left(Trim(request.ServerVariables("HTTP_REFERER")),40)

    'Response.Cookies("62userid").domain = "62life.com"
    'Response.Cookies("62userid").Secure = True
    'Response.Cookies("62passwd").domain = "62life.com"
    'Response.Cookies("62passwd").Secure = True
    'Response.Cookies("62autologin").domain = "62life.com"
    'Response.Cookies("62autologin").Secure = True

    '쿠키를 읽어 자동로그인 처리한다
    If strLoginResult = "" And Request.Cookies("62autologin") = "Y" Then
        Response.Redirect "loginm1.asp?usec=y&backurl="&backurl
    End If

    strUserId = Trim(Request.Cookies("62userid"))

    if Len(strUserId) > 30 then
        strUserId = AESDecrypt(strUserId, ENC_KEY_NAME)
    end if

    httpCookie = Request.ServerVariables("HTTP_COOKIE")
    httpCookieArray = Split(httpCookie,";")
    For i=0 To Ubound(httpCookieArray) Step 1
        paramArrays = Split(httpCookieArray(i),"=")
        paramName = paramArrays(0)
        paramValue = paramArrays(1)
        If InStr(paramName,"ASPSESSIONID") > 0 Then
            aspSessionName = paramName
            'aspSessionValue = paramValue
            Response.AddHeader "Set-Cookie", aspSessionName & "=; path=/; expires=Thu, 01-Jan-1970 00:00:00 UTC;"
        End If
    Next
%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta http-equiv="Content-Type" content="text/html;charset=utf-8" />
<meta name="viewport" content="user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, width=device-width, height=device-height" />
<title><%=programTitle%></title>
<link rel="shortcut icon" type="image/x-icon" href="/m/images/icons/favicon.ico" />
<link rel="apple-touch-icon-precomposed" href="/m/images/icons/apple-touch-icon.png" />
<link rel="stylesheet" type="text/css" href="/m/css/mainm.css?v=1.1.0" />
<link rel="stylesheet" type="text/css" href="/m/css/swiper.css" />
<link rel="stylesheet" type="text/css" href="/m/css/m_common_ci.css?v=1.1.0" /> 
<script src="/m/js/jquery-2.1.1.min.js"></script>
<script src="/m/js/mainm.js"></script>
<script src="/m/js/jquery-scrolltofixed-min.js" type="text/javascript"></script>
<script src="/m/js/swiper.min.js"></script>
<script type="text/javascript" src="https://appleid.cdn-apple.com/appleauth/static/jsapi/appleid/1/en_US/appleid.auth.js"></script>
<script>
//<![CDATA[

    $(document).ready(function() {

        var userid = getCookie("62userid");

        // 가져온 쿠키값이 있으면
        if(userid != "") {
            //document.getElementById("loginuserid").value = userid;
            //document.getElementById("saveuserid").checked = true;
            document.getElementById("loginpassword").focus();
        } else {
            document.getElementById("loginuserid").focus();
        }

		//이벤트 등록
		$("#loginpassword").keypress(function(e){
			if(e.keyCode === 13){
				loginSubmit();
				//e.preventDefault();
			}
		});
        
    });

    // 로그인 아이디 저장
    function confirmSave(cbx) {
        var isRemember;

        // 로그인 아이디를 저장한다고 선택할 경우
        if(cbx.checked) {
            isRemember = confirm("이 기기에 로그인 정보를 저장하시겠습니까? \n여럿이 사용하는 기기에서는 개인정보가 유출될 수 있으니 주의하세요.");

            if(!isRemember) {
                cbx.checked = false;
            }
        }
    }

    function loginSubmit() {

        var lform = document.getElementById("loginForm");

        if(lform.loginuserid.value=="" || lform.loginuserid.value=="아이디") {
            alert("아이디를 입력하세요.");
            lform.loginuserid.focus();
            return false;
        } else if (lform.loginpassword.value=="") {
            alert("비밀번호를 입력하세요.");
            lform.loginpassword.focus();
            return false;
        } else {
            /* 자동로그인 체크되었을 경우,
            if(lform.autologin.checked==true) {
                saveAllLogin($('#loginuserid').val(),$('#loginpassword').val());
            } else {
                setCookie("62passwd", "", -1);
            }
            */
            lform.loginuserid.readOnly = true;
            lform.loginpassword.readOnly = true;

            //lform.action = "https://"+location.host+"/m/loginm1.asp";
            lform.action = "/m/loginm1.asp";
            lform.submit();
        }
    }

    // 쿠키에 로그인 정보 저장
    function saveLogin(userid) {

        if(userid != "") {
            // 쿠키에 값을 365일간 저장
            setCookie("m62userid", userid, 365);
        } else {
            // userid 쿠키 삭제
            setCookie("m62userid", userid, -1);
        }
    }

    // 쿠키에 로그인 정보 저장
    function saveAllLogin(userid,passwd) {
        if(userid != "" && passwd != "") {
            // 쿠키에 값을 2주일간 저장
            setCookie("m62userid", userid, 365);
            setCookie("m62passwd", passwd, 365);
            setCookie("62autologin", "Y", 365);
        }
    }

    //키보드 한글자판을 보이고 숨기기
    function toggleShowKeyBoard() {
        $('#divKeyboard').animate({opacity:'toggle',left:'+=50',height:'toggle'},500,function() {
            if($('#divKeyboard').is(":visible")) {
                $('#showKeyboard').text("한글자판감추기");
            } else {
                $('#showKeyboard').text("한글자판보기");
            }

        });
    }

//]]>
</script>
</head>
<body>
<!--#include virtual="/m/headerm.asp"-->
<div class="gwrapper">
    <ul class="login-box new bg-white">
        <li class="content10 align-center">
            <form id="loginForm" name="loginForm" method="post" autocomplete="off">
            <input type="hidden" name="backurl" id="backurl" value="<%=backurl%>" />
            <input type="hidden" name="refererx" id="refererx" value="<%=refererx%>" />
            <div id="loginBox">
                <!--<div id="divKeyboard">
                    <img src="/m/images/menu/kbscreenshot.png" />
                </div>
                <div id="divKeyboardShow">
                    <a href="javascript:toggleShowKeyBoard();"><span id="showKeyboard">한글자판보기</span></a>
                </div> -->
                <div id="loginArea">
                    <div class="login-title">
                      <p>환영합니다!</p>
                      <span>자연이랑에서 다양한 서비스와 혜택을 누려보세요.</span>
                    </div>
                    <p class="user-id">
                        <input type="text" id="loginuserid" name="loginuserid" maxlength="12" value="<%=strUserId%>" tabindex="2" title="아이디 입력" placeholder="아이디" autocomplete="off" />
                        <a href="javascript:void(0);" id="did" onmousedown="clearKeyValue('loginuserid', 'did')">아이디 지우기</a>
                    </p>
                    <p class="user-pw">
                        <input type="password" name="loginpassword_fake" id="loginpassword_fake" autocomplete="off" style="display:none;" />
                        <input type="password" name="loginpassword" id="loginpassword" maxlength="30" value="" title="비밀번호 입력" tabindex="3" autocomplete="off" placeholder="비밀번호" />
                        <a href="javascript:void(0);" id="dpw" onmousedown="clearKeyValue('loginpassword', 'dpw')">비밀번호 지우기</a>
                    </p>
                    <div class="divNullBottom5"></div>
                    <p class="user-btn">
                        <!--<input type="checkbox" name="saveuserid" id="saveuserid" tabindex="4" onclick="return saveId();"  title="아이디 저장" /> <label id="idsave" for="saveuserid" onclick="confirmSave(this)"><span></span>아이디저장</label>
                        &nbsp;-->
                        &nbsp;&nbsp;&nbsp;<input type="checkbox" name="autologin" id="autologin" tabindex="5" title="자동 로그인" checked="checked" /> <label id="saveidpw" for="autologin"><span></span>자동 로그인</label>
                        <a href="javascript:void(0);" id="loginBtn" tabindex="5" title="로그인"><span>로그인 </span></a>
                    </p>
                </div>
                    <p class="user-msg">
                        <% If strLoginResult = "FAIL" Then %>
                        ⓘ 로그인 정보가 정확하지 않습니다!
                        <% ElseIf strLoginResult = "LOCK" Then %>
                        ⓘ 계정이 잠겨있습니다!
                        <% End If %>
                    </p>
                    <div id="memberlink" class="align-center">
                        <a href="/m/member/search_id_m.asp" class="text-medium color-gray">아이디 찾기</a>
                        &nbsp;
                        <span class="color-lightgrey">|</span>
                        &nbsp;
                        <a href="/m/member/search_pwd_m.asp" class="text-medium color-gray">비밀번호 찾기</a>
                    </div>
                    <div class="divNullBottom30"></div>
                <div id="noticeArea">
                    <div class="divNullBottom30"></div>
                    <div id="div-sns-login" class="align-center">
                        <table align="center" border="0" cellpadding="5">
                        <tr>
                            <td colspan="3">
                                <section class="login_social">
                                <h3>SNS 간편로그인</h3>
                                <ul class="login_social_list" data-log-actionid-label="social_login">
                                    <li>
                                        <button type="button" class="sns_naver" onclick="wnSnsAuth.doNaverLogin('login');">네이버 로그인</button>
                                    </li>
                                    <li>
                                        <button type="button" class="sns_facebook" onclick="javascript:window.location='/m/member/utility/mi_loginFB_m.asp';">페이스북 로그인</button>
                                    </li>
                                    <li>
                                        <button type="button" class="sns_apple" onclick="signInApple();">애플 로그인</button>
                                    </li>
                                </ul>
                                </section>
                            </td>
                        </tr>
                        </table>
                    </div>
                    <div class="divNullBottom30"></div>
                </div>
                <div class="sign-up">
                  <span>자연이랑이 처음이세요?</span>
                  <div class="divNullBottom5"></div>
                  <!--a href="/m/member/jm_intro_m.asp" class="text-medium color-gray">회원가입</a-->
                  <input class="flatBtnWhiteLt" type="button" value="회원가입" onclick="javascript:location.href='/m/member/jm_intro_m.asp'">
                </div>
            </div>
            </form>

            <div class="divNullBottom30"></div>
        </li>
    </ul>
</div>

<!--#include virtual="/m/footerm.asp"-->

<% if Session("twalk_pid") <> "" and Request.Cookies("welcome-twalk") <> "yes" Then %>
<div id="welcome-twalk-banner">
  <div id="div-innder">
  <img id="btnclose4web" src="/m/images/icons/close_4web_128_br.png" alt="X" onclick="hideWelcomeTwalkBanner();">
  <table width="100%" border="0" cellpadding="0" cellspacing="0">
    <tr>
      <td valign="middle">
        <span class="inner-text">최초 한번만 로그인하고 이용하세요!<br />
        휴대폰인증이나, SNS계정으로 쉽고 빠르게 가입하고 이용하실 수 있어요.
        </span>
      </td>
    </tr>
  </table>
  </div>
  <script>
  function hideWelcomeTwalkBanner() {
      setCookie('welcome-twalk', 'yes' , 1);
      $('#welcome-twalk-banner').css('display', 'none');
  }
  </script>
</div>
<% End If %>

<script src="/js/naveridlogin_js_sdk_2.0.0.js"></script>
<script src="/js/wn_snsauth-1.1.0.js"></script>
<script>
//<![CDATA[
	$(function() {
	    addEvent(document.getElementById('loginuserid'), 'focus', function() { checkKeyValue('loginuserid', 'did'); });
		addEvent(document.getElementById('loginuserid'), 'keyup', function() { checkKeyValue('loginuserid', 'did'); });
		addEvent(document.getElementById('loginpassword'), 'focus', function() { checkKeyValue('loginpassword', 'dpw'); if(this.value.length==0) this.value=""; });
		addEvent(document.getElementById('loginpassword'), 'keyup', function() { checkKeyValue('loginpassword', 'dpw'); });
		addEvent(document.getElementById('loginBtn'), 'click', function() { loginSubmit(); });
        /*
		if($('#saveuserid').is(':checked')) {
		    $('#loginpassword').focus();
	    } else {
            $('#loginuserid').focus();
    	}
        */
		checkKeyValue('loginuserid', 'did');
		checkKeyValue('loginpassword', 'dpw');
	});
    
    /* Appleid sign-in */
    initApple();
    //Listen for authorization success
    document.addEventListener('AppleIDSignInOnSuccess', appleidLoginSuccess);
    //Listen for authorization failures
    document.addEventListener('AppleIDSignInOnFailure', appleidLoginFailure);
    
//]]>
</script>
</body>
</html>
