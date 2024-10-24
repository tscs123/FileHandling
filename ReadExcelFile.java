package com.tripillar.filehandling.excel;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadExcelFile {

    public static void main(String[] args) {
        try (FileInputStream file = new FileInputStream("sample.xlsx")) {
            Workbook workbook = new XSSFWorkbook(file);
            Sheet sheet = workbook.getSheetAt(0);
            Row row = sheet.getRow(0);
            Cell cell = row.getCell(0);
            System.out.println("Cell Value: " + cell.getStringCellValue());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
