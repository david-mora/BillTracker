package com.davidmora.BillTracker.model;

import java.util.List;

public class User {
    private String name;
    private String email;
    private long id;
    private List<Bill> bills;

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public List<Bill> getBills(){
        return bills;
    }

    public void setBills(Bill bill){
        if(bill != null)
            this.bills.add(bill);
    }

    public void setName(String name) {
        if(!name.isEmpty())
            this.name = name;
    }

    public void setEmail(String email) {
        if(!email.isEmpty())
            this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User (String name, String email){
        if(!name.isEmpty() && !email.isEmpty()) {
            this.name = name;
            this.email = email;
        }
    }

    public User (String name, String email, List<Bill> bills){
        if(!name.isEmpty() && !email.isEmpty() && !bills.isEmpty()) {
            this.name = name;
            this.email = email;
            this.bills = bills;
        }
    }
}
