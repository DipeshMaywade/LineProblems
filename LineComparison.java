import java.util.Scanner;

public class LineCompariosn{
	public static void main(String[] args){

		Scanner a = new Scanner(System.in);
		System.out.println("Enter the Value Of X1");
		int x1 = a.nextInt();

                System.out.println("Enter the Value Of y1");
                int y1 = a.nextInt();

                System.out.println("Enter the Value Of x2");
                int x2 = a.nextInt();

                System.out.println("Enter the Value Of y2");
                int y2 = a.nextInt();

		double lengthOfLine= Math.sqrt((x2-x1)^2+(y2-y1)^2);
		System.out.println("DistanceBetween"+"("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+lengthOfLine);

	}

}
