package com.startjava.lesson_1.variable;

public class Variable {
    public static void main(String[] args) {
        byte numberOfCores = 4;
        short typeOfSystem = 64;
        int systemMemory = 512;  
        long dataMemory = 1000; 
        float randomAccessMemory = 8.0f; 
        double frequency = 2.80; 
        char indexCore = 'x';
        boolean mouse = true;

        System.out.print("Количество ядер CPU - " + numberOfCores + indexCore + " ядерный\nЧастота CPU - " + frequency + " GHz\nRAM - " + randomAccessMemory
                + " GB\nПамять SSD - " + systemMemory + " GB\nПамять HDD - " + dataMemory + " GB\nРазрядность ОС - " + indexCore + typeOfSystem + "\nНаличие мыши - "
                + mouse);
    }   
}