import java.util.*;
class grade{
        public static void main(String[] args){
                Scanner scr = new Scanner(System.in);
                System.out.println("Enter the grade(capital)");
		char grade = scr.next().charAt(0);

		switch(grade){
			case 'O':
				System.out.println("outstanding");
				break;
			case 'A':
			        System.out.println("excellent");
			        break;
			case 'B':
			 	System.out.println("very good");
				break;
			case 'C':
				System.out.println("good");
				break;
			default:
				System.out.println("FAIL");
		}
	
                
        }
}
