package com.example.WarpLib.models;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


@MappedSuperclass
@Data
@NoArgsConstructor
public abstract class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private float price;
    private String title;
    private String authorship;
    private int release_year;
    private int age;
    private int copies;
    private int awards;
    private float rating;
    private String language;
}
