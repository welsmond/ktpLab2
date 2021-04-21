import java.util.Scanner;
public class Lab1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите координаты первой точки x y z: ");
        int X = in.nextInt();
        int Y = in.nextInt();
        int Z = in.nextInt();
        Point3d p1 = new Point3d(X,Y,Z);

        System.out.print("Введите координаты второй точки x y z: ");
        X = in.nextInt();
        Y = in.nextInt();
        Z = in.nextInt();
        Point3d p2 = new Point3d(X,Y,Z);

        System.out.print("Введите координаты третьей точки x y z: ");
        X = in.nextInt();
        Y = in.nextInt();
        Z = in.nextInt();
        Point3d p3 = new Point3d(X,Y,Z);

        in.close();

        System.out.println("Площадь треугольника: " + computeArea(p1, p2, p3));

    }

    public static double computeArea(Point3d p1, Point3d p2, Point3d p3) {

        if (p1.isEqual(p2) || p2.isEqual(p3) || p3.isEqual(p1)) {
            System.out.println("Одна из точек равна другой");
            return -1;
        } else {
            double a = p1.distanceTo(p2);
            double b = p2.distanceTo(p3);
            double c = p3.distanceTo(p1);
            double p = (a+b+c)/2;
            return (Math.sqrt(p*(p-a)*(p-b)*(p-c)));
        }
    }
}
