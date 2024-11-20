import java.util.*;
class positivennegative{
        public static void main(String[] args){
                Scanner scr = new Scanner(System.in);
                System.out.println("Enter the first number ");
                int num1 = scr.nextInt();
		System.out.println("Enter the second number");
		int num2 = scr.nextInt();
		int num = 0;
		if(num1>=0 && num2>=0){
			num = num1 * num2;
			if(num%2==0){
				System.out.println("The product is Even");
			}else{
				System.out.println("the product is odd");
			}
		}else{
			System.out.println("the number is negative");
                }


        }
}
