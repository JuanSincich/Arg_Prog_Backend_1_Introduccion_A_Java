// Crear un objeto libro que contenga las siguientes propiedades: ISBN,
// Título, Autor, Número de páginas. Crear un método para cargar un libro
// pidiendo los datos al usuario y luego informar mediante otro método el
// número de ISBN, el título, el autor del libro y el numero de páginas.

let libro = {
  isbn: "",
  titulo: "",
  autor: "",
  pag: 0,

  crearLibro: function (isbn, titulo, autor, pag) {
    this.isbn = isbn;
    this.titulo = titulo;
    this.autor = autor;
    this.pag = pag;
  },
  mostrarInformacion: function () {
    console.log(`ISBN: ${this.isbn}`);
    console.log(`Título: ${this.titulo}`);
    console.log(`Autor: ${this.autor}`);
    console.log(`Número de páginas: ${this.pag}`);
  },
};

document.getElementById("form").addEventListener("submit", (event) => {
  event.preventDefault();
  const isbn = document.getElementById("isbn").value;
  const titulo = document.getElementById("titulo").value;
  const autor = document.getElementById("autor").value;
  const pag = document.getElementById("pag").value;

  libro.crearLibro(isbn, titulo, autor, pag);
  libro.mostrarInformacion();

  console.log(libro);

  const results = document.getElementById("results");
  results.innerHTML = `<table class="table">
<thead>
  <tr>
    <th scope="col">Isbn</th>
    <th scope="col">Título</th>
    <th scope="col">Autor</th>
    <th scope="col">Cantidad de páginas</th>
  </tr>
</thead>
<tbody>
  <tr>
    <td>${libro.isbn}</td>
    <td>${libro.titulo}</td>
    <td>${libro.autor}</td>
    <td>${libro.pag}</td>
  </tr>

</tbody>
</table>`;
});
