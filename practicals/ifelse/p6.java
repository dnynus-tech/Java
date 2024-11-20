class div3{
	public static void main(String[] args){
		int num = 56;
		if(num%3==0 && num %7==0){
			System.out.println("divisble by both 3 and 7");
		}
		else if(num%3==0||num %7==0){
			if(num%3==0){
				System.out.println("divisble by 3");
			}
			else{
				System.out.println("Divisble by 7");
			}
		}
		else {
			System.out.println("not divisble by 3 and 7");}
	}
}
