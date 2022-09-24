package org.example.entities;

import jakarta.persistence.*;

import java.util.*;

@Entity
public class Address {

    @Id
    private String id;
    private String street;
    private String road;

    @Lob
    private byte [] image;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public Address() {
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id='" + id + '\'' +
                ", street='" + street + '\'' +
                ", road='" + road + '\'' +
                ", image=" + Arrays.toString(image) +
                '}';
    }
}
