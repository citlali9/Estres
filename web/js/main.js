/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function sendData2Back() {
    console.log("ey");
    //define variables que utilizaremps
    //document.getElementById("nombre").value
    var nombre=document.getElementById("nombre").value;
    var paterno=document.getElementById("paterno").value;
    var materno=document.getElementById("materno").value;
    var telefono=document.getElementById("telefono").value;

    //indica que vamos hacer una peticion post por medio de una libreria ajax
    // es una comunicacion asincrona
    $.post("utlSuperPro",
            {   
                // parametros que se enviaran 
                nombre: nombre,
                paterno: paterno,
                materno: materno,
                telefono: telefono
                
            }, function (data) {
        console.log("Hey tu data");
        //muestra todo lo que llego de consola en data
        console.log(data);
        if (data.resultado === true) {
            window.alert("Hey tu fincion");
        }
    }
    );
}

