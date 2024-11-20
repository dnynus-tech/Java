import java.util.*;
class p9{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the no of element to be inserted in array");
                int n = sc.nextInt();
                int arr[]=new int[n];
                for(int i = 0;i<n;i++){
                        arr[i] = sc.nextInt();
                }
                 for(int i = 0;i<n;i++){

			 if(i%2 !=0){
                                System.out.print(arr[i] + "is an odd indexed element  ");
                        }
		 }

}
}
