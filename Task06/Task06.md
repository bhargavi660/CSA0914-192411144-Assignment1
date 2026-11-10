# Task06 – Inheritance and Vehicle Hierarchy

## 1. Introduction

Inheritance is an important concept in Object-Oriented Programming. It allows one class to acquire the properties and methods of another class.

In the Campus Smart-Parking System, inheritance can represent different types of vehicles such as cars, two-wheelers and electric cars.

## 2. Inheritance Hierarchy

The Vehicle class acts as the parent class. Other vehicle classes inherit its common properties and methods.

Example hierarchy:

```text
                 Vehicle
                    |
          ---------------------
          |         |         |
        Car    TwoWheeler  ElectricCar
```

## 3. Superclass and Subclasses

**Superclass:** The parent class whose properties and methods are inherited.

**Subclass:** The child class that inherits properties and methods from the parent class.

Example:

```java
class Vehicle {
    String vehicleNo;

    void display() {
        System.out.println("Vehicle Number: " + vehicleNo);
    }
}

class Car extends Vehicle {
    int numberOfDoors;
}

class TwoWheeler extends Vehicle {
    boolean hasHelmetSpace;
}

class ElectricCar extends Car {
    int batteryCapacity;
}
```

## 4. Types of Inheritance in Java

1. **Single Inheritance:** One subclass inherits from one superclass.
2. **Multilevel Inheritance:** A class inherits from a subclass, forming multiple levels.
3. **Hierarchical Inheritance:** Multiple subclasses inherit from one superclass.
4. **Multiple Inheritance:** Java does not support multiple inheritance through classes, but it can be achieved using interfaces.

## 5. Use of the `super` Keyword

The `super` keyword refers to the immediate parent class.

It is used to:
- Access parent class variables.
- Call parent class methods.
- Call parent class constructors.

Example:

```java
class Vehicle {
    Vehicle(String vehicleNo) {
        System.out.println("Vehicle: " + vehicleNo);
    }
}

class ElectricCar extends Vehicle {
    ElectricCar(String vehicleNo) {
        super(vehicleNo);
        System.out.println("Electric Car Created");
    }
}
```

## 6. Constructor Execution Order

When an ElectricCar object is created, the parent class constructor executes before the child class constructor.

Example:

```java
ElectricCar e = new ElectricCar("TN01AB1111");
```

Execution order:

1. Vehicle constructor executes.
2. ElectricCar constructor executes.

Output:

```text
Vehicle: TN01AB1111
Electric Car Created
```

## 7. Alternative Design and Complexity Analysis

An alternative to inheritance is composition.

Instead of creating separate subclasses, a Vehicle class can contain a VehicleType object that stores vehicle-specific information.

**Inheritance:**
- Provides code reuse.
- Represents an IS-A relationship.
- Makes common vehicle behaviour easier to maintain.

**Composition:**
- Provides greater flexibility.
- Allows vehicle characteristics to be changed without changing the class hierarchy.
- Can reduce dependency between classes.

**Complexity Analysis:**

- Accessing inherited fields and methods generally takes O(1) time.
- Creating an object with a fixed number of fields takes O(1) space.
- The number of classes does not directly determine the execution time of a method.

## 8. Conclusion

Inheritance helps organize different vehicle categories in the Campus Smart-Parking System. A common Vehicle superclass reduces code duplication, while subclasses provide specialized properties. The `super` keyword helps access parent class constructors and methods.
