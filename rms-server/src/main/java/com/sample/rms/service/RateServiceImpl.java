package com.sample.rms.service;

import com.sample.rms.Rate;
import com.sample.rms.RateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RateServiceImpl implements RateService {

    @Autowired
    private RateRepository rateRepository;

    @Override
    public Iterable<Rate> getAllRates() {
        return rateRepository.findAll();
    }

    @Override
    public void addRate(Rate rate) {
        rateRepository.save(rate);
    }

    @Override
    public void deleteRate(Long id) {
        rateRepository.deleteById(id);
    }
}
