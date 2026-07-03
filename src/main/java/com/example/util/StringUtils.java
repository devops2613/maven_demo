package com.example.util;

import java.util.List;
import java.util.StringJoiner;

public class StringUtils {
    public static String join(List<?> items, String sep) {
        StringJoiner sj = new StringJoiner(sep);
        for (Object o : items) {
            sj.add(o.toString());
        }
        return sj.toString();
    }
}
