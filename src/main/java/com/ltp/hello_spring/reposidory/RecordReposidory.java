package com.ltp.hello_spring.reposidory;

import com.ltp.hello_spring.Constants;
import com.ltp.hello_spring.Record;
import java.util.*;

public class RecordReposidory {
    private List<Record> records = new ArrayList<>();

    // Arrays.asList(
    // new Record("Chair", new BigDecimal("20.99"), new BigDecimal("5.99")),
    // new Record("Table", new BigDecimal("40.99"), new BigDecimal("8.99")),
    // new Record("Couch", new BigDecimal("100.99"), new BigDecimal("105.99")),
    // new Record("Fridge", new BigDecimal("200.99"), new BigDecimal("59.99")),
    // new Record("Bed", new BigDecimal("150.99"), new BigDecimal("205.99")));
    public List<Record> getRecords() {
        return this.records;
    }

    public void setRecords(List<Record> records) {
        this.records = records;
    }

    public Record getRecord(int index) {
        return records.get(index);
    }

    public void setRecord(Record record) {
        int index = getRecordIndex(record.getId());
        if (index == Constants.NOT_FOUND)
            records.add(record);
        else
            records.set(index, record);
    }

    public Integer getRecordIndex(String id) {
        for (int i = 0; i < records.size(); i++) {
            if (records.get(i).getId().equals(id))
                return i;
        }
        return Constants.NOT_FOUND;
    }
}
