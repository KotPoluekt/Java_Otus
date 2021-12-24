package com.tomato.lesson2;

public class Main {

    public static void main(String[] args) {
        BinaryPrinter printer = createPrinter(12);

        int value = 16;

        try {
            doPrint(printer, value);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(printer.getSize());

        Object o;
    }

    private static BinaryPrinter createPrinter(int size) {
        BinaryPrinter printer = new BinaryPrinter(size);
        return printer;
    }

    private static void doPrint(BinaryPrinter printer, int value) throws Exception {
        printer.printBinary(value);
        printer.setSize(-1);
    }
}
