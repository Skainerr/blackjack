package com.company;

public class Deal {
    public void oneGame(Players players){
        Dealer bot = new Dealer();
        Deck deck = new Deck();
        Bank bank = new Bank();
        deck.generateDeck();
        deck.generateDeck();
        deck.generateDeck();
        deck.generateDeck();
        deck.shuffleDeck();
        players.drawACard(deck);
        bot.drawACard(deck);
        players.drawACard(deck);
        bot.drawACard(deck);
        System.out.println("Dealer have " + bot.getValueOfHand());
        System.out.println("Player 1 have " + players.getValueOfHand());
        System.out.println("Your bank is " + bank);


        while(players.wannaNextCard()){
            players.drawACard(deck);
            System.out.println("Player 1 have " + players.getValueOfHand());
        }
        while(bot.wannaNextCard()){
            bot.drawACard(deck);
            System.out.println("Dealer have " + bot.getValueOfHand());
        }
        if(players.getValueOfHand() == 21){
            System.out.println("Congrats you have blackjack! Your bank is now" + bank + "€");
        }else if(players.getValueOfHand() > 21){
            System.out.println("Sorry you lost. Your bank is now " + bank + "€");
        }else if(players.getValueOfHand() == bot.getValueOfHand()){
            System.out.println("Congrats you win! Your bank is now " + bank + "€");
        }else if(players.getValueOfHand() > bot.getValueOfHand()){
                System.out.println("Congrats you win! Your bank is now " + bank + "€");
        }else if(players.getValueOfHand() < 21 && bot.getValueOfHand() > 21){
            System.out.println("Congrats you win! Your bank is now " + bank + "€");
        }
    }

}