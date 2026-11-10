# Task05 – Static Members and Object Life Cycle

## 1. Introduction

Static members belong to the class rather than individual objects. They are useful in the Campus Smart-Parking System for maintaining shared information such as ticket numbers and total vehicle occupancy.

## 2. Static Variables

A static variable is shared by all objects of a class.

Example:

```java
class ParkingTicket {
    static int ticketCounter = 1000;
    int ticketNumber;

    ParkingTicket() {
        ticketNumber = ++ticketCounter;
    }
}
```

Every new ticket receives a unique ticket number.

## 3. Static Methods

Static methods belong to the class and can be called without creating an object.

Example:

```java
class ParkingFacility {
    static int totalOccupancy = 0;

    static void displayOccupancy() {
        System.out.println("Total Occupancy: " + totalOccupancy);
    }
}
```

A static method can directly access static members.

## 4. Static Block

A static block executes once when the class is loaded. It is generally used to initialize static variables.

Example:

```java
class ParkingSystem {
    static int totalSlots;

    static {
        totalSlots = 50;
    }
}
```

## 5. Object Life Cycle

The life cycle of an object includes:

1. **Object creation:** An object is created using the `new` keyword.
2. **Initialization:** Constructors initialize the object's fields.
3. **Usage:** The object is used by calling its methods.
4. **Unreachable state:** The object becomes eligible for garbage collection when it is no longer reachable.
5. **Garbage collection:** The JVM may reclaim the memory occupied by eligible objects.

Garbage collection is managed automatically by the Java Virtual Machine.

## 6. Passing and Returning Objects

Java allows objects to be passed as method arguments and returned from methods.

This helps different parts of the parking system share and process vehicle information.

## 7. Alternative Design and Complexity Analysis

An alternative is to maintain the ticket counter as an instance variable instead of a static variable.

**Instance Counter:**
- Every object maintains its own counter.
- Different parking facilities may generate duplicate ticket numbers.
- Additional coordination is required for a shared ticket sequence.

**Static Counter:**
- All objects share one counter.
- It provides a common ticket sequence within the class.
- It is suitable for maintaining shared information.

**Complexity Analysis:**

- Accessing or updating a static counter takes O(1) time.
- Static variables require O(1) additional storage for each static field.
- Each object requires memory for its own instance variables.

## 8. Conclusion

Static variables and methods help maintain shared information in the Campus Smart-Parking System. A static ticket counter can generate unique ticket numbers, while static occupancy information can track shared parking data. Understanding object life cycle and garbage collection helps manage memory efficiently.
