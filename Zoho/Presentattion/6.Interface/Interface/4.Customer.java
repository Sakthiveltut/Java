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
		System.out.println(SBI.BRANCH);
			
	}	
}
interface SBI
{
	public final String BRANCH = "Surandai";
	public void accountCreationSBI();
	default void withdrawATM_SBI()
	{
		System.out.println("SBI Amount Debitted");
	}
	public default void depositATM_SBI()
	{
		System.out.println("SBI Amount Creditted");
	}
	public static void accountClose(){
		System.out.println("SBI Account Closed");
	}
	private void profit(){
		System.out.println("Bank Profit");
	}
}
interface CBI
{
	public final String BRANCH = "Tenkasi";
	public void accountCreationCBI();
	default void withdrawATM_CBI()
	{
		System.out.println("CBI Amount Debitted");
	}
	public default void depositATM_CBI()
	{
		System.out.println("CBI Amount Creditted");
	}
	public static void accountClose(){
		System.out.println("CBI Account Closed");
	}
	private void profit(){
		System.out.println("Bank Profit");
	}
}
interface IOB
{
	String BRANCH = "Tenkasi";
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