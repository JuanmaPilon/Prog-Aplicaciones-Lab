<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <link href="styles.css" src="styles.css">
        <title>Turismo.uy - Consulta de Actividad Turistica</title>
        <link rel="stylesheet" type="text/css" href="styles.css">
        <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    </head>

    <body onload="cargarDatos()">
        <header>
            <div id="logo">
                <h1>Turismo.uy - Consulta de Actividad Turistica</h1>
            </div>
            <div id="search">
                <form action="ss" method="post">
                    <input type="text" name="query" placeholder="Buscar turistas o paquetes">
                    <button type="submit">Buscar</button>
                </form>
            </div>
            <div id="login">
                <a href="logedUser.jsp" src="logedUser.jsp">Volver al inicio</a>
            </div>
        </header>

        <%
            String filtro = "";
        %>
        <main>
            <form action="SvActividad" method="GET">
                <label for="departamento">Departamento:</label>
                <select id="departamento" name="departamento"></select>
                <button type="button" onclick="filtrarPorDepartamento()">Filtrar por Departamento</button>
                <br>

                <label for="categoria">Categoria:</label>
                <select id="categoria" name="categoria"></select>
                <button type="button" onclick="filtrarPorCategoria()">Filtrar por Categoria</button>

                <label for="actividad">Actividades:</label>
                <select id="actividad" name="actividad"> 

                </select>
                <br>


                <button type="submit">Consultar</button>
            </form>


        </main>


        <script>

            function cargarDepartamentos() {
                fetch("SvDepartamento")
                        .then(response => response.text())
                        .then(data => {
                            const departamentos = data.split(",");
                            const select = document.getElementById("departamento");
                            departamentos.forEach(departamento => {
                                const option = document.createElement("option");
                                option.value = departamento;
                                option.text = departamento;
                                select.appendChild(option);
                            });
                        })
                        .catch(error => console.error("Error al cargar departamentos: " + error));
            }

            function cargarCategorias() {
                fetch("SvCategoria")
                        .then(response => response.text())
                        .then(data => {
                            const categorias = data.split(",");
                            const select = document.getElementById("categoria");
                            categorias.forEach(categoria => {
                                const option = document.createElement("option");
                                option.value = categoria;
                                option.text = categoria;
                                select.appendChild(option);
                            });
                            // Permite múltiples selecciones
                        })
                        .catch(error => console.error("Error al cargar categorías: " + error));
            }



            function filtrarPorDepartamento() {
                const filtro = "FiltroDepartamento";
                const departamentoSeleccionado = document.getElementById("departamento").value;

                // Construir la URL con el valor seleccionado del departamento
                const url = "SvActividad?filtro=" + filtro + "&departamento=" + encodeURIComponent(departamentoSeleccionado);

                fetch(url)
                        .then(response => response.text())
                        .then(data => {
                            const select = document.getElementById("actividad");
                            select.innerHTML = ''; // Limpia las opciones anteriores

                            const actividades = data.split(",");
                            actividades.forEach(actividad => {
                                const option = document.createElement("option");
                                option.value = actividad;
                                option.text = actividad;
                                select.appendChild(option);
                            });
                        })
                        .catch(error => console.error("Error al filtrar por departamento: " + error));
            }


            function filtrarPorCategoria() {
                const filtro = "FiltroCategoria";
                const categoriaSeleccionada = document.getElementById("categoria").value;

                // Construir la URL con el valor seleccionado de la categoría
                const url = "SvActividad?filtro=" + filtro + "&categoria=" + encodeURIComponent(categoriaSeleccionada);

                fetch(url)
                        .then(response => response.text())
                        .then(data => {
                            const select = document.getElementById("actividad");
                            select.innerHTML = ''; // Limpia las opciones anteriores

                            const actividades = data.split(",");
                            actividades.forEach(actividad => {
                                const option = document.createElement("option");
                                option.value = actividad;
                                option.text = actividad;
                                select.appendChild(option);
                            });
                        })
                        .catch(error => console.error("Error al filtrar por categoría: " + error));
            }



            function cargarDatos() {
                cargarDepartamentos();
                cargarCategorias();
            }

        </script>

        <footer>
            <p>Creado por Juan Martin Pilon - Carlos Santana - Natalia Lopez - Santiago Badiola</p>
            <p>&copy; 2023 Turismo.uy</p>
        </footer>
    </body>
</html>