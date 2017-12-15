
public class Customer extends Person {
	public int c, m;
	
	public Customer(){
		c = 201702018;
		m = 2000;
	}
	
	public void SC(int c){this.c = c;} public void SM(int m){this.m=m;}
	public int GC(){return c;}  public int GM(){return m;}

}
