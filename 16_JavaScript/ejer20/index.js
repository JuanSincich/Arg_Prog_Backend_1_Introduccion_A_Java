let generarA = () => {
  let array1 = [];

  for (let i = 3; i <= 15; i += 3) {
    let array = [i];
    array1.push(array);
  }

  console.log(JSON.stringify(array1));

  let array2 = array1.flat();
  console.log(JSON.stringify(array2));

  let results = document.getElementById("results");
  results.innerHTML = `<h5>Array 1 : ${JSON.stringify(array1)}<br>
  Array 2 : ${JSON.stringify(array2)}<h5/>`;
};
generarA();
