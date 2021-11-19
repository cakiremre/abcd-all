package com.beam.sample.abcd;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("auth")
public class AuthController {

    private final AccountService accountService;

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("login")
    public Response<Account> login(@RequestParam String username,
                                   @RequestParam String password){
        return accountService.login(username, password);
    }
}
