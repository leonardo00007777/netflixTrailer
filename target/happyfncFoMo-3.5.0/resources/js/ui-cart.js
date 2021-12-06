$(function() {
  initCartTopTrigger();
  initCartBottomTrigger();
  addToggleClickHandler();
});

/**
 * 장바구니 카테고리 그룹 헤더 플로팅
 */
var stickyPoints = [];
function resetStickyPoints() {
  destroyStickyPoints();
  initCartTopTrigger();
  initCartBottomTrigger();
}
function destroyStickyPoints() {
  var sticky;
  for (var i=0; i<stickyPoints.length; i++) {
    sticky = stickyPoints[i];
    sticky.destroy();
  }

  stickyPoints = [];
}
function initCartTopTrigger() {
  $(".c-top-trigger").each(function() {
		var $el = $(this);
		var sticky = new Waypoint({
			element: $el,
			handler: function(dir) {
        if(dir == 'down') {
          var $myGroup = this.element.closest(".cart-group-cat");
          if($myGroup.hasClass("open")) {
            this.element.addClass("sticky");
          }
        } else if(dir == 'up') {
          this.element.removeClass("sticky");
        }
      },
			offset: 110,
		});

    stickyPoints.push(sticky);
	});
}
function initCartBottomTrigger() {
  $(".c-bottom-trigger").each(function() {
    var $el = $(this);
    var sticky = new Waypoint({
      element: $el,
      handler: function(dir) {
        if(dir == 'down') {
          var $myGroup = this.element.closest(".cart-group-cat");
          if($myGroup.hasClass("open")) {
            cartHeaderToBottom(this.element, true);
          }
        } else if(dir == 'up') {
          cartHeaderToBottom(this.element, false);
        }
      },
      offset: 204,
    });

    stickyPoints.push(sticky);
  });
}
function cartHeaderToBottom($trigger, toBottom) {
  var $cartGroup = $trigger.closest(".cart-group-cat");
  if(toBottom) {
    $cartGroup.addClass("header-to-bottom");
  } else {
    $cartGroup.removeClass("header-to-bottom");
  }
}
/**
 * 장바구니 카테고리 그룹 토글버튼
 */
function addToggleClickHandler() {
  $(".cart-group-cat .btn-toggle").each(function() {
    $(this).on("click", function() {
      var $myGroup = $(this).closest(".cart-group-cat");
      var $myTopRow = $(this).closest(".top-row");
      var isFloat = $myTopRow.hasClass("sticky")? true : false;
      if(isFloat) {
        gotoMyPosition($myGroup);
        destroyFloating($myGroup);
      }
      resetStickyPoints();
    });
  });

  function destroyFloating($group) {
    var $myTopRow = $group.find(".top-row");
    $myTopRow.removeClass("sticky");
  }

  function gotoMyPosition($group) {
    var offset = 104;
    var top = $group.offset().top;
    $("html").scrollTop(top - offset);
  }
}