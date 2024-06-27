package com;


   public class circle implements Shape {
        private double radius;
    
        
        public circle(double radius) {
            this.radius = radius;
        }
    
        
        @Override
        public double area() {
            return Math.PI * radius * radius;
        }
    
        
        @Override
        public double perimeter() {
            return 2 * Math.PI * radius;
        }
    }
    
    

