# 💸 Expense Tracker with Chart Analytics

A full-stack Java web application for tracking daily/monthly expenses with interactive category-wise analytics and visual reports.

---

## 🚀 Features

- ➕ Add, update, and delete expenses
- 📊 Category-wise and monthly visual analytics using Chart.js
- 🔐 User-friendly form validations and input controls
- 📁 RESTful APIs for smooth backend integration
- 🧠 Clean UI for financial insight at a glance

---

## 🛠️ Tech Stack

| Layer       | Tech                         |
|-------------|------------------------------|
| Frontend    | Thymeleaf, HTML, CSS, Chart.js |
| Backend     | Java, Spring Boot (REST APIs) |
| Database    | PostgreSQL                   |
| IDE         | VS Code                      |
| Build Tool  | Maven                        |
| Deployment  | Localhost (can be extended to cloud platforms) |

---

## 🗃️ Database Schema

```sql
Table: expenses
-------------------------
id SERIAL PRIMARY KEY
title VARCHAR(255)
amount NUMERIC
category VARCHAR(100)
date DATE
