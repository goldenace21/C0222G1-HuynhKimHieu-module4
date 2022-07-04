package com.example.case_study.model.employee;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "user")
public class User {
    @Id
    @Column(name = "user_name")
    private String userName;
    @Column(name = "password")
    private String password;

    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private Set<Employee> employeeSet;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "user_role",
               joinColumns = @JoinColumn(name = "user_name"),
               inverseJoinColumns = @JoinColumn(name = "role_id"))
    @JsonManagedReference
    private Set<Role> userRoleSet;

    public User() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Employee> getEmployeeSet() {
        return employeeSet;
    }

    public void setEmployeeSet(Set<Employee> employeeSet) {
        this.employeeSet = employeeSet;
    }

    public Set<Role> getUserRoleSet() {
        return userRoleSet;
    }

    public void setUserRoleSet(Set<Role> userRoleSet) {
        this.userRoleSet = userRoleSet;
    }
}
