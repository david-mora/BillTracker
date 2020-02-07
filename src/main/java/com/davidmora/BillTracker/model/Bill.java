package com.davidmora.BillTracker.model;

import java.math.BigDecimal;
import static java.lang.Boolean.TRUE;

public class Bill {
    private String name;
    private boolean monthly;
    private boolean yearly;
    private BigDecimal amount;
    private Company company;

    public String getName() {
        return name;
    }

    public boolean isMonthly() {
        return monthly;
    }

    public boolean isYearly() {
        return yearly;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public Company getCompany() {
        return company;
    }

    public Bill (String name, boolean monthly, BigDecimal amount, Company company){
        this.name = name;
        this.amount = amount;
        this.company = company;
        if(monthly)
            this.monthly = monthly;
        else
            this.yearly = TRUE;

    }
}
