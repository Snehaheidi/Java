package collection;

 public class StudentDetail
{
    private String Sname;
    private int Sage;
    private int SId;
    public StudentDetail(){
        System.out.println("************ Student Details *************");
    }
    public StudentDetail(String Sname, int SId, int Sage){
        this.Sname = Sname;
        this.SId = SId;
        this.Sage = Sage;
    }

    public String getSname() {
        return Sname;
    }
    public int getSage() {
        return Sage;
    }
    public int getSId() {
        return SId;
    }
    public void printDetails() {
    	System.out.println("Name : "+Sname+"\t\t Reg.No : "+SId+"\t\tAge: "+Sage);
    }
}