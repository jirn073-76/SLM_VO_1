package com.example.slm_vo_1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {

    MathUtil m = new MathUtil();
    @RequestMapping("/sum")
    public double sum(@RequestParam int a, @RequestParam int b)
    {
        return m.add(a, b);
    }

    @RequestMapping("/abs")
    public int abs(@RequestParam int a)
    {
        return m.abs(a);
    }

    @RequestMapping("/divide")
    public double divide(@RequestParam int a, @RequestParam int b)
    {
        return m.divide(a,b);
    }

    @RequestMapping("/subtract")
    public double minus(@RequestParam int a, @RequestParam int b)
    {
        return m.minus(a,b);
    }

    @RequestMapping("/square")
    public int square(@RequestParam int a)
    {
        return m.square(a);
    }

    @RequestMapping("/pow")
    public double pow(@RequestParam int a, @RequestParam int b)
    {
        return m.pow(a, b);
    }
}
