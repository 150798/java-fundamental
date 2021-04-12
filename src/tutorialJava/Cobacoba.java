package tutorialJava;

public class Cobacoba {
	public static void main(String[] args) {
		
		int x,y;
		for (x=1; x <=9; x++) {
			for(y=1; y<=x; y++) {
				if (x != y){
					System.out.print(" ");
              	}else{
					System.out.println("*");
				}
			}		
	}
	    
	