class StringDemoP25{
	public static void main(String []args){

		String str1 = new String("Shashi");
		String str2 = new String("Core2Web");
		String str3 = new String("Shashi");

		System.out.println(System.identityHashCode(str1));  // (1000)
		System.out.println(System.identityHashCode(str2));  // (2000)
		System.out.println(System.identityHashCode(str3));  // (3000)
	}		// Different address because Each string make by new then string goes on Heap 
}

