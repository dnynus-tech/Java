import java.util.*;
class p2{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int sum =0;
                System.out.print("Enter the size of array :");
                int n = sc.nextInt();
                int arr[]= new int[n];
                for(int i = 0;i<n;i++){
                        arr[i]= sc.nextInt();
                }
                for(int i=0;i<n;i++){
                        if(arr[i]%3==0){
                                System.out.print(arr[i]);
                                sum=sum+arr[i];
                        }
                }
                System.out.println("sum is :" + sum);
        }
}
