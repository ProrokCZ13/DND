package com.DND.entities;

import java.util.Locale;
import java.util.Random;

public class Entity {

    private Random random = new Random();

    public String name;
    public double health;
    public double damage;
    public double luck;

    public Entity(String name, double health, double damage, double luck) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.luck = luck;
    }

    public Entity(Enemies enemies) {
        this.name = enemies.getEntity().name;
        this.health = enemies.getEntity().health;
        this.damage = enemies.getEntity().damage;
        this.luck = enemies.getEntity().luck;
    }


    public void getASCII() {
        if (this.name.contains("DIO")) {
            System.out.println();

        } else if (this.name.contains("KOKOT")) {
            System.out.println(
                   );
        } else if (this.name.contains("CRAB")) {
            System.out.println(
                    );
        } else if (this.name.contains("SLIME")) {
            System.out.println( );
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.toUpperCase(Locale.ROOT);
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public double getLuck() {
        return luck;
    }

    public void setLuck(double luck) {
        this.luck = luck;
    }
}
