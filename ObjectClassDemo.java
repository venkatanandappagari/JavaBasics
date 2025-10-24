package JavaOops;
class Student1{
	int id;
	String name;
	public Student1(int id,String name) {
		this.id=id;
		this.name=name;
		}
		
	}
	public class ObjectClassDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s=new Student1(28,"Venkatesulu");
		System.out.println(s.id);
		System.out.println(s.name);
		
	}

}
