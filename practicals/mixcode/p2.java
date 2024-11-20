import java.util.*;
class code2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of row");
		int row = sc.nextInt();
		for(int i = 0 ; i<row ;i++){
			for(int j = row ; j>=0 ; j--){
				System.out.print((char)64+row);
				System.out.print(i+j + "");
			}System.out.println();
		}
	}
}

