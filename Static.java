package Static;

public class Static {
	static int debitTxCounter=0;
	static int creditTxCounter=0;
	int accountNumber;
	String custemerName;
	double  accountBalance;
	Static (int accountNumber,String custemerName,double accountBalance)
	{
		this.accountNumber   =   accountNumber;	
		this.custemerName    =   custemerName;
		this. accountBalance =   accountBalance;
	}
	double credit(double amount)
	{
		System.out.println("accountNumber="+accountNumber+"\ncustemerName="+custemerName+"\naccountBalance="+  accountBalance);
		  accountBalance =  accountBalance+amount;
		  System.out.println("AfterBalance"+  accountBalance);
		  creditTxCounter++;
		  return   accountBalance;
		 }
	double debit(double amount)
	{
		System.out.println("accountNumber="+accountNumber+"\ncustemerName="+custemerName+"\naccountBalance="+  accountBalance);
		  accountBalance =  accountBalance - amount;
		  System.out.println("AfterBalance"+  accountBalance);
		  debitTxCounter++;
		  return   accountBalance;
		 }
	
	
	public static void main(String[] args) 
	{
	Static b1 = new Static(123,"Raj",25000.0);
	Static b2 = new Static(456,"Tamil",20000.0);
	Static b3 = new Static(789,"sasi",30000.0);
	b1.credit(5000.0);
	b2.debit(10000.0);
	b3.credit(20000.0);
	b1.debit(6000.0);
	b2.credit(7000.0);
	b3.credit(100000.0);
	System.out.println("Your credit count="+creditTxCounter);
	System.out.println("Your debit count="+debitTxCounter);

	}

}
