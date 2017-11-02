import java.util.Scanner;

public class Sum {
	
	 public static int addBitIterative(int a, int b){  

	        while (b != 0){
	            int carry = (a & b) ; //CARRY is AND of two bits
	          
	            a = a ^b; //SUM of two bits is A XOR B
	          
	            b = carry << 1; //shifts carry to 1 bit to calculate sum
	        }
	        return a;
	 }
	 
	 public static int addIterative(int a, int b){  

	        while (b != 0){
	            a++;
	            b--;
	        }
	        return a;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Sum of 2 numbers without using + operator\n");
		// Taking the 1st number as input
				System.out.println("Please input the 1st number:  ");
				Scanner input1 = new Scanner(System.in);
				int a = input1.nextInt();
				
				// Taking the 2nd number as input
				System.out.println("Please input the 2nd number:  ");
				Scanner input2 = new Scanner(System.in);
				int b = input2.nextInt();
				
		
		
		System.out.println("The Sum using BitWise and BitShift operators is: " +addBitIterative(a,b));

		System.out.println("The Sum using Unary operator is: " +addIterative(a,b));

	}

}
