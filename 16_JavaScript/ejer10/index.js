document.getElementById("form").addEventListener("submit", (event) => {
  event.preventDefault();

  const frase = document.getElementById("str").value;

  const results = document.getElementById("results");

  const reversePh = reverse(frase);
  results.innerHTML = `<h5>${reversePh}</h5>`;

  console.log(frase);
});

const reverse = (frase) => {
  return frase.split("").reverse().join("");
};
