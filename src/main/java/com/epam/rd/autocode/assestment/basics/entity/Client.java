package com.epam.rd.autocode.assestment.basics.entity;

public class Client extends User {
    private double balance;
    private String driverLicense;
    private double rating;

    public Client(int id, String email, String password, String name, double balance, String driverLicense, double rating) {
        super(id, email, password, name);
        this.balance = balance;
        this.driverLicense = driverLicense;
        this.rating = rating;
    }

    // Геттери та сеттери
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(String driverLicense) {
        this.driverLicense = driverLicense;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + getId() +
                ", email='" + getEmail() + '\'' +
                ", password='" + getPassword() + '\'' +
                ", name='" + getName() + '\'' +
                ", balance=" + balance +
                ", driverLicense='" + driverLicense + '\'' +
                ", rating=" + rating +
                '}';
    }
}
