package com.company;

import java.util.Scanner;

public class Players {
    private Bank bank = new Bank();
    private int hand = 0;
    private int aceInHand = 0;
    public void eraseHand () {
        hand = 0;
    }

    public Bank getBank() {
        return bank;
    }

    public void drawACard(Deck deck){
        Card cardInHand = deck.drawACard();

        if(cardInHand.getValueOfCard() == 11){
           aceInHand = aceInHand + 1;
        }
        hand = hand + cardInHand.getValueOfCard();
        if(hand > 21){
            if(aceInHand > 0){
                hand = hand - 10;
                aceInHand = aceInHand - 1;
            }
        }

    }
    public boolean wannaNextCard(){
        if(hand < 21) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Do you want a next card?: Y/N");
            String userInput = scanner.next();
            if(userInput.equals("Y") || userInput.equals("y")){
                return true;
            }else {return false;}


        }else{return false;}
    }
    public int getValueOfHand(){
        return hand;
    }
    public boolean wannaContinue(){
        if(bank.getMoney() > 0){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Do you want to continue?: Y/N");
            String userInput = scanner.next();
            if(userInput.equals("Y") || userInput.equals("y")){
                return true;
            }else {return false;}
        }else{return false;}
    }
}
