# 📚 Bookstore Collection Management

A Java-based project demonstrating how to manage and process a bookstore inventory using **Java Streams**, **Predicates**, and **Comparator**. The project focuses on filtering, sorting, and categorizing books in a clean and readable way.

---

## 📖 Overview

The bookstore maintains a collection of books with the following attributes:

- ID
- Book Name
- Author
- Price
- Published Date (`LocalDate`)

The application provides multiple operations to analyze and display this data effectively.

---

## ✨ Features

### 📉 Discounted Books
- Displays books priced **below $30**
- Useful for promotions and discounts

### 📜 Books Published Before 2000
- Filters books published before **January 1, 2000**
- Helps identify classic titles

### 🚀 Upcoming Books
- Displays books whose titles end with **"(Coming Soon)"**
- Used to preview future releases

### 💲 Sort Books by Price
- Sorts all books by price in **ascending order**
- Helpful for price comparison and listings

### 🏺 Rare Books
- Identifies books with titles of **20 or more characters**
- Useful for collectors and special editions

### 📋 View All Books
- Displays the complete book collection

---

## 🛠️ Technologies Used

- **Java**
- Java Collections (`List`)
- Java Streams API
- Functional Interfaces (`Predicate`)
- Lambda Expressions
- Comparator
- `LocalDate`

---

## 🚀 How to Run

1. Clone the repository
   ```bash
   git clone <repository-url>

---
2. Open the project in your IDE
3. Run the main class that calls BookService
4. View results in the console

## 📈 Learning Outcomes

* Hands-on experience with Java Streams
* Functional-style filtering and sorting
* Cleaner and more maintainable Java code
* Real-world data processing scenarios