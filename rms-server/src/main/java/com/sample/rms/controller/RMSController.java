package com.sample.rms.controller;

import com.sample.rms.Rate;
import com.sample.rms.RateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/rms")

public class RMSController {

    @Autowired
    private RateRepository rateRepository;

    @GetMapping(path="/all")
    public @ResponseBody
    Iterable<Rate> getAllRates() {
        return rateRepository.findAll();
    }

    @PostMapping(path="/add")
    public @ResponseBody
    void addRate(@RequestBody Rate rate) {
        rateRepository.save(rate);
    }

    @DeleteMapping(path="/delete/{id}")
    public @ResponseBody
    void deleteRate(@PathVariable Long id){
        rateRepository.deleteById(id);
    }

}
