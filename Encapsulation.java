package javaProgramss;

class Encapsulation1 {
	private int  id;
	private String name;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
public class Encapsulation{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation1 encap=new Encapsulation1();
		encap.setId(45);
		encap.setName("Venkat");
		System.out.println(encap.getId());
		System.out.println(encap.getName());
		

	}
}
	
