/*
'*****************************************************************
'20121011   hwkim   처음 작성 시작
'20170314   hwkim   backurl 추가
'*****************************************************************
*/


    var backurl =""  ;
    
    // 직접 로그아웃 했을 경우, 자동로그인 기능 해제
	//----------------------------------------------------------------
	// Cookie  초기화
	//----------------------------------------------------------------
	// id  , pw , autologin   쿠키삭제
    /*'Response.Cookies("62userid").domain = "62life.com"
    'Response.Cookies("62userid").Secure = True
    'Response.Cookies("62passwd").domain = "62life.com"
    'Response.Cookies("62passwd").Secure = True
    'Response.Cookies("62autologin").domain = "62life.com"
    'Response.Cookies("62autologin").Secure = True

    Response.Cookies("62passwd") = ""
    Response.Cookies("62passwd").Expires = Date-1
    Response.Cookies("62autologin") = ""
    Response.Cookies("62autologin").Expires = Date-1
	*/

	//----------------------------------------------------------------
	// 회원 로그아웃 정보 저장 -  db처리 :  logininfo
	//----------------------------------------------------------------




	//----------------------------------------------------------------
	// 장바구니 유지를 위해 현재 적용하지 않음-  db처리 :  shopping_basket
	//----------------------------------------------------------------



	//----------------------------------------------------------------
	// 세션 삭제
	//----------------------------------------------------------------
	/*
		.Contents.Remove("memcd")
	    .Contents.Remove("memid62")
	    .Contents.Remove("memname62")
	    .Contents.Remove("nickname62")
	    .Contents.Remove("memlevel62")
	    .Contents.Remove("jobname62")
	    .Contents.Remove("MemId")
	    .Contents.Remove("MemLevel")
	    .Contents.Remove("MemName")
	*/

	//----------------------------------------------------------------
	// 변수 초기화
	//----------------------------------------------------------------
	/*strLoginMemCd = ""
	strLoginMemId = ""
	strLoginMemName = ""
	strLoginMemNickName = ""
	strLoginMemLevel = ""
	strLoginMemJobName = ""
	IsAdmin = ""
	MemId = ""
	MemLevel = ""
	MemName = ""
	*/

	//----------------------------------------------------------------
	// 세션 모두초기화
	//----------------------------------------------------------------


	//----------------------------------------------------------------
	// root 로 이동 or  이전페이지
	//----------------------------------------------------------------
