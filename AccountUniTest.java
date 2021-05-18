public class AccountUniTest
{
	public static void main(String[] args)
	{
		Account[] accountArray = new Account[10];
		
		accountArray[0] = new Checking(1);
		accountArray[1] = new Checking(2);
		accountArray[2] = new Checking(3);
		accountArray[3] = new Checking(4);
		accountArray[4] = new Checking(5);
                accountArray[5] = new Checking(6);
		accountArray[6] = new Checking(7);
		accountArray[7] = new Checking(8);
		accountArray[8] = new Checking(9);
		accountArray[9] = new Checking(10);
	
		
		for(int i = 0; i < accountArray.length; ++i)
			System.out.println(accountArray[i].getAccountInfo() + "\n");
	}
}
