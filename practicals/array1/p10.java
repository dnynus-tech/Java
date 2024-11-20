import java.util.*;
class rollno{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the no of student ");
                int n = sc.nextInt();
                int arr[]=new int[n];
		System.out.print("Enter the Roll No :");
                for(int i = 0;i<n;i++){
                        arr[i] = sc.nextInt();
                }
		System.out.print("The roll no of student are :");
                 for(int i = 0;i<n;i++){
                                System.out.print(arr[i] + " ");
                        }


}
}
