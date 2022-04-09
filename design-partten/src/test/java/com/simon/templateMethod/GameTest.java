package com.simon.templateMethod;
import org.junit.jupiter.api.Test;

class GameTest {

    @Test
    public void test01(){
        Game game = new Football();
        game.initialize();
        game.startPlay();
        game.endPlay();
    }

}