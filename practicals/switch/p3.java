import java.util.*;
class size{
        public static void main(String[] args){
                Scanner scr = new Scanner(System.in);
                System.out.println("Enter the size(capital)");
                char size = scr.next().charAt(0);

                switch(size){
                        case 'S':
                                System.out.println("small");
                                break;
                        case 'M':
                                System.out.println("Medium");
                                break;
                        case 'L':
                                System.out.println("large");
                                break;
                   
                        default:
                                System.out.println("Extra large");
                }


        }
}
