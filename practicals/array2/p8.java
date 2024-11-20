import java.util.*;
class p8{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array :");
		int n = sc.nextInt();
		int arr[]=new int[n];
		for(int i =0;i<n;i++){
			arr[i]= sc.nextInt();
		}
		for(int i =0;i<n;i++){
			if(arr[i]>5 && arr[i]<9){
				System.out.println(arr[i]+"is greater then 5 and less then 9");
		}
	}
}

}
