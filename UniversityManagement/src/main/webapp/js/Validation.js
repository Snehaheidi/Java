document.getElementById("ok").addEventListener("click", loginValidate);

function loginValidate() {
	var name = document.getElementById("uName").value;
	var pass = document.getElementById("uPass").value;
    /*window.alert("validation page");*/
	var url = "Logiin?name=" + name + "&pass=" + pass;
	const request = new XMLHttpRequest();
	var value;
	try {
		/*window.alert("try");*/
		request.open("POST", url, true);
		request.send();
		request.onreadystatechange = function() {
			if (request.readyState==4 ) {
				
				value = request.responseText;
				alert(value);
				if(value=="admin"){
			       window.location.href = "Admin.jsp";
				}
				else if(value=="faculty"){
					alert("dxxxx");
					window.location.href = "FacultyProfile.jsp";
				}
				else if(value=="student"){
					window.location.href = "StudentProfile.jsp";
				}
				else{
					window.location.href = "Login.jsp";
				}
				console.log(value);
				
			}
		}
	}
	catch (error) {
		window.alert("unable to process");
	}
}

/*var nameRegex = /^[A-Za-z]+$/;
	if(sname.match(nameRegex)){
		alert("Enter the valid name");
		  document.sname.focus();
	}
	else if(pass<8 || pass==""){
		alert("password minimum  8 character")
	}
	else{
		alert("Login Successfull..")
	}
*/