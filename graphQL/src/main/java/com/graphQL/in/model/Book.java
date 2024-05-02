package com.graphQL.in.model;

import jakarta.persistence.*;
import lombok.*;
@Data
@NoArgsConstructor
@Entity
@Table(name = "project_books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String description;
    private String author;
    private double price;
    private int pages;
}
