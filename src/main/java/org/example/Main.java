package org.example;

public class Main {
    public static void main(String[] args) {
        try{
            throw new ExperimentException("Ошибка");
        }
        catch (ExperimentException e){
            System.out.println(e.getMessage());
        }
    }
}