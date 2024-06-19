let results = document.getElementById("results");

document.getElementById("form").addEventListener("submit", (event) => {
  event.preventDefault();
  let text = document.getElementById("text").value;
  let resaltado = resaltdor(text);
  results.innerHTML = `<h5>${resaltado} </h5>`;
});

let resaltdor = (text) => {
  let palabras = text.split(/\b/);

  let resaltadas = [];

  palabras.forEach((i) => {
    if (i.trim().length > 8) {
      resaltadas.push(`<span class="resaltado">${i}</span>`);
    } else {
      resaltadas.push(i);
    }
  });
  return resaltadas.join(" ");
};
