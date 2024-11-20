import java.util.*;
class trip{
        public static void main(String[] args){
                Scanner scr = new Scanner(System.in);
                System.out.println("Enter the budget");
                int budget = scr.nextInt();

                switch(budget){
                        case 15000:
                                System.out.println("JAMMU N KASHMIR");
                                break;
                        case 10000:
                                System.out.println("MANALI");
                                break;
                        case 6000:
                                System.out.println("AMRITSAR");
                                break;
                        case 2000:
                                System.out.println("MAHABALESHWAR");
                                break;

                        default:
                           	System.out.println("FOR THE OTHER BUUDGET TRY NEXT TIME");
                }


        }
}
