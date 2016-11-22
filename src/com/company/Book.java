package com.company;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Leviatan on 21/11/2016.
 */
@Entity
public class Book {

    @Id
    private long id;
    private String title;
    private String description;
    private float unitCost;
    private String isbn;


    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public float getUnitCost() {
        return unitCost;
    }

    public String getIsbn() {
        return isbn;
    }


    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setUnitCost(float unitCost) {
        this.unitCost = unitCost;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }



}
