package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String helloWorld()
    {
        return "Hello from Spring!";
    }

    @GetMapping("/math/pi")
    public String pi() {
        return "3.141592653589793";
    }


    @GetMapping("/math/calculate")
    public String calculate(@RequestParam Integer x, @RequestParam Integer y, @RequestParam(defaultValue = "add") String operation)
    {
        return MathService.calculate(operation, x, y).toString();
    }

    @PostMapping("/math/sum")
    public String sum(@RequestParam Integer [] n)
    {
        return MathService.sum(n).toString();
    }

    @GetMapping("/flight")
    public Flight getFlight()
    {
        Flight flight = new Flight();
        flight.setDepartsOn(new Date());
        return flight;
    }

}