import java.util.Scanner;

public class LineCompariosn{
	public static void main(String[] args){

		Scanner a = new Scanner(System.in);
		System.out.println("Enter the Value Of X1");
		int l1x1 = a.nextInt();

                System.out.println("Enter the Value Of y1");
                int l1y1 = a.nextInt();

                System.out.println("Enter the Value Of x2");
                int l1x2 = a.nextInt();

                System.out.println("Enter the Value Of y2");
                int l1y2 = a.nextInt();

		double lengthOfLine1= Math.sqrt((l1x2-l1x1)^2+(l1y2-l1y1)^2);
		System.out.println("DistanceBetween"+"("+l1x1+","+l1y1+"),"+"("+l1x2+","+l1y2+")===>"+lengthOfLine1);


		System.out.println("Enter the Value Of X1");
                int l2x1 = a.nextInt();

                System.out.println("Enter the Value Of y1");
                int l2y1 = a.nextInt();

                System.out.println("Enter the Value Of x2");
                int l2x2 = a.nextInt();

                System.out.println("Enter the Value Of y2");
                int l2y2 = a.nextInt();

                double lengthOfLine2= Math.sqrt((l2x2-l2x1)^2+(l2y2-l2y1)^2);
                System.out.println("DistanceBetween"+"("+l2x1+","+l2y1+"),"+"("+l2x2+","+l2y2+")===>"+lengthOfLine2);

		if (lengthOfLine1==lengthOfLine2){

			System.out.println("Both Line are Equal");
		}

		else {
			System.out.println("Line Are Not Equal");
		}
	}

}
