// Escribir un algoritmo en el cual se consulte al usuario que ingrese ¿cómo está el día de
// hoy? (soleado, nublado, lloviendo). A continuación, mostrar por pantalla un mensaje que
// indique “El día de hoy está ...”, completando el mensaje con el dato que ingresó el usuario.
document.getElementById("form").addEventListener("submit", function (event) {
  event.preventDefault();
  const selection = document.getElementById("selection").value;
  const resultDiv = document.createElement("div");

  switch (selection) {
    case "Soleado":
      resultDiv.innerHTML = "<h3> El día de hoy está soleado</h3>";
      break;
    case "Nublado":
      resultDiv.innerHTML = "<h3> El día de hoy está nublado</h3>";
      break;
    case "Frio":
      resultDiv.innerHTML = "<h3> El día de hoy está frío</h3>";
      break;
    case "Ventoso":
      resultDiv.innerHTML = "<h3> El día de hoy está ventoso</h3>";
      break;

    default:
      resultDiv.innerHTML = "<h3> No eligió ninguna opción</h3>";
      break;
  }
  const result = document.getElementById("result");

  result.innerHTML =
    ""; /* Esta mierda es para que no se impriman las respuestas una debajo de otra */
  result.append(resultDiv);
});
