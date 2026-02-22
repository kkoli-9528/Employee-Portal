package com.example.signUp;

public class User {

  private String email;
  private String password;

  public User() {}

  public User(String email, String password) {

    this.email = email;
    this.password = password;
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
