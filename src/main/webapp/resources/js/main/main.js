/**
 * 자연이랑 전역 스크립트
 */
var STICKY_POINT = 64; //header top area height
var QUICKMENU_POINT = 1000; //quickmenu trigger point
var SWIPER_SPEED = 600; //swiper speed

/* Detect Mobile */
var isMobile = navigator.userAgent.match(/(iPad)|(iPhone)|(iPod)|(android)|(webOS)/i);
if(!isMobile) {
	document.body.classList.add("dt");
} else {
	document.body.classList.add("mb");
}
/* Detect Footer */
// var hasFooter = (document.querySelector(".global-footer"))? true : false;
// if(!hasFooter) {
// 	document.body.classList.add("no-footer");
// }
/* Detect GNB */
var hasGnb = (document.querySelector(".global-header"))? true : false;
if(hasGnb) {
	document.body.classList.add("gnb");
}
/* Detect BNB */
var hasBnb = (document.querySelector(".global-bottom"))? true : false;
// if(hasBnb && !document.body.classList.contains('page-home')) {
if(hasBnb) {
	document.body.classList.add("has-bnb");
}
/* Detect Button Footer */
var hasBtnFooter = (document.querySelector(".button-footer"))? true : false;
if(hasBtnFooter) {
	document.body.classList.add("has-btn-footer");
}
/* Detect Fixed Button Footer */
var hasFixedBtnFooter = (document.querySelector(".button-footer-fixed"))? true : false;
if(hasFixedBtnFooter) {
	document.body.classList.add("has-fixed-btn-footer");
}

if(document.querySelectorAll('[data-aos="fade-up"]').length) {
	AOS.init();
}

/* jQuery Ready */
$(function() {
	/* Common */
	UI.TopCategryDropdown();
	UI.Selectbox(".selectbox");
	UI.CustomSelect(".custom-select");
	initGlobalHeader();
	initQuickMenu();
	
	/**
	 * Category Page
	 */
	/* PLP View 삭제 예정 */
	// if($("#prd-list").length) {
	// 	UI.ProductListView();
	// }
});//jQuery Ready

/**
 * 스크롤 고정 공통 세팅
 */
$(".scroll-fixed-top").each(function() {
	var target = $(this);
	new Waypoint.Sticky({
		element: target,
		stuckClass: 'sticky',
		wrapper: false,
	});
});

$(".scroll-fixed-local-header").each(function() {
	var target = $(this);
	new Waypoint.Sticky({
		element: target,
		stuckClass: 'sticky',
		offset: 50,
		// wrapper: false,
	});
});

$(".scroll-fixed-lnb").each(function() {
	var target = $(this);
	new Waypoint.Sticky({
		element: target,
		stuckClass: 'sticky',
		offset: 96,
		wrapper: false,
	});
});

/**
 * 스와이퍼 공통 세팅
 */
var swiperOptionDotSub = {
	speed: SWIPER_SPEED,
	watchOverflow: true,
	parallax: true,
	pagination: {
		el: '.swiper-pgn-dots-sub',
	},
};

$(function() {
	initSwiperFree();
	initSwiperFreeDot();
	initSwiperPrdMain();
	initSwiperDotMain();
	initSwiperDotSub();
	initSwiperR40();
	initSwiperR60();
	initSwiperSpShopA3();
	initSwiperSpShopC5();
	initSwiperPrdH();
	initSwiperPrd2n();
	initSwiperRankingB();
	initSwiperBannerFraction();
	initLayerPopupSwiper();
	initMarketingPopupSwiper();
	initSwiperSpMain();
});

/* Marketing Banner Swiper */
function initMarketingPopupSwiper() {
	if(!$(".wn-marketing-popup").length) return;

	$('.wn-marketing-popup').on('shown.bs.modal', function (e) {
		var $btnAutoplay = $(this).find(".swiper-btn-autoplay");
		var swiper = new Swiper('.swiper-mkp', {
			speed: SWIPER_SPEED,
			autoplay: {
				delay: 5000,
			},
			loop: true,
			pagination: {
				el: '.pages',
				type: 'fraction',
			},
			watchOverflow: true,
		});

		$btnAutoplay.data("swiper", swiper).on("click", function() {
			if(swiper.autoplay.running) {
				swiper.autoplay.stop();
				$(this).addClass("play");
			} else {
				swiper.autoplay.start();
				$(this).removeClass("play");
			}
		});
	});
}

/* Layer Popup Swiper */
function initLayerPopupSwiper() {
	if(!$(".wn-layer-popup").length) return;
	
	$('.wn-layer-popup').on('shown.bs.modal', function (e) {
		new Swiper('#layerPopupSwiper', {
			navigation: {
				nextEl: '.swiper-next',
				prevEl: '.swiper-prev',
			},
			pagination: {
				el: '.swiper-pagination-box',
				type: 'fraction',
			},
			resistanceRatio: 0,
			watchOverflow: true,
		});
	});
}

function initSwiperBannerFraction() {
	var swiperSelector = ".swiper-banner-fraction";
	new Swiper(swiperSelector, {
		pagination: {
			el: '.swiper-fraction',
			type: 'fraction',
		},
	});
}

//Main Raking B Type
function initSwiperRankingB() {
	var swiperSelector = ".swiper-ranking-b";
	new Swiper(swiperSelector, {
		slidesPerView: 2,
		slidesPerGroup: 2,
		slidesOffsetAfter: -5,
		spaceBetween: 10,
		watchOverflow: true,
	});
	detectSingleSlide(swiperSelector);
}

//Detect Swiper has Single Slide
function detectSingleSlide(swiperSelector) {
	var swiperList = document.querySelectorAll(swiperSelector);
	Array.prototype.forEach.call(swiperList, function (swiper) {
    if(swiper.querySelectorAll(".swiper-slide").length == 1) {
			swiper.classList.add("single-slide");
		}
	});
}

function initSwiperFree() {
	var swiperSelector = ".swiper-free";
	new Swiper(swiperSelector, {
		slidesPerView: 'auto',
		freeMode: true,
		slidesOffsetAfter: 15,
		watchOverflow: true,
	});
}

function initSwiperFreeDot() {
	var swiperSelector = ".swiper-free-dot";
	new Swiper(swiperSelector, {
		slidesPerView: 'auto',
		freeMode: true,
		slidesOffsetAfter: 15,
		watchOverflow: true,
		pagination: {
			el: '.swiper-pgn-dots-sub',
		},
	});
}

function initSwiperPrdMain() {
	var swiperSelector = ".swipder-prd-main";
	new Swiper(swiperSelector, {
		loop: true,
		speed: SWIPER_SPEED,
		pagination: {
			el: '.swiper-pgn-dots-main',
		},
	});
}
function initSwiperDotMain() {
	var swiperSelector = ".swiper-dot-main";
	
	$(swiperSelector).each(function() {
		var idSelector = "#" + $(this).attr("id");
		var btnAutoplay = $(this).find(".swiper-btn-autoplay");
		var swiper = new Swiper(idSelector, {
			autoplay: {
				delay: 5000,
			},
			loop: true,
			speed: SWIPER_SPEED,
			// parallax: true,
			pagination: {
				el: '.swiper-pgn-dots-main',
			},
		});
		
		btnAutoplay.data("swiper", swiper).on("click", function() {
			if(swiper.autoplay.running) {
				swiper.autoplay.stop();
				$(this).addClass("play");
			} else {
				swiper.autoplay.start();
				$(this).removeClass("play");
			}
		});
	});
	
}
function initSwiperDotSub() {
	var swiperSelector = ".swiper-dot-sub";
	new Swiper(swiperSelector, swiperOptionDotSub);
}
function initSwiperSpShopA3() {
	//shop group
	new Swiper(".swiper-sp-shop-group", {
		speed: SWIPER_SPEED,
		watchOverflow: true,
		parallax: true,
		resistanceRatio: 0,
		pagination: {
			el: '.swiper-pgn-dots-sub',
		},
	});
	//thumbnails in group
	new Swiper(".swiper-sp-shop-thumb-a3", {
		speed: SWIPER_SPEED,
		slidesPerView: 2,
		slidesPerGroup: 2,
		slidesOffsetAfter: -75,
		spaceBetween: 10,
		nested: true,
		// noSwiping: false,
	});
}
function initSwiperSpShopC5() {
	var swiperSelector = ".swiper-sp-shop-c5";
	new Swiper(swiperSelector, {
		slidesOffsetAfter: -125,
		spaceBetween: 10,
		watchOverflow: true,
	});
	detectSingleSlide(swiperSelector);
}
//Swiper Right Space 40px
function initSwiperR40() {
	var swiperSelector = ".swiper-r-40";
	new Swiper(swiperSelector, {
		slidesOffsetAfter: -25,
		spaceBetween: 15,
		watchOverflow: true,
	});
	detectSingleSlide(swiperSelector);
}
function initSwiperR60() {
	var swiperSelector = ".swiper-r-60";
	new Swiper(swiperSelector, {
		slidesOffsetAfter: -60,
		spaceBetween: 10,
		watchOverflow: true,
	});
	detectSingleSlide(swiperSelector);
}

//Horizontal Product Item Swiper
function initSwiperPrdH() {
	var swiperSelector = ".swiper-prd-h";
	new Swiper(swiperSelector, {
		slidesOffsetAfter: -25,
		spaceBetween: 10,
		watchOverflow: true,
	});
	detectSingleSlide(swiperSelector);
}
//2 Product Items Swiper
function initSwiperPrd2n() {
	var swiperSelector = ".swiper-prd-2n";
	new Swiper(swiperSelector, {
		speed: SWIPER_SPEED,
		slidesPerView: 2,
		slidesPerGroup: 2,
		spaceBetween: 10,
		pagination: {
			el: '.swiper-pgn-dots-sub',
		},
		noSwiping: false,
	});
}
//전문관 메인 스와이퍼
function initSwiperSpMain() {
	var swiperSelector = ".swiper-sp-main";
	var mySwiperOptions = $.extend({}, swiperOptionDotSub);
	mySwiperOptions.pagination = { el: '.swiper-pgn-dots-main' };
	new Swiper(swiperSelector, mySwiperOptions);
}

var localNavSwiper = new Swiper('#local-nav-swiper', {
	slidesPerView: 'auto',
});

/* Header */
function initGlobalHeader() {
	var stickyHeader = $("#sticky-header");
	var lastScrollTop = $(this).scrollTop();
	var isGnbOnly = $("body").hasClass("gnb-scroll-show");
	var scrolled, currentHeight, maxHeight;
	//float header with gnb
	if(isGnbOnly) {
		$(window).scroll(function (event) {
			scrolled = $(this).scrollTop();
			if (scrolled >= lastScrollTop) {
				if (scrolled >= STICKY_POINT) {
					stickyHeader.addClass("header-float-min");
				}
			} else {
				currentHeight = scrolled + $(window).height();
				maxHeight = $(document).height();
				if (currentHeight < maxHeight) {
					if (scrolled < STICKY_POINT) {
						stickyHeader.removeClass("header-float-min");
					}
				}
			}
			lastScrollTop = scrolled;
		});
	} else {
		$(window).scroll(function (event) {
			scrolled = $(this).scrollTop();
			if (scrolled >= lastScrollTop) {
				if (scrolled >= STICKY_POINT) {
					stickyHeader.addClass("min");
					activeFollower(true);
				}
			} else {
				currentHeight = scrolled + $(window).height();
				maxHeight = $(document).height();
				if (currentHeight < maxHeight) {
					stickyHeader.removeClass("min");
					activeFollower(false);
				}
			}
			lastScrollTop = scrolled;
		});
	}
}

function activeFollower(isFollow) {
	var $follower = $(".scroll-fixed-gnb");
	if (!$follower.length) return;

	if(isFollow) {
		$follower.addClass("follow");
	} else {
		$follower.removeClass("follow");
	}
}

/* Quick Menu */
function initQuickMenu() {
	//goto top top
	$("#page-top-button").on("click", function(e) {
		e.preventDefault();
		var body = $("html, body");
		body.stop().animate({scrollTop:0}, 600, 'easeOutCubic');
	});

	//trigger visible
	$(window).scroll(function (event) {
		updateQuickMenu();
	});

	//init visible
	updateQuickMenu();
}
function updateQuickMenu() {
	var st = $(this).scrollTop();
	if (st >= QUICKMENU_POINT) {
		$("#quick-menu").fadeIn(200);
	} else {
		$("#quick-menu").fadeOut(200);
	}
}

/* Attach Item Remove Click Listener */
function attachItemRemoveClick(btn) {
  $(btn).parents(".attach-item").remove();
}

/* Set Mobile Full Screen Height */
function setVh() {
	var vh = window.innerHeight * 0.01;
	document.documentElement.style.setProperty('--vh', vh + 'px');
}
window.addEventListener('resize', function() {
	setVh();
});
window.onload = function() {
	setVh();
}

/**
 * 상품 리스트 레이아웃
 */
$(".btn-layout").each(function() {
  addBtnLayoutClick($(this));
});
function addBtnLayoutClick($btn) {
  $btn.on("click", function() {
		var layout = $(this).attr("data-layout");
    changePlpLayout(layout);
  });
}
function changePlpImage(layout) {
	var prdList = $("#prd-list");
	var prdItems = prdList.find(".prd-item");
	var item,
	img,
	dataSrc,
	imgV,
	imgH;
	
	prdItems.each(function() {
		item = $(this);
		img = item.find(".prd-item-img img");
		dataSrc = JSON.parse(img.attr("data-src"));
		imgH = dataSrc.h;
		imgV = dataSrc.v;
		if(layout == "large") {
			img.attr("src", imgH);
		} else {
			img.attr("src", imgV);
		}
	});
}
function changePlpLayout(layout) {
	var prdList = $("#prd-list");
	var prdItems = prdList.find(".prd-item");
	var PRD_LIST_LAYOUT = ["tile", "large", "list"];
	var PRD_ITEM_TYPES = ["v", "large", "h"];
	var listClassPre = "prd-list-";
	var itemClassPre = "prd-item-";
	var listClass,
	itemClass;
	
	changePlpImage(layout);

	PRD_LIST_LAYOUT.forEach(function (item, index) {
		listClass = listClassPre + item;
		itemClass = itemClassPre + PRD_ITEM_TYPES[index];
		if (item == layout) {
			prdList.addClass(listClass);
			prdItems.addClass(itemClass);
		} else {
			prdList.removeClass(listClass);
			prdItems.removeClass(itemClass);
		}
	});
}

/**
 * Change Container
 * 이벤트 댓글 작성, 전화번호 변경 폼 등
 */
function changeOpen(selector) {
	$(selector).addClass("open");
}
function changeClose(selector) {
	$(selector).removeClass("open");
}