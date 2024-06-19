let Ratio = () => {
  const ratio = parseFloat(document.getElementById("ratio").value);

  if (isNaN(ratio) || ratio <= 0) {
    alert("Por favor, ingrese un número válido para el radio.");
    return;
  }
  console.log(`radio: ${Math.PI * Math.pow(ratio, 2)}`);

  const result = document.createElement("h5");
  result.textContent = `Radio: ${Math.PI * Math.pow(ratio, 2)}`;

  const results = document.getElementById("results");
  results.textContent = "";
  results.appendChild(result);
  return result;
};

let Perim = () => {
  const ratio = parseFloat(document.getElementById("ratio").value);

  if (isNaN(ratio) || ratio <= 0) {
    alert("Por favor, ingrese un número válido para el radio.");
    return;
  }
  const result = document.createElement("h5");
  result.textContent = `Perímetro: ${2 * Math.PI * ratio}`;

  const results = document.getElementById("results");

  results.appendChild(result);
  return result;
};
