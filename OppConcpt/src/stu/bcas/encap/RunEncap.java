package stu.bcas.encap;

public class RunEncap {
	public static void main(String args[] ) {
		EncapTest encap = new EncapTest();
		encap.setName("jemes");
		encap.setAge("20");
		encap.setidNum("123456v");		
		System.out.println("\nName : " + encap.getName() + "\nAge :" + encap.getAge() +"\nidNum : " + encap.getidNum());
	}
	

}
