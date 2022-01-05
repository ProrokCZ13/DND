package com.DND.map.content;

import com.DND.entities.Player;

import java.util.Scanner;

public class Shop {

    private Scanner scanner = new Scanner(System.in);

    public Player player;

    public Shop(Player player) {
        this.player = player;
        System.out.println("\n\"HELLO DEAR ADVENTURER, IS THERE SOMETHING YOU WANT?\" - SAID TRADER");
    }

    public void goShopping() {
        System.out.println(
                "Your wallet : " + player.getWallet() + " COINS\n" +
                " - (1) - NEW WEAPON (+15 DMG) : 100 COINS\n" +
                " - (2) - HEAL (+20 HP) : 75 COINS\n" +
                " - (0) - EXIT\n"
        );
        System.out.print("Choose: ");
        int choice = scanner.nextInt();
        if (choice == 1) {
            if (player.getWallet() >= 100) {
                player.setWallet(player.getWallet() - 100);
                player.setDamage(player.getDamage() + 15);
                System.out.println("YOU'VE NEW WEAPON");
                System.out.println("+15 DMG (" + player.getDamage() + " DMG)\n");
                goShopping();
            } else {
                System.out.println("\"WHERE MONEY BRO?!");
                System.out.println("YOU NEED " + (100 - player.getWallet()) + " MORE!\n");
                goShopping();
            }
        } else if (choice == 2) {
            if (player.getWallet() >= 75) {
                player.setWallet(player.getWallet() - 75);
                player.setHealth(player.getHealth() + 20);
                System.out.println("YOU'VE BOUGHT HEAL");
                System.out.println("+20 HP (" + player.getHealth() + " HP)\n");
                goShopping();
            } else {
                System.out.println("WHERE MONEY BRO?!");
                System.out.println("YOU NEED " + (75 - player.getWallet()) + " MORE!\n");
                goShopping();
            }
        } else {
            System.out.println("\n\"SEE YOU LATER!\" - SAID TRADER");
        }
    }


}
