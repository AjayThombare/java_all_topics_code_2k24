class StringDemoP27{
	public static void main(String []args){

		String str1 = "Kanha";	
		String str2 = "Ashish";	
		String str3 = "KanhaAshish";	//SCP
		String str4 = str1 + str2;

		// System.out.println(str4);

		System.out.println(System.identityHashCode(str1)); 
		System.out.println(System.identityHashCode(str2));  
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
			
	}		 
}

