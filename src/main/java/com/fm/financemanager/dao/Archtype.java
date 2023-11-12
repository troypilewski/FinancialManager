package com.fm.financemanager.dao;

public enum Archtype {
    BANK("Bank"),
    BRANCH("Branch"),
    CUSTOMER("Customer"),
    ACCOUNT("Account"),
    TRANSACTION("Transaction");

    private String description;

    Archtype(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
}
