# Java Backend – Functional Programming & Streams Practice

This is a Java backend learning repository focused on **Java 8+ features**, especially **functional programming**, **streams**, and **core collection APIs**.  
It contains small, self-contained demo classes that illustrate how modern Java concepts work in practice.

---

## 📌 Purpose

The goal of this project is to:

- Understand Java functional interfaces
- Practice lambda expressions and method references
- Explore Java Streams (sources, intermediate, and terminal operations)
- Reinforce usage of Java Collections (`List`, `Set`, `Map`)
- Serve as a reference or revision guide for Java backend interviews and learning

---

## 🛠️ Tech Stack

- Java 8+
- IntelliJ IDEA (project files included)
- No external libraries – pure Java

---

## 📂 Project Structure

```
java-backend/
├── biConsumer/
│ └── BiConsumerDemo.java
├── biFunction/
│ └── BiFunctionDemo.java
├── collections/
│ ├── ListDemo.java
│ ├── MapDemo.java
│ └── SetDemo.java
├── consumer/
│ └── ConsumerDemo.java
├── functionalInterface/
│ └── FunctionalInterfaceDemo.java
├── methodReference/
│ └── MethodReference.java
├── predicate/
│ └── PredicateDemo.java
├── streams/
│ ├── intermediate/
│ │ ├── BookDemo.java
│ │ └── IntermediateDemo.java
│ ├── terminalOperations/
│ │ └── TerminalOperationsDemo.java
│ ├── StreamPractice1.java
│ ├── StreamsDemo.java
│ └── StreamSourcesDemo.java
└── Readme.md
```

---

## 📘 Module Overview

### 1. Functional Interfaces
- `functionalInterface/FunctionalInterfaceDemo.java`
- Demonstrates custom functional interfaces and lambda usage

### 2. Consumer & BiConsumer
- `consumer/ConsumerDemo.java`
- `biConsumer/BiConsumerDemo.java`
- Shows how to consume inputs with side effects

### 3. Predicate
- `predicate/PredicateDemo.java`
- Covers boolean-based filtering logic

### 4. Function & BiFunction
- `biFunction/BiFunctionDemo.java`
- Demonstrates transformation of data

### 5. Method References
- `methodReference/MethodReference.java`
- Examples of static, instance, and constructor references

### 6. Collections
- `collections/ListDemo.java`
- `collections/SetDemo.java`
- `collections/MapDemo.java`
- Hands-on examples of Java Collection Framework usage

### 7. Streams API

#### Stream Basics
- `streams/StreamsDemo.java`
- `streams/StreamSourcesDemo.java`

#### Intermediate Operations
- `streams/intermediate/IntermediateDemo.java`
- `streams/intermediate/BookDemo.java`
- Covers `filter`, `map`, `sorted`, `distinct`, etc.

#### Terminal Operations
- `streams/terminalOperations/TerminalOperationsDemo.java`
- Covers `forEach`, `collect`, `reduce`, `count`, etc.

#### Practice
- `streams/StreamPractice1.java`
- Mixed real-world style stream exercises

---

## ▶️ How to Run

1. Open the project in **IntelliJ IDEA**
2. Ensure **Java 8 or above** is configured
3. Navigate to any `*Demo.java` file
4. Run the `main()` method

Each class is independent and can be run on its own.

---

## 🎯 Who This Is For

- Java backend beginners
- Developers revising Java 8 features
- Interview preparation (Streams, Lambdas, Collections)
- Anyone learning functional programming in Java

---

## 📄 Notes

- No frameworks (Spring, Hibernate) are used
- Focus is purely on **core Java concepts**
- Code is intentionally simple and readable  
