package university;

public class Student {
   String studName,studphNo , studdob , studemail,studcity , studrollNo,id;

public Student(String studname, String studrollNo, String studdob, String studphNo, String studemail,String studcity) {
	this.studName = studname;
	this.studrollNo = studrollNo;
	this.studdob = studdob;
	this.studphNo = studphNo;
	this.studemail = studemail;
	this.studcity = studcity;
}

public Student() {
	
}
//DataBase Object call this Constructor
public Student(String id, String stud_name, String rollNo, String dob, String phNo, String email, String city) {
	this.id = id;
	this.studName = stud_name;
	this.studrollNo = rollNo;
	this.studdob = dob;
	this.studphNo = phNo;
	this.studemail = email;
	this.studcity = city;
}
public String getid() {
	return id;
}
public void setid(String id) {
	this.id = id;
}
public String getStudName() {
	return studName;
}

public void setStudName(String studName) {
	this.studName = studName;
}

public String getStudrollNo() {
	return studrollNo;
}

public void setStudrollNo(String studrollNo) {
	this.studrollNo = studrollNo;
}

public String getStudphNo() {
	return studphNo;
}

public void setStudphNo(String studphNo) {
	this.studphNo = studphNo;
}

public String getStuddob() {
	return studdob;
}

public void setStuddob(String studdob) {
	this.studdob = studdob;
}

public String getStudemail() {
	return studemail;
}

public void setStudemail(String studemail) {
	this.studemail = studemail;
}

public String getStudcity() {
	return studcity;
}

public void setStudcity(String studcity) {
	this.studcity = studcity;
}
}
