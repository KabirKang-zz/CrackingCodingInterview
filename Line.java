// Question 7.3 answered

public class Line{
    static double epsilon = 0.000001;
    public double slope;
    public double yint;
    public Line(double s, double y){
        slope = s;
        yint = y;
    }
    public boolean intersect(Line line2){
        return Math.abs(slope - line2.slope)>epsilon || 
	    Math.abs(yint-line2.yint)<epsilon;
    }
    public static void main(String [] args){
	System.out.println("Hello");
	Line line1,line2;
	line1 = new Line(2,2);
	line2 = new Line(2,3);
	System.out.println(line1.intersect(line2));
    }
}