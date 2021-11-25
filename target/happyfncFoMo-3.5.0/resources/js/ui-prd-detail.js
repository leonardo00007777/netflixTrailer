/**
 * 상품상세 UI Scripts
 */
$(function() {
  // Product Detail Body Swiper
  if($("#prdDetailSwiper").length) {
    initPrdDetailSwiper();
  }
  // Product Detail Tab Sticky
  if($("#prdDetailTabContainer").length) {
    addStickyPrdDetailTab();
  }
  //포토리뷰상세 팝업 스와이퍼
  if($("#modalPhotoReview").length) {
    initPhotoRiviewSwiper();
  }
  //QnA 토글
	$(".qna-item").each(function() {
		var $qnaItem = $(this);
		var $btn = $(this).find(".btn-toggle");
		$btn.on("click", function(e) {
			e.preventDefault();
			$qnaItem.toggleClass("open");
		});
	});
  //레시피 스와이퍼
  initSwiperPdpRecipe();
});

/* 구매하기 */
function showBuyOption() {
	$("#modalBuyOption").modal('show');
}
function closeBuyOption() {
	$("#modalBuyOption").modal('hide');
}


/* 상품 상세 탭 */
var prdDetailSwiper;

function addStickyPrdDetailTab() {
  new Waypoint.Sticky({
    element: $("#prdDetailTabContainer"),
    stuckClass: 'sticky',
    offset: 50,
    wrapper: false,
  });
}

function initPrdDetailSwiper() {
  prdDetailSwiper = new Swiper("#prdDetailSwiper", {
    autoHeight: true,
    resistanceRatio: 0,
    on: {
      slideChange: function(sw) {
        pdpBodyOn(sw.realIndex);
      }
    },
  });
  prdDetailSwiper.isBeginning = true;
}
function pdpBodyOn(index) {
		pdpTabOn(index);
		pdpContentOn(index);
		setTimeout(pdpScrollToTab, 100);
}
function pdpScrollToTab() {
	var y = Math.floor($(".section-prd-detail-tab").offset().top);
	var body = $("html, body");
	body.scrollTop(y - 50);
}
function pdpTabOn(index) {
	var tab = $("#pdpTab");
	tab.find(".tab-item").each(function(i) {
		if(i == index) {
			$(this).addClass("active");
		} else {
			$(this).removeClass("active");
		}
	});
}
function pdpContentOn(index) {
	prdDetailSwiper.slideTo(index, 0);
}

/* 상품기술서 더보기 버튼 */
function clickPrdViewMore() {
	$("#pdpDetailView").each(function() {
		$(this).parent().toggleClass("open");
		prdDetailSwiper.updateAutoHeight();
	});
}

/* 레시피 스와이퍼 */
function initSwiperPdpRecipe() {
	var swiperSelector = ".swiper-pdp-recipe";
	var mySwiperOptions = $.extend({}, swiperOptionDotSub);
	mySwiperOptions.noSwiping = false;
	mySwiperOptions.resistanceRatio = 0;
	new Swiper(swiperSelector, mySwiperOptions);
}

/**
 * 상픔 구매후기
 */
/* 포토후기 팝업 스와이퍼 */
function initPhotoRiviewSwiper() {
  $('#modalPhotoReview').on('show.bs.modal', function (e) {
    setTimeout(initSwiper, 100);
    function initSwiper() {
      var index = $('#modalPhotoReview').find('input[name="photoRivewIndex"]').val();
      new Swiper("#photoReviewSwiper", {
        navigation: {
          nextEl: '.swiper-nav-next',
          prevEl: '.swiper-nav-prev',
        },
        pagination: {
          el: '.swiper-nav-fraction',
          type: 'fraction',
        },
        initialSlide: index,
      });
    }
  });
}
/* 포토후기 팝업 열기 */
function showPhotoReviewDetail(index) {
	$('#modalPhotoReview').on('show.bs.modal', function(e) {
			$(e.currentTarget).find('input[name="photoRivewIndex"]').val(index);
	});
	$('#modalPhotoReview').modal('show');
}