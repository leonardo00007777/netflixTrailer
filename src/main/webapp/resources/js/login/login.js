
$(function() {

/*    var userid = getCookie("62userid");

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
    */
	
	$("#_id").click(function(){
 	   
		//common.wlog("home_utilbar_review_toast_pop");
		//location.href=_baseUrl+"mypage/getGdasList.do";
		common.init(2);
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

function loginCheck() {
	
	alert("loginCheck().......");
	
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

