package javaedubridge;

 interface Abc {
	void m1();
	

}
class Interface implements Abc{
	public void m1() {
		System.out.println("hello,aishwarya!!\n");
		
	}
	public static void main(String[]args) {
		Interface bb=new Interface();
		bb.m1(); 
	}
	
}