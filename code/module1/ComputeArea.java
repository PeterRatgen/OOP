import java.util.Scanner;

public class ComputeArea {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double radius;
    double area;

    System.out.println("Enter the number for the radius: ");
    radius = input.nextDouble();

    area = radius * radius * 3.14159;

    System.out.println("The the area of the circle: " + area);
  }
}
