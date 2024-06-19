function process() {
  document.getElementById("form").addEventListener("submit", (event) => {
    event.preventDefault();

    let str = document.getElementById("str").value;

    let strFinal = "";

    for (let i = 0; i < str.length; i++) {
      strFinal += str.substring(i, i + 1);
      if (i !== str.length - 1) {
        strFinal += " ";
      }
    }

    let results = document.getElementById("results");
    results.innerHTML = `<h5>${strFinal}</h5>`;
  });
}
