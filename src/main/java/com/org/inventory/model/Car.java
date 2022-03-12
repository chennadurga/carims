package com.org.inventory.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;
@Entity
@Table
public class Car {

    @Id
    @Column
    private int id;
    @Column
    private String name;
    @Column
    private String model;
    @Column
    private String engine;
    @Column
    private int quantity;


    public Car() {
    }

    public Car(int id, String name, String model, String engine, int quantity) {
        this.id = id;
        this.name = name;
        this.model = model;
        this.engine = engine;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car cars = (Car) o;
        return getQuantity() == cars.getQuantity() && Objects.equals(getId(), cars.getId()) && Objects.equals(getName(), cars.getName()) && Objects.equals(getModel(), cars.getModel()) && Objects.equals(getEngine(), cars.getEngine());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getModel(), getEngine(), getQuantity());
    }

    @Override
    public String toString() {
        return "Cars{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", engine='" + engine + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
