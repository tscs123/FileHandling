package com.tripillar.filehandling.excel;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcelFile {

    public static void main(String[] args) {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("SampleSheet");

        Row row = sheet.createRow(0);
        Cell cell = row.createCell(0);
        cell.setCellValue("Hello, Excel!");

        try (FileOutputStream fileOut = new FileOutputStream("sample.xlsx")) {
            workbook.write(fileOut);
            System.out.println("Excel file written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
