package myproject;

public class greatestofthreenumbers {
	public static void main(String arg[]) {
		int a=23;
		int b=46;
		int c=59;
		int greatest;
		if(a>=b && a>=c) {
			greatest = a;
		} else if(b>=a && b>=c) {
			greatest = b;
		} else {
			greatest = c;
		}
		System.out.println("the greatest number is " +greatest);
		
	}

}
