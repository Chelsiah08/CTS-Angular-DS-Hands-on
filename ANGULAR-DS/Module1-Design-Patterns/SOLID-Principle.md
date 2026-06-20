# SOLID Principles

SOLID is a set of 5 Object Oriented Design Principles used to write clean,
maintainable and scalable software.

## 1. Single Responsibility Principle (SRP)

Definition:
A class should have only one reason to change.

Example:
A class should not handle employee details, salary calculation,
and database operations together.

Benefit:
- Easy maintenance
- Easy testing


## 2. Open Closed Principle (OCP)

Definition:
Software entities should be open for extension but closed for modification.

Example:
We should add new features by creating new classes instead of changing existing code.

Benefit:
- Reduces bugs
- Improves flexibility


## 3. Liskov Substitution Principle (LSP)

Definition:
A child class should be able to replace its parent class without affecting the program.

Example:
If a class extends another class, it should properly follow the parent behaviour.


## 4. Interface Segregation Principle (ISP)

Definition:
A class should not be forced to implement methods it does not use.

Example:
Instead of one large interface, create smaller interfaces.


## 5. Dependency Inversion Principle (DIP)

Definition:
High level modules should depend on abstractions, not concrete classes.

Example:
Use interfaces instead of directly depending on specific classes.


# MCQ Revision

1. Which principle says a class should have only one reason to change?
Answer: SRP


2. OCP means?
Answer: Open for extension and closed for modification


3. Which principle deals with parent-child relationship?
Answer: LSP


4. ISP avoids what problem?
Answer: Unnecessary methods in interfaces


5. DIP says depend on?
Answer: Abstraction