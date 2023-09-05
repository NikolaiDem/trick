package com.example.trick.controller;

import com.example.trick.dao.UserRepository;
import com.example.trick.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController("/user")
public class UserController {

    @Autowired //todo инжект через поле
    private UserRepository userRepository;

    //todo использовавание метода Get для создания пользователя
    @GetMapping("/user/{userName}") //неправильное именование эндпоинта
    public User getUser(@PathVariable("userName") String userName) {
        return userRepository.createUser(userName);
    }


    /*todo использование метода POST для обновления имени пользователя */
    @PostMapping("/user") //неправильное именование эндпоинта
    public User postUser(String userName) {
        return userRepository.updateUser(userName);
    }


    /*todo ошибки:
    *  использование pathVariable вместо тела?
    *  метод PUT - реализован не идемпонтентно? */
    @PutMapping("/user/{userName}") //неправильное именование эндпоинта
    public User putUser(@PathVariable String userName) {
        return userRepository.createUser(userName);
    }

    /*todo для страны лучше использовать параметр запроса */
    @GetMapping("/getUser/country/{country}") //неправильное именование эндпоинта
    public User findUsersFromCountry(@PathVariable String country) {
        return userRepository.findByCountry(country);
    }
}
