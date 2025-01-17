class Demo7{
	void fun()throws IOException{
		System.out.println("In fun");
	}
	public static void main(String [] args)throws IoException{
		Demo7 obj = new Demo7();
		obj.fun();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		System.out.println(str);
	}
}

