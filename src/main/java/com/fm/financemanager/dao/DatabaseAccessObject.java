package com.fm.financemanager.dao;

import org.dizitart.no2.NitriteId;
import org.dizitart.no2.WriteResult;

public interface DatabaseAccessObject {
    boolean validate(Archtype type);
    WriteResult create(Archtype type);
    WriteResult read(Archtype type, NitriteId id);
    WriteResult update(Archtype type, NitriteId id);
    WriteResult delete(Archtype type, NitriteId id);
}
