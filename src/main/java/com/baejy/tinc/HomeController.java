package com.baejy.tinc;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class HomeController {
    @GetMapping("/home")
    public List<String> home() {
        return Arrays.asList("Spring Boot", "React");
    }
}
