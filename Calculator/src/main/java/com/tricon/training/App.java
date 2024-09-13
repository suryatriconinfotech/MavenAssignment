package com.tricon.training;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        AddClass add=new AddClass();
        SubtractClass subtract = new SubtractClass();
        MultiplyClass multiply = new MultiplyClass();
        DivideClass divide = new DivideClass();

        int a = 10;
        int b = 5;

        System.out.println("Addition: " + add.add(a, b));
        System.out.println("Subtraction: " + subtract.subtract(a, b));
        System.out.println("Multiplication: " + multiply.multiply(a, b));
        System.out.println("Division: " + divide.divide(a, b));

    }
}
