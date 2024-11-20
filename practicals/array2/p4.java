import java.util.*;
class p4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements  :");
		int num = sc.nextInt();
		int arr[] = new int[num];
		for(int i = 0;i<num;i++){
			arr[i]= sc.nextInt();
		}

		System.out.println("enter the number to search :");
		int search= sc.nextInt();
		for(int i=0;i<num;i++){
		if(arr[i]==search){
				System.out.println(search +"is at the index"+i);
			}
		}
		}
}
