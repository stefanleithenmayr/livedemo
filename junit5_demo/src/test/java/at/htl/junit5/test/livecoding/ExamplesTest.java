package at.htl.junit5.test.livecoding;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ExamplesTest {

    private Examples examples;

    @BeforeEach
    void setUp() {
        examples = new Examples();
    }

    @Test
    void add() {

        //ARRANGE
        int firstNumber = 5, secondNumber = 10, expected = 15;

        //ACT
        int actual = examples.add(firstNumber, secondNumber);

        //ASSERT
        assertThat(actual).isEqualTo(expected);
    }


    @Test
    void t02_eq() {

        //Äquivalenzklassen
        // 0 - 15 false
        // 16 - 45 true
        // 46 - 100 false
        // -unendlich bis -1
        //101 - unendlich

        //Grenzwertanalyse
        // 15 --> false
        //16 --> true

    }

    @ParameterizedTest
    //@ValueSource(ints = {10,15,16})
    @CsvSource({"10, false", "16, true", "22, true"})
    void t03_paramTest(int age, boolean expected){

        //ARRANGE
//        boolean expected = false;

        //ACT

        boolean actual = examples.canAccess(age);

        //ASSERT

        assertThat(actual).isEqualTo(expected);

    }

    @Test
    void t04_fail(){
        
    }
}