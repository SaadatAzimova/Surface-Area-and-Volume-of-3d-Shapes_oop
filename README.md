3D Shapes Polymorphism Project
Description
This project demonstrates the use of Object-Oriented Programming (OOP) principles to calculate the surface area and volume of various 3D shapes: Sphere, Cylinder, and Cube. It employs the concept of interfaces and polymorphism to achieve extensibility and maintainability.

The project includes:

An interface Shape3DInterface that defines methods for calculating surface area and volume.
Three classes (Sphere, Cylinder, and Cube) that implement the interface, each with its unique formulas.
A main program that generates a list of 10 random 3D shape objects and prints their details, such as dimensions, surface area, and volume.

Polymorphism in Action

1.Interface Reference: The list shapes is defined as List<Shape3DInterface>, which means it can hold references to any object that implements the Shape3DInterface interface (i.e., Sphere, Cylinder, and Cube).
List<Shape3DInterface> shapes = new ArrayList<>();

2.Uniform Access to Different Objects:
Objects of different types (Sphere, Cylinder, and Cube) are added to the shapes list. Despite being different classes, they are all treated as Shape3DInterface objects in the list.
shapes.add(new Sphere(radius));
shapes.add(new Cylinder(radius, height));
shapes.add(new Cube(side));

3.Dynamic Method Dispatch:When the surfaceArea() and volume() methods are called on objects in the list, Java dynamically determines the appropriate implementation to execute based on the actual type of the object (e.g., Sphere, Cylinder, or Cube).
for (Shape3DInterface shape : shapes) {
    System.out.println(shape);
    System.out.printf("Surface Area: %.2f, Volume: %.2f%n", shape.surfaceArea(), shape.volume());
}

Screenshots:

![3doop1](https://github.com/user-attachments/assets/afc96f05-d992-441a-ba14-650c704f7338)
![3doop2](https://github.com/user-attachments/assets/21c31139-2087-4f71-848e-309d8748a554)
![3doop3](https://github.com/user-attachments/assets/cc2d39c6-cd2c-441b-b623-83c22724a203)
