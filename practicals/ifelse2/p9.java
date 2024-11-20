class pythagoren{
	public static void  main(String[] args){
		int a = 3;
		int b = 4;
		int c = 5;
		if(a*a+b*b==c*c){
			System.out.println("pythagoren triplet");
		}else if(c*c+b*b==a*a){
                        System.out.println("pythagoren triplet");
                }else if(a*a+c*c==b*b){
                        System.out.println("pythagoren triplet");
                }else{
                        System.out.println(" not a pythagoren triplet");
                }
	}
}
