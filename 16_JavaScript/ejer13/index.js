// Crear un objeto persona, con las propiedades nombre, edad, sexo ('H'
// hombre, 'M' mujer, 'O' otro), peso y altura. A continuación, muestre las
// propiedades del objeto JavaScript.

let Persona = document
  .getElementById("form")
  .addEventListener("submit", (event) => {
    event.preventDefault();

    const name = document.getElementById("name").value;
    const age = document.getElementById("age").value;
    const sexos = document.querySelector(
      'input[name="flexRadioDefault"]:checked'
    );
    const weigth = document.getElementById("weigth").value;
    const heigth = document.getElementById("heigth").value;

    let sexo = "";
    if (sexos.value === "M") {
      sexo = "Masculino";
    } else if (sexos.value === "F") {
      sexo = "Femenino";
    } else {
      sexo = "Otro";
    }

    const Persona = new Object();
    Persona.nombre = name;
    Persona.edad = age;
    Persona.sexo = sexo;
    Persona.peso = weigth;
    Persona.altura = heigth;

    console.log(Persona);
    const results = document.getElementById("results");
    results.innerHTML = `<h3>Persona agreagda:</h3><br><h5>Nombre : ${name}<br>
    Edad: ${age} <br>
    Sexo: ${sexo}<br>
    Peso: ${weigth}<br>
    Altura: ${heigth} </h5>`;
  });
