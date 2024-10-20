interface MacD20{
	default public void burger(){
		System.out.println("Making Burger");
	}
	default public void fries(){
		System.out.println("Making Fries");
	}
	public void revenue();
}
class SinhgadMacD20 implements MacD20{
	public void revenue(){
		System.out.println("1Cr");
	}
}
class DhayriMacD20 implements MacD20{
	public void revenue(){
		System.out.println("1.5Cr");
	}
}
class PetrolMacD20 implements MacD20{
	public void revenue(){
		System.out.println("2Cr");
	}
}

