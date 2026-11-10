# Task 02 – Choose the Data Representation

## 1. Introduction

The Campus Smart-Parking System requires suitable Java data types and array structures to store vehicle details, parking slots, entry times, parking duration and fees.

The data representation should support different floors and different numbers of parking slots on each floor.

## 2. Selection of Data Types

| Data | Java Data Type | Reason |
|---|---|---|
| Floor number | int | Stores whole-number floor values. |
| Slot number | int | Represents the slot position. |
| Vehicle registration number | String | Contains letters and numbers. |
| Vehicle type | String or enum | Identifies the category of vehicle. |
| Entry time | LocalDateTime | Stores date and time accurately. |
| Exit time | LocalDateTime | Stores the vehicle's exit date and time. |
| Parking duration | long | Stores duration in minutes. |
| Parking fee | double | Represents fees that may contain decimal values. |
| Pass validity | boolean | Indicates whether a
