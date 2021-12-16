/*팝업*/

$(document).ready(function(){
  var modals = document.getElementsByClassName("modal");
  var btns = document.getElementsByClassName("popup-btn");
  var spanes = document.getElementsByClassName("btn-close");
  var cncls = document.getElementsByClassName("close");
  var funcs = [];

  function Modal(event, num) {
    return function() {
      btns[num].onclick =  function() {
          modals[num].style.display = "block";
          console.log(num);
      };
      spanes[num].onclick = function() {
          modals[num].style.display = "none";
      };
      cncls[num].onclick = function() {
          modals[num].style.display = "none";
      };
      modals[num].onclick = function(event) {
        if (event.target === modals[num]) {
          modals[num].style.display = "none";
        }
      };
    };
  };
  for(var i = 0; i < btns.length; i++) {
    funcs[i] = Modal(event, i);
  }
  for(var j = 0; j < btns.length; j++) {
    funcs[j]();
  }
});


// search-autocomplete
$(function () {
  $('.header-search input').click(function(){
    $('.search-autocomplete').addClass('on');
    return false;
  });
  $(document).click(function(e){
    if(e.target.className =="search-autocomplete"){return false}
    $('.search-autocomplete').removeClass('on')
  });
})

// header-modal
$(function () {
  $('.header-modal-content .header-btn-close').click(function(){
    $(this).parents().parents('.header-modal-content').css('display','none');
  });
})