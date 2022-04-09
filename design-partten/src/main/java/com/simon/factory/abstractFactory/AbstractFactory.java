package com.simon.factory.abstractFactory;

//工厂不是简单地抽象，可以理解为是专门的抽象工厂
public interface AbstractFactory {
    public Color produceColor();
    public Weight produceWeight();
}

class BananaFactory implements AbstractFactory {

    @Override
    public Color produceColor() {
        Yellow yellow = new Yellow();
        yellow.yellow();
        return yellow;
    }

    @Override
    public Weight produceWeight() {
        FivePounds fivePounds = new FivePounds();
        fivePounds.FivePounds();
        return fivePounds;
    }

}

class AppleFactory implements AbstractFactory{

    @Override
    public Color produceColor() {
        Pink pink = new Pink();
        pink.pink();
        return pink;
    }

    @Override
    public Weight produceWeight() {
        TwoPounds twoPounds = new TwoPounds();
        twoPounds.twoPounds();
        return twoPounds;
    }
}