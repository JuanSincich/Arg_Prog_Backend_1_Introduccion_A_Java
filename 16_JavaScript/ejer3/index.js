document.getElementById("form").addEventListener("submit", function (event) {
  event.preventDefault();
  const age = parseInt(document.getElementById("age").value.trim());
  const results = document.getElementById("results");
  const resultH5 = document.createElement("h5");

  if (isNaN(age)) {
    resultH5.innerHTML = "Ingresá números por favor";
  } else {
    if (age < 1) {
      resultH5.innerHTML = "Ingresá una edad válida";
    } else {
      if (age > 17) {
        resultH5.innerHTML = "Sos mayor de edad";
      } else {
        resultH5.innerHTML = "Sos menor de edad";
      }
    }
  }

  results.innerHTML = "";
  results.append(resultH5);
});
