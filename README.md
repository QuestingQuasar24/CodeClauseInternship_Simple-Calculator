# Basic Calculator

A simple console-based calculator application written in Java that performs basic arithmetic operations.

## Features

- **Four Basic Operations**: Addition (+), Subtraction (-), Multiplication (*), Division (/)
- **User-Friendly Interface**: Interactive console prompts
- **Error Handling**: Robust input validation and error messages
- **Continuous Operation**: Perform multiple calculations in one session
- **Two Implementation Styles**: Sequential input and menu-driven approaches

## Technologies Used

- **Java**: Core programming language
- **Scanner Class**: For user input handling
- **Exception Handling**: For error management

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Command line interface (Terminal/Command Prompt)

### Installation

1. **Clone or download** the calculator files
2. **Navigate** to the project directory
3. **Compile** the Java files:
   ```bash
   javac BasicCalculator.java
   ```

### Running the Application

#### Option 1: Interactive Calculator
```bash
java BasicCalculator
```

#### Option 2: Menu-Based Calculator
```bash
java MenuBasedCalculator
```

## Usage

### Interactive Calculator
1. Enter the first number when prompted
2. Choose an operation (+, -, *, /)
3. Enter the second number
4. View the result
5. Choose to continue or quit

### Menu-Based Calculator
1. Select an operation from the numbered menu (1-5)
2. Enter two numbers when prompted
3. View the result
4. Return to menu for next operation

## Example Usage

```
=== Basic Calculator ===
Supported operations: +, -, *, /
Type 'quit' to exit

==============================
Enter first number: 15
Enter operation (+, -, *, /): +
Enter second number: 25

Result: 15.0 + 25.0 = 40.0

Do you want to perform another calculation? (y/n): y

==============================
Enter first number: 100
Enter operation (+, -, *, /): /
Enter second number: 4

Result: 100.0 / 4.0 = 25.0

Do you want to perform another calculation? (y/n): n

Thank you for using the calculator!
```

## Error Handling

The calculator handles several types of errors:

- **Invalid Numbers**: Non-numeric input detection
- **Division by Zero**: Prevents division by zero operations
- **Invalid Operations**: Unsupported operation symbols
- **Input Validation**: Graceful handling of unexpected input

## Code Structure

### Main Classes

#### `BasicCalculator`
- Main interactive calculator implementation
- Sequential input approach
- Continuous operation loop

#### `MenuBasedCalculator`
- Alternative menu-driven implementation
- Numbered operation selection
- Cleaner operation flow

### Key Methods

#### `performCalculation(double num1, double num2, String operation)`
- Performs arithmetic operations
- Handles division by zero
- Validates operation symbols
- Returns calculated result

## Learning Outcomes

This project demonstrates:

- **User Input Handling**: Reading and validating console input
- **Basic Arithmetic**: Implementation of fundamental math operations
- **Error Handling**: Try-catch blocks and exception management
- **Control Flow**: Loops, conditionals, and switch statements
- **Method Design**: Separation of concerns and code organization
- **String Processing**: Input parsing and validation

## Future Enhancements

Potential improvements and features:

- [ ] Scientific operations (sin, cos, tan, sqrt, etc.)
- [ ] Memory functions (store, recall, clear)
- [ ] History of calculations
- [ ] Expression evaluation (e.g., "2 + 3 * 4")
- [ ] GUI interface using Swing or JavaFX
- [ ] File input/output for batch calculations
- [ ] Unit conversions
- [ ] Percentage calculations

## Contributing

Feel free to fork this project and submit pull requests for any improvements:

1. Fork the repository
2. Create a feature branch
3. Make your changes
4. Test thoroughly
5. Submit a pull request

## License

This project is open source and available under the MIT License.

## Contact

For questions or suggestions, please open an issue in the repository.

---

**Happy Calculating!** 🧮
