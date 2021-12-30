/**
 * Popup Scripts
 */

/* ****************************************
 * BottomSheet (cupertino-pane js)
 ****************************************** */
//BottomSheet Default Setting
var bottomDefaultSettings = {
  initialBreak: "top",
  breaks: {
    top: { enabled: false },
    middle: { enabled: true, height: Math.floor(window.screen.height - 100) },
    bottom: { enabled: false },
  },
  parentElement: "body",
  backdrop: true,
  backdropOpacity: 0.3,
  bottomClose: true,
  buttonClose: false,
  dragBy: [".draggable", ".bottom-sheet-header"],
  // onBackdropTap: () => bottomSheet.destroy({ animate: true }),
  onWillPresent: () => preventBodyScroll(),
  onDidDismiss: () => allowBodyScroll(),
};

function allowBodyScroll() {
  $("body").css("overflow", "auto");
}
function preventBodyScroll() {
  $("body").css("overflow", "hidden");
}