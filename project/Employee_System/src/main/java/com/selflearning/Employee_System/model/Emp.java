package com.selflearning.Employee_System.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Emp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
     @NotBlank(message = "First name is required")
    private String firstname;

    @NotBlank(message = "Last name is required")
    private String lastname;

    @Email(message = "Invalid email format")
    private String email;

    // Address can be blank but not null
    @NotNull(message = "Address should not be null")
    private String address;

    // Salary should not be null
    @NotNull(message = "Salary should not be null")
    private Double salary;

    public void setId(int id) {
    }
}
