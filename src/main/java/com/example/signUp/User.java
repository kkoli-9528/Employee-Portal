package com.example.signUp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class User {

  private @Id
  @GeneratedValue Long id;
  private String email;
  private String password;

  public User() {}

  public User(String email, String password) {

    this.email = email;
    this.password = password;
  }

  public Long getId(){
    return this.id;
  }

  public String getUserEmail(){
    return email;
  }

  public void setUserEmail(String email){
    this.email = email;
  }

  public String getUserPassword(){
    return password;
  }

  public void setUserPassword(String password){
    this.password = password;
  }
}
