import java.util.*;
class p6{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the no of element to be inserted in array");
                int n = sc.nextInt();
                char arr[]=new char[n];
                for(int i = 0;i<n;i++){
                        arr[i] = sc.next().charAt(0);
                }
                 for(int i = 0;i<n;i++){
                                System.out.print(arr[i] + " ");
                        }


}
}
