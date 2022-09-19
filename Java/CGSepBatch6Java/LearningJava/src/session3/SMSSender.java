package session3;

public abstract class SMSSender {
	abstract public void establishConnectionWithYourTower();
	abstract public void disconnectConnectionWithYourTower();
	public void checkForDND()
	{
		//check for number present in DND
	}
	public void checkForTelecomRules()
	{
		//Check for Telecom Rules
	}
	public void sendSMS()
	{	
		establishConnectionWithYourTower();
		checkForDND();
		checkForTelecomRules();
		System.out.println("Sending SMS");
		disconnectConnectionWithYourTower();
		
	}
	

}
