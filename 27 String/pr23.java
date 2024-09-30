class StringDemoP23{
	public static void main(String []args){

		String str1 = "Shashi";	// string literal (SCP)
		System.out.println(System.identityHashCode(str1));
		
		String str2 = "Shashi Bagal";	// string literal (SCP)
		System.out.println(System.identityHashCode(str2));	

		String str3 = new String("Shashi");	// object type string or new String (Heap)
		System.out.println(System.identityHashCode(str3)); 

		String str4 = new String("Shashi");	// object type string or new String (Heap)
		System.out.println(System.identityHashCode(str4)); 					


	}
}

