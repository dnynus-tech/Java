import java.util.*;
class p7{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the number of elements  :");
                int num = sc.nextInt();
                int arr[] = new int[num];
                for(int i = 0;i<num;i++){
                        arr[i]= sc.nextInt();
                }
                for(int i=0;i<num;i++){
                if(num%2==0){
                           if(i%2==0){
				   System.out.print(arr[i]);
                        }
			 
                }else{
			System.out.print(arr[i]);
		}
		}

         
                }
}
