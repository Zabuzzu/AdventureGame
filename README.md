**PROJECT DESCRIPTION** 
SOLID Adventure Game is a text-based adventure game where the player fights various monsters, collects items, and earns points. Initially, the code was monolithic, but it has been refactored using SOLID principles to make it more flexible and maintainable.
**Refactoring Goal**
The project was originally implemented in a single class, making it difficult to expand and maintain.
Refactoring was carried out considering the following SOLID principles:
1) Single Responsibility Principle (SRP) – each class is responsible for only one task.

2)Open/Closed Principle (OCP) – new monsters or items can be added without modifying existing code.

3)Liskov Substitution Principle (LSP) – monster subclasses can replace the parent class without breakin

4)Dependency Inversion Principle (DIP) – dependency on abstractions instead of concrete classes (e.g., the Enemy interface).
