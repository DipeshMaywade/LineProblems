import java.util.Scanner;

public class LineProblem {
    private final double x1;
    private final double y1;
    private final double x2;
    private final double y2;

    public LineProblem() {
        Scanner sc = new Scanner(System.in);
        this.x1 = sc.nextDouble();
        this.y1 = sc.nextDouble();
        this.x2 = sc.nextDouble();
        this.y2 = sc.nextDouble();
    }

    public static void calculation() {

        System.out.println("For Line One");
        LineProblem line1 = new LineProblem();
        double lengthOfLine1 = Math.sqrt((line1.x2 - line1.x1) * (line1.x2 - line1.x1) + (line1.y2 - line1.y1) * (line1.y2 - line1.y1));
        System.out.println("For Line Two");
        LineProblem line2 = new LineProblem();
        double lengthOfLine2 = Math.sqrt((line2.x2 - line2.x1) * (line2.x2 - line1.x1) + (line2.y2 - line2.y1) * (line2.y2 - line2.y1));


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
    public static void main(String[] args) {
        calculation();
    }

}
