class StringDemoP34{
	public static void main(String [] args){
		String str1 = new String("Shashi");	// Object1
		System.out.println(str1);	// Shashi
		System.out.println(System.identityHashCode(str1));

		str1 = str1+"Bagal";	// Object2
		System.out.println(str1);	//ShashiBagal
		System.out.println(System.identityHashCode(str1));
		
		str1 = str1+"C2W";	// Object3
		System.out.println(str1);	// ShashiBagalC2W
		System.out.println(System.identityHashCode(str1));

	}
}

