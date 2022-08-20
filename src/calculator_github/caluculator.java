package calculator_github;

public class caluculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float answer = add(2,43);
		System.out.println(answer);
		answer = subtract(2.34f,1.3f);
		System.out.println(answer);
		answer = multiply(2.34f,1.3f);
		System.out.println(answer);
		

	}
	
	public static float add(float a, float b) {
		return(a+b);
	}
	
	public static float subtract(float a, float b) {
		return(a-b);
	}
	
	public static float multiply(float a, float b) {
		return(a*b);
		
	}
}
