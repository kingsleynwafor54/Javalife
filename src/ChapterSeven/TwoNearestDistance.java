package ChapterSeven;

import java.util.Scanner;

public class TwoNearestDistance {
    public static double distance(double x1,double x2,double y1,double y2){
        return Math.sqrt((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1));
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number of point");
        int numberOfPoint=scanner.nextInt();
        double[][] points=new double[numberOfPoint][2];
        System.out.println("Enter "+ numberOfPoint+" points: ");
        for(int counter=0;counter<points.length;counter++){
            System.out.println("input your row value");
            points[counter][0]=scanner.nextInt();
            System.out.println("input your column value");
            points[counter][1]=scanner.nextInt();
        }
        //defining the shortest distance from the first  and second rows and column
    int p1=0,p2=1;
        double shortestDistance=distance(points[p1][0],points[p1][1],points[p2][0],points[p1][1]);

        for(int  counter =0; counter<points.length;counter++){
            for(int count=counter+1;count<points.length;count++){
                double distance= distance(points[counter][0], points[counter][1],points[count][0], points[count][1]);
           if (shortestDistance> distance){
               p1=counter;
               p2=count;
               shortestDistance=distance;
           }
            }
            System.out.println("The closest two points are " +"(" + points[p1][0] + ", " + points[p1][1] + ") and ("+ points[p2][0]+","+ points[p2][1] + ")");

        }
    }
}
