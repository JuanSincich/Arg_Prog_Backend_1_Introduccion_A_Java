//     Conocido el número en matemática PI π, pedir al usuario que ingrese el valor del radio
// de una circunferencia y calcular y mostrar por pantalla el área y perímetro. Recuerde que
// para calcular el área y el perímetro se utilizan las siguientes fórmulas:
document.getElementById("form").addEventListener("submit", function (event) {
  event.preventDefault();
  const ratio = parseFloat(document.getElementById("ratio").value);
  const resultArea = document.createElement("h5");
  const resultPerim = document.createElement("h5");
  const results = document.getElementById("results");
  results.innerHTML = "";
  console.log(ratio);

  if (isNaN(ratio) || ratio <= 0) {
    results.innerHTML = `<h5> Ingrese un valor válido (número mayor a 0) para realizar los cálculos.</h5>`;
  } else {
    const area = Math.PI * Math.pow(ratio, 2);
    const perim = 2 * Math.PI * ratio;
    resultArea.innerHTML = `El area de la circunfernecia es ${area}`;
    resultPerim.innerHTML = `El perímetro de la circunfernecia es ${perim}`;
    console.log(area);
    console.log(perim);

    results.append(resultArea, resultPerim);
  }
});
