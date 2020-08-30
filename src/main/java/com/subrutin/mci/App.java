package com.subrutin.mci;

import com.subrutin.mci.section4.InterviewQuestion;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       InterviewQuestion iq = new InterviewQuestion();
       Boolean result = iq.isHaveSameElement(new char[]{'a','b','c','x'},new char[]{'z','y','x'});
       System.out.println(result);
    }
}
