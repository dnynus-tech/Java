class hostel{
	public static void main(String[] args){
		int fee = 50000;
		if(fee >= 100000){
			System.out.println("AC room with 2 roommates");
		}else if(fee >= 100000){
                        System.out.println("AC room with 2 roommates");
                }else if(fee <= 100000 && fee>=80000){
                        System.out.println("AC room with 4 roommates");
                }else if(fee <= 80000 && fee>=60000){
                        System.out.println("AC room with 6 roommates");
                }else if(fee <= 60000 && fee>=40000){
                        System.out.println(" non - AC room with 2 roommates");
                }else if(fee <= 40000 && fee>=20000){
                        System.out.println("non-AC room with 4 roommates");
                }else{
		        System.out.println("no rooms");
		}
	}
}	
