package com.company;

import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
        Calculator calculator = new Calculator();

    @Test
    public void testThatJunitWorks() {
        //Arrange
        //Act
        int expected = 2;
        int actual = calculator.sum(1, 1);
        //Assert
        assertEquals(expected, actual);
    }
    @Test
    public void testCorrectInputAndCorrectResult(){
        //Arrange

        //Act
        int expected = 45;
        int actual = calculator.sum(19,26);
        //Assert
        assertEquals(expected,actual);
        }
        @Test
        public void testForWrongInputThrowException(){
        assertThrows(InputMismatchException.class,()->{
            calculator.sum(1001,2);
        });
        }
        @Test
        public void testIfEven(){
        boolean expected = true;
        boolean actual = calculator.isEven(500);
        assertEquals(expected,actual);
        }

        @Test
        public void testIfNotEven(){
        boolean expected = false;
        boolean actual = calculator.isEven(553);
        assertEquals(expected, actual);
        }

        @Test
        public void deposit(float amount) {


        }
    }
