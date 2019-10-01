package com.company;

enum Suit {HEART, DIAMOND, SPADES, CLUBS}

enum Rank {TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE}

public class Card {
    private Rank rank;
    private Suit suit;
    private int valueOfCard;


    public Card(Rank r, Suit s) {
        rank = r;
        suit = s;
        switch (r) {
            case KING:
            case QUEEN:
            case JACK:
            case TEN:
                valueOfCard = 10;
                break;
            case TWO:
                valueOfCard = 2;
                break;
            case THREE:
                valueOfCard = 3;
                break;
            case FOUR:
                valueOfCard = 4;
                break;
            case FIVE:
                valueOfCard = 5;
                break;
            case SIX:
                valueOfCard = 6;
                break;
            case SEVEN:
                valueOfCard = 7;
                break;
            case EIGHT:
                valueOfCard = 8;
                break;
            case NINE:
                valueOfCard = 9;
                break;
            case ACE:
                valueOfCard = 11;
                break;
        }
    }
    public int getValueOfCard(){
        return valueOfCard;
    }

    @Override
    public String toString () {
        return rank.toString() + " " + suit.toString()+ "\n";
    }

}