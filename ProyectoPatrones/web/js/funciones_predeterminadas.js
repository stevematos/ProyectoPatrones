/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function handleClickHref(valor)
{
    texto = "../jsp/" + valor + ".jsp";
    window.location.href = texto;
}

function handleClickHrefServlet(valor)
{
    texto = "../"+valor;
    window.location.href = texto;
}

function retroceder(paginas)
{
    history.back(paginas);
}

//funciones ccopita xdxd
function existeCliente(){
    var checkCliente = document.getElementById("checkCliente");
    
    var nombre = document.getElementById("nombre");
    var apepat = document.getElementById("apepat");
    var apemat = document.getElementById("apemat");
    var celular = document.getElementById("celular");
    
    if(checkCliente.checked == true){
        nombre.disabled = true;
        apepat.disabled = true;
        apemat.disabled = true;
        celular.disabled = true;
    } else {
        nombre.disabled = false;
        apepat.disabled = false;
        apemat.disabled = false;
        celular.disabled = false;
    }
}

function existeTarjeta(){
    var checkCliente = document.getElementById("checkCliente");
    
    var nombre = document.getElementById("nombre");
    var apepat = document.getElementById("apepat");
    var apemat = document.getElementById("apemat");
    var celular = document.getElementById("celular");
    
    if(checkCliente.checked == true){
        nombre.disabled = true;
        apepat.disabled = true;
        apemat.disabled = true;
        celular.disabled = true;
    } else {
        nombre.disabled = false;
        apepat.disabled = false;
        apemat.disabled = false;
        celular.disabled = false;
    }
}