package com.sample.rms;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Rate {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String rateDescription;
    private Date rateEffectiveDate;
    private Date rateExpirationDate;
    private int amount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRateDescription() {
        return rateDescription;
    }

    public void setRateDescription(String rateDescription) {
        this.rateDescription = rateDescription;
    }

    public Date getRateEffectiveDate() {
        return rateEffectiveDate;
    }

    public void setRateEffectiveDate(Date rateEffectiveDate) {
        this.rateEffectiveDate = rateEffectiveDate;
    }

    public Date getRateExpirationDate() {
        return rateExpirationDate;
    }

    public void setRateExpirationDate(Date rateExpirationDate) {
        this.rateExpirationDate = rateExpirationDate;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
