document.getElementById("form").addEventListener("submit", (event) => {
  event.preventDefault();
  let results = document.getElementById("results");

  let ratio = document.getElementById("input").value;
  let perim = 2 * Math.PI * ratio;
  let area = Math.PI * Math.pow(ratio, 2);

  results.innerHTML = `<h5>Perímentro: ${perim}<br /> 
  Area: ${area} </h5>`;
});
