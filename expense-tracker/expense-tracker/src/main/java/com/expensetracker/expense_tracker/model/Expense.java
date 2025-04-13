package com.expensetracker.expense_tracker.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String category;
    private String description;
    private double amount;
    private LocalDate date;

    // Getters and Setters (you can use Lombok or generate from VS Code)
}
