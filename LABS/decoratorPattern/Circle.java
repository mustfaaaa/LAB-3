package LABS.decoratorPattern;

public class Circle implements Shape {
   private double price = 30.0; // Price for circle

   @Override
   public void draw() {
      System.out.println("Shape: Circle");
   }

   @Override
   public double getPrice() {
      return price; // Return the price of the circle
   }
}