<%-- 
    Document   : index
    Created on : 25-09-2022, 22:28:20
    Author     : JavierSoto
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
             <h1>Calculadora de Interés Simple</h1>
        
         <form method="POST" action="ServletCaluloInteres" id="formulario">
                
        <label for="numer">Ingrese Capital&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp:</label>
            <input type="number" name="capital" id="capital" pattern="[0-9]+" required placeholder="ej:5000">
            <br>
            <label for="numer">Ingrese tasa interés anual&nbsp;&nbsp;&nbsp;&nbsp;&nbsp:</label>
            <input type="number" id="tinteres" name="tinteres"  min="0" max="99" step="0.01" required placeholder="ej:3.23" >
            <br>
            <label for="numyear">Ingrese número de años&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp:</label>
            <input type="number" id="nyears" name="nyears"  min="0" max="30" required placeholder="max30" >
            <br>
            <br>
        <input type="submit" value="&nbsp;&nbsp;&nbsp;&nbsp;Enviar Datos para calcular&nbsp;&nbsp;&nbsp;&nbsp">
    </form> 
    </body>
</html>
