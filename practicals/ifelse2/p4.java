class stud{
	public static void main(String[] args){
		float per = 85.03f;
		if(per > 85.00){
			System.out.println("Medical field");
		}else if(per<=85.00 && per>75.00 ){
                        System.out.println("Engineering field");
		} else if(per<=75.00&& per<65.00){
                        System.out.println("pharmacy");
		}else{
			System.out.println("repeat");
		}
	}
}
