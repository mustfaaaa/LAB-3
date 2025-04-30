package LABS.decoratorPattern;

public abstract class ShapeDecorator implements Shape {
   protected Shape decoratedShape;
   protected double decorationPrice; // Price for decoration

   public ShapeDecorator(Shape decoratedShape, double decorationPrice) {
      this.decoratedShape = decoratedShape;
      this.decorationPrice = decorationPrice;
   }

   @Override
   public void draw() {
      decoratedShape.draw(); // Draw the shape
      showCost(); // Display the cost
   }

   @Override
   public double getPrice() {
      return decoratedShape.getPrice() + decorationPrice; // Add decoration cost to the shape's price
   }

   // Show the cost of the shape and decoration
   private void showCost() {
      System.out.println("Total cost: " + getPrice());
   }
}