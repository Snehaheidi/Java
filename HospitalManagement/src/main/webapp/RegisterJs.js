document.getElementById("submit").addEventListener("click",register);

var pname = document.getElementById("pName").value;
var phno = document.getElementById("phNo").value;
var intime = document.getElementById("inTime").value;
var docTime = document.getElementById("docTime").value;

/*function register(){
    if(pname==" "||phno==" "||intime==" "||docTime==" "){
	  alert("Enter the Values properly...")
	  //pname = document.getElementById("pName").autofocus;
    }
}*/
document.getElementById("phNo").addEventListener("focusout",phNoValidate);
function phNoValidate(){
	//alert("phNovalidate");
	if(phno==" "){
		alert("enter the valid phNo");
	}
}