/**
 * Write the test cases for an endpoint that takes requests like this:
 *   /convertLettersToNumbers?letters=aBc
 * The endpoint takes in a series of letters in the "letters" query parameter
 * and returns a numeric representation. For example, if the request has the
 * query parameter "letters=a", the endpoint returns "01". If the request has
 * "letters=aBz", the endpoint returns "010226".
 * 
 * Please identify and write the automated tests. 
 * Do not implement the endpoint. Simply write the tests based on the specification of the endpoint.
 *
 * For example, do NOT write:
 *  public static void main() { .. }
 * 
 * Instead, you will write:
 *  void test_something() { .. }
 *  void test_something_else() { .. }
 */
package com.collection;

import java.util.Random;

public class AlphabetToNumber {
    public static void main(String[] args) {
        testAPIEndPoint();


    }
    static int getARandomNumberForLetters(){
        Random random = new Random();
        return 1+random.nextInt(26);
    }

    static String getLetter(int letterNumber, boolean upperCase){
        int offset=0;
        if(upperCase){
            offset=65;
        }else {
            offset=96;
        }

        return String.valueOf((char)(letterNumber+offset));
    }
    static String getLetterNumberStr(int letterNumber) {
        String letterNumberStr="";
        if(letterNumber<10){
            letterNumberStr="0"+letterNumber;
        }else {
            letterNumberStr=String.valueOf(letterNumber);
        }
        return letterNumberStr;
    }

    static void testAPIEndPoint() {
        StringBuilder letters=new StringBuilder();
        StringBuilder letterNumbers=new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            int aRandomNumberForLetters = getARandomNumberForLetters();
            boolean caseFlag;
            caseFlag= aRandomNumberForLetters % 2 == 0;
            letters.append(getLetter(aRandomNumberForLetters, caseFlag));
            letterNumbers.append( getLetterNumberStr(aRandomNumberForLetters));
            String testLetter=letterNumbers.toString();
            String expectedLetterNumber=letterNumbers.toString();
            //call API End Point here pass letters to it get number from it and compare
            // with above values
        }
    }

}