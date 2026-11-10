# Task 01 – Understand the Problem and Identify the Objects

## 1. Problem Analysis

The Campus Smart-Parking System manages vehicles entering and leaving a multi-level parking facility. It allocates suitable parking slots, generates unique parking tickets, records entry time and calculates parking fees based on vehicle type and parking duration.

The system supports two-wheelers, cars and electric vehicles. It also provides free parking for students and staff with valid monthly passes, while visitors pay the applicable parking fee.

## 2. Inputs and Outputs

### Inputs
- Vehicle registration number
- Vehicle type
- Entry time and exit time
- Floor and slot details
- User category (Student, Staff or Visitor)
- Monthly pass validity

### Outputs
- Allocated floor and slot number
- Unique parking ticket number
- Vehicle entry and exit details
- Total parking duration
- Calculated parking fee
- Available parking slot information

## 3. Candidate Classes and Responsibilities

| Candidate Class | Responsibility |
|---|---|
| Vehicle | Stores vehicle registration number and common vehicle details. |
| TwoWheeler | Represents a two-wheeler vehicle. |
| Car | Represents a car. |
| ElectricVehicle | Represents an electric vehicle and charging details. |
| ParkingSlot | Stores slot number, floor number and occupancy status. |
| ParkingFloor | Manages the slots available on a floor. |
| ParkingTicket | Stores ticket number, vehicle details and entry time. |
| ParkingFacility | Manages floors, slot allocation and slot release. |
| ParkingUser | Stores user details and pass information. |
| FeeCalculator | Calculates parking fees based on vehicle type and duration. |

Each class has a separate responsibility. This improves readability, maintainability and extensibility.

## 4. Nouns and Verbs

**Nouns identified as candidate classes:**
Vehicle, ParkingSlot, ParkingFloor, Parking
