# Java Methods: String and Number Operations

**Author:** Daniel Chung  
**Course:** CSCI 125 – Programming I  
**Section:** M01  
**Institution:** New York Institute of Technology  
**Language:** Java

## Overview

This program contains five static methods that perform common string and numeric operations. Developed for introductory programming coursework, it demonstrates method parameters, return values, loops, and Java's built-in string utilities.

A demonstration method calls each operation using predefined examples. No keyboard input is required.

## Methods

| Method | Purpose |
|--------|---------|
| `reverse(String str)` | Reverses a string using `StringBuilder`. |
| `thewordsswitched(int d)` | Reverses an integer's digits using remainder and division operations. |
| `fibonaccinumberexample(int daniel)` | Calculates a Fibonacci number iteratively, using F(0) = 0 and F(1) = 1. |
| `numericalnumers(int chung)` | Repeatedly sums a nonnegative integer's digits until a single digit remains. |
| `isSubstring(String mainStr, String subStr)` | Checks whether one string contains another using `contains()`. |

## Example Results

| Operation | Input | Result |
|-----------|-------|--------|
| String reversal | `"Dogs!"` | `"!sgoD"` |
| Integer digit reversal | `1904` | `4091` |
| Fibonacci calculation | Position `10` | `55` |
| Digital root | `9875` | `2` |
| Substring detection | `"hello"` contains `"ell"` | `true` |

For the digital-root example:

```text
9875 → 9 + 8 + 7 + 5 = 29
29 → 2 + 9 = 11
11 → 1 + 1 = 2
```

## Concepts Practiced

- Static methods
- Parameters and return values
- String, integer, and Boolean types
- For and while loops
- Nested loops
- Remainder and integer division
- Iterative calculations
- StringBuilder and string methods
- Calling reusable methods from a demonstration program

## Required Setup Corrections

The supplied file requires two changes before it can run as a standard Java application:

1. Rename `Daniel_ChungLab6.java` to `Main.java` because the source declares `public class Main`.
2. Change the demonstration method name from uppercase `Main` to lowercase `main`.

Replace:

```java
public static void Main(String[] args)
```

with:

```java
public static void main(String[] args)
```

Java is case-sensitive, so `Main()` is not recognized as the standard application entry point.

## How to Run

### Requirements

Install a Java Development Kit (JDK) with `javac` and `java` available in your terminal. No external libraries are required.

### Compile and Execute

After applying the setup corrections, open a terminal in the folder containing `Main.java`:

```sh
javac Main.java
java Main
```

The program runs all five examples in sequence.

## Expected Output After Setup Corrections

```text
The current information provided: Dogs! and the phrase reversed is: !sgoD

The reversed integer product of result 1904 is equal to 4091

Fibonacci number at position 10: 55

The amount figure for the number 9875 is 2

Is it true that 'ell' is a substring of 'hello'? true
```

## Current Limitations

- Demonstration inputs are hardcoded and must be edited to try different examples.
- Fibonacci results exceed the Java int range starting at position 47.
- Reversing sufficiently large integers can cause integer overflow.
- Reversed integers do not preserve leading zeros: reversing `1200` produces `21`.
- Negative Fibonacci positions are not validated and currently return `0`.
- The digital-root method returns negative inputs unchanged.
- Substring matching is case-sensitive.
- String methods do not include null-input handling.

## Learning Objective

Practice dividing a program into reusable methods while applying iteration, numeric operations, and string manipulation to small computational problems.
