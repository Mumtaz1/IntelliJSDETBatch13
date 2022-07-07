package com.syntax.class24;

public class FileTester {
    public static void main(String[] args) {
        File [] arr = {new JavaFile(), new PdfFile(), new WordFile()};

        for(File file : arr) {
            file.open();
            file.edit();
            file.close();
            System.out.println();
        }
    }
}
