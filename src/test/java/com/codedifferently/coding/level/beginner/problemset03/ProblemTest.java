package com.codedifferently.coding.level.beginner.problemset03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProblemTest {

    // Problem 21
    @Test
    public void compareLastDigitTest01() {

        // Given
        int a = 7;
        int b = 17;

        // When
        Boolean expected = true;
        Boolean actual = Problem.compareLastDigit(a, b);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void compareLastDigitTest02() {

        // Given
        int a = 6;
        int b = 17;

        // When
        Boolean expected = false;
        Boolean actual = Problem.compareLastDigit(a, b);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void compareLastDigitTest03() {

        // Given
        int a = 3;
        int b = 113;

        // When
        Boolean expected = true;
        Boolean actual = Problem.compareLastDigit(a, b);

        // Then
        Assertions.assertEquals(expected, actual);
    }


    // Problem 22
    @Test
    public void doubleTheSumTest01() {

        // Given
        int a = 1;
        int b = 2;

        // When
        Integer expected = 3;
        Integer actual = Problem.doubleTheSum(a, b);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void doubleTheSumTest02() {

        // Given
        int a = 3;
        int b = 2;

        // When
        Integer expected = 5;
        Integer actual = Problem.doubleTheSum(a, b);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void doubleTheSumTest03() {

        // Given
        int a = 2;
        int b = 2;

        // When
        Integer expected = 8;
        Integer actual = Problem.doubleTheSum(a, b);

        // Then
        Assertions.assertEquals(expected, actual);
    }


    // Problem 23
    @Test
    public void lookOut10Test01() {

        // Given
        int a = 9;
        int b = 10;

        // When
        Boolean expected = true;
        Boolean actual = Problem.lookOut10(a,b);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lookOut10Test02() {

        // Given
        int a = 9;
        int b = 9;

        // When
        Boolean expected = false;
        Boolean actual = Problem.lookOut10(a,b);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lookOut10Test03() {

        // Given
        int a = 1;
        int b = 9;

        // When
        Boolean expected = true;
        Boolean actual = Problem.lookOut10(a,b);

        // Then
        Assertions.assertEquals(expected, actual);
    }


    // Problem 24
    @Test
    public void beginWithNotTest01() {

        // Given
        String str = "candy";

        // When
        String expected = "not candy";
        String actual = Problem.beginWithNot(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void beginWithNotTest02() {

        // Given
        String str = "x";

        // When
        String expected = "not x";
        String actual = Problem.beginWithNot(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void beginWithNotTest03() {

        // Given
        String str = "not bad";

        // When
        String expected = "not bad";
        String actual = Problem.beginWithNot(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }


    // Problem 25
    @Test
    public void popular3Test01() {

        // Given
        String str = "Java";

        // When
        String expected = "JavJavJav";
        String actual = Problem.popular3(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void popular3Test02() {

        // Given
        String str = "Chocolate";

        // When
        String expected = "ChoChoCho";
        String actual = Problem.popular3(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void popular3Test03() {

        // Given
        String str = "abc";

        // When
        String expected = "abcabcabc";
        String actual = Problem.popular3(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }


    // Problem 26
    @Test
    public void double22Test01() {

        // Given
        String str = "kitten";

        // When
        String expected = "kikittenki";
        String actual = Problem.double22(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void double22Test02() {

        // Given
        String str = "Ha";

        // When
        String expected = "HaHaHa";
        String actual = Problem.double22(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void double22Test03() {

        // Given
        String str = "abc";

        // When
        String expected = "ababcab";
        String actual = Problem.double22(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }


    // Problem 27
    @Test
    public void range1020Test01() {

        // Given
        int a = 12;
        int b = 99;

        // When
        Boolean expected = true;
        Boolean actual = Problem.range1020(a, b);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void range1020Test02() {

        // Given
        int a = 21;
        int b = 12;

        // When
        Boolean expected = true;
        Boolean actual = Problem.range1020(a, b);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void range1020Test03() {

        // Given
        int a = 8;
        int b = 99;

        // When
        Boolean expected = false;
        Boolean actual = Problem.range1020(a, b);

        // Then
        Assertions.assertEquals(expected, actual);
    }


    // Problem 28
    @Test
    public void deleteDelTest01() {

        // Given
        String str = "adelbc";

        // When
        String expected = "abc";
        String actual = Problem.deleteDel(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void deleteDelTest02() {

        // Given
        String str = "adelHello";

        // When
        String expected = "aHello";
        String actual = Problem.deleteDel(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void deleteDelTest03() {

        // Given
        String str = "adedbc";

        // When
        String expected = "adedbc";
        String actual = Problem.deleteDel(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }



    // Problem 29
    @Test
    public void maxNumberTest01() {

        // Given
        int a = 1;
        int b = 2;
        int c = 3;

        // When
        Integer expected = 3;
        Integer actual = Problem.maxNumber(a, b, c);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxNumberTest02() {

        // Given
        int a = 1;
        int b = 3;
        int c = 2;

        // When
        Integer expected = 3;
        Integer actual = Problem.maxNumber(a, b, c);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxNumberTest03() {

        // Given
        int a = 3;
        int b = 2;
        int c = 1;

        // When
        Integer expected = 3;
        Integer actual = Problem.maxNumber(a, b, c);

        // Then
        Assertions.assertEquals(expected, actual);
    }


    // Problem 30
    @Test
    public void larger1020Test01() {

        // Given
        int a = 11;
        int b = 19;

        // When
        Integer expected = 19;
        Integer actual = Problem.larger1020(a, b);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void larger1020Test02() {

        // Given
        int a = 19;
        int b = 11;

        // When
        Integer expected = 19;
        Integer actual = Problem.larger1020(a, b);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void larger1020Test03() {

        // Given
        int a = 11;
        int b = 9;

        // When
        Integer expected = 11;
        Integer actual = Problem.larger1020(a, b);

        // Then
        Assertions.assertEquals(expected, actual);
    }


    // Problem 31
    @Test
    public void goingUpTest01() {

        // Given
        String str = "Hello";

        // When
        String expected = "HeLLO";
        String actual = Problem.goingUp(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void goingUpTest02() {

        // Given
        String str = "hi there";

        // When
        String expected = "hi thERE";
        String actual = Problem.goingUp(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void goingUpTest03() {

        // Given
        String str = "hi";

        // When
        String expected = "HI";
        String actual = Problem.goingUp(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }

}
