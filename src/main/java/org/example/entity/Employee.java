package org.example.entity;

public class Employee {
    private int id;
    private String firstname;
    private String lastname;

    // Constructor
    public Employee(int id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    // Setter methods (optional, but can be used later)
    public void setId(int id) {
        this.id = id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", firstname='" + firstname + "', lastname='" + lastname + "'}";
    }
}
