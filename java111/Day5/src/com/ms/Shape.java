package com.ms;

public class Shape {

    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        r.breadth=3;
        r.length=9;

        Circle c=new Circle();
        c.radius=7;

        Square sq=new Square();
        sq.side=5;

        sq.area();
        c.area();
        r.area();
    }
}
