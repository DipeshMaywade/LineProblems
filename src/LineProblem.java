import java.util.Scanner;

public class LineProblem {
    private final double X1;
    private final double Y1;
    private final double X2;
    private final double Y2;

    public LineProblem() {
        Scanner sc = new Scanner(System.in);
        this.X1 = sc.nextDouble();
        this.Y1 = sc.nextDouble();
        this.X2= sc.nextDouble();
        this.Y2 = sc.nextDouble();
    }

    public static void main(String[] args) {

        System.out.println("Enter Coordinates For Line1 x1,y1,x2,y2");
        double lengthOfLine1 = calculation();
        System.out.println("Enter Coordinates For Line2 x1,y1,x2,y2");
        double lengthOfLine2 = calculation();

        System.out.println("Length Of Line1 " + lengthOfLine1);
        System.out.println("Length Of Line2 " + lengthOfLine2);

        if (lengthOfLine1 == lengthOfLine2) {
            System.out.println("Both Line Are Equal");
        } else if (lengthOfLine1 > lengthOfLine2) {
            System.out.println("Line1 is Bigger Than Line2");
        } else if (lengthOfLine1 < lengthOfLine2) {
            System.out.println("Line2 is Bigger Than Line1");
        }
    }

    public static double calculation() {
        LineProblem obj = new LineProblem();
        double length = Math.sqrt(Math.pow((obj.X2 - obj.X1),2) + Math.pow((obj.Y2 - obj.Y1),2));
        return length;
    }
}
