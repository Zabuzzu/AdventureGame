**PROJECT DESCRIPTION** 
SOLID Adventure Game is a text-based adventure game where the player fights various monsters, collects items, and earns points. Initially, the code was monolithic, but it has been refactored using SOLID principles to make it more flexible and maintainable.


**Refactoring Goal**
The project was originally implemented in a single class, making it difficult to expand and maintain.

Refactoring was carried out considering the following SOLID principles:


1. Single Responsibility Principle (SRP) – each class is responsible for only one task.

2. Open/Closed Principle (OCP) – new monsters or items can be added without modifying existing code.

3. Liskov Substitution Principle (LSP) – monster subclasses can replace the parent class without breakin

4. Dependency Inversion Principle (DIP) – dependency on abstractions instead of concrete classes (e.g., the Enemy interface).

Why did we improve the code?

At first, the code was monolithic. It was all in one big class, which made it hard to change or add new features. So, we refactored it using SOLID principles.

How did we improve the code?

We used five SOLID principles:

Single Responsibility Principle (SRP) – Each class has only one job.

Open/Closed Principle (OCP) – We can add new monsters and items without changing the main code.

Liskov Substitution Principle (LSP) – All monsters follow the same rules and can replace each other.

Dependency Inversion Principle (DIP) – The game depends on interfaces, not specific classes.

What are the benefits?

The code is now easier to read and change.

We can add new features faster.

The project is more professional and follows good programming practices.
