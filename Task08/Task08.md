
# Task 08 – Polymorphism in Java

## 1. Introduction

Polymorphism means one name having many forms. In Java, polymorphism allows the same method to behave differently depending on the object.

There are two types of polymorphism:
- Compile-time polymorphism (Method Overloading)
- Runtime polymorphism (Method Overriding)

## 2. Method Overloading

Method overloading means defining multiple methods with the same name but different parameters.

Example:
```java
void calculateFee(int hours) {
    System.out.println(hours * 20);
}

void calculateFee(int hours, double rate) {
    System.out.println(hours * rate);
}
```

## 3. Method Overriding

Method overriding occurs when a subclass provides its own implementation of a method inherited from its superclass.

Example:
```java
class Vehicle {
    void display() {
        System.out.println("Vehicle");
    }
}

class Car extends Vehicle {
    @Override
    void display() {
        System.out.println("Car");
    }
}
```

## 4. Runtime Polymorphism

A superclass reference can refer to a subclass object. The overridden method is selected at runtime based on the actual object.

Example:
```java
Vehicle v = new Car();
v.display();
```

Output:
```text
Car
```

## 5. Upcasting and Dynamic Method Dispatch

Upcasting means storing a subclass object in a superclass reference.

Dynamic method dispatch allows Java to decide which overridden method to execute at runtime.

Example:
```java
Vehicle[] vehicles = {
    new Car(),
    new TwoWheeler()
};

for (Vehicle v : vehicles) {
    v.calculateFee();
}
```

## 6. Advantages of Polymorphism

- Reduces repeated code.
- Improves flexibility.
- Makes programs easier to maintain.
- Avoids lengthy if-else conditions.
- Supports runtime method selection.

## 7. Alternative Approach and Complexity Analysis

An alternative is using if-else or switch statements to check the vehicle type and calculate the parking fee.

However, this approach becomes difficult to maintain when new vehicle types are added.

Using polymorphism, each vehicle class implements its own fee calculation method.

The method call takes O(1) time, while processing n vehicles takes O(n) time. The vehicle array requires O(n) space.

## 8. Conclusion

Polymorphism makes the campus smart-parking system flexible. Different vehicle types can calculate their parking fees using the same method name with different implementations.
