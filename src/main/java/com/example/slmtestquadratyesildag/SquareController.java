package com.example.slmtestquadratyesildag;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SquareController {

    @GetMapping("/api/square")
    public int square(int v) {
        return v*v;
    }
}
