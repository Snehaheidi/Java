package railway;

public class Passenger
{
    static int id = 1;//static variable to give id for every new passenger
    String name;
    int age;
    String berthPreference;// U or L or M
    int passengerId;
    String allotted;//allotted type (L,U,M,RAC,WL)
    int serialNumber;
	static int serialNum = 0;
    public Passenger(String name,int age,String berthPreference,int passengerId)
    {
        this.name = name;
        this.age = age;
        this.berthPreference = berthPreference;
        this.passengerId = passengerId;
        allotted = "";
        serialNumber = serialNum++;
    }

    public Passenger() {
        super();
    }
}