package com.amey.problems;

public class StringCompression {
    // Run-Length Encoding (RLE).
    //methods - string - compress and give back
    //aaaabbbcca ->4a3b2c2a -- case


    static void main() {

        String s = "aaaabbbcca";
        System.out.println(s);
        int count = 0;

        for(int i = 0; i < s.length(); i++){

           char curr = s.charAt(i);
            char next;

           if(i == s.length()-1)
           {
               next = ':';
           }else{
               next = s.charAt(i+1);
           }

         //   System.out.println("curr:"+curr+", next:"+next);
           //Character.toString()

           if(Character.toString(curr).equalsIgnoreCase(Character.toString(next))){
               count++;
           } else{
               count++;
               System.out.print(count+Character.toString(curr));
               count = 0;
           }
        }

    }

}
