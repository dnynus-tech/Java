import java.util.*;
class marks{
        public static void main(String[] args){
                Scanner scr = new Scanner(System.in);
                System.out.println("Enter the marks of 5 subject");
                int mark1 = scr.nextInt();
		int mark2 = scr.nextInt();
		int mark3 = scr.nextInt();
		int mark4 = scr.nextInt();
		int mark5 = scr.nextInt();
		int sum =0;
		if(mark1>35 && mark2>35 && mark3>35 && mark4>35 && mark5>35){
			sum = mark1+mark2+mark3+mark4+mark5;
			if(sum>=450){
				System.out.println("first class with distinction");
			}else if(sum<450 && sum>=400){
				System.out.println("first class ");
			}else if(sum<400 && sum>=350){
                                System.out.println("second class ");
			}else if(sum<350 && sum>=300){
                                System.out.println("first class ");
			}else{
				System.out.println("PASS");
			}
		}else{
			System.out.println("FAIL");
		}
	}
}
