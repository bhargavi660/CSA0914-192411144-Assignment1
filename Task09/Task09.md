
# Task 09 – Abstraction in Java

## 1. Introduction

Abstraction is an important concept in Object-Oriented Programming. It hides implementation details and shows only the essential features to the user.

Java supports abstraction using:
- Abstract classes
- Interfaces

## 2. Abstract Class

An abstract class is declared using the `abstract` keyword. It cannot be directly instantiated.

Example:
```java
abstract class Vehicle {
    abstract void calculateFee();

    void display() {
        System.out.println("Campus Parking System");
    }
}
```

## 3. Abstract Method

An abstract method has no implementation in the parent class. Subclasses must provide its implementation.

Example:
```java
class Car extends Vehicle {
    @Override
    void calculateFee() {
        System.out.println("Car parking fee is Rs. 30 per hour");
    }
}
```

## 4. Interface

An interface defines a contract that implementing classes must follow.

Example:
```java
interface Chargeable {
    void chargeBattery();
}

class ElectricCar implements Chargeable {
    public void chargeBattery() {
        System.out.println("Electric car is charging");
    }
}
```

## 5. Abstract Class vs Interface

| Abstract Class | Interface |
|---|---|
| Uses the abstract keyword | Uses the interface keyword |
| Can have constructors | Cannot have constructors |
| Can contain instance variables | Fields are public, static and final by default |
| A class can extend only one class | A class can implement multiple interfaces |

## 6. Multiple Interfaces

Java allows a class to implement more than one interface.

Example:
```java
interface Chargeable {
    void charge();
}

interface Payable {
    void makePayment();
}

class ElectricCar implements Chargeable, Payable {
    public void charge() {
        System.out.println("Charging vehicle");
    }

    public void makePayment() {
        System.out.println("Payment completed");
    }
}
```

Interfaces can also contain default and static methods.

## 7. Alternative Approach and Complexity Analysis

An alternative is to use ordinary concrete classes instead of abstract classes and interfaces.

However, this may expose unnecessary implementation details and make it harder to enforce common behaviour.

Abstraction provides a common structure for different vehicle types. Method execution generally takes O(1) time, while processing n vehicles takes O(n) time. Storage for n vehicle objects is O(n).

## 8. Conclusion

Abstraction helps the campus smart-parking system hide unnecessary details and provide a common structure for different vehicle types. Abstract classes and interfaces improve flexibility, code reuse and maintainability.
