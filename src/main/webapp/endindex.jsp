<%-- 
    Document   : endindex
    Created on : 26-09-2022, 23:07:17
    Author     : JavierSoto
--%>

<%@page import="Model.CalculoInteres"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<% 
CalculoInteres cin = (CalculoInteres) request.getAttribute("calculo");
%>

<% 
CalculoInteres res = (CalculoInteres) request.getAttribute("resultado");
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 50%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
}
</style>        
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Resultado del Calculo de Interes Simple</h1>
      <table>
  <tr>
    <th>Resultado</th>
    <th>Valor</th>
  </tr>  
    <tr>
    <td>El inetres Simple es:</td>
    <td>$<%= Math.round(cin.calculo()) %></td>
  </tr>
   <tr>
    <td>El Resultado es:</td>
    <td>$<%= Math.round(res.resultado())%> </td>
     </tr>
   </table>
       <p>Gracias!!!</p>
    </body>
</html>
