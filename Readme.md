# Bookstore Collection Management

This project demonstrates how to manage and process a collection of books using clean, readable logic (for example, Java Streams or similar functional approaches). It focuses on filtering, transforming, and sorting book data to support common bookstore use cases.

---

## 📚 Project Overview

The bookstore maintains a collection of books, each having attributes such as:

* **Title**
* **Price**
* **Publication Year**

Using this data, the project implements multiple features that help the bookstore analyze and present its inventory effectively.

---

## ✨ Features & Functionalities

### 1. Discounted Books

**Goal:** Identify books priced over **$30**.

* Filters books whose price is less than or equal to 30
* Displays the qualifying books

**Use Case:** Helps the bookstore decide which books can be included in special discount campaigns.

---

### 2. Classics Collection

**Goal:** Identify books published **before the year 2000**.

* Filters books based on publication year
* Displays classic titles

**Use Case:** Supports launching a special *Classics Collection* for older, timeless books.

---

### 3. Upcoming Titles

**Goal:** Generate future book titles.

* Appends the suffix **"(Coming Soon)"** to all existing book titles
* Produces a new list of upcoming titles

**Use Case:** Helps marketing teams preview next year’s catalog.

---

### 4. Sort by Price

**Goal:** Display books sorted by price in **ascending order**.

* Sorts the book collection from lowest to highest price
* Displays the sorted list

**Use Case:** Useful for printing price tags or displaying sorted listings in the store.

---

### 5. Rare Books

**Goal:** Identify rare books.

* A book is considered **rare** if its title contains **more than 20 characters**
* Filters and displays such books

**Use Case:** Helps collectors and special buyers find unique or rare titles.

---

## 🛠️ Technologies Used

* Programming Language: **Java** (or similar language supporting functional operations)
* Core Concepts:

    * Collections
    * Functional programming (Streams, filters, maps, sorting)
    * Clean and readable code practices

---

## 🚀 How to Run the Project

1. Clone the repository

   ```bash
   git clone <repository-url>
   ```
2. Open the project in your IDE (IntelliJ, Eclipse, VS Code, etc.)
3. Run the main class to see the output in the console

---

## 📌 Example Output

* List of discounted books (price > $30)
* Classic books published before 2000
* Upcoming titles with "(Coming Soon)" suffix
* Books sorted by price
* Rare books with long titles

---

## 📈 Learning Outcomes

* Understanding real-world use cases of collection processing
* Writing expressive and maintainable code
* Applying functional-style operations for filtering and transformation

---

## 🤝 Contributing

Contributions are welcome! Feel free to fork the repository, improve the logic, or add new features.

---

## 📄 License

This project is open-source and available for educational purposes.

---

Happy Coding! 🚀
