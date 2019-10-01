package com.company;

public class Deal {
    public void oneGame(Players players){
        Dealer bot = new Dealer();
        Deck deck = new Deck();
        deck.generateDeck();
        deck.generateDeck();
        deck.generateDeck();
        deck.generateDeck();
        deck.shuffleDeck();


        boolean flag = true;
        while(flag){
            System.out.println("Your bank is " + players.getBank().getMoney());
            players.eraseHand();
            bot.eraseHand();
            players.drawACard(deck);
            bot.drawACard(deck);
            players.drawACard(deck);
            bot.drawACard(deck);
            int bet = players.getBank().wannaBet();

            System.out.println("Dealer have " + bot.getValueOfHand());
            System.out.println("Player 1 have " + players.getValueOfHand());
                System.out.println("Your bank is " + (players.getBank().getMoney() - bet));

            while (players.wannaNextCard()){
                players.drawACard(deck);
                System.out.println("Player 1 have " + players.getValueOfHand());
            }
            while (bot.wannaNextCard()) {
                bot.drawACard(deck);
                System.out.println("Dealer have " + bot.getValueOfHand());
            }
            if (players.getValueOfHand() > 21
                    || (players.getValueOfHand() < 21 && bot.getValueOfHand() > players.getValueOfHand() && bot.getValueOfHand() <= 21)) {
                players.getBank().changeBank(players.getBank().getMoney() - bet);
                System.out.println("Sorry you lost. Your bank is now " + players.getBank().getMoney() + "€");
            }else if(
                    players.getValueOfHand() == 21
                            || players.getValueOfHand() == bot.getValueOfHand()
                            || players.getValueOfHand() > bot.getValueOfHand()
                            || players.getValueOfHand() < 21 && bot.getValueOfHand() > 21){
                players.getBank().changeBank(players.getBank().getMoney() + bet);

                System.out.println("Congrats you win! Your bank is now " + players.getBank().getMoney() + "€");
            }
            if(deck.listSize() < 25){
                deck.shuffleDeck();
            }
            flag = players.wannaContinue();
    }
    }
}