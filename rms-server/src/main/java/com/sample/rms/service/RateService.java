package com.sample.rms.service;

import com.sample.rms.Rate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public interface RateService {
    Iterable<Rate> getAllRates();
    ResponseEntity<Rate> addRate(Rate rate);
    ResponseEntity<String> deleteRate(Long id);

    }
