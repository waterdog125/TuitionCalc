import java.util.Scanner;



public class TuitionCalc{

	public static double TuitionCalc(){

		float Total = 0;
		float prevTot = 0;


		Scanner input = new Scanner(System.in);
		System.out.print("Enter the initial cost of tuition:");
		float Initial = input.nextFloat();
		System.out.print("Enter the APR rate of the loan:");
		float APR = input.nextFloat();
		System.out.print("Enter the term length of the loan:");
		int LoanTerm = input.nextInt();	
		prevTot = Initial;
		for (int i = 0; i<LoanTerm; i++){
			Total = (prevTot*APR) + prevTot;
		}
		return(Total);

	}


	public static void main(String[] args) {
		System.out.print(TuitionCalc());

	}
 }







