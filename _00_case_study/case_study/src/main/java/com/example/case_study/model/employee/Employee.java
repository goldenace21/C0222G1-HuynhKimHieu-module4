package com.example.case_study.model.employee;

import com.example.case_study.model.customer.CustomerType;

import javax.persistence.*;

@Entity(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @Column(name = "birthday", columnDefinition = "date")
    private String birthday;
    private String idCard;
    private String phoneNumber;
    private String salary;
    private String email;
    private String address;

    @ManyToOne(targetEntity = Division.class)
    @JoinColumn(name = "division_id")
    private Division division;

    @ManyToOne(targetEntity = Position.class)
    @JoinColumn(name = "position_id")
    private Position position;

    @ManyToOne(targetEntity = EducationDegree.class)
    @JoinColumn(name = "education_degree_id")
    private EducationDegree educationDegree;

    @ManyToOne(targetEntity = User.class)
    @JoinColumn(name = "user_name")
    private User user;

    public Employee() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public EducationDegree getEducationDegree() {
        return educationDegree;
    }

    public void setEducationDegree(EducationDegree educationDegree) {
        this.educationDegree = educationDegree;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
