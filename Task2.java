package Task2;

import java.util.Random;
import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		GSM gsm1 = new GSM();
		gsm1.model = "Samsung";
		System.out.println("Please enter the first tel.number/starts with 08, 10 figures/: ");
		gsm1.insertSimCard(sc.next());

		GSM gsm2 = new GSM();
		gsm2.model = "iPhone";
		System.out.println("Please enter the second tel.number/starts with 08, 10 figures/: ");
		gsm2.insertSimCard(sc.next());

		// 5 random calls:
		for (int i = 0; i < 5; i++) {
			Call nextCall = new Call();

			int r = new Random().nextInt(2);
			nextCall.caller = r == 0 ? gsm1 : gsm2;
			nextCall.receiver = r == 0 ? gsm2 : gsm1;

			nextCall.duration = new Random().nextInt(60);

			nextCall.caller.call(nextCall.receiver, nextCall.duration);
		}

		printCallsInfo(gsm1);
		printCallsInfo(gsm2);

		gsm1.removeSimCard();
		gsm2.removeSimCard();
	}

	static void printCallsInfo(GSM gsm) {
		System.out.println(gsm.simMobileNumber + " :");
		System.out.println("The prise for all outgoing calls is: " + gsm.getSumForCall(Call.priceForAMinute));
		gsm.printInfoForTheLastOutgoingCall();
		gsm.printInfoForTheLastIncomingCall();
	}
}
