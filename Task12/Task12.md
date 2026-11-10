
# Task 12 – Day-4 Challenge: Extending the Smart-Parking System

## 1. Introduction

The Day-4 challenge extends the existing campus smart-parking system by introducing new vehicle categories, visitor passes and multiple parking floors.

The system must support new requirements without affecting its existing functionality.

## 2. New Requirements

The updated system introduces four major changes:

1. **Electric Bikes:** Electric bikes are charged a fixed flat parking fee.
2. **Delivery Vans:** Delivery vans are charged twice the normal car parking rate between 9 AM and 5 PM.
3. **One-Day Visitor Pass:** Visitors can use a one-day parking pass.
4. **Multiple Floors:** The parking facility supports five floors with different numbers of parking slots.

## 3. Impact Analysis

These requirements affect the existing system in the following ways:

- New vehicle classes are required.
- Fee calculation must support different pricing rules.
- Visitor pass validity must be checked.
- Parking allocation must support unequal floor capacities.
- Existing vehicle types must continue working correctly.

## 4. Proposed Object-Oriented Design

The system can be extended using inheritance, abstraction, interfaces and polymorphism.

### Vehicle Hierarchy

- Vehicle – Common abstract parent class.
- Car – Represents cars.
- TwoWheeler – Represents two-wheelers.
- ElectricBike – Represents electric bikes.
- DeliveryVan – Represents delivery vans.

### Additional Classes

- VisitorPass – Stores visitor pass details and validity.
- ParkingFacility – Manages parking slots across multiple floors.
- ParkingTicket – Stores vehicle entry and exit information.

## 5. Parking Fee Rules

| Vehicle Type | Fee Rule |
|---|---|
| Car | Normal car rate |
| Two-Wheeler | Normal two-wheeler rate |
| Electric Bike | Fixed flat fee |
| Delivery Van | Double car rate from 9 AM to 5 PM |

A visitor with a valid one-day pass can park according to the pass conditions.

## 6. Multiple-Floor Parking Design

A two-dimensional or jagged array can represent the five parking floors.

Each floor can have a different number of slots.

Example:

```java
int[] slotsPerFloor = {20, 25, 30, 35, 40};
```

The system can use this array to create the parking structure dynamically.

## 7. Alternative Design Approach

An alternative is to use a large switch statement to check each vehicle type and calculate its fee.

However, this makes the program harder to maintain when new vehicle categories are introduced.

Using inheritance and method overriding allows each vehicle class to implement its own fee calculation.

A jagged array is suitable for floors with unequal slot counts. An ArrayList could also be used for dynamically changing parking capacity.

## 8. Testing

The extended system should be tested using the following cases:

| Test Case | Expected Result |
|---|---|
| Electric bike entry | Vehicle registered |
| Electric bike exit | Flat fee calculated |
| Delivery van during 9 AM–5 PM | Double car rate applied |
| Delivery van outside this period | Normal applicable rate |
| Valid visitor pass | Parking permitted |
| Expired visitor pass | Parking rejected |
| Five-floor allocation | Correct floor and slot assigned |
| Full parking facility | Parking unavailable |
| Existing car entry | Normal functionality maintained |

## 9. Trade-offs and Limitations

- Additional vehicle classes increase the number of classes in the system.
- Visitor pass validation requires date and time information.
- Multiple floors require more complex slot management.
- A database would be useful for storing permanent parking records.
- Real-time sensors and payment integration are not included in the basic implementation.

## 10. Conclusion

The Day-4 challenge improves the campus smart-parking system by supporting additional vehicle types, visitor passes and multiple parking floors.

Using object-oriented programming makes the system easier to extend, maintain and modify when new requirements are introduced.
