public class Main {
    public static void main(String[] args) {
        
    }

    public static double area (double radius){
        double pi = Math.PI;
        double radiusSquared = Math.pow(radius, 2);
        if (radius < 0){
            return -1.0;
        } else {
            return pi * radiusSquared;

        }
    }

    public static double area (double x, double y){
        if (x < 0 || y < 0){
            return -1.0;
        } else {
            return x * y;
        }
    }
}