package com.kobi.class2;

import java.util.ArrayList;

public class SuperHero {

    private String name = "";
    private String city = "";
    private boolean isGifted = false;
    private int hp = 0;

    private ArrayList<TopTen> scores;

    public SuperHero() { }

    public SuperHero(String name, String city, boolean isGifted, int hp) {
        this.name = name;
        this.city = city;
        this.isGifted = isGifted;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public SuperHero setName(String name) {
        this.name = name;
        return this;
    }

    public String getCity() {
        return city;
    }

    public SuperHero setCity(String city) {
        this.city = city;
        return this;
    }

    public boolean isGifted() {
        return isGifted;
    }

    public SuperHero setGifted(boolean gifted) {
        isGifted = gifted;
        return this;
    }

    public int getHp() {
        return hp;
    }

    public SuperHero setHp(int hp) {
        this.hp = hp;
        return this;
    }

    public ArrayList<TopTen> getScores() {
        return scores;
    }

    public SuperHero setScores(ArrayList<TopTen> scores) {
        this.scores = scores;
        return this;
    }
}
