document.getElementById("form").addEventListener("submit", (event) => {
  event.preventDefault();
  const str = document.getElementById("str").value;

  const results = document.getElementById("results");

  const dato = tipoDeDato(str);
  console.log(dato);

  console.log();
});

const tipoDeDato = (dato) => {
  if (/^\d+$/.test(dato)) {
    return "number";
  } else {
    return typeof dato;
  }
};
