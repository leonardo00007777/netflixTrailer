/**
 * 검색 화면 UI
 */
$(function () {
  initSearchTabConSwiper();
  searchTabSticky();
});

var searchTabConSwiper;

function initSearchTabConSwiper() {
  searchTabConSwiper = new Swiper("#searchTabConSwiper", {
    autoHeight: true,
    resistanceRatio: 0,
    on: {
      slideChange: function (sw) {
        searchTabOn(sw.realIndex);
      }
    },
  });
  searchTabConSwiper.isBeginning = true;
}

function searchOn(indexNum) {
  searchTabOn(indexNum);
  searchTabConOn(indexNum);
}

function searchTabOn(indexNum) {
  var $tab = $("#searchTab");
  $tab.find(".nav-link").each(function (i) {
    if (i == indexNum) {
      $(this).addClass("active");
    } else {
      $(this).removeClass("active");
    }
  });
}

function searchTabConOn(indexNum) {
  searchTabConSwiper.slideTo(indexNum, 0);
}

function searchTabSticky() {
  var $tab = $("#fixedTabs");
  if($tab.length) {
    new Waypoint.Sticky({
      element: $tab,
      stuckClass: 'sticky',
      offset: 118,
    });
  }
}