$(function (){

})

function cartToastMsg(checkDiv){
    if(checkDiv == 'newPrdList' || checkDiv == 'newProd'){
        $('.toast').toast('hide');
        $('#newPrdListToastAutoClose').toast('show');
    } else if(checkDiv == 'dcPrdList' || checkDiv == 'dcProd'){
        $('.toast').toast('hide');
        $('#dcPrdListToastAutoClose').toast('show');
    } else if(checkDiv == 'dtlPrdList') {
        $('.toast').toast('hide');
        $('#dtlPrdToastAutoClose').toast('show');
    }
}

function cartCheckBox(checkDiv){
    var checkv = 'check_' + checkDiv;
    $('#' + checkv).prop('checked', true);
}