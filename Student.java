
class StudentDemo  //Blueprint or idea about just student
{
	//member variable
	String Name;
	int age;
	 //Member function
	public void setName(String Name)
	{
		this.Name=Name;
	}
	public String getName()
	{
		return Name;
	}
	public void SetAge(int age)
	{
		this.age=age;
	}
	public int getAge()
	{
		return age;
	}

}
//Instance Member
class course
{
	String name;
	int duration;
	double fees;
	
	
	//Member Function
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	
	
}
public class Student
{
	public static void main(String args[])
	{
		StudentDemo S1=new StudentDemo(); //Object or Reference
		S1.setName("Sayali");
		S1.SetAge(23);
		System.out.println(S1.getName()+"\t"+S1.getAge());
		
		StudentDemo S2=new StudentDemo();
		S2.setName("Jaydeep");
		S2.SetAge(23);
		System.out.println(S2.getName()+"\t"+S2.getAge());
		
		course c1=new course();
		c1.setName("EDAC");
		c1.setDuration(5);
		c1.setFees(60000);
		System.out.println(c1.getName()+"\t"+c1.getDuration()+"\t"+c1.getFees());
		
		course c2=new course();
		c2.setName("EDBDA");
		c2.setDuration(5);
		c2.setFees(600000);
		System.out.println(c2.getName()+"\t"+c2.getDuration()+"\t"+c2.getFees());
	}
}
