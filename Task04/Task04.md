# Task04 – Classes, Objects and Constructors

## 1. Introduction

Classes and objects are the basic building blocks of Object-Oriented Programming in Java. In the Campus Smart-Parking System, classes represent entities such as Vehicle, Car, ElectricCar and ParkingFacility.

## 2. Classes and Objects

- **Class:** A blueprint that defines attributes and methods.
- **Object:** An instance of a class created using the `new` keyword.

Example:

```java
class Vehicle {
    String vehicleNo;
    String vehicleType;

    void displayDetails() {
        System.out.println(vehicleNo + " " + vehicleType);
    }
}
```

Creating an object:

```java
Vehicle v1 = new Vehicle();
v1.vehicleNo = "TN01AB1111";
v1.vehicleType = "Car";
v1.displayDetails();
```

## 3. Constructors

A constructor initializes an object when it is created. It has the same name as the class and does not have a return type.

### Default Constructor

A constructor with no parameters.

```java
Vehicle() {
    vehicleNo = "Not Assigned";
}
```

### Parameterized Constructor

A constructor that accepts values as parameters.

```java
Vehicle(String number, String type) {
    vehicleNo = number;
    vehicleType = type;
}
```

### Constructor Overloading

Defining multiple constructors with different parameter lists in the same class.

```java
Vehicle() {
    vehicleNo = "Unknown";
}

Vehicle(String number) {
    vehicleNo = number;
}

Vehicle(String number, String type) {
    vehicleNo = number;
    vehicleType = type;
}
```

## 4. Use of `this` Keyword

The `this` keyword refers to the current object. It is used to distinguish instance variables from constructor parameters.

```java
Vehicle(String vehicleNo, String vehicleType) {
    this.vehicleNo = vehicleNo;
    this.vehicleType = vehicleType;
}
```

## 5. Constructor Chaining

Constructor chaining means calling one constructor from another constructor using `this()`.

```java
Vehicle() {
    this("Unknown", "Not Assigned");
}

Vehicle(String number, String type) {
    this.vehicleNo = number;
    this.vehicleType = type;
}
```

The `this()` statement must be the first statement in the constructor.

## 6. Copy Constructor

A copy constructor creates a new object using the values of an existing object.

```java
Vehicle(Vehicle other) {
    this.vehicleNo = other.vehicleNo;
    this.vehicleType = other.vehicleType;
}
```

Java does not provide a built-in copy constructor; it can be created by the programmer.

## 7. Memory Allocation: Stack and Heap

- **Stack:** Stores local variables and method-call information, including local object references.
- **Heap:** Stores objects and their instance data created using `new`.
- Objects that are no longer reachable may become eligible for garbage collection.

## 8. Alternative Design and Complexity Analysis

An alternative to using constructors is to create objects using setter methods or factory methods.

**Setter Methods:**
- Objects can be created first and initialized later.
- Values can be changed after object creation.
- Invalid or incomplete objects may be created if validation is not used.

**Factory Methods:**
- Provide a controlled way to create objects.
- Can validate input before returning an object.
- Improve flexibility when object creation becomes complex.

**Comparison:**

Constructors initialize objects immediately and help maintain valid object states. Setter methods provide flexibility but may allow incomplete objects. Factory methods provide better control over object creation.

The time complexity of assigning a fixed number of fields during object creation is O(1). The space complexity for one object with a fixed number of fields is O(1).

## 9. Conclusion

Classes and objects help organize the Campus Smart-Parking System. Constructors initialize vehicle details, constructor overloading provides different ways to create objects, and the `this` keyword helps access current object members. These concepts improve code organization, reusability and maintainability.
