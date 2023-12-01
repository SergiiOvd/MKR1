package com.epam.rd.autocode.assestment.basics.entity;

import java.time.LocalDate;

public class Employee extends User {
    private String phone;
    private String dateOfBirth;

    public Employee(int id, String email, String password, String name, String phone, String dateOfBirth) {
        super(id, email, password, name);
        this.phone = phone;
        this.dateOfBirth = dateOfBirth;
    }

    // Геттери та сеттери
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + getId() +
                ", email='" + getEmail() + '\'' +
                ", password='" + getPassword() + '\'' +
                ", name='" + getName() + '\'' +
                ", phone='" + phone + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }
}
