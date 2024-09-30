class StringDemoP26{
	public static void main(String []args){

		String str1 = "Kanha";	//SCP
		String str2 = "Ashish";	//SCP
		String str3 = new String("Kanha");	// HEAP
		String str4 = "KanhaAshish";	//SCP

		System.out.println(System.identityHashCode(str1)); 
		System.out.println(System.identityHashCode(str2));  
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
			
	}		 
}

