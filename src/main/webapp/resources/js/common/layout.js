$(function() {

  // header-select
  function CustomSelectBox(selector){
    this.$selectBox = null,
    this.$select = null,
    this.$list = null,
    this.$listLi = null;
    CustomSelectBox.prototype.init = function(selector){
        this.$selectBox = $(selector);
        this.$select = this.$selectBox.find('.select-box .select');
        this.$list = this.$selectBox.find('.select-box .select-list');
        this.$listLi = this.$list.children('li');
    }
    CustomSelectBox.prototype.initEvent = function(e){
        var that = this;
        this.$select.on('click', function(e){
            that.listOn();
        });
        this.$listLi.on('click', function(e){
            that.listSelect($(this));
        });
        $(document).on('click', function(e){
            that.listOff($(e.target));
        });
    }
    CustomSelectBox.prototype.listOn = function(){
        this.$selectBox.toggleClass('on');
        if(this.$selectBox.hasClass('on')){
            this.$list.css('display', 'block');
        }else{
            this.$list.css('display', 'none');
        };
    }
    CustomSelectBox.prototype.listSelect = function($target){
        $target.addClass('selected').siblings('li').removeClass('selected');
        this.$selectBox.removeClass('on');
        this.$select.text($target.text());
        this.$list.css('display', 'none');
    }
    CustomSelectBox.prototype.listOff = function($target){
        if(!$target.is(this.$select) && this.$selectBox.hasClass('on')){
            this.$selectBox.removeClass('on');
            this.$list.css('display', 'none');
        };
    }
    this.init(selector);
    this.initEvent();
  }
  var select = new CustomSelectBox('.select-wrap');


  // layout left 메뉴
  var w = $(window).width(),
    h = $(window).height();
  //$('section').width(w);
  // $('section').height(h);
  // $('menu .menu-container').height(h - 60);

  $('.hamb').click(function() {$('html').toggleClass('active');});
  $(window).resize(function() {
    var w = $(window).width(),
      h = $(window).height();
    //$('section').width(w);
    $('section').height(h);
    // $('menu .menu-container').height(h - 60);
  });


  // header swipe menu
  $(".swiper-menu").each(function() {
		new Swiper(".swiper-menu", {
      slidesPerView: 'auto',
			freeMode: true,
			watchOverflow: true,
		});
	});
  $(".swiper-menu .swiper-slide a").click(function(){
    $(this).parent().addClass('on').siblings().removeClass('on');
  });


  // header swipe tab
  $(".swiper-menu-tab").each(function() {
		new Swiper(".swiper-menu-tab", {
      slidesPerView: 'auto',
			freeMode: true,
			watchOverflow: true,
		});
	});
  $(".swiper-menu-tab .swiper-slide a:first-child").click(function(){
    $(this).parent().addClass('on').siblings().removeClass('on');
  });
  // 닫기버튼
  $(".swiper-menu-tab-close").click(function(){
    $(this).parent().remove();
  });

  // left swipe menu
  var _tabList = $( ".tab_list" );
  var _tabTarget = _tabList.children( "li" );
  var swipeMenu = new Swiper(".swiper-tab", {
    allowTouchMove: false,
  });
  _tabTarget.on( "click", function( $e ){
    var itemIndex = $( this ).index();
    swipeMenu.slideTo( itemIndex); //index값으로 slideto에 넘김
  });
  $('.tab_list li').click(function() {
    $(this).addClass('on').siblings().removeClass('on');
  });


  // left menu slide
  $('.menu-slide li.active').addClass('open').children('ul').show();
  	$('.menu-slide li.has-sub>a').on('click', function(){
  		$(this).removeAttr('href');
  		var element = $(this).parent('li');
  		if (element.hasClass('open')) {
  			element.removeClass('open');
  			element.find('li').removeClass('open');
  			element.find('ul').slideUp(200);
  		}
  		else {
  			element.addClass('open');
  			element.children('ul').slideDown(200);
  			element.siblings('li').children('ul').slideUp(200);
  			element.siblings('li').removeClass('open');
  			element.siblings('li').find('li').removeClass('open');
  			element.siblings('li').find('ul').slideUp(200);
  		}
  	});

    // bookmark
    $('.bookmark').click(function() {
      $(this).toggleClass('on');
      $('.pop-bookmark').fadeIn(200).delay(1000).fadeOut(200);
    });

});


$(document).ready(function(){
  var fileTarget = $('.file-box .upload-hidden');

  fileTarget.on('change', function(){
    if(window.FileReader){
      var filename = $(this)[0].files[0].name;
    }
    else {
      var filename = $(this).val().split('/').pop().split('\\').pop();
    }

    $(this).siblings('.upload-name').val(filename);
  });
});

/* tab - new스타일*/
$(function() {
  $('.tab-basic .tab-list-wrap .tab-list1').click(function() {
    var activeTab = $(this).attr('data-tab');
    $(this).parents().children('.tab-list1').removeClass('tab-active');
    $(this).parents().next('.tab-container').children('.tab-content').removeClass('tab-active');
    $(this).addClass('tab-active');
    $('#' + activeTab).addClass('tab-active');
  })
});



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


// /* header tab */
// $(document).ready(function() {
//   var tabs = $("#container-1").tabs();
//     var tabCounter = 1;
//
//     $('.add_tab').click( function(){
//       var ul = tabs.find( "ul.header-tabList" );
//       var current_idx = ul.find("li").length + 1;
//       $("<li class='swiper-slide'><a href='#fragment" + current_idx + "'>Call Details</a><a class='swiper-menu-tab-close' id='tabli" + current_idx + "' href='javascript:void(0)'>닫기</a></li>" ).appendTo( ul );
//       tabs.append("<div id='fragment" + current_idx + "' class='ui-tabs-active'><div class='content'>new tab " + current_idx + "</div></div>" );
//       tabs.tabs("refresh");
//   });
//  tabs.on( "click", ".swiper-menu-tab-close", function() {
//     var id= $( this ).attr("id");
//     $( this ).closest( "li" ).remove();
//
//     id=id.replace("tabli", "fragment");
//     $("#" + id).remove();
//       tabs.tabs( "refresh" );
//   });
// });
