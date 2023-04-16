package package1;

public class Constructor {

	
			public	double  volume, pi=3.14;
			// no need to wright public 
			Constructor() {
				
				int height=5,radius=5;
				volume = pi*radius*radius*height;
				
				System.out.println("defalt constuctor output"+ volume);
				
			}
			
		    public Constructor(int a, int b) {
		        volume = pi*a*a*b;
				
				System.out.println("parameterized constuctor output"+ volume);
				
				
			}
			 
			public static void main(String[] args) {
				
			
				
				 new Constructor();

				new Constructor(4, 4);
				
			}

		}


	


