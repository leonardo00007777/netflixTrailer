$(function(){
    $(window).scroll(function() {
        if ($(this).scrollTop() > 100) {
            $('.scroll-top_wrap').css('display','block');
        } else {
            $('.scroll-top_wrap').css('display','none');
        }
    });

    $('.scroll-top.event img').click( function() {
        $('html, body').animate({
            scrollTop : 0
        },200);
        return false;
    });

    $('.divpop.event .popup_wrap .close_btn').click( function() {
        $('.divpop.event').css('display','none');
    });
})

function requestCommonEventProcess(url, json) {
    $.ajax({
        async: true,
        url: url,
        data: json,
        dataType: 'json',
        contentType: 'charset=utf-8',
        success: function(data) {
            $('.divpop.event .popup_wrap #divpopmessage').html(data.message);
            $('.divpop.event').css('display','block');

            if (data.result == 'success') {
            } else if (data.result == 'login') {
            } else if (data.result == 'block') {
            }
        },
        error: function(xhr, status, error) {
            $('.divpop.event .popup_wrap #divpopmessage').html('정보를 처리하지 못했습니다. 한번 더 시도하시고 계속 문제가 발생하면 1:1문의를 이용해 주세요.');
            $('.divpop.event').css('display','block');
        }
    });
}
