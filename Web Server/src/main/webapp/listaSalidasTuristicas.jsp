<%@page import="logica.Paquete"%>
<%@page import="logica.SalidaTuristica"%>
<%@page import="logica.Categoria"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="logica.Actividad" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
    <%
        Actividad act = (Actividad) request.getSession().getAttribute("actividad");//usuario del que se muestra la info
        ArrayList<SalidaTuristica> salidas = act.getListaSalidaTuristica();

    %>
    <head>
        <meta charset="UTF-8">
        <title>Turismo.uy - Perfil de Actividad Turistica</title>
        <link rel="stylesheet" type="text/css" href="styles.css">
    </head>

    <body>
        <header>
            <div id="logo">
                <h1>Turismo.uy</h1>
            </div>
            <div id="search">
                <form action="svlet" method="post">
                    <input type="text" name="query" placeholder="Buscar turistas o paquetes">
                    <button type="submit">Buscar</button>
                </form>
            </div>
            <div id="login">
                <a href="logedUser.jsp" src="logedUser.jsp">Volver al inicio</a>
            </div>
        </header>

        <main>

            <div class="actividad">
                <h3>Salidas Asociadas</h3>
                <ul>
                    <%         

                        if (salidas != null && !salidas.isEmpty()) {
                            for (SalidaTuristica nombreSalida : salidas) {
                                System.out.println(nombreSalida.getNombre());
                                out.println("<li> <a href='#' onclick='mostrarSalida(\"" + nombreSalida.getNombre() + "\")'>" + nombreSalida.getNombre() + "</a></li>");
                            }
                        } else {
                            out.println("<li>No hay salidas disponibles para esta actividad.</li>");
                        }
                    %>
                </ul>
            </div>

        </main>

        <footer>
            <p>Creado por Juan Martin Pilon - Carlos Santana - Natalia Lopez - Santiago Badiola</p>
            <p>&copy; 2023 Turismo.uy</p>
        </footer>
    </body>
    <script>
        function mostrarSalida(nombreSalida) {
            var xhr = new XMLHttpRequest();
            xhr.open("GET", "SvPerfilSalida?nombreSalida=" + nombreSalida, true);
            xhr.onreadystatechange = function () {
                if (xhr.readyState === 4 && xhr.status === 200) {
                    window.location.href = "perfilSalidaTuristica.jsp";
                }
            };
            xhr.send();
        }
    </script>

</html>