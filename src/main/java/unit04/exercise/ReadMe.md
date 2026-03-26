# Assignment: Simple Login Authentication System (Java)

## Objective
Implement a basic login authentication system using Java.

---

## Requirements

### 1. User Class
Create a `User` class with the following attributes:
- username
- password
- role

---

### 2. UserStore (Fake Database)
Implement a `UserStore` class that simulates a database using a `Map`:
- **Key:** Username
- **Value:** User object

Add at least **three predefined users**.

---

### 3. Authentication Method
Implement a `login` method that:
- Accepts `username` and `password`
- Checks if the user exists
- Verifies the password
- Returns the `User` object if successful
- Returns `null` if authentication fails

---

### 4. Main Method
- Call the `login` method with sample data
- If successful:
  - Print a message including **name and role**
  - Example:
    ```
    Dear Mr. Michael, Admin
    ```
- If failed:
  - Print an error message

---

## Learning Goals
- Understanding of classes and objects
- Working with collections (`Map`)
- Basic authentication logic
- Clean code structure