package com.beam.sample.abcd;

import org.springframework.stereotype.Service;

@Service
public class AccountService {


    public Response<Account> login(String username, String password) {
        if (username.equals(password)) {
            return Response.<Account>builder()
                    .code(0)
                    .data(Account.builder()
                            .username(username)
                            .password(password)
                            .build())
                    .build();
        }else{
            return Response.<Account>builder()
                    .code(100)
                    .build();
        }
    }
}
