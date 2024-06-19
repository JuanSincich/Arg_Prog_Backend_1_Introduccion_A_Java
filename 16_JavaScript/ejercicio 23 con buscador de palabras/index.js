let results = document.getElementById("results");

document.getElementById("form").addEventListener("submit", (event) => {
  event.preventDefault();
  let text = document.getElementById("text").value;
  results.innerHTML = `<h5>${text} </h5>`;

  console.log(text);
});

document.getElementById("formResaltar").addEventListener("submit", (event) => {
  event.preventDefault();
  let palabras = document.getElementById("palabras").value;
  console.log(palabras);
  let arrayPalabras = palabras.split(",");
  console.log(arrayPalabras);
});
