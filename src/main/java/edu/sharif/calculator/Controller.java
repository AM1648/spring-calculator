package edu.sharif.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calc")
public class Controller {

    @GetMapping("/sum/{a}/{b}")
    String sum(@PathVariable int a, @PathVariable int b) {
        return "%s + %s = %s".formatted(a, b, a + b);
    }

    @GetMapping("/subtract/{a}/{b}")
    String subtract(@PathVariable int a, @PathVariable int b) {
        return "%s - %s = %s".formatted(a, b, a - b);
    }

    @GetMapping("/mult/{a}/{b}")
    String mult(@PathVariable int a, @PathVariable int b) {
        return "%s * %s = %s".formatted(a, b, a * b);
    }

    @GetMapping("/div/{a}/{b}")
    String div(@PathVariable int a, @PathVariable int b) {
        return "%s / %s = %s".formatted(a, b, a / b);
    }
}
