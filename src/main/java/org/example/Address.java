package org.example;

//In this class using all the Hibernate Annotation


import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name="student_address")
public class Address {

    @Id
    @GeneratedValue                          //It is used for auto increment primary key
    @Column(name="address_id")             //It is for changing the column name
    private int addressId;
    @Column(name = "STREET",length = 50)      //length for set the length
    private String street;
    @Column(name = "CITY", length = 100)
    private String city;

    @Column(name = "Is_Open")
    private boolean isOpen;
    @Transient                           // It will not create the column
    private double x;                   // This annotation restrict to create column
    @Column(name = "Date_added")
    @Temporal(TemporalType.DATE)       //it can show only date not time
    private Date addedDate;
    @Lob
    private byte[] image;


    public Address(){
        super();
    }

    public Address(int addressId, String street, String city, boolean isOpen, double x, Date addedDate, byte[] image) {
        this.addressId = addressId;
        this.street = street;
        this.city = city;
        this.isOpen = isOpen;
        this.x = x;
        this.addedDate = addedDate;
        this.image = image;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}
