package com.tomato.lesson2;

class BinaryPrinter {
    public static int DEFAULT_SIZE = 8;
    private int size;
    public int test = 0;

    public BinaryPrinter(int size) {
        this.size = size;
    }

    void printBinary(long value) {
        for (int i = size - 1; i >=0; i--) {
            long mask = 1L << i;
            long result = (mask & value) >> i;
            System.out.print(result);
        }
        System.out.println();
    }

    public int getSize() {
        return size;
    }

    /**
    *
    * @param size must be positive
     */
    public void setSize(int size) throws Exception {
        if (size <= 0) {
            throw new Exception("Illegal size " + size);
        }
        this.size = size;
    }
}
