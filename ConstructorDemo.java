package JavaOops;
 class StudentDetails {
	int id;
	String name;
	boolean status;
	float height;
	public StudentDetails(){
		this("no information",0);
	}
	public StudentDetails(String name,float height) {
		this.name=name;
		this.height=height;
	}
	public StudentDetails(int id,String name,boolean status,float height) {
		this.id=id;
		this.name=name;
		this.status=status;
		this.height=height;
	}
	public StudentDetails(StudentDetails sd) {
		id=sd.id;
		name=sd.name;
		status=sd.status;
		height=sd.height;
	}
	@Override
    public String toString() {
	        return "id: " + id + ", name: " + name + ", status: " + status + ", height: " + height;
	  }

}
 public class ConstructorDemo{
	 public static void main(String[] args) {
		 StudentDetails s=new StudentDetails();
		 System.out.println(s);
		 StudentDetails s1=new StudentDetails("venkat",5.6f);
		 System.out.println("\n name:"+s1.name+"\n height:"+s1.height);
		 StudentDetails s2=new StudentDetails(45,"venkat",false,5.6f);
		 System.out.println(s2.name+s2.id+s2.status+s2.height);
		 StudentDetails s3=new StudentDetails(s2);
		 System.out.println(s3.name+s3.id+s3.status+s3.height);
	 }	
 }
