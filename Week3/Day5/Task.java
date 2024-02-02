// package com.codewithharry.shape;

// import java.awt.image.PixelInterleavedSampleModel;

// class Rectangle {
//     private double length;
//     private double width;

//     public Rectangle(double length, double width) {
//         this.length = length;
//         this.width = width;
//     }

//     public double getLength() {
//         return length;
//     }

//     public void setLength(double length) {
//         this.length = length;
//     }

//     public double getWidth() {
//         return width;
//     }

//     public void setWidth(double width) {
//         this.width = width;
//     }

//     public double calculateArea() {
//         return length * width;
//     }
// }


//  class Square extends Rectangle {
//     public Square(double side) {
//         super(side, side);
//     }
// }


//  class Circle {
//     private double radius;

//     public Circle(double radius) {
//         this.radius = radius;
//     }

//     public double getRadius() {
//         return radius;
//     }

//     public void setRadius(double radius) {
//         this.radius = radius;
//     }

//     public double calculateArea() {
//         return Math.PI * radius * radius;
//     }
// }


//  class Cylinder extends Circle {
//     private double height;

//     public Cylinder(double radius, double height) {
//         super(radius);
//         this.height = height;
//     }

//     public double getHeight() {
//         return height;
//     }

//     public void setHeight(double height) {
//         this.height = height;
//     }

//     public double calculateVolume() {
//         return calculateArea() * height;
//     }
// }


//  class Sphere extends Circle {
//     public Sphere(double radius) {
//         super(radius);
//     }

//     public double calculateVolume() {
//         return (4.0 / 3.0) * Math.PI * Math.pow(getRadius(), 3);
//     }
// }

// public class Task{
//   public static void main(String[] args){
    
//   }
// }
