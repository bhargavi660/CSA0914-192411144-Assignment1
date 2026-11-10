
# Task 11 – Complete System Implementation and Testing

## 1. Introduction

The campus smart-parking system combines object-oriented programming concepts to manage vehicle entry, parking allocation, fee calculation and vehicle exit.

## 2. Main Features

- Registers vehicles entering the parking facility.
- Allocates available parking slots.
- Calculates parking fees based on vehicle type and parking duration.
- Releases parking slots when vehicles exit.
- Displays vehicle and parking information.
- Handles invalid inputs.

## 3. Testing

The system should be tested using different test cases.

| Test Case | Input | Expected Result |
|---|---|---|
| Normal entry | Valid vehicle number | Vehicle registered |
| Available slot | Free parking slot | Slot allocated |
| Full parking | No free slots | Parking unavailable |
| Normal exit | Valid occupied slot | Slot released |
| Invalid slot | Negative slot number | Error handled |
| Zero parking time | 0 minutes | Zero fee |
| Duplicate vehicle | Existing registration number | Duplicate rejected |

## 4. Fee Calculation

Assume the parking fee is:

- Car: Rs. 30 per hour
- Two-wheeler: Rs. 10 per hour

Example:

For a car parked for 3 hours:

Fee = 3 × 30 = Rs. 90

For a two-wheeler parked for 2 hours:

Fee = 2 × 10 = Rs. 20

## 5. Object-Oriented Concepts Used

- Encapsulation protects vehicle and ticket information.
- Inheritance allows different vehicle types to share common properties.
- Polymorphism provides different fee calculations.
- Abstraction hides unnecessary implementation details.
- Constructors initialize vehicle and parking objects.

## 6. Data Structure Comparison

| Data Structure | Advantages | Disadvantages |
|---|---|---|
| Array | Simple and fixed-size storage | Difficult to resize |
| ArrayList | Dynamic size and easy insertion | Searching may take O(n) |
| HashMap | Fast average lookup by vehicle number | Requires additional memory |

A HashMap can be useful for finding active parking tickets using vehicle registration numbers.

## 7. Complexity Analysis

- Sequential parking-slot search: O(n)
- Vehicle lookup using an array: O(n)
- Vehicle lookup using HashMap: O(1) average case
- Releasing a known parking slot: O(1)
- Storage for n vehicles: O(n)

## 8. Limitations

- The basic implementation does not use a database.
- Payment processing is simulated.
- Real-time parking sensors are not connected.
- User authentication is not implemented.

## 9. Conclusion

The campus smart-parking system demonstrates how object-oriented programming concepts can be combined to build a parking management application. Testing helps identify errors and improves the reliability of the system.
