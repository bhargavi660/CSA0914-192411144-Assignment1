
# Task 10 – Packages, Access Modifiers and Encapsulation

## 1. Introduction

Packages, access modifiers and encapsulation are important Java concepts that help organize and protect program data.

## 2. Packages in Java

A package is a group of related classes and interfaces. It helps organize code and avoid naming conflicts.

Example:
```java
package parking;
```

Advantages:
- Organizes classes.
- Avoids naming conflicts.
- Improves code reusability.
- Provides access protection.

## 3. Access Modifiers

Java provides four main access levels.

| Modifier | Accessibility |
|---|---|
| private | Within the same class |
| default | Within the same package |
| protected | Same package and subclasses |
| public | Accessible from anywhere |

## 4. Encapsulation

Encapsulation means combining data and methods into a single class and restricting direct access to data.

It is implemented using private variables and public getter and setter methods.

Example:
```java
class Vehicle {
    private String vehicleNo;

    public void setVehicleNo(String vehicleNo) {
        if (vehicleNo != null && !vehicleNo.isEmpty()) {
            this.vehicleNo = vehicleNo;
        }
    }

    public String getVehicleNo() {
        return vehicleNo;
    }
}
```

## 5. Data Validation

Setter methods can validate data before storing it.

Example:
```java
public void setParkingHours(int hours) {
    if (hours > 0) {
        this.parkingHours = hours;
    }
}
```

This prevents invalid values from being assigned.

## 6. Wrapper Classes and Autoboxing

Wrapper classes convert primitive data types into objects.

Examples:
- int → Integer
- double → Double
- char → Character
- boolean → Boolean

Autoboxing automatically converts a primitive value into its wrapper object.

Example:
```java
int a = 10;
Integer b = a;
```

Unboxing converts a wrapper object back into a primitive value.

Using `==` to compare two Integer objects can produce unexpected results because it may compare object references. Use `.equals()` to compare their values.

## 7. Alternative Approach and Complexity Analysis

An alternative is to declare variables as public and allow direct access.

However, this does not provide proper data protection or validation.

Encapsulation provides controlled access through getter and setter methods.

Accessing a field or using a simple getter or setter generally takes O(1) time. The storage required for each vehicle object is O(1).

## 8. Conclusion

Packages help organize the campus smart-parking system. Access modifiers control visibility, while encapsulation protects vehicle information and prevents invalid data from being stored.
