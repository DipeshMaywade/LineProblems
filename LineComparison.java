import java.util.Scanner;

public class LineProblem {

    public static void main(String[] args) {

        System.out.println("Enter Coordinates For Line1");
        double lengthOfLine1= lengthCalculation();
        System.out.println("Enter Coordinates For Line2");
        double lengthOfLine2= lengthCalculation();

        System.out.println("Length Of Line1 "+ lengthOfLine1);
        System.out.println("Length Of Line2 "+ lengthOfLine2);

        if(lengthOfLine1==lengthOfLine2){
            System.out.println("Both Line Are Equal");
        }
        else if (lengthOfLine1>lengthOfLine2){
            System.out.println("Line1 is Bigger Than Line2");
        }
        else if (lengthOfLine1<lengthOfLine2){
            System.out.println("Line2 is Bigger Than Line1" );
        }
    }

    static double lengthCalculation(){
        double x1,x2,y1,y2;
        double dis;

        Scanner sc=new Scanner(System.in);

        System.out.println("enter x1,y1,x2,y2 point");
        x1=sc.nextDouble();
        y1=sc.nextDouble();
        x2=sc.nextDouble();
        y2=sc.nextDouble();

        dis= Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));

        return dis;
    }
}
