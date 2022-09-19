package session3;

public class Vodafone extends SMSSender {

	@Override
	public void establishConnectionWithYourTower() {
		System.out.println("Connecting using Vodafone");
		
	}

	@Override
	public void disconnectConnectionWithYourTower() {
		System.out.println("Disconnection using Vodafone");
		
	}

}
