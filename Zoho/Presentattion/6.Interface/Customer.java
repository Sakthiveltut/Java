interface SBI
{
	public void accountCreationSBI();
	default void withdrawATM_SBI()
	{
		System.out.println("SBI Amount Debitted");
	}
	default void depositATM_SBI()
	{
		System.out.println("SBI Amount Creditted");
	}
	static void accountClose(){
		System.out.println("SBI Account Closed");
	}
}
interface CBI
{
	public void accountCreationCBI();
	default void withdrawATM_CBI()
	{
		System.out.println("CBI Amount Debitted");
	}
	default void depositATM_CBI()
	{
		System.out.println("CBI Amount Creditted");
	}
	static void accountClose(){
		System.out.println("CBI Account Closed");
	}
}
interface IOB
{
	public void accountCreationIOB();
	default void withdrawATM_IOB()
	{
		System.out.println("IOB Amount Debitted");
	}
	default void depositATM_IOB()
	{
		System.out.println("IOB Amount Creditted");
	}
	static void accountClose(){
		System.out.println("IOB Account Closed");
	}
}
public class Customer implements SBI, CBI
{	
	@Override
	public void accountCreationSBI()
	{
		System.out.println("SBI account created");
	}
	@Override
	public void accountCreationCBI()
	{
		System.out.println("CBI account created");
	}
	public static void main(String[] args)
	{
		Customer c1 = new Customer();	
		c1.depositATM_SBI();
		c1.withdrawATM_SBI();
		
		SBI.accountClose();	
	}	
}