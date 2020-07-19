package ru.netology.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Objects;
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
public class Smartphone extends Product{
    private String name;
    private String manufacturer;

    public Smartphone(String lg, String s) {
        super();
    }

    public Smartphone(int id, String name, int price, String name1, String manufacturer) {
        super(id, name, price);
        this.name = name1;
        this.manufacturer = manufacturer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Smartphone that = (Smartphone) o;
        return name.equals(that.name) &&
                manufacturer.equals(that.manufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, manufacturer);
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
