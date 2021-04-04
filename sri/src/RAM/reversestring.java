package RAM;


public class reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 String original, reverse = "";
	      Scanner in = new Scanner(System.in);
	 
	      System.out.println("Enter a string to reverse");
	      original = in.nextLine();
	 
	      int length = original.length();
	 
	      for ( int i = length - 1 ; i >= 0 ; i-- )
	         reverse = reverse + original.charAt(i);
	 
	      System.out.println("Reverse of entered string is: "+reverse); 
	      */
		
		 StringBuffer a = new StringBuffer("Java programming is fun");
	      System.out.println(a.reverse());
	}

}
