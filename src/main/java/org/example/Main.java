package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        List<Shape3DInterface> shapes = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int shapeType = random.nextInt(3);
            switch (shapeType) {
                case 0 -> { // Sphere
                    double radius = 1 + random.nextDouble() * 9; // Random radius [1, 10]
                    shapes.add(new Sphere(radius));
                }
                case 1 -> { // Cylinder
                    double radius = 1 + random.nextDouble() * 9; // Random radius [1, 10]
                    double height = 5 + random.nextDouble() * 15; // Random height [5, 20]
                    shapes.add(new Cylinder(radius, height));
                }
                case 2 -> { // Cube
                    double side = 1 + random.nextDouble() * 9; // Random side length [1, 10]
                    shapes.add(new Cube(side));
                }
            }
        }

        // Print details of each shape
        for (Shape3DInterface shape : shapes) {
            System.out.println(shape);
            System.out.printf("Surface Area: %.2f, Volume: %.2f%n", shape.surfaceArea(), shape.volume());
        }

    }
}