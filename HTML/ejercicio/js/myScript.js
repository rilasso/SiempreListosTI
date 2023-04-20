function myFunction() {
  let parrafo = document.getElementById("demo");
  if(parrafo.innerHTML == "A Paragraph."){
  parrafo.innerHTML = "Paragraph changed.";
  }else{
  parrafo.innerHTML = "A Paragraph.";
  }
}
