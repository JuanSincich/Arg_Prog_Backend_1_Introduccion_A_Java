document.getElementById("form").addEventListener("submit", (event) => {
  event.preventDefault();
  const num1 = parseFloat(document.getElementById("num1").value);
  const num2 = parseFloat(document.getElementById("num2").value);
  const option = document.querySelector(
    'input[name="flexRadioDefault"]:checked'
  );
  const results = document.getElementById("results");

  if (isNaN(num1) || isNaN(num2)) {
    results.innerHTML = "<h5>Uno o ambos valores ingreados no es válido</h5>";
  } else {
    if (option) {
      switch (option.value) {
        case "sum":
          results.innerHTML = `<h5>La suma de ${num1} y ${num2} es igual a ${
            num1 + num2
          }</h5>`;
          console.log(num1 + num2);
          break;
        case "sub":
          results.innerHTML = `<h5>La resta de ${num1} menos ${num2} es igual a ${
            num1 - num2
          }</h5>`;
          break;
        case "mult":
          results.innerHTML = `<h5>La multiplicación de ${num1} por ${num2} es igual a ${
            num1 * num2
          }</h5>`;
          break;
        case "div":
          if (num2 === 0) {
            results.innerHTML = `<h5>No se puede dividir por 0</h5>`;
          } else {
            results.innerHTML = `<h5>La división de ${num1} dividido ${num2} es igual a ${
              num1 / num2
            }</h5>`;
          }

          break;

        default:
          results.innerHTML = `<h5>Operación no válida</h5>`;
          break;
      }
    } else {
      results.innerHTML = `<h5>Por favor seleccione la operación a realizar</h5>`;
    }
  }
});
