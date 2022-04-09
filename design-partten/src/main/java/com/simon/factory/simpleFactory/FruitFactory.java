package com.simon.factory.simpleFactory;

//工厂可以生产出这几种类型的水果
public class FruitFactory {
    public Fruit produceFruit(String name){
//        int num = ("banana".equals(name)?1:name).equals("pear")?2:3;
        int num;
        if ("banana".equals(name)){
            num = 1;
        }else if ("pear".equals(name)){
            num = 2;
        }else {
            num = 3;
        }
        switch (num){
            case 1:
                return new FruitImpl1();
            case 2:
                return new FruitImpl2();
            default:
                break;
        }
        return null;
    }
}