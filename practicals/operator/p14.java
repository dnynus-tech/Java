class c2w{
        public static void main(String[] args){
		int fee = 2500;
		int studentregular = 20;
		int studentextrenal = 15;
		int total = studentregular + studentextrenal ;
		int totalfee = total*fee;
		int studinclass = total-studentextrenal;
		int perstudfee = totalfee / total ;
		 System.out.println(fee);
		  System.out.println( studentregular);
		   System.out.println(studentextrenal);
		 System.out.println(total);
		 System.out.println(totalfee);
		 System.out.println(studinclass);
                 System.out.println(perstudfee);


        }
}
