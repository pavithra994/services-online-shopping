package com.project.onlineShopping.models;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.Email;
import java.util.Date;

@Document(collection = "User")
public class User {

    @Id
    private int uid;

//    @NotBlank(message = "First name is required")
    private String firstName;

//    @NotBlank(message = "Last name is required")
    private String lastName;

//    @NotBlank(message = "Email is required")
//    @Email(message = "Valid Email required")
//    @Column(unique = true)
    private String email;

//    @NotBlank(message = "password is required")
    private String password;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
