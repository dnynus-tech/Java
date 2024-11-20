class per{
	public static void main(String[] args){
		float per = 56.0f;
		if(per>=85.00){
			System.out.println("Passed:first class with distinction");
		}else if(per>=75.00 && per<=85.00){
                        System.out.println("Passed:first class with distinction");
		}else if(per>=65.00 && per<=75.00){
                        System.out.println("Passed:first class ");
                }else if(per>=35.00 && per<=65.00){
                        System.out.println("Passed:second class");
		}else{
                        System.out.println("fail");
                }
	}
}
