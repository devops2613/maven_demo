package com.example.app;

import com.example.util.StringUtils;
import com.google.common.collect.ImmutableList;

public class App {
    public static void main(String[] args) {
        System.out.println("App started");
        ImmutableList<String> items = ImmutableList.of("alpha", "beta", "gamma");
        System.out.println("Items: " + StringUtils.join(items, ", "));
    }
}
