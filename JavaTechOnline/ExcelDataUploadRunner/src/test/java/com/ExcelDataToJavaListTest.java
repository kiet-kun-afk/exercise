package com;

import java.io.File;
import java.util.List;

import com.poiji.bind.Poiji;

public class ExcelDataToJavaListTest {
    public static void main(String[] args) {
        File file = new File("InvoiceDetailsSheet.xlsx");
        List<InvoiceExcel> invoices = Poiji.fromExcel(file, InvoiceExcel.class);
        System.out.println("Printing List Data: " + invoices);
    }
}
