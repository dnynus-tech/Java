class check1{
	public static void main(String[] args){
		int num = 56;
		if(num%2==0 && num%5 ==0 && num%10 == 0){
			System.out.println(num+" is divisble by 2,5and10");
		}else if(num%2==0){
                        System.out.println(num+" is divisble by 2");
                }
		else if(num%5==0){
			System.out.println(num+" is divisble by 5");
		}else{
			System.out.println("Not divisble by 2,5and 10");
		}
	}
}
