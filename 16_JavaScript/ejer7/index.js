function sumarNumeros() {
  const limit = parseInt(document.getElementById("limit").value);
  if (limit < 1) {
    alert(`Ingrese un limite mayor positivo`);
    return;
  }
  let sum = 0;
  let cont = 0;

  while (sum <= limit) {
    const num = parseInt(prompt("Ingrese un número"));
    if (isNaN(num)) {
      alert("ingrese un valor valido (números enteros positivos)");
      continue;
    }
    sum += num;
    cont++;
  }
  const results = document.getElementById("results");
  results.innerHTML = `<h5> La suma de los ${cont} números ingresados es igula a ${sum}`;
}
