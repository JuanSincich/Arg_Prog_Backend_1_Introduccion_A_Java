// A partir del siguiente array: var valores = [true, 5, false, "hola", "adios", 2]:
// a) Determinar cual de los dos elementos de texto es mayor
let valores = [true, 5, false, "hola", "adios", 2];

let longerString = valores.reduce((pre, act) => {
  if (typeof act === "string") {
    return pre.length > act.length ? pre : act;
  } else {
    return pre;
  }
});

console.log(`El string más largo es ${longerString}`);

// b) Utilizando exclusivamente los dos valores booleanos del array, determinar los
// operadores necesarios para obtener un resultado true y otro resultado false

console.log(valores[0] || valores[2]);
console.log(valores[0] && valores[2]);

// c) Determinar el resultado de las cinco operaciones matemáticas realizadas con los
// dos elementos numéricos

console.log(`Suma : ${valores[1] + valores[5]}`);
console.log(`Resta : ${valores[1] - valores[5]}`);
console.log(`Multiplicación : ${valores[1] * valores[5]}`);
console.log(`división : ${valores[1] / valores[5]}`);
console.log(`Módulo : ${valores[1] % valores[5]}`);

let generar = () => {
  let resultado = document.getElementById("resultado");
  resultado.innerHTML = `<h5> A- El string más largo del array es "${longerString}"<br/><br/>
  B- Para obtener resultado true (valores[0] || valores[2]): ${
    valores[0] || valores[2]
  }
  Para obtener resultado fasle (valores[0] && valores[2]): ${
    valores[0] && valores[2]
  }<br/><br/>
C- Suma : ${valores[1] + valores[5]}<br/>
Resta : ${valores[1] - valores[5]}<br/>
Multiplicación : ${valores[1] * valores[5]}<br/>
División : ${valores[1] / valores[5]}<br/>
Módulo : ${valores[1] % valores[5]}<br/>
  <h5/>`;
};
