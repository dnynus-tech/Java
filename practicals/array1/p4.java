import java.util.*;
class p4{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
		int sum =0;
                System.out.print("Enter the no of element to be inserted in array");
                int n = sc.nextInt();
                int arr[]=new int[n];
                for(int i = 0;i<n;i++){
                        arr[i] = sc.nextInt();
                }
                 for(int i = 0;i<n;i++){
			 if(arr[i]%2!=0){
                           sum = sum+arr[i];     
                        }}
			System.out.println(sum);
		 

}
}
