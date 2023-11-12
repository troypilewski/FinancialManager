package com.fm.financemanager.manager;

import com.fm.financemanager.dao.Archtype;
import com.fm.financemanager.dao.DatabaseAccessObject;
import org.dizitart.no2.Nitrite;
import org.dizitart.no2.NitriteId;
import org.dizitart.no2.WriteResult;

import java.io.File;

public class DatabaseManager implements DatabaseAccessObject {
    private Nitrite db;

    public Nitrite connect() {
        db = Nitrite.builder()
                .filePath(new File("target/appdb.db"))
                .compressed()
                .openOrCreate();
        return db;
    }
    @Override
    public boolean validate(Archtype type) {
        return false;
    }
    @Override
    public WriteResult create(Archtype type) {
        return null;
    }
    @Override
    public WriteResult read(Archtype type, NitriteId id) {
        return null;
    }
    @Override
    public WriteResult update(Archtype type, NitriteId id) {
        return null;
    }
    @Override
    public WriteResult delete(Archtype type, NitriteId id) {
        return null;
    }
}
