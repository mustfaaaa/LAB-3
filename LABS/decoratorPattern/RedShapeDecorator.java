package LABS.decoratorPattern;

public class RedShapeDecorator extends ShapeDecorator {

   public RedShapeDecorator(Shape decoratedShape) {
      super(decoratedShape, 10.0); // Red decoration costs 10.0
   }

   @Override
   public void draw() {
      decoratedShape.draw(); // Draw the shape
      setRedBorder(decoratedShape); // Add red border
   }

   private void setRedBorder(Shape decoratedShape){
      System.out.println("Border Color: Red");
   }
}