package com.sample.rms.service;

import com.sample.rms.Rate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public interface RateService {
    Iterable<Rate> getAllRates();
    void addRate(Rate rate);
    void deleteRate(Long id);

    }
