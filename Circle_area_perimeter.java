//Program to output perimeter and area of a circle 

import java.util.Scanner;

public class Circle_area_perimeter {
    
   public static void main(String[] args) {
    
     //A = pir^2   //P = 2pir

     double pi = 3.14;

     double radius;
 
     Scanner sc = new Scanner(System.in);
 
    System.out.print("Enter the radius of the circle: ");
    radius = sc.nextInt();
    
    double area = pi*(radius*radius);
    double perimeter = 2*pi*radius;

    System.out.println(("The area of the circle is: " + area + "\nThe perimeter of the circle is: " + perimeter));

    sc.close();
   }
}
