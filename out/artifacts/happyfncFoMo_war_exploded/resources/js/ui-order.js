//배송지 설정
function checkShipChangeHandler() {
  var checkbox = document.querySelector("#checkShip");
  if(checkbox.checked) {
    setMultipleShipping();
  } else {
    setSingleShipping();
  }
}
function setMultipleShipping() {
  document.querySelector("#singleShipping").style.display = 'none';
  document.querySelector("#multipleShipping").style.display = 'block';
}
function setSingleShipping() {
  document.querySelector("#singleShipping").style.display = 'block';
  document.querySelector("#multipleShipping").style.display = 'none';
}