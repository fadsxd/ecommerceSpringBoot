package com.proyecto.ecommerce.controller;

import com.proyecto.ecommerce.dto.UserDto;
import com.proyecto.ecommerce.entity.User;
import com.proyecto.ecommerce.service.UserService;
import java.util.UUID;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
@AllArgsConstructor
public class UserController {
  private UserService userService;
  @GetMapping("/{id}")
  public ResponseEntity<UserDto> getById(@PathVariable UUID id){
    UserDto userFond = userService.getById(id);
    return ResponseEntity
        .status(HttpStatus.OK)
        .body(userFond);
  }
}
