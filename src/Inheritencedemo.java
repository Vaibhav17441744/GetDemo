
public class Inheritencedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      P p=new P();
      p.m1();
      C c=new C();
      c.m1();
      c.m2();
      P p1=new C();
      p1.m1();
      
	}

}
class P{
	public void m1() {
		System.out.println("parent class meth");
	}
	
}

class C extends P{
	public void m2() {
		System.out.println("child class meth");
	}
	
	
}