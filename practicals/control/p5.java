class foeswitchdemo{
	public static void main(String[] args){
		int i = 0;
		for(;;i++){
		switch(i){
			case 1:
				System.out.print("New");
			default:
				System.out.println();
		}
		if(i==10){
			break;
		}
	}
}
}
