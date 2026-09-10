package javalanguagefundamentals;

public class Employe {
	int id;
	int age;
	long salary;
	char grade;
	float experience;
	boolean IsActive;
	static int leaves;
	long phno;
	void display() {
		
		
		System.out.println("Employee leaves is"+leaves);
		leaves--;
		
	}
public static void main(String[] args) {
	Employe e1=new Employe();
	Employe e2=new Employe();
	Employe e3=new Employe();
	
	e1.id=200135;
	e1.age=30;
	e1.salary=500000;
	e1.grade='A';
	e1.experience=3.5f;
	e1.IsActive=true;
	e1.leaves=3;
	e1.phno=8796543291l;
	System.out.println("Employe Id Is:"+e1.id);
	System.out.println("Employe age Is:"+e1.age);
	System.out.println("Employe salary Is:"+e1.salary);
	System.out.println("Employe grade Is:"+e1.grade);
	System.out.println("Employe experience Is:"+e1.experience);
	System.out.println("Employe IsActive :"+e1.IsActive);
	
	
	System.out.println("Employe phoneNumber Is:"+e1.phno);
	e1.display();
	e2.display();
	e3.display();
}
}
