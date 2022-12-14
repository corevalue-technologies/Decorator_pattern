package main;


public abstract class ShapeDecorator implements Shape {

    protected Shape decoratedShape;

    // Abstract class method
    public ShapeDecorator(Shape decoratedShape)
    {
        this.decoratedShape = decoratedShape;
    }

    // Outside abstract class
    public void draw() { decoratedShape.draw(); }
}
