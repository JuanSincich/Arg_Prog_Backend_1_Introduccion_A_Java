// Realizar un programa en Java donde se creen dos arreglos: el primero
// será un arreglo A de 50 números reales, y el segundo B, un arreglo de
// 20 números, también reales.

let generarNum = () => Math.floor(Math.random() * 50);

let arrayA = [];
let arrayB = [];
let arrayC = [];
let results = document.getElementById("results");
let resultsA = document.createElement("div");
let resultsB = document.createElement("div");

// El programa deberá inicializar el arreglo A
// con números aleatorios y mostrarlo por pantalla.

let generarA = () => {
  for (let i = 0; i < 50; i++) {
    arrayA.push(generarNum());
  }
  console.log(arrayA);

  // Luego, el arreglo A se debe ordenar de menor a mayor

  let Aaordenado = arrayA.sort((a, b) => a - b);

  results.innerHTML = "";
  resultsA.innerHTML = `<h5>Arreglo A : ${arrayA}<h5/> `;
  results.append(resultsA);
  console.log(Aaordenado);

  arrayC = arrayA;
  console.log(`array C : ${arrayC}`);
  arrayA = [];
};

// copiar los primeros 10 números ordenados al arreglo B de 20 elementos,
//  y rellenar los 10 últimos elementos con el valor 0.5.

let generarB = () => {
  for (let i = 0; i < 20; i++) {
    if (i < 10) {
      arrayB.push(arrayC[i]);
    } else {
      arrayB.push(0.5);
    }
  }
  resultsB.innerHTML = `<h5 class="mt-3"> Arreglo B : ${arrayB} <h5/>`;
  results.append(resultsB);
  console.log(arrayB);
  arrayB = [];
};


SET