package com.qt.container;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
         eg1: hashMap.put(0, "a0");
         eg2: hashMap.put(1, "a1");
         eg3: hashMap.put(16, "a16");
         eg4: hashMap.put(32, "a32");
         eg5: hashMap.put(48, "a48");
              hashMap.put(64, "a64");
              hashMap.put(80, "a80");
              hashMap.put(96, "a96");
              hashMap.put(112, "a112");
         eg6: hashMap.put(128, "a128");
        //{0=a0, 32=a32, 64=a64, 96=a96, 128=a128, 1=a1, 16=a16, 48=a48, 80=a80, 112=a112}
        System.out.println(hashMap);
    }
}
