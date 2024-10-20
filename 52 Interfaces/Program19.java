interface MacD19{
	public void burger(){
		System.out.println("Making Burger");
	}
	public void fries(){
		System.out.println("Making Fries");
	}
	public void revenue();
}
class SinhgadMacD19 implements MacD19{
	public void revenue(){
		System.out.println("1Cr");
	}
}
class DhayriMacD19 implements MacD19{
	public void revenue(){
		System.out.println("1.5Cr");
	}
}
class PetrolMacD19 implements MacD19{
	public void revenue(){
		System.out.println("2Cr");
	}
}

