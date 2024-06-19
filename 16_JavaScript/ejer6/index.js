document.getElementById("form").addEventListener("submit", (event) => {
  event.preventDefault();

  const num = parseInt(document.getElementById("num").value);
  const results = document.getElementById("results");
  if (isNaN(num) || num === 0) {
    results.innerHTML = `<h5> Ingreso inválido. Ingrese un número entero positivo</h5>`;
  } else {
    if (num % 2 === 0) {
      results.innerHTML = `<h5>El número ${num} es par</h5>`;
    } else {
      results.innerHTML = `<h5>El número ${num} es impar</h5>`;
    }
  }
});
