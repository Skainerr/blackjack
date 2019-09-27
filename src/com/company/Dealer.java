package com.company;

public class Dealer extends Players {
    @Override
    public boolean wannaNextCard() {
        if(getValueOfHand() <= 17){
            return true;
        }else{return false;}
    }
}
