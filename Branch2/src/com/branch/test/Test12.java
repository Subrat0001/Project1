package com.branch.test;

public class Test12 {
	    String reverse = "";
    
    public String reverseString(String str){
         
        if(str.length() == 1){
            return str;
        } else {
        	System.out.println(str);
            reverse += str.charAt(str.length()-1)+reverseString(str.substring(0,str.length()-1));
            System.out.println(reverse);
            return reverse;
        }
    }
     
    public static void main(String a[]){
    	Test12 srr = new Test12();
        System.out.println("Result: "+srr.reverseString("Java2novice"));
    }
}
