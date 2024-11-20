import java.util.*;
class evennodd{
	public static void main(String[] args){
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the number to check whether even or odd");
		int num = scr.nextInt();
		if(num %2==0){
			System.out.println(num +  "is even number ");
		}else{
			System.out.println(num +"is odd number");
		}
	}
}
