# Java Basic Arrays Assignment

## Overview

This project contains exercises to practice working with **arrays in Java**, including single-dimensional arrays, multi-dimensional arrays, object arrays, and common array operations. The goal is to understand array declaration, initialization, iteration, modification, and limitations.

---

## Files and Exercises

### 1. `ArrayBasics.java`

**Exercise 1: Array Basics**

* **Part A: Integer Array**

  * Declare and initialize an integer array.
  * Print the array, its length, and individual elements.
  * Modify an element and verify the change.
* **Part B: String Array**

  * Declare and initialize an array of programming languages.
  * Find the longest name.
  * Print all languages starting with `'J'`.

**Key Concepts:** Array declaration, indexing, loops, `Arrays.toString()`, string manipulation.

---

### 2. `ArrayOperations.java`

**Exercise 2: Array Operations**

* Implements methods to:

  1. Find the maximum value in an integer array.
  2. Calculate the average of elements.
  3. Count occurrences of a specific value.
  4. Reverse the array in-place.

**Key Concepts:** Methods, array traversal, in-place modification.

---

### 3. `TwoDimensionalArrays.java`

**Exercise 3: Two-Dimensional Arrays**

* **Matrix Creation:** Initialize a 3x3 matrix and print in readable format.
* **Matrix Operations:**

  * Sum of all elements.
  * Sum of main diagonal.
  * Check if a specific element exists.

**Key Concepts:** 2D array initialization, nested loops, matrix operations.

---

### 4. `ArrayLimitations.java`

**Exercise 4: Array Limitations Demonstration**

* Show why arrays have a fixed size.
* Attempt to add or remove elements.
* Explain array limitations in comments.

**Key Concepts:** Fixed-size arrays, `ArrayIndexOutOfBoundsException`, memory allocation.

---

### 5. `StudentArray.java`

**Exercise 5: Array of Objects**

* Define a `Student` class with fields: `name`, `id`, `grade`.
* Create an array of 5 students with sample data.
* Print all students.
* Find the student with the highest grade.
* Calculate the average grade.

**Key Concepts:** Object arrays, custom classes, array traversal.

---

### 6. `ArrayChallenge.java` (Optional)

**Challenge Exercise: Array Rotation**

* Rotate an array to the right by `k` positions.
* Example: `[1,2,3,4,5]` → rotate by 2 → `[4,5,1,2,3]`.

**Key Concepts:** Array rotation, modular arithmetic, in-place reversal.

---

## Prerequisites

* Java JDK installed
* Basic knowledge of:

  * Loops (`for`, `while`)
  * Conditionals (`if/else`)
  * Arrays and object-oriented programming

---

## How to Run

1. Open a terminal or IDE in the project folder.
2. Compile the Java file:

```bash
javac ArrayBasics.java
```

3. Run the program:

```bash
java ArrayBasics
```

4. Repeat for other files:

```bash
javac ArrayOperations.java
java ArrayOperations
```

---

## Notes

* Arrays in Java have **zero-based indexing**.
* The `length` property gives the size of an array.
* Arrays cannot grow or shrink dynamically; use `ArrayList` for flexible size.
* Enhanced `for-each` loops are used when the index is not needed.
* Use `Arrays.toString()` for a readable array output.

---

