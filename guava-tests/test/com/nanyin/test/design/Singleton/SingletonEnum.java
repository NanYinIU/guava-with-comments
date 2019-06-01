package com.nanyin.test.design.Singleton;

import java.util.Arrays;

public enum SingletonEnum {
    INSTANCE;
    private final String[] favoriteSongs =
            { "Hound Dog", "Heartbreak Hotel" };
    public void printFavorites() {
        System.out.println(Arrays.toString(favoriteSongs));
    }
}
