class StringDemoP21{
	public static void main(String []args){

		String str1 = "Core2Web";	// string literal (SCP)
		System.out.println(System.identityHashCode(str1));
		
		String str2 = "Core2Web";	// string literal (SCP)
		System.out.println(System.identityHashCode(str2));	

		String str3 = new String("Core2Web");	// object type string or new String (Heap)
		System.out.println(System.identityHashCode(str3)); 

		String str4 = new String("Core2Web");	// object type string or new String (Heap)
		System.out.println(System.identityHashCode(str4)); 					


	}
}

