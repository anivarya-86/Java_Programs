# 🧮 Java Basic Projects & Calculators

Welcome to my Java learning repository! 🚀
This repository contains a collection of essential Java programs that perform mathematical calculations using user input. I created these while learning Core Java concepts.

## 📂 Included Programs
Here is a list of the tools available in this project:

### 1. ➗ Arithmetic Calculator (`AllArithmeticOperators.java`)
A complete calculator that takes two numbers and performs:
- Addition (+)
- Subtraction (-)
- Multiplication (*)
- Division (/)
- Modulus (%)

### 2. 💰 Simple Interest Calculator (`SimpleInterest.java`)
A financial tool to calculate Simple Interest based on:
- Principal Amount
- Rate of Interest
- Time Period

### 3. 📐 Triangle Area Calculator (`AreaOFTriangle.java`)
Calculates the area of a triangle using the formula `0.5 * Base * Height`.

### 4. 📏 Perimeter Calculator (`Perimeter.java`)
Calculates the perimeter of a quadrilateral shape by summing up the values of all 4 sides provided by the user.
### 5. 🌡️ Temperature Converter (`FahrenheitToCelsius.java`)
A useful tool that converts temperature from Fahrenheit (°F) to Celsius (°C).
- **Formula:** `(Fahrenheit - 32) * 5/9`
- **Features:** Takes user input for temperature and outputs the precise Celsius value.
### 6. ➕➖ Positive, Negative or Zero Checker (`PositiveNegative.java`)
A logic-based program that checks the nature of a number provided by the user.
- It determines if the number is **Positive**, **Negative**, or **Zero**.
- Demonstrates the use of `if-else if-else` conditional statements.

### 7. 🔢 Odd or Even Checker (`OddEven.java`)
A classic beginner program to verify if a number is **Odd** or **Even**.
- **Logic:** Uses the modulus operator (`%`).
- If `number % 2 == 0`, it prints **Even**, otherwise **Odd**.
- 
### 8. 📅 Leap Year Checker (`LeapYear.java`)
A program to determine whether a specific year is a Leap Year or a standard year.
- **Logic:** Validates if a year is divisible by 4.
- **Advanced Logic:** Correctly handles century years (e.g., 2000 is a leap year, but 1900 is not) by checking divisibility by 100 and 400.
  
### 9. 🎓 Student Grade Calculator (`GradeCalculator.java`)
A program that evaluates student performance based on marks obtained.
- **Input:** Takes the marks or percentage from the user.
- **Output:** Assigns a specific Grade (A, B, C, D, or Fail) based on predefined score ranges.
- **Key Concept:** Demonstrates the efficient use of `else-if` ladders to handle multiple conditions.
  
### 10. 🏆 Greatest of Three Numbers (`GreatestOfThree.java`)
A program that takes three numbers as input and identifies the largest among them.
- **Logic:** Compares three variables (A, B, and C) using relational operators.
- **Key Concept:** Demonstrates the use of Logical AND (`&&`) operators combined with `if-else` blocks to efficiently find the maximum value.
  
### 11. ⚙️ Bitwise Operators Showcase (`BitwiseOperators.java`)
A comprehensive program demonstrating the power of Bitwise operators in Java.
- **Operations Covered:**
  - **Bitwise AND (`&`):** Performs logical AND on individual bits.
  - **Bitwise OR (`|`):** Performs logical OR on individual bits.
  - **Bitwise XOR (`^`):** Exclusive OR operation.
  - **Bitwise NOT (`~`):** Inverts all the bits of a number.
    
### 12. ⚡ Odd or Even (Bitwise Method) (`BitwiseOddEven.java`)
An optimized way to check if a number is Odd or Even without using the modulo (`%`) operator.
- **Logic:** Checks the Least Significant Bit (LSB) using `(number & 1)`.
- **Efficiency:** This method is computationally faster than the standard division method.
  
### 13. ✖️ Multiplication Table Generator (`TableGenerator.java`)
A program that prints the multiplication table for any number entered by the user.
- **Input:** Takes an integer (e.g., 5).
- **Output:** Displays the table from 1 to 10 in a structured format.
- **Key Concept:** Demonstrates the use of **Loops** (`for` loop or `while` loop) to perform repetitive calculations efficiently
  
### 14. ❗ Factorial Calculator (`Factorial.java`)
A mathematical program that calculates the factorial of a non-negative integer.
- **Example:** The factorial of 5 (`5!`) is `5 * 4 * 3 * 2 * 1 = 120`.
- **Logic:** Uses a loop (`for` or `while`) to multiply a series of descending integers.
- **Key Concept:** Demonstrates how to use an **accumulator variable** to store results inside a loop.

### 15. 🔢 Sum of Odd Numbers (`SumOfOddNumbers.java`)
A program designed to calculate the sum of all odd numbers up to a specific limit set by the user.
- **Example:** If input is `10`, it calculates `1 + 3 + 5 + 7 + 9 = 25`.
- **Logic:** Uses a loop to traverse numbers and an `if` condition (`i % 2 != 0`) to filter and add only the odd values.
- **Key Concept:** filtering data inside loops and calculating cumulative sums.

### 16. 🔗 LCM Calculator (`LCM.java`)
A program that finds the Least Common Multiple of two given numbers.
- **Example:** For inputs `4` and `6`, the LCM is `12` (since 12 is the smallest number divisible by both).
- **Logic:** Starts checking from the larger of the two numbers and increments until a value divisible by both inputs is found.
- **Key Concept:** Uses `while` loops and the modulus operator (`%`) to find common divisibility.

### 17. 🛡️ Prime Number Checker (`PrimeNumber.java`)
A classic algorithm to determine if a number is Prime (divisible only by 1 and itself).
- **Example:** `7` is Prime, but `9` is not (since 3 divides 9).
- **Logic:** Iterates through numbers to check for any divisibility other than 1 and the number itself.
- **Key Concept:** Uses a `boolean` flag to track the status and  using methods in program.

 ### 18. 🌀 Fibonacci Series Generator (`Fibonacci.java`)
A program that prints the Fibonacci sequence up to a specific number of terms.
- **Example:** If input is `5`, output is `0, 1, 1, 2, 3`.
- **Logic:** Each number is the sum of the two preceding ones (`Third = First + Second `).
- **Key Concept:** Demonstrates variable swapping logic inside a loop to update values in each iteration.

### 19. 🔁 Palindrome Checker (`Palindrome.java`)
A program that verifies if a number remains the same when its digits are reversed.
- **Example:** `121` reversed is `121` (Palindrome), but `123` reversed is `321` (Not Palindrome).
- **Logic:** Extracts digits from the number, builds the reverse number, and compares it with the original.
- **Key Concept:** Uses a `while` loop with modulus (`%`) and division (`/`) operators to reverse an integer.

### 20. 💪 Armstrong Number Checker (`ArmstrongNumber.java`)
A program to check if a number is an Armstrong number (where the sum of the cubes of its digits equals the number itself).
- **Example:** `153` is an Armstrong number because `(1*1*1) + (5*5*5) + (3*3*3) = 153`.
- **Logic:** Extracts digits one by one, cubes them, and adds them to a sum variable.
- **Key Concept:** Reuses the digit extraction logic from the Palindrome program but applies mathematical powers.🤖

### 21. 📊 Array Sum & Average (Modular Approach) (`ArraySumAverage.java`)
A program that calculates the sum and average of an array using a separate utility class for input handling.
- **Files Involved:** `ArraySumAverage.java` (Logic) and `ArrayUtility.java` (Input Helper).
- **Key Concept:** Demonstrates **Modular Programming** by separating the main logic from the input logic.
- **Logic:** accurately calculates average in `double` to preserve decimal values.

### 22. 🔎 Count Occurrences (`OccurrencesArray.java`)
A program that counts how many times a specific number appears in an array.
- **Example:** In array `{2, 5, 2, 8, 2}`, the number `2` appears **3 times**.
- **Logic:** It uses a `while` loop to traverse the array and increments a counter variable whenever the target number is found.
- **Key Concept:** Linear Search algorithm basics.

### 23. 📉📈 Min & Max Finder (`MaxMinArray.java`)
A program that scans an array to find the absolute minimum and maximum values.
- **Example:** In array `{10, 5, 20, 3}`, the Min is `3` and Max is `20`.
- **Logic:** Assumes the first element is the min/max, then compares it with the rest of the array to update values.
- **Key Concept:** Conditional checks inside a loop to update tracking variables.

 ### 24. 📉📈 Check Sorted Array (`IsSortedArray.java`)
A program that checks whether the elements of an array are arranged in ascending order.
- **Example:** `{1, 2, 3, 4, 5}` returns **True**. `{1, 3, 2, 5}` returns **False**.
- **Logic:** Iterates through the array and checks if any element is greater than the next element. If such a pair is found, the array is not sorted.
- **Key Concept:** Using a `boolean` flag and traversing an array to find a specific condition.
-------------------------------------------------------------------------------------

### 🚀 How to Run
To run any of these files on your local machine:

1. **Clone this repo:**
   ```bash
   git clone [https://github.com/](https://github.com/)anivarya-86/Java_Programs.git}
   Link 💁 (https://github.com/anivarya-86/Java_Programs)
