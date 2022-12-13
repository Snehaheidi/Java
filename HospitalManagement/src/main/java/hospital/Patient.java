package hospital;

public class Patient {
     private int pId;
     String pName,phNo , inTime,outTime;
     int waitTime,docTime;
     int timeTaken;
	public Patient(String pName, String phNo) {
		this.pName = pName;
		this.phNo = phNo;
	}

	public Patient(int p_id, String inTime, int doctorTime, int waitingTime, String outtime) {
		this.pId = p_id;
		this.inTime = inTime;
		this.docTime = doctorTime;
		this.waitTime = waitingTime;
		this.outTime = outtime;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getPhNo() {
		return phNo;
	}
	public void setPhNo(String phNo) {
		this.phNo = phNo;
	}
	public String getInTime() {
		return inTime;
	}
	public void setInTime(String inTime) {
		this.inTime = inTime;
	}
	public String getOutTime() {
		return outTime;
	}
	public void setOutTime(String outTime) {
		this.outTime = outTime;
	}
	public int getDocTime() {
		return docTime;
	}

	public void setDocTime(int docTime) {
		this.docTime = docTime;
	}

	public int getTimeTaken() {
		return timeTaken;
	}
	public void setTimeTaken(int timeTaken) {
		this.timeTaken = timeTaken;
	}
	public int getWaitTime() {
		return waitTime;
	}
	public void setWaitTime(int waitTime) {
		this.waitTime = waitTime;
	}
}