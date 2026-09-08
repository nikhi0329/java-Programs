package javalanguagefundamentals;

public class Employee {
	 String Name;
	 int id;
	 int salary;
	 int experience;
	 boolean IsPermanent;
	 public static void main(String[] args) {
		 Employee e1=new Employee();
		 e1.Name="Chiru";
		 e1.salary=456789;
		 e1.experience=5;
		 e1.IsPermanent=true;
		 System.out.println(e1.Name);
		 System.out.println(e1.salary);
		 System.out.println(e1.experience);
		 System.out.println(e1.IsPermanent);
	 }
	

}
