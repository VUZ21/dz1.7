package com.company;

public class Main {

    public static void main(String[] args) {
        Warrior w = new Warrior();
        Medic m = new Medic();
        Magic c = new Magic();

        Hero[] heroes = {w, m, c};
        for (Hero a : heroes) {
            a.applySuperAbility("CRITICAL DAMAGE");
        }
    }
}
