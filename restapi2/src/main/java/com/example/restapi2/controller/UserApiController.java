package com.example.restapi2.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.restapi2.domain.User;
import com.example.restapi2.dto.UserRequest;
import com.example.restapi2.dto.UserResponse;
import com.example.restapi2.service.UserService;

import jakarta.validation.Valid;

/**
 * ユーザー情報を管理するREST APIコントローラー
 */
@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "*", methods = {
        RequestMethod.GET, RequestMethod.POST,
        RequestMethod.PUT, RequestMethod.DELETE })
public class UserApiController {

    private final UserService userService;

    @Autowired
    public UserApiController(UserService userService) {
        this.userService = userService;
    }
// パスパラメータを使ったGETメソッド（GET /users/{id}）
    // 引数や戻り値は適宜修正してください
    // GET /users/{id}
    @GetMapping("/{id}")
    public ResponseEntity<UserResponse> getUserById(@PathVariable Integer id) {
        User user = userService.findById(id);
        return ResponseEntity.ok(new UserResponse(user));
    }
    // クエリパラメータを使ったGETメソッド（GET /users/search）
    // 引数や戻り値は適宜修正してください
    // GET /users/search?name=xxx&email=yyy
    @GetMapping("/search")
    public ResponseEntity<List<UserResponse>> searchUsers(
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String email) {

        User condition = new User(null, name, email, null, null);
        List<User> users = userService.searchUsers(condition);

        List<UserResponse> responses = users.stream()
                .map(UserResponse::new)
                .collect(Collectors.toList());

        return ResponseEntity.ok(responses);
    }

    // POSTメソッドによるユーザー作成（POST /users）
    // 引数や戻り値は適宜修正してください
    // POST /users
    @PostMapping("")
    public ResponseEntity<UserResponse> createUser(
            @Valid @RequestBody UserRequest req) {

        User user = new User(null, req.getName(), req.getEmail(), null, null);
        User created = userService.createUser(user);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(new UserResponse(created));
    }

    // PUTメソッドによるユーザー更新（PUT /users/{id}）
    // 引数や戻り値は適宜修正してください
    // PUT /users/{id}
    @PutMapping("/{id}")
    public ResponseEntity<UserResponse> updateUser(
            @PathVariable Integer id,
            @Valid @RequestBody UserRequest req) {

        User user = new User(null, req.getName(), req.getEmail(), null, null);
        User updated = userService.updateUser(id, user);

        return ResponseEntity.ok(new UserResponse(updated));
    }

}
