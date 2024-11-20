class code11{
        public static void main(String[] args){
                int row=4;

                for(int i =1;i<=row;i++){
                        for(int j = i ; j<=row;j++){
				if(j%2==0){
					int k = j+64;
                                        System.out.print((char)k + " ");
				}else{
					System.out.print(j+64 + " ");
				}
                        }System.out.println();
                }
        }
}
