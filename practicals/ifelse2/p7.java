class profit{
	public static void main(String[] args){
		double costp = 1200;
		double sellingp = 1500;
		if(costp>sellingp){
			System.out.println(costp - sellingp+"loss");
		}else if(costp<sellingp){
                        System.out.println(sellingp - costp +" profit");
                }else{
			System.out.println("both are equal");
		}
	}
}
