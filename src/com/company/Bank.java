package com.company;

import java.util.Scanner;

public class Bank {
    private int bank = 10000;
    public int wannaBet() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much do you want to bet? min bet is 2€, max bet is 20€: ");
        String userInput = scanner.next();
        userInput = userInput.replaceAll("[0-9]", "");
        userInput = userInput.replaceAll("€","");
        int bet = Integer.getInteger(userInput);
        try {
            if (bet <= 20 && bet >= 2) {
                return bet;
            } else {
                System.out.println("You are not allowed to bet this amount of money, please make correct bet");
                return wannaBet();
            }
        }catch (NumberFormatException e){
            System.out.println("Please enter amount of money between 2-20€");
            return wannaBet();
        }


    }
    public int getBank(){
        return bank;
    }
}
