package org.example;

import assignment1.FactoryDate;

public class Main {
    public static void main(String[] args) {
        FactoryDate factoryDate = new FactoryDate(28,02,2022);
        System.out.println(factoryDate.get_next_date());
    }




}