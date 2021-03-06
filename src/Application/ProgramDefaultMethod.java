package Application;

import java.util.Locale;
import java.util.Scanner;

import services.BrazilInterestService;
import services.InterestService;

public class ProgramDefaultMethod {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Amount: ");
		double amount = sc.nextDouble();
		System.out.print("Months: ");
		int months = sc.nextInt();
		
		InterestService interEst = new BrazilInterestService(2.0);
		double payment = interEst.payment(amount, months);
		
		System.out.println("Payment After " + months + "months: ");
		System.out.println(String.format("%.2f", payment));		
		
		sc.close();

	}

}
