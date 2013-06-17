package design.pattern.memento.a1;

import java.util.HashMap;
import java.util.Map;

public class RPGGame {
    private final Map<String, Record> records = new HashMap<String, Record>();

    public void save(String s, Record r) { 
        records.put(s, r);
    }

    public Record getRecord(String s) { 
        return records.get(s); 
    }
}
