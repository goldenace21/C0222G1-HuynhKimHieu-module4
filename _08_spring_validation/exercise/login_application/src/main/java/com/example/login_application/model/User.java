package com.example.login_application.model;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity(name = "user")
public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "int")
    private Integer id;

    @NotBlank(message = "not blank")
    @Column(name = "first_name")
    @Size(min=5, max=45, message = " 5 < name < 45")
    private String firstName;

    @Column(name = "last_name")
    @NotBlank(message = "not blank")
    @Size(min=5, max=45 , message = " 5< name < 45")
    private String lastName;

    @Pattern(regexp = "^(\\d){9,11}$" ,message = "error format")
    private String phoneNumber;

    @Pattern(regexp = "^(\\d){1,}$" ,message = "error format")
    @Min(value = 18, message = "age >= 18")
    @Max(value = 100, message = "age < 100")
    private String age;

    @NotBlank(message = "not blank")
    @NotEmpty(message = "not empty")
    private String email;

    public User() {
    }

    public User(Integer id, String firstName, String lastName, String phoneNumber, String age, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
