let generarNum = () => Math.floor(Math.random() * 10);

let generar = () => {
  let vector1 = [];
  let vector2 = [];
  for (let i = 0; i < 5; i++) {
    vector1.push(generarNum());
    vector2.push(generarNum());
  }

  console.log(vector1);
  console.log(vector2);

  const results = document.getElementById("results");

  results.innerHTML = `<h2> Vector 1 = ${vector1.join()}<br>
  Vector 2 = ${vector2.join()}</h2>`;
};
