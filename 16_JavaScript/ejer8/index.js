function lector() {
  const array = [];

  while (true) {
    let num = parseInt(prompt(`ingrese un número entero (0 para terminar)`));
    if (isNaN(num)) {
      alert(`Ingrese un valor válido(numeros enteros)`);
    } else if (num === 0) {
      break;
    } else {
      array.push(num);
    }
  }

  const max = Math.max(...array);
  const min = Math.min(...array);

  let sum = 0;

  array.forEach((num) => {
    sum += num;
  });

  const prom = sum / array.length;

  console.log(...array);
  console.log(max);
  console.log(min);
  console.log(prom);

  const results = document.getElementById("results");
  results.innerHTML = `<table class="table table-bordered mt-3">
  <thead>
    <tr>
      <th>Número máximo</th>
      <th>Número mínimo</th>
      <th>Promedio</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>${max}</td>
      <td>${min} </td>
      <td> ${prom}</td>
    </tr>
  </tbody>
</table>`;
}
