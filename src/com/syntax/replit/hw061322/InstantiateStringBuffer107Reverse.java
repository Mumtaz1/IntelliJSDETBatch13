package com.syntax.replit.hw061322;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class InstantiateStringBuffer107Reverse {

    /*
    How would you reverse a string using StringBuffer Class
    Given String "Hello Friends"
    Expected Output:
    sdneirF olleH
     */
    public static void main(String[] args) {

    StringBuffer sb = new StringBuffer("Hello Friends");
        sb.reverse();  // usage of reverse() method

        System.out.println(sb);
    }
}
