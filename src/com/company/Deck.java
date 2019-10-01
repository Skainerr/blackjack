package com.company;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    List<Card> listOfCard = new ArrayList<>();

    public List<Card> generateDeck(){

        for(Suit s : Suit.values()) {
            for (Rank r : Rank.values()) {

                Card card = new Card(r, s);
                listOfCard.add(card);

            }
        }
        return listOfCard;

    }

    public List<Card> shuffleDeck(){
        Collections.shuffle(listOfCard);
        return listOfCard;
    }
    public int listSize(){
        return listOfCard.size();
    }
    public List<Card> getDeck(){
        return listOfCard;
    }
    public Card drawACard(){
        Card topCard = listOfCard.get(0);
        listOfCard.remove(0);
        return topCard;
    }
}
