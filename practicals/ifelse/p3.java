class check{
	public static void main(String[] args){
		int num = 13;
		if(num%2==0 && num>10){
			System.out.println("the number is even and greater then 10");
		}else if(num%2==0 && num<10){
			System.out.println("the number is even but less  then 10");
		}else if(num%2==0 && num==10){
                        System.out.println("the number is even and equal to 10");
                }else if(num%2!=0 && num>10){
                        System.out.println("the number is odd and greater  then 10");
                }else if(num%2!=0 && num<10){
                        System.out.println("the number is odd but less  then 10");
                }else{
                        System.out.println("the number is odd equal to 10");
                }
	}
}
