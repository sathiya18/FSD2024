package ptu.cse.sathya;


public class DebuggingExample3Watch {
	    public static void main(String[] args) {
	        int length = 10;
	        int width = 5;
	        int area = calculateArea(length, width);
	        System.out.println("Area of the rectangle: " + area);
	    }

	    public static int calculateArea(int length, int width) {
	        return length * width;
	    }
	}

