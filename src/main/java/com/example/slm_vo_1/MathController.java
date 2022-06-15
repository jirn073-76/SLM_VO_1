package com.example.slm_vo_1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {

    @RequestMapping("/sum")
    public int sum(@RequestParam int a, @RequestParam int b)
    {
        return a + b;
    }

    @RequestMapping("/abs")
    public int abs(@RequestParam int a)
    {
        return MathUtil.abs(a);
    }

    @RequestMapping("/divide")
    public double divide(@RequestParam int a, @RequestParam int b)
    {
        return MathUtil.divide(a,b);
    }

    @RequestMapping("/subtract")
    public double minus(@RequestParam int a, @RequestParam int b)
    {
        return MathUtil.minus(a,b);
    }

    @RequestMapping("/square")
    public int square(@RequestParam int a)
    {
        return MathUtil.square(a);
    }

    @RequestMapping("/pow")
    public double pow(@RequestParam int a, @RequestParam int b)
    {
        return MathUtil.pow(a, b);
    }
}
