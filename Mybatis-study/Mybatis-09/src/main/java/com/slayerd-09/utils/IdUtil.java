package com.slayerd.utils;

import java.util.UUID;

public class IdUtil {
    public static String getId(){
        String s = UUID.randomUUID().toString().replaceAll("-", "");
        return s;
    }
}
