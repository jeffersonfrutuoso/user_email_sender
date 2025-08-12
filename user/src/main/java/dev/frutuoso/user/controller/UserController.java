package dev.frutuoso.user.controller;

import dev.frutuoso.user.domain.UserModel;
import dev.frutuoso.user.dtos.UserDTO;
import dev.frutuoso.user.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class UserController {

    private final UserService userService;

    @PostMapping("/users")
    public ResponseEntity<UserModel> create(@RequestBody UserDTO userDTO){
        var userModel = new UserModel();
        BeanUtils.copyProperties(userDTO, userModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.create(userModel));
    }
}
