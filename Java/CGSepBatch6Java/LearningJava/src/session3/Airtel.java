package session3;

public class Airtel extends SMSSender {

	@Override
	public void establishConnectionWithYourTower() {
		System.out.println("Connecting using Airtel");
		
	}

	@Override
	public void disconnectConnectionWithYourTower() {
		System.out.println("Disconnection using Airtel");
		
	}

}
