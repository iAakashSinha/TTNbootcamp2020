//Ques1: Write all possible (including failure, exception case) Unit Tests for all the methods in First.java.

package com.im;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FirstTest {
    @Test
    void canary(){
        assertTrue(true);
    }

    @Nested
    class replaceSubStringTest {
        First obj;

        @BeforeEach
        void initialize() {
            obj = new First();
        }

        @Test
        void should_returnTrue_When_replaceSubString_isCorrect() {

            //given
            String mainString = "Hello World";
            String subString = "World";
            String replacementString = "India";

            //when
            String temp = obj.replaceSubString(mainString, subString, replacementString);

            //then
            assertEquals("Hello India", temp);
        }

        @Test
        void should_returnTrue_When_mainString_isEmpty() {
            //given
            String mainString = "";
            String subString = "World";
            String replacementString = "India";

            //when
            String temp = obj.replaceSubString(mainString, subString, replacementString);

            //then
            assertEquals("", temp);

        }

        @Test
        void should_returnTrue_When_subString_isNull(){ //subString != null
            //given
            String mainString = "Hello World";
            String subString=null;
            String replacementString="India";

            //when
            String temp = obj.replaceSubString(mainString,subString,replacementString);
            //then
            assertEquals("Hello World", temp);
        }

        @Test
        void should_returnTrue_When_replacementString_isNull(){
            //given
            String mainString="Hello World";
            String subString="World";
            String replacementString=null;

            //when
            String temp = obj.replaceSubString(mainString,subString,replacementString);
            //then
            assertEquals("Hello World", temp);
        }

        @Test
        void should_returnTrue_When_mainString_contains_subString(){
            //given
            String mainString="Hello World";
            String subString="Usa";
            String replacementString="India";

            //when
            String temp = obj.replaceSubString(mainString,subString,replacementString);
            //then
            assertEquals("Hello World", temp);
        }

    }

    @Nested
    class filterEvenElementsTest {
        First obj;

        @BeforeEach
        void initialize() {
            obj = new First();
        }

        @Test
        void should_returnTrue_List_isCorrect(){
            //given
            List<Integer> ls = new ArrayList<>();
            ls.add(5);
            ls.add(2);
            ls.add(9);
            List<Integer> expected = new ArrayList<>();
            expected.add(5);
            expected.add(9);

            //when
            List<Integer> output = obj.filterEvenElements(ls);

            //then
            assertArrayEquals(expected.toArray(),output.toArray());
        }
    }

    @Nested
    class calculateAverageTest {
        First obj;

        @BeforeEach
        void initialize() {
            obj = new First();
        }

        @Test
        void should_returnTrue_When_calculateAverage(){
            //given
            List<BigDecimal> values = new ArrayList<>();
            values.add(new BigDecimal("10.3"));
            values.add(new BigDecimal("99.3"));
            values.add(new BigDecimal("22.1"));

            //when
            BigDecimal avg = obj.calculateAverage(values);

            System.out.println(avg);

            //then
            assertEquals(new BigDecimal("43.9"),avg);
        }

        @Test
        void should_returnTrue_When_Value_isNULL(){
            //given
            List<BigDecimal> values = new ArrayList<>();

            //when
            Executable exe = () -> obj.calculateAverage(values);

            //then
            assertThrows(RuntimeException.class,exe);
        }

        @Test
        void should_returnTrue_When_ValueSize_Is_LessThan_1(){
            //given
            List<BigDecimal> values = new ArrayList<>();

            //when
            Executable exe = () -> obj.calculateAverage(values);

            //then
            assertThrows(RuntimeException.class,exe);
        }
    }

    @Nested
    class isPallindromeTest {
        First obj;

        @BeforeEach
        void initialize() {
            obj = new First();
        }

        @Test
        void should_returnTrue_Palindrome_isCorrect() {
            //given
            String origString = "abcba";
            String reverseString = "abcba";

            //when
            Boolean expected = obj.isPallindrome(origString);

            //then
            assertTrue(expected);
        }

        @Test
        void should_returnFalse_Palindrome_isNotCorrect() {
            //given
            String origString = "Aakash";
            String reverseString = "hsakaA";

            //when
            Boolean expected = obj.isPallindrome(origString);

            //then
            assertFalse(expected);
        }
    }
}