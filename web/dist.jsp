<%-- 
    Document   : dist
    Created on : Dec 19, 2016, 5:36:13 PM
    Author     : Santosh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>WAP Dictionary </title>
        <link rel="stylesheet" type="text/css" href="css/dist.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"
        type="text/javascript"></script>
        <script src="js/dist.js"></script>
    </head>
    <body>
        <div id="wrapper">
            <h1>WAP Online Dictionary</h1>

            <div id="search" ><label>Term:&nbsp</label><input type="text" id="textBox"><button id="btn" onclick="getVal();">Lookup</button> <br><span id="message1"></span></div>
            <div id="mess_result">
                <div id="message2_title">
                    <span id="title"></span>
                    <span id="message2"></span>
                </div>
                <div id="result"></div>
              </div>
            <div id="footer">
                Name:Santosh Ghimire (Id:985277)
            </div>
        </div>
    </body>
</html>
