package II;

public class Student {
	public String n, d, g, c;
    
	public Student(){
		n = "박지우";
		d = "컴퓨터공학과";
		g = "1학년";
		c = "18학점";
	}
	
	public void SN(String n){this.n=n;} public void SD(String d){this.d=d;}
	public void SG(String g){this.g=g;} public void SC(String c){this.c=c;}
	
	public String GN(){return n;} public String GD(){return d;}
	public String GG(){return g;} public String GC(){return c;}
	

}
