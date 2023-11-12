package com.fm.financemanager.dao;

import org.dizitart.no2.WriteResult;

public interface Bank {
    boolean validate();
    WriteResult create();
    WriteResult read();
    WriteResult update();
    WriteResult delete();
}
