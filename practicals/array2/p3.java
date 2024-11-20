import java.util.*;
class p3{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the size of array :");
                int n = sc.nextInt();
                char arr[]= new char[n];
                for(int i = 0;i<n;i++){
                        arr[i]= sc.next().charAt(0);
                }
                for(int i=0;i<n;i++){
                        if(arr[i]=='a'||arr[i]=='A'||arr[i]=='e'||arr[i]=='E'||arr[i]=='i'||arr[i]=='I'||arr[i]=='o'||arr[i]=='O'||arr[i]=='u'||arr[i]=='U'){
				System.out.print(arr[i] + " ");
			}
		}
	}
}
