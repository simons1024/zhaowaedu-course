package com.simon.strategy;
import org.junit.jupiter.api.Test;

class StrategyTest {

    @Test
    public void test01(){
        Context context = new Context();

        Strategy strategyA = new ConcreteStrategyA();
        context.setStrategy(strategyA);
        context.strategyMethod();

        Strategy strategyB = new ConcreteStrategyB();
        context.setStrategy(strategyB);
        context.strategyMethod();
    }
}