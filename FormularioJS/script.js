function enviar() {
    

let nome
let endereço
let email
let Remail
let senha;
let Rsenha;
nome = document.getElementById("nome").value;
endereço = document.getElementById("endereço").value;
email = document.getElementById("email").value;
Remail = document.getElementById("Remail").value;
senha = document.getElementById("senha").value;
Rsenha = document.getElementById("Rsenha").value;
if (nome=="") {
    alert("prenecha seu nome ");
    return false;
}
else if (endereço=="") {
    alert("prenecha seu endereço ");
    return false;
}
else if (email=="") {
    alert("prenecha seu email ");
    return false;
}
else if (senha=="") {
    alert("prenecha sua senha ");
    return false;
}
else if (email != Remail) {
    alert("a confirmação não coincide ");
    return false;
}else if (senha!=Rsenha) {
    alert("a confirmação da senha não coincide ");
    return false;
}
else {   alert(" 'PARABENS FORMULARIO CONCLUIDO'!!!")
return true;}
}
