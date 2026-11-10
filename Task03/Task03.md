# Task 03 – Design the Control Logic

## 1. Introduction

The Campus Smart-Parking System requires control logic to allocate free parking slots and calculate parking fees. Loops and conditional statements are used to perform these operations correctly.

## 2. Slot Allocation Logic

The system searches each floor and each slot until it finds the first available slot.

- A `for` loop checks each floor.
- A nested `for` loop checks the slots on that floor.
- If a slot is free (`null`), the vehicle number is stored.
- The `return` statement immediately returns the allocated floor and slot.
- If no free slot is found, the method returns `null`.

## 3. Parking Fee Calculation

The parking fee depends on vehicle type and parking duration.

Example pricing assumptions:

| Vehicle Type | First Hour | Each Additional Hour | Daily Maximum |
|---|---:|---:|---:|
| Two-wheeler | Rs 10 | Rs 10 | Rs 100 |
| Car | Rs 30 | Rs 30 | Rs 300 |
| Electric Vehicle | Rs 40 | Rs 40 | Rs 400 |

Every started hour is charged as a complete hour.

The fee is calculated using conditional statements such as `if-else`. A daily maximum is applied to prevent the fee from exceeding the specified limit.

## 4. Use of break, continue and return

- **break:** Stops searching once a suitable free slot is found.
- **continue:** Skips an unsuitable or occupied slot and checks the next slot.
- **return:** Returns the allocated position or calculated fee immediately.

These statements reduce unnecessary operations and make the control flow easier to understand.

## 5. When No Suitable Slot Is Available

If all slots are occupied or no slot matches the vehicle requirements, the allocation method returns `null`. The system can then display a message such as "No suitable parking slot available."

## 6. Pseudocode for Slot Allocation

```text
ALGORITHM AllocateSlot(vehicleNo)

    FOR each floor f
        FOR each slot s in floor f

            IF slot[f][s] is empty THEN
                slot[f][s] = vehicleNo
                RETURN {f, s}
            END IF

        END FOR
    END FOR

    RETURN NULL

END ALGORITHM
```

## 7. Pseudocode for Parking Fee Calculation

```text
ALGORITHM CalculateFee(vehicleType, minutes)

    IF minutes <= 0 THEN
        RETURN 0
    END IF

    hours = (minutes + 59) / 60

    IF vehicleType is TwoWheeler THEN
        rate = 10
        dailyMaximum = 100

    ELSE IF vehicleType is Car THEN
        rate = 30
        dailyMaximum = 300

    ELSE IF vehicleType is ElectricVehicle THEN
        rate = 40
        dailyMaximum = 400

    ELSE
        RETURN INVALID_VEHICLE_TYPE
    END IF

    fee = hours * rate

    IF fee > dailyMaximum THEN
        fee = dailyMaximum
    END IF

    RETURN fee

END ALGORITHM
```

## 8. Alternative Concept and Complexity Analysis

The original approach scans all floors and slots to find an available position.

An alternative approach uses:
- A count of free slots for every floor.
- A stack containing the available slot positions.

### Comparison

| Operation | Scanning Approach | Stack-Based Approach |
|---|---|---|
| Allocation | O(F × S) worst case | O(1) |
| Release | O(1) with known position | O(1) |
| Extra storage | O(1) beyond slot storage | O(F × S) for free-slot stacks |
| Implementation | Simple | Requires additional data structures |

Here, F represents the number of floors and S represents the maximum number of slots per floor.

A stack-based approach can improve allocation time because the system can retrieve an available slot directly instead of scanning every slot. However, the stack must be updated correctly whenever a slot is allocated or released.

## 9. Conclusion

Loops and conditional statements provide the control logic required for the Smart-Parking System. The scanning approach is simple and suitable for a small parking facility. For a larger facility, maintaining free-slot information can improve allocation performance.
