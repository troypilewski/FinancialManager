package com.fm.financemanager.controller;

import com.fm.financemanager.manager.DatabaseManager;
import org.dizitart.no2.Nitrite;

public class MainController {
    private Nitrite db;
    public void initialize() {
        DatabaseManager dm = new DatabaseManager();
        db = dm.connect();
    }

}