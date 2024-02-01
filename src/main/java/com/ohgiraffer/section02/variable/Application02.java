package com.ohgiraffer.section02.variable;

public class Application02 {

    public static void main(String[] args) {
        //정수를 취급하는 자료형은 4가지가 있다

        byte bnum;  //- 1byte
        short snum; ///-  2byte
        int inum; //- 4byte
        long lnum; //- 8byte
        //실수
        float fnum; //- 4byte
        double dnum; //- 8byte
        //문자
        char ch; // - 2byte
        //논리값
        boolean isTrue; //1byte

        //문자열을 취급하는 자료

        String str; //- 4byte

        bnum = 1;
        snum = 2;
        inum = 4;
        lnum = 8L;
        fnum = 4.0f;
        dnum = 8.0;
        ch = 'a';
        ch = 97;

        isTrue = true;
        isTrue = false;

        str = "안녕하세요";
        System.out.println( inum );

        System.out.println( isTrue );
        System.out.println('a'+"ava");
        System.out.println('a'+'a');
        System.out.println("안녕");
    }
    
}
