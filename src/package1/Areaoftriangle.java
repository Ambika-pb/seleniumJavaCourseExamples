package package1;

public class Areaoftriangle {


	// non-static method
    public void square()
	{
    	int a,side=5;
    	a=side*side;
    	// print sentence and varible at a time we use concatinate operator (+)
    	System.out.println("area" +a);
	}
 // non-static method
    public  static void triangle()
  	{
      	double a;
      	int base=5,height=5;
      	a=0.5*base*height;
      	System.out.println(a);
  	}
  	
    public void circle()
  	{
      	double a;
      	int radius=5;
      	a=3.142*radius*radius;
      	System.out.println(a);
  	}
  	
	
	public static void main(String[] args) {
		
		Areaoftriangle obj = new Areaoftriangle();
        obj.square();
        //calling a static method
       Areaoftriangle.triangle();
        obj.circle();


	}}




