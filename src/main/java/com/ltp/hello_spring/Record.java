package com.ltp.hello_spring;
import java.util.Objects;
import java.math.*;
import java.util.UUID;


public class Record {
    private String item;
    private BigDecimal revenue;
    private BigDecimal cost;
    private String id;

    public Record() {
        this.id = UUID.randomUUID().toString();
    }

    public Record(String item, BigDecimal revenue, BigDecimal cost) {
        this.item = item;
        this.revenue = revenue;
        this.cost = cost;
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getItem() {
        return this.item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public BigDecimal getRevenue() {
        return this.revenue;
    }

    public void setRevenue(BigDecimal revenue) {
        this.revenue = revenue;
    }

    public BigDecimal getCost() {
        return this.cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public Record item(String item) {
        setItem(item);
        return this;
    }

    public Record revenue(BigDecimal revenue) {
        setRevenue(revenue);
        return this;
    }

    public Record cost(BigDecimal cost) {
        setCost(cost);
        return this;
    }

    @Override
    public boolean equals(Object o) {
      return this.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(item, revenue, cost);
    }

    @Override
    public String toString() {
        return "{" +
            " item='" + getItem() + "'" +
            ", revenue='" + getRevenue() + "'" +
            ", cost='" + getCost() + "'" +
            "}";
    }

}