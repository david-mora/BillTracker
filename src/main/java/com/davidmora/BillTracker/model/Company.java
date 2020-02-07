package com.davidmora.BillTracker.model;

public class Company {
    private String name;
    private String website;

    public void setName(String name) {
        this.name = name;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getName() {
        return name;
    }

    public String getWebsite() {
        return website;
    }

    public Company (String name, String website){
        this.name = name;
        this.website = website;
    }
}
