document.getElementById("submit").addEventListener("onclick",register);

var pname = document.getElementById("pName").value;
var phno = document.getElementById("phNo").value;
var intime = document.getElementById("inTime").value;
var docTime = document.getElementById("docTime").value;

function register(){
    if(pname==""||phno=="" ||intime==""||docTime==""){
	  alert("Enter the Values properly...")
	  //pname = document.getElementById("pName").autofocus;
    }
}
document.getElementById("phNo").addEventListener("focusout",phNoValidate);
function phNoValidate(){
	//alert("phNovalidate");
	if(phno==" "){
		alert("enter the valid phNo");
	}
}

//LOGIN PAGE 
document.getElementById("submit1").addEventListener("onclick",validate);

var pid = document.getElementById("pid").value;
var phNo = document.getElementById("phno").value;

function validate(){
	if(pid=="" || phNo==""){
		alter("Enter the Value ");
	}
}