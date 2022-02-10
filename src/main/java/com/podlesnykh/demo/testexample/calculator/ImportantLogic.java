package com.podlesnykh.demo.testexample.calculator;

import java.util.Date;
import java.util.zip.ZipEntry;

public class ImportantLogic {

    public void doSomeImportantUpdates(Order order) {
        //+ 50 lines of code

        Object transactTime = null;

        String normalizedTransactTime = normalizeTimesTemp((Date) transactTime);
        if (transactTime == null && order.getCreationTime() > 0) {
            normalizedTransactTime = normalizedSendingTime(new Date(order.getCreationTime()));
        }

        // + 200 lines of code
    }

    private String normalizedSendingTime(Date date) {
        return "";
    }

    private String normalizeTimesTemp(Date transactTime) {
        return null;
    }
}

class Order {

    public int getCreationTime() {
        return 0;
    }
}