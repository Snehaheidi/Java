package university;

public class Faculty {
    String facname,facdob,facphNo,facemail,facCollege,facCourse,faccity;
	public Faculty(String facname, String facdob, String facphNo, String facemail, String facCollege, String facCourse,String faccity) {
		this.facname = facname;
		this.facdob = facdob;
		this.facphNo = facphNo;
		this.facemail = facemail;
		this.facCollege = facCollege;
		this.facCourse = facCourse;
		this.faccity = faccity;
	}
	public Faculty() {
		// TODO Auto-generated constructor stub
	}
	public String getFacname() {
		return facname;
	}
	public void setFacname(String facname) {
		this.facname = facname;
	}
	public String getFacdob() {
		return facdob;
	}
	public void setFacdob(String facdob) {
		this.facdob = facdob;
	}
	public String getFacphNo() {
		return facphNo;
	}
	public void setFacphNo(String facphNo) {
		this.facphNo = facphNo;
	}
	public String getFacemail() {
		return facemail;
	}
	public void setFacemail(String facemail) {
		this.facemail = facemail;
	}
	public String getFacCollege() {
		return facCollege;
	}
	public void setFacCollege(String facCollege) {
		this.facCollege = facCollege;
	}
	public String getFacCourse() {
		return facCourse;
	}
	public void setFacCourse(String facCourse) {
		this.facCourse = facCourse;
	}
	public String getFaccity() {
		return faccity;
	}
	public void setFaccity(String faccity) {
		this.faccity = faccity;
	}

}
