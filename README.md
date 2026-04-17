# Software Projects – Course Repository (SS26)

## Introduction

This repository contains the **examples and materials for the course _Software Projects_** in the summer semester 2026.  
It documents the **lecture progress** and provides students with the **code developed during the sessions**.

The repository evolves throughout the semester, reflecting the **chronological development of topics, tools, and programming concepts** introduced in the course.

Students can use this repository to:

- access lecture examples
- deepen knowledge of discussed technologies
- track course progress
- retrieve the most recent code from the lectures

---

## Repository Structure

The project follows a **standard Maven-based Java structure**.

```text
src
 └─ main
     ├─ java
     │   ├─ unit01             # Basics: Setup, Hello World
     │   ├─ unit02             # Lombok & Data Modeling, Basic File I/O
     │   │   ├─ lombok         # Annotations (@Data, @Builder)
     │   │   └─ read           # Basic Scanner usage for files
     │   ├─ unit03             # Advanced File I/O & ETL
     │   │   ├─ read           # BufferedReader & Streams
     │   │   ├─ write          # BufferedWriter & File writing
     │   │   └─ task2          # Hotel ETL assignment (CSV parsing)
     │   ├─ unit04             # Data Structures, Sorting & GUI Intro
     │   │   ├─ auth_logic     # Authentication logic (UserStore)
     │   │   ├─ collections    # List, Set, Map usage
     │   │   ├─ gui_basics     # Introduction to Swing (Login, Windows)
     │   │   └─ sorting        # Comparable interface & Sorting
     │   └─ unit05             # Advanced GUI & Tables
     │       ├─ gui_advanced   # Extended GUI (Admin area, Hashing)
     │       └─ gui_table      # JTable implementation & Layouts
     └─ resources              # Data files (hotels.txt, names.txt)
pom.xml                        # Maven Configuration (Lombok, etc.)
```

Each unit (Unit 01, 02, etc.) contains the examples and experiments from the respective lecture session.

---

## Current Content & Examples

The current examples cover the setup and core concepts of software development:

- **Unit 01: First Steps**
    - Java Project Setup & HelloWorld
- **Unit 02: Lombok & Simple I/O**
    - Introduction to Lombok (`@Data`, `@Builder`, `@AllArgsConstructor`)
    - Reading text files using `Scanner`
- **Unit 03: File Processing & ETL**
    - Advanced reading with `BufferedReader` and `InputStreamReader`
    - Writing data to files
    - Practical ETL task: Parsing CSV-like hotel data into objects
- **Unit 04: Logic, Data Structures & Sorting**
    - Working with `ArrayList`, `HashSet`, and `HashMap`
    - Sorting objects using `Comparable`
    - Implementation of authentication logic
    - Introduction to Java Swing (Windows, Buttons, Layouts)
- **Unit 05: User Interfaces & Tables**
    - Advanced Swing components: `JTable` and `DefaultTableModel`
    - Layout management (BorderLayout, GridLayout)
    - Role-based window control (Admin, Senior, Junior)
    - Password hashing

---

## Technologies

The following technologies and tools are currently used in the course:

- **Java 25** (OpenJDK)
- **Maven** (Build management & dependencies)
- **IntelliJ IDEA** (Development Environment)
- **Lombok** (Code simplification)
- **Git** (Version control)

---

## Knowledge Progress & Learning Objectives

Competencies acquired after each unit:

| Unit | Focus               | Competencies                                                                                        |
|:-----|:--------------------|:---------------------------------------------------------------------------------------------------|
| **01** | Basics            | Create projects, understand basic Java structure, run Hello World.                                 |
| **02** | Data Modeling     | Use Lombok to simplify POJOs, perform simple file reading.                                         |
| **03** | File I/O & ETL    | Efficiently read/write files, parse structured data (CSV) into object models.                      |
| **04** | Data & Logic      | Choose appropriate collections, implement sorting, build basic GUI windows.                        |
| **05** | Advanced GUI      | Create complex interactive UIs with tables, structured layouts, and role-based logic.              |

---

## Units & Examples

Detailed overview of the covered examples and concepts.

### Unit 01: Basics
- **HelloWorld**: Basic structure of a Java class and the `main` method.

### Unit 02: Lombok & Simple I/O
- **Lombok (Lecturer/Student)**: Reducing boilerplate code using annotations.
- **ScannerFileReadMain (read)**: Using `Scanner` to read from local files.

### Unit 03: Advanced File I/O
- **BufferedDemo**: Efficient reading using `BufferedReader`.
- **HotelEtlMain (task2)**: Modeling and parsing complex datasets from `hotels.txt`.
- **SimpleWritingProcess**: Basic file output operations.

### Unit 04: Collections, Sorting & GUI Basics
- **Collections (HashMapDemo/SetDemo/ArrayListDemo)**: Practical examples of different Java collection types.
- **StudentSortingMain (sorting)**: Implementing the `Comparable` interface for custom object sorting.
- **LoginWindow (gui_basics)**: Creating the first graphical user interface with Swing.
- **UserStore (auth_logic)**: Developing backend logic for user authentication.

### Unit 05: Advanced GUI & Tables
- **Login (gui_advanced)**: Advanced login window with hashing support.
- **AdminWindow / SeniorWindow / JuniorWindow (gui_advanced)**: Role-specific views after login.
- **TableDemoWindow (gui_table)**: Implementation of dynamic tables using `JTable`.
- **TableApplicationMain (gui_table)**: Starting and managing GUI applications with table components.

---

## Purpose

This repository serves as a **living documentation of the course** and will be gradually updated with further examples, experiments, and project components developed throughout the semester.