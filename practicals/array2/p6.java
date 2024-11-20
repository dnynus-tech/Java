import java.util.*;
class p6{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the number of elements  :");
                int num = sc.nextInt();
                int arr[] = new int[num];
                for(int i = 0;i<num;i++){
                        arr[i]= sc.nextInt();
                }

                System.out.print("sum of odd index is :");
                int prod = 1;
                for(int i=0;i<num;i++){
                if(i%2!=0){
                           prod=prod*arr[i];
                        }
                }
                System.out.print(prod);
                }
}
