import java.util.*;
class internalmarks{
        public static void main(String[] args){
                Scanner scr = new Scanner(System.in);
                System.out.println("Enter the attandance");
                int num = scr.nextInt();
                        if(num>=90){
                                System.out.println("25");
                        }else if(num<90 && num>=85){
                                System.out.println("20");
                               }else if(num<85 && num>=80){
                                System.out.println("18");
                          }else if(num<80 && num>=75){
                                System.out.println("15");
                          }else{
                                System.out.println("12");
                }


        }
}
