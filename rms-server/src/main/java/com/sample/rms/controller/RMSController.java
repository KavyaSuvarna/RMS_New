package com.sample.rms.controller;

import com.sample.rms.Rate;
import com.sample.rms.RateRepository;
import com.sample.rms.service.RateService;
import com.sample.rms.service.RateServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/rms")

public class RMSController {

    @Autowired
    private RateServiceImpl rateService;

    @GetMapping(path="/all")
    public @ResponseBody
    Iterable<Rate> getAllRates() {
        return rateService.getAllRates();
    }

    @PostMapping(path="/add")
    public @ResponseBody
    void addRate(@RequestBody Rate rate) {
        rateService.addRate(rate);
    }

    @DeleteMapping(path="/delete/{id}")
    public @ResponseBody
    void deleteRate(@PathVariable Long id){
        rateService.deleteRate(id);
    }

}
