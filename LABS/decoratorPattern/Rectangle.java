package LABS.decoratorPattern;

public class Rectangle implements Shape {
   private double price = 50.0; // Price for rectangle

   @Override
   public void draw() {
      System.out.println("Shape: Rectangle");
   }

   @Override
   public double getPrice() {
      return price; // Return the price of the rectangle
   }
}