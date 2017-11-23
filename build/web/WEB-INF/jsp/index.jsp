<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>

        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script src="js/popper.js"></script>
        <script src="js/jquery-3.2.1.min.js"></script>
        <script src="js/bootstrap.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/main.js"></script>
        <link rel="stylesheet" href="css/bootstrap.css">
    </head>
    <body class="bg-dark">
        <form action="ver.htm" method="post">
            <div class="container">
                <div class=" card card-login mx-auto mt-5">
                    <div class="card-header">Test </div>
                    <div class="card-body">    

                        <fieldset class="row justify-content-md-center">
                            <legend>Tienes estres???? :O</legend>

                            <p>Ultimamente tienes dolores musculares o sientes que se agudizan tus sentidos? </p>
                            <select name="uno">
                                <option>Si</option>
                                <option>NO</option>
                            </select>
                               <p> Sientes que no logras relajarte aun cuando dejas de hacer actividades?</p>
                            <select name="dos">
                                <option>Si</option>
                                <option>NO</option>
                            </select>
                                <p>Sientes angustia y desesperacion? </p>
                            <select name="tres">
                                <option>Si</option>
                                <option>NO</option>
                            </select>
                                <p>Consideras que tienes estres? </p>
                            <select name="cuatro">
                                <option>Si</option>
                                <option>NO</option>
                            </select>
                                
                                <input type="submit" value="Calcular" />
                        </fieldset><br>

                    </div>
                </div>
            </div>
        </form>
    </body>
</html>