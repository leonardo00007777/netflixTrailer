function getCartOrderType(gdcd, strOdtype) {
    var G_RIGHTAWAY_DATE_FROM = "2020-10-06";
    var G_RIGHTAWAY_DATE_TO = "2020-10-07";
    var now = new Date();
    var dateDiff1 = Math.ceil((new Date(G_RIGHTAWAY_DATE_FROM).getTime() - now.getDate())/(1000*3600*24));
    var dateDiff2 = Math.ceil((new Date(G_RIGHTAWAY_DATE_TO).getTime() - now.getDate())/(1000*3600*24));
    var datex = now.getFullYear() + "-" + ("0"+ (now.getMonth() + 1)).slice(-2) + "-" + ("0"+ (now.getDate() + 1)).slice(-2);
    var nowDate = now.getFullYear() + "/" + ("0" + (now.getMonth() + 1)).slice(2) + "/" + ("0" + (now.getDate() + 1)).slice(2);

    isRightAwayEnableDay(datex);

    var goodsOdType;
    var goodsTheDayYn;

    $.ajax({
        url : "/main/getCartOrderType"
        , data : {"gdcd" : gdcd}
        , success : function (data){
            goodsOdType = data.odgubun;
            goodsTheDayYn = data.thedaysyn;
            if(goodsOdType == '11' && strOdtype=='02'){
                if(goodsTheDayYn == 'Y') {
                    // ' 당일발송 상품 주문가능 시간인 경우
                    // ' 1)화~금
                    // ' 2)아침 7시 당일발송 도입으로 13시 당일발송은 07시~13시까지만 판매
                    var now = new Date();
                    var weekd = now.getDay();

                    if(weekd > 2 && weekd <= 6 && !(0 <= dateDiff1 && dateDiff2 <= 0)){
                        if(isRightAwayEnableDay(datex)) {
                            var today3s = nowDate;
                            var deadline = " " + "13:00:00";
                            var baseTime = today3s + deadline;
                            var hourDiff = Math.ceil(new Date(baseTime).getTime() - now.getHours()) / (1000 * 60 * 60 *24);
                            if(hourDiff >= -5 && hourDiff <0){
                                goodsOdType = '02';
                            }
                        }
                    }
                } else {
                    goodsOdType = '02';
                }
            }
        }
    });
    return goodsOdType;
}

function isRightAwayEnableDay(datex){
    var enableDay;
    $.ajax({
        url : "/main/isRightAwayEnableDay"
        , data : {"datex" : datex}
        , success : function (data){
            enableDay = data;
        }
    });
    return enableDay;
}

function radiationTestInfo(testidx) {
    $.ajax({
          url : "/main/radiationTestInfo"
        , data : {"testidx" : testidx}
        , success : function (data) {
             console.log('radiationTestInfo', data);
        }
    });
}

function textAreaCheck(text){
    var txtLength = text.value.length;
    if(text.value.length > text.maxLength){
        text.value = text.value.slice(0, text.maxLength);
        txtLength = text.value.length;
    }
    $('#textLength').html(txtLength + '자');
}

function reviewInsert(){
    var reviewText = $('#reviewText').val();
    console.log("111111111111111", reviewText);
    $.ajax({
          url : "/main/reviewInsert"
        , data : {"reviewText" : reviewText}
        , type: 'POST'
        , dataType: 'text'
    });
}

function countDownTimer(dt, id, nextDlvDt) {
    var end = new Date(dt);
    var _second = 1000;
    var _minute = _second * 60;
    var _hour = _minute * 60;
    var _day = _hour * 24;
    var timer;

    function showRemaining() {
        var now = new Date();
        var distance = end - now;
        if (distance < 0) {
            clearInterval(timer);
            //$('#'+id).html('종료되었습니다. 새로고침하세요.');
            countDownTimer(dt, 'spanDeliveryTime');
            $('#spanDeliveryDate').html(nextDlvDt);
            return;
        }
        var days = Math.floor(distance / _day);
        var hours = Math.floor((distance % _day) / _hour);
        var minutes = Math.floor((distance % _hour) / _minute);
        var seconds = Math.floor((distance % _minute) / _second);

        var strRemainTime = "";
        strRemainTime += days + '일 ';
        strRemainTime += hours + '시간 ';
        strRemainTime += minutes + '분 '
        strRemainTime += seconds + '초'
        $('#'+id).html(strRemainTime);
        $('#'+id).html(strRemainTime);
    }

    timer = setInterval(showRemaining, 1000);
}

function shareFaceBook() {
    var thisUrl = '62life.com';
    var url = "http://www.facebook.com/sharer/sharer.php?u="+encodeURIComponent(thisUrl);
    window.open(url, "", "width=486, height=286");
}

function changeTest(gdName, gdCd, price, salePrice){
    console.log('gdName:::',gdName, 'gdCd:::', gdCd, 'price:::', price, 'salePrice:::', salePrice);
}
