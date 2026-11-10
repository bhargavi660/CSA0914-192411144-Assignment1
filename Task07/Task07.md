# Task07 – Method Overriding and Specialised Behaviour

## 1. Introduction

Method overriding allows a subclass to provide its own implementation of a method already defined in its superclass.

In the Campus Smart-Parking System, different vehicle types can have different parking fee calculations.

## 2. Method Overriding

When a subclass defines a method with the same name, return type and parameters as a method in its parent class, it is called method overriding.

Example:

```java
class Vehicle {
    void displayType() {
        System.out.println("General Vehicle");
    }
}

class Car extends Vehicle {
    @Override
    void displayType() {
        System.out.println("Car");
    }
}
```

## 3. Using the @Override Annotation

The `@Override` annotation tells the compiler that a method is intended to override a parent class method.

It helps detect mistakes in method names and signatures.

## 4. Specialised Fee Calculation

Different vehicle types can have different parking charges.

Example:

```java
class Vehicle {
    double calculateFee(int hours) {
        return hours * 20;
    }
}

class Car extends Vehicle {
    @Override
    double calculateFee(int hours) {
        return hours * 30;
    }
}

class TwoWheeler extends Vehicle {
    @Override
    double calculateFee(int hours) {
        return hours * 10;
    }
}
```

Each subclass provides its own fee calculation.

## 5. Rules of Method Overriding

- The method name must be the same.
- The parameter list must be the same.
- The return type must be compatible.
- The access level cannot be more restrictive than the parent method.
- Static methods are hidden, not overridden.
- Private methods cannot be overridden.
- Final methods cannot be overridden.

## 6. Use of the final Keyword

The `final` keyword prevents further modification in certain situations.

- A final variable cannot be reassigned.
- A final method cannot be overridden.
- A final class cannot be inherited.

## 7. toString(), equals() and hashCode()

These methods are inherited from the Object class.

**toString():** Returns a string representation of an object.

**equals():** Checks whether two objects are logically equal.

**hashCode():** Returns an integer hash value used by hash-based collections.

For the parking system, two Vehicle objects can be considered equal if they have the same registration number.

When equals() is overridden, hashCode() should also be overridden consistently.

## 8. Alternative Design and Complexity Analysis

An alternative to method overriding is using conditional statements such as if-else or switch to calculate fees based on vehicle type.

**Conditional Approach:**
- All fee calculations are handled in one method.
- Adding new vehicle types requires modifying the existing method.
- The method can become difficult to maintain.

**Method Overriding:**
- Each vehicle class handles its own fee calculation.
- New vehicle types can be added with less modification to existing classes.
- It improves code organization and extensibility.

**Complexity Analysis:**

- A simple fee calculation takes O(1) time.
- The calculation uses O(1) additional space.
- Runtime method dispatch has constant overhead for ordinary method calls.

## 9. Conclusion

Method overriding allows different vehicle classes to implement specialised behaviour. In the Campus Smart-Parking System, it makes fee calculation easier to extend and maintain. The @Override annotation, final keyword, toString(), equals() and hashCode() support reliable object-oriented programming.
