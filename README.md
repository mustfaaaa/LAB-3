<h1> Explanation: </h1> 
<p></p>here are some changes made to the code respectively!!!!!!!
</p> 
<b>Shape Interface:</b> The getPrice method is now included in the Shape interface to return the price of the shape.

<b>Rectangle and Circle Classes:</b>  Each of these classes has a base price, and the getPrice method returns the price of the shape.

<b>ShapeDecorator: </b> The ShapeDecorator class calculates the total price by adding the decoration cost to the base shape price.

<b>RedShapeDecorator:</b>  This decorator adds a cost for the red border and calls showCost to display the total price.


This way, when you call draw() on any decorated shape, it will show the cost of the decoration in addition to the basic shape cost.

<h1>CODE 2</h1>
Added UTF8Decorator:
A new decorator class that ensures data is encoded and decoded using UTF-8 during file write and read operations.

<b>Decorator Logic:</b>

<b>On writeData:</b> Converts the string to UTF-8 bytes and back to a string for consistent encoding.

<b>On readData:</b> Converts the read string back to UTF-8 bytes and then decodes it.

<b>Integration:</b>
Can be added to the existing decorator chain (e.g., before EncryptionDecorator) to ensure UTF-8 compatibility.

<b>Other Classes:</b>
No changes were made to FileDataSource, DataSourceDecorator, CompressionDecorator, or EncryptionDecorator.

This change enhances character encoding consistency in multi-layered data processing.
