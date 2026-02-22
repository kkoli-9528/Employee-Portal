package com.example.signUp;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class signUp {
  
  @PostMapping("/signUp")
  public ResponseEntity<String> createUser(@RequestBody User user){
    System.out.println("Username: " + user.getUserEmail());
    System.out.println("Password: " + user.getUserPassword());

    return ResponseEntity.ok("User Created Succesfully");
  }
}
