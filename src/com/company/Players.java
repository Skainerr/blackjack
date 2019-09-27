package com.company;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Players {
    private int hand = 0;
    public int drawACard(Deck deck){
        Card cardInHand = deck.drawACard();
        hand = hand + cardInHand.getValueOfCard();
        return hand;
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




}
