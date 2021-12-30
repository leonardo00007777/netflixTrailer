$(function() {
	/**
	 * Promotion Main Navigation
	 */
	if($("#prmNav").length) {
		new Waypoint({
			element: $("#prmNavContainer")[0],
			handler: function(dir) {
        if(dir == 'down') {
					$("#prmNav").addClass("scroll-fixed-gnb follow");
        }
      },
      offset: 50,
		});
		new Waypoint({
			element: $("#prmNavContainer")[0],
			handler: function(dir) {
				if(dir == 'up') {
					$("#prmNav").removeClass("scroll-fixed-gnb");
        }
      },
      offset: 100,
		});
	}
	
  /**
   * Event Scrollspy Tab
   */
  var CONTENT_OFFSET = 110;
  $("#scrollspyNav").find("a").each(function() {
		var idSelector = $(this).attr("href");
    addClickHandler($(this));
		addEnterHandler(idSelector);
	});

  function addClickHandler($tab) {
    $tab.on("click", function(e) {
      e.preventDefault();
      var contentSelector = $(this).attr("href");
      var $content = $(contentSelector);
      var top = $content.position().top;
      $("html").scrollTop(top - CONTENT_OFFSET);
    });
  }

	function addEnterHandler(idSelector) {
    new Waypoint({
			element: $(idSelector)[0],
			handler: function(dir) {
        if(dir == 'down') {
          navOn(this.element.id);
        } else if(dir == 'up') {
          navPrevOn(this.element.id);
        }
      },
      offset: CONTENT_OFFSET,
		});

		// new Waypoint.Inview({
		// 	element: $(idSelector)[0],
		// 	entered: function(direction) {
		// 		if(direction == 'up') {
		// 			navPrevOn(this.element.id);
		// 		}
		// 	},
		// 	exit: function(direction) {
		// 		if(direction == 'down') {
		// 			navOn(this.element.id);
		// 		}
		// 	},
		// })
  }
  
	function navOn(id) {
		$("#scrollspyNav").find("a").each(function() {
			var link = $(this).attr("href");
			var idSelector = "#" + id;
			if(link == idSelector) {
				$(this).addClass("active");
			} else {
				$(this).removeClass("active");
			}
		})
  }
  
	function navPrevOn(currentId) {
		var prevId;
		var id;
		$("#scrollspyNav").find("a").each(function() {
			id = $(this).attr("href").substr(1);
			if(id == currentId) {
				return false;
			}
			prevId = id;
		});
		if(prevId != undefined) {
			navOn(prevId);
		}
	}
});