class Demo{
	public static void main(String[] args){
		int x = 10;
		int y = 15;
		int z = x++ + ++y + y++ + x++;
		System.out.println(z);
		System.out.println(x);
		System.out.println(y);
	}
}

