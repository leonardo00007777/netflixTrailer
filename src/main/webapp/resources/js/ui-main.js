/**
 * 상품상세 UI Scripts
 */
$(function() {
  // Product Detail Body Swiper
  if($("#globalNavSwiper").length) {
    initglobalNavSwiper();
  }
  // Product Detail Tab Sticky
  if($("#globalNavContainer").length) {
    addStickyglobalNav();
  }
});


/* 글로벌 메인 슬라이드 */
var globalNavSwiper;

function addStickyglobalNav() {
  new Waypoint.Sticky({
    element: $("#globalNavContainer"),
    // stuckClass: 'sticky',
    // offset: 50,
    wrapper: false,
  });
}

function initglobalNavSwiper() {
  globalNavSwiper = new Swiper("#globalNavSwiper", {
    autoHeight: true,
    resistanceRatio: 0,
    on: {
      slideChange: function(sw) {
        mainBodyOn(sw.realIndex);
      }
    },
  });
  globalNavSwiper.isBeginning = true;
}
function mainBodyOn(index) {
		mainTabOn(index);
    mainContentOn(index);
}
function mainTabOn(index) {
	var tab = $("#mainTab");
	tab.find(".menu-item").each(function(i) {
		if(i == index) {
			$(this).addClass("active");
		} else {
			$(this).removeClass("active");
		}
	});
}
function mainContentOn(index) {
	globalNavSwiper.slideTo(index, 0);
}
