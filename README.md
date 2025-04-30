<h1> Explanation: </h1> 
<p></p>here are some changes made to the code respectively!!!!!!!
</p> 
<b>Shape Interface:</b> The getPrice method is now included in the Shape interface to return the price of the shape.

<b>Rectangle and Circle Classes:</b>  Each of these classes has a base price, and the getPrice method returns the price of the shape.

<b>ShapeDecorator: </b> The ShapeDecorator class calculates the total price by adding the decoration cost to the base shape price.

<b>RedShapeDecorator:</b>  This decorator adds a cost for the red border and calls showCost to display the total price.


This way, when you call draw() on any decorated shape, it will show the cost of the decoration in addition to the basic shape cost.
