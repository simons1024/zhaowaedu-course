package com.simon.factory.abstractFactory;

public interface Weight {
}

class TwoPounds implements Weight{
    public void twoPounds(){
        System.out.println("2磅重");
    }
}

class FivePounds implements Weight{
    public void FivePounds(){
        System.out.println("5磅重");
    }
}