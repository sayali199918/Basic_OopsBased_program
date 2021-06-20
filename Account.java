
 class Account_Demo{
	private int Acc_id;
	private String name;
	private double Balance;
	static int Rate=10;
	
	
	 Account_Demo(int Acc_id,String name,double Balance)
	 {
		 this.Acc_id=Acc_id;
		 this.name=name;
		 this.Balance=Balance;
	 }
	
	 public int getAcc_id() {
		return Acc_id;
	}
	public void setAcc_id(int Acc_id) {
		this.Acc_id = Acc_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return Balance;
	}
	public void setBalance(double Balance) {
		this.Balance = Balance;
	}
	public int getRate() {
		return Rate;
	}
}
public class Account
{
	public static void main(String args[])
	{
		/*Account_Demo A1=new Account_Demo();
		A1.setAcc_id(101);
		A1.setName("Nidhi");
		A1.setBalance(5000000);
		System.out.println(A1.getAcc_id()+"\t"+A1.getName()+"\t"+A1.getBalance());*/
		
		Account_Demo A1=new Account_Demo(101,"Nidhi",100);
		System.out.println(A1.getAcc_id()+"\t"+A1.getName()+"\t"+A1.getBalance());
		
		Account_Demo A2=new Account_Demo(102,"Sayali",2000);
		System.out.println(A2.getAcc_id()+"\t"+A2.getName()+"\t"+A2.getBalance());
		
		Account_Demo A3=new Account_Demo(103,"Sonal",50000);
		System.out.println(A3.getAcc_id()+"\t"+A3.getName()+"\t"+A3.getBalance());
		
		Account_Demo A4=new Account_Demo(104,"Sonali",9000);
		System.out.println(A4.getAcc_id()+"\t"+A4.getName()+"\t"+A4.getBalance());
		
		Account_Demo A5=new Account_Demo(105,"Rekha",2);
		System.out.println(A5.getAcc_id()+"\t"+A5.getName()+"\t"+A5.getBalance());
		
		Account_Demo A6=new Account_Demo(106,"Savita",1);
		System.out.println(A6.getAcc_id()+"\t"+A6.getName()+"\t"+A6.getBalance());
		
		Account_Demo A7=new Account_Demo(107,"Meena",20000);
		System.out.println(A7.getAcc_id()+"\t"+A7.getName()+"\t"+A7.getBalance());
		
		System.out.println(A1.getRate());
		
		
	}
}
