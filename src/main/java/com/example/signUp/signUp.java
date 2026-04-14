package com.example.signUp;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SignUp {
  
  @PostMapping("/signUp")
  public ResponseEntity<String> createUser(@RequestBody User user){
    
    System.out.println("Username: " + user.getUserEmail().trim());
    System.out.println("Password: " + user.getUserPassword().trim());

    if (user.getUserEmail().trim().isEmpty()) {
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Resourse not found");
    }

    if (!user.getUserEmail().trim().matches("^((?!\\.)[\\w\\-_.]*[^.])(@\\w+)(\\.\\w+(\\.\\w+)?[^.\\W])$")) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid Username Or Password");
    }

    return ResponseEntity.ok("User Created Succesfully");
  }
}
