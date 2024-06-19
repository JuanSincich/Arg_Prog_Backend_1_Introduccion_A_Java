let arrayPersonas = [];
document.getElementById("form").addEventListener("submit", (event) => {
  event.preventDefault();

  let name = document.getElementById("name").value;
  let age = document.getElementById("age").value;
  let sexos = document.querySelector('input[name="flexRadioDefault"]:checked');

  let sex = "";
  if (sexos.value === "H") {
    sex = "Hombre";
  } else if (sexos.value === "M") {
    sex = "Mujer";
  } else {
    sex = "Otro";
  }

  function Persona(name, age, sex) {
    this.name = name;
    this.age = age;
    this.sex = sex;
  }

  let persona1 = new Persona(name, age, sex);
  console.log(persona1);
  arrayPersonas.push(persona1);
  console.log(arrayPersonas);
});
