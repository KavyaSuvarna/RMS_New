package com.sample.rms.service;

import com.sample.rms.Rate;
import com.sample.rms.RateRepository;
import com.sample.rms.exception.RmsRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service
public class RateServiceImpl implements RateService {

    @Autowired
    private RateRepository rateRepository;

    @Override
    public Iterable<Rate> getAllRates() {
        return rateRepository.findAll();
    }

    @Override
    public ResponseEntity<Rate> addRate(Rate rate) {
        Rate newRate = rateRepository.save(rate);
        if(newRate == null){
            return ResponseEntity.notFound().build();
        } else{
            return ResponseEntity.ok().build();
        }
    }

    @Override
    public ResponseEntity<String> deleteRate(Long id) {
        Optional<Rate> rate = rateRepository.findById(id);
        if(!rate.isPresent()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "RateId not found in RMS");
        }else {
            rateRepository.deleteById(id);
            return ResponseEntity.ok().body("deleted");

        }
    }
}
