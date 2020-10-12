package com.assignment.weekOne.assignmentOne;

import org.apache.commons.codec.binary.Base64;

import java.io.UnsupportedEncodingException;

public class Main
{
    public static void main(String[] args) throws UnsupportedEncodingException {

        String textData = "I am learning Encoding!!!";

        String encodeBase64String = Base64.encodeBase64String(textData.getBytes());

        System.out.println(encodeBase64String);

        byte[] bytes = Base64.decodeBase64(encodeBase64String);

        String s = new String(bytes, "UTF-8");

        System.out.println(s);


    }
}