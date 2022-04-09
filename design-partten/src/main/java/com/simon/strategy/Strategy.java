package com.simon.strategy;
import lombok.Data;

public interface Strategy {
    public void strategyMethod();
}

class ConcreteStrategyA implements Strategy{
    @Override
    public void strategyMethod() {
        System.out.println("A 策略的具体实现");
    }
}

class ConcreteStrategyB implements Strategy{
    @Override
    public void strategyMethod() {
        System.out.println("B 策略的具体实现");
    }
}

@Data
class Context{
    public Strategy strategy;
    public void strategyMethod(){
        strategy.strategyMethod();
    }
}