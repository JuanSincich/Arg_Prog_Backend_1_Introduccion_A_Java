document.getElementById("form").addEventListener("submit", (event) => {
  event.preventDefault();
  const frase = document.getElementById("str").value;

  const fraseArr = frase.split(" ");

  console.log(masLarga(fraseArr));

  const results = document.getElementById("results");
  results.innerHTML = `<h5> La palabra más larga es ${masLarga(fraseArr)}`;
});

const masLarga = (arr) => {
  return arr.reduce((bef, aft) => (bef.length > aft.length ? bef : aft), "");
};
