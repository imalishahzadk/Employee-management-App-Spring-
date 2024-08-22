package ca.clinda_prakash.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String designation;
    private String hiringdate;
    private Boolean active_status;

    // Default constructor
    public Employee() {
    }

    public Employee(String name, String designation, String hiringdate, Boolean active_status) {
        this.name = name;
        this.designation = designation;
        this.hiringdate = hiringdate;
        this.active_status = active_status;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getHiringdate() {
        return hiringdate;
    }

    public void setHiringdate(String hiringdate) {
        this.hiringdate = hiringdate;
    }

    public Boolean getActive_status() {
        return active_status;
    }

    public void setActive_status(Boolean active_status) {
        this.active_status = active_status;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", hiringdate='" + hiringdate + '\'' +
                ", active_status=" + active_status +
                '}';
    }
}
