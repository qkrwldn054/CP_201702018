package II;

public class Graduate extends Student {
	public String e;
	public double r;
	
	public Graduate(){
		e = "±³À°Á¶±³";
		r = 0.45;	
		}
	
	public void SE(String e){this.e=e;} public void SR(double r){this.r=r;}
	
	public String GE(){return e;} public double GR(){return r;}
}
