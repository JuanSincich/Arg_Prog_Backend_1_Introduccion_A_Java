// Realiza un programa que sólo permita introducir los caracteres ‘S’ y ‘N’. Si el usuario
//         ingresa alguno de esos dos caracteres se deberá de imprimir un mensaje por pantalla
//         que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
document.getElementById("form").addEventListener("submit", (event) => {
  event.preventDefault();

  let char = document.getElementById("char").value.toLowerCase();
  let results = document.getElementById("results");
  if (char !== "s" && char !== "n") {
    results.innerHTML = `<h5>Ingreso incorrecto. Ingrese "s" o "n":</h5>`;
  } else {
    if (char === "s") {
      results.innerHTML = `<h5>¡Correcto! Usted ingresó "Si".</h5>`;
    }
    if (char === "n") {
      results.innerHTML = `<h5>¡Correcto! Usted ingresó "No".</h5>`;
    }
  }
});
