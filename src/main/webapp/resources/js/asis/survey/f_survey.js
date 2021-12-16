
    $(document).ready(function() {

        $( document ).bind( 'mobileinit', function(){
          $.mobile.loader.prototype.options.text = "loading";
          $.mobile.loader.prototype.options.textVisible = false;
          $.mobile.loader.prototype.options.theme = "a";
          $.mobile.loader.prototype.options.html = "";
        });

        $("#btnStartSurvey").bind( "click", function(event, ui) {

            if($("#argee1").is(":checked")!=true) {
                alert("정보제공 내용에 동의하셔야 설문을 작성할 수 있습니다!");
                $("#argee1").focus();
                return false;
            } else {
                //다음페이지로
                $.mobile.changePage( "#pagesurveylist", { transition: "slidefade" }, false, true );
                //location.href = "f_survey02.asp";
            }
            
        });
        
        $("#userid").bind( "focus", function(event, ui) {
            this.select();
        });
        
        $("#btnCheckId").bind( "click", function(event, ui) {
            
            //자연이랑 아이디 존재여부 체크
            var strUrl = "/m/getuserid.asp?userid=";
            strUrl += $("#userid").val();
           
            $.ajax({
                url: strUrl,
                contentType: "application/json; charset=utf-8",
                dataType: 'json',
                success: function(data) {
                    if(data.error) {
                        $("#errormsg").html("<span style='color:red;'>자연이랑에 가입된 아이이디가 없습니다!</span>");
                    } else {
                        $("#userid").val(data.userid);
                        $("#usercd").val(data.usercd);
                        if($("#usercd").val()=="") {
                            $("#errormsg").html("<span style='color:red;'>입력하신 아이디가 없습니다!</span>");
                        } else {
                            $("#errormsg").html("<span style='color:red;'>아이디를 찾았습니다!</span>");                            
                        }
                    }                  
                },
                error: function() {
                    $("#userid").val("");
                    $("#usercd").val("");
                }
            });

        });
        
        
        $("#btnSubmitSurvey").bind( "click", function(event, ui) {

            if($("input[name=radio0]:checked").size()==0) {
                alert("연령대를 선택하세요!");
                $("#radio0_3").focus();
                return false;
            }
            if($("input[name=radio1]:checked").size()==0) {
                alert("소유 나이프 수량을 선택하세요!");
                $("#radio1_1").focus();
                return false;
            }
            if($("input[name=radio2]:checked").size()==0) {
                alert("주요 구입처를 선택하세요!");
                $("#radio2_6").focus();
                return false;
            }
            if($("input[name=radio2]:checked").val()=="6" && $("#text2_6").val()=="") {
                alert("기타 내용을 입력하세요!");
                $("#text2_6").focus();
                return false;
            }
            if($("input[name=radio3]:checked").size()==0) {
                alert("구입시 중요한 기준을 선택하세요!");
                $("#radio3_1").focus();
                return false;
            }
            if($("input[name=radio3]:checked").val()=="6" && $("#text3_6").val()=="") {
                alert("기타 내용을 입력하세요!");
                $("#text3_6").focus();
                return false;
            }
            if($("input[name=radio4]:checked").size()==0) {
                alert("날갈이 횟수를 선택하세요!");
                $("#radio4_1").focus();
                return false;
            }
            if($("input[name=radio5]:checked").size()==0) {
                alert("누가 칼날을 가는지 선택하세요!");
                $("#radio5_1").focus();
                return false;
            }
            if($("input[name=radio5]:checked").val()=="6" && $("#text5_6").val()=="") {
                alert("기타 내용을 입력하세요!");
                $("#text5_6").focus();
                return false;
            }
            if($("input[name=radio6]:checked").size()==0) {
                alert("칼을 갈때 느낌을 선택하세요!");
                $("#radio6_1").focus();
                return false;
            }
            if($("input[name=radio7]:checked").size()==0) {
                alert("휘슬러 나이프 제품을 알고 계시는지를 선택하세요!");
                $("#radio7_2").focus();
                return false;
            }
            if($("input[name=radio8]:checked").size()==0) {
                alert("신상품 구매여부를 선택하세요!");
                $("#radio8_2").focus();
                return false;
            }
            if($("input[name=radio9]:checked").size()==0) {
                alert("가격대비 구매여부를 선택하세요!");
                $("#radio9_2").focus();
                return false;
            }
            if($("#text10_1").val()=="") {
                alert("나이프 대표 브랜드를 써 주세요!");
                $("#text10_1").focus();
                return false;
            }
            if($("#text11_1").val()=="") {
                alert("기존 나이프 사용 시 불편하신 점을 답해주세요!");
                $("#text11_1").focus();
                return false;
            }
            if($("#userid").val()=="") {
                alert("경품 배송에 필요한 정확한 자연이랑 아이디를 입력 후, 확인하세요!");
                $("#userid").focus();                
                return false;
            }
            if($("#usercd").val()=="") {
                alert("먼저 자연이랑 아이디를 조회하세요!");
                $("#btnCheckId").focus();                
                return false;
            }

            //설문제출
            //$.mobile.changePage( "f_survey02.asp", { transition: "slidefade" }, true, false );
            if(confirm("모든 설문내용을 바르게 작성하셨고, 제출하시겠습니까?")) {
                $("#mainx").submit();
                /*
                $.mobile.changePage( "f_survey03.asp", {
                    type: "post",
                    data: $("form#mainx").serialize()
                }); 
                */ 
            }

        });
        
    });
