package com.ltp.hello_spring;

import java.util.Date;
import java.util.UUID;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.constraints.*;

import java.util.Objects;

public class Item {
    @NotBlank(message = "Please choose a category")
    private String category;
    @NotBlank(message = "Name can't be blank")
    private String name;
    @Min(value=0, message="Price can't be negative")
    private Double price;
    @Min(value=0, message="Discount can't be negative")
    private Double discount;
    @Past(message = "Date must be in the past")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;
    private String id;

    public Item() {
        this.id = UUID.randomUUID().toString();
    }

    public Item(String category, String name, Double price, Double discount, Date date) {
        this.category = category;
        this.name = name;
        this.price = price;
        this.discount = discount;
        this.date = date;
        this.id = UUID.randomUUID().toString();
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getDiscount() {
        return this.discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Item category(String category) {
        setCategory(category);
        return this;
    }

    public Item name(String name) {
        setName(name);
        return this;
    }

    public Item price(Double price) {
        setPrice(price);
        return this;
    }

    public Item discount(Double discount) {
        setDiscount(discount);
        return this;
    }

    public Item date(Date date) {
        setDate(date);
        return this;
    }

    public Item id(String id) {
        setId(id);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        return this.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, name, price, discount, date, id);
    }

    @Override
    public String toString() {
        return "{" +
                " category='" + getCategory() + "'" +
                ", name='" + getName() + "'" +
                ", price='" + getPrice() + "'" +
                ", discount='" + getDiscount() + "'" +
                ", date='" + getDate() + "'" +
                ", id='" + getId() + "'" +
                "}";
    }

}
