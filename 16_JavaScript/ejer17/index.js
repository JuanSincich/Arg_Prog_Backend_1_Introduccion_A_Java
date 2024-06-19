let generarNum = () => Math.floor(Math.random() * 10);

let generar = () => {
  let vector1 = [];

  for (let i = 0; i < 5; i++) {
    vector1.push(generarNum());
  }

  let vector2 = vector1.slice();
  vector2.splice(3, 2);
  const results = document.getElementById("results");

  results.innerHTML = `<h2> Vector original = ${vector1.join()}<br>
  Vector modificado = ${vector2.join()}</h2>`;
};
