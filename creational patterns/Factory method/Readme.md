pattern 1 : Factory method

factory method is a structural design pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created. In this pattern, the superclass defines a method that returns an object of a derived class, but the actual creation of the object is deferred to the derived classes.

Here's an example implementation in Java:
we have an abstract class 'vehicule' with a factory method 'VehiculeFactory'. The 'Moto' and 'Voiture' classes are derived classes that implement the 'VehicleFactory' interface.