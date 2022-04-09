package com.simon.factory.abstractFactory;

public interface Color {
}

class Yellow implements Color{
    public void yellow(){
        System.out.println("黄色");
    }
}

class Pink implements Color{
    public void pink(){
        System.out.println("粉色");
    }
}