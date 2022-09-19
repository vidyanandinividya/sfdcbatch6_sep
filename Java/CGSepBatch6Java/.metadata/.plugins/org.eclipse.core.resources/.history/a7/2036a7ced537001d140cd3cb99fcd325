package session3;

import java.util.Scanner;

public class AbstractClassDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		SMSSender airtel=new Airtel();
		airtel.sendSMS();
		SMSSender vodafone=new Vodafone();
		vodafone.sendSMS();
		System.out.println("Do you want to send SMS using Airtel or vodafone");
		int choice=sc.nextInt();
		SMSSender sms=choice==1?new Airtel():new Vodafone();
		sms.sendSMS();
	}

}
