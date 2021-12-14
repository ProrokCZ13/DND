package com.DND;

import com.DND.entities.Player;
import com.DND.map.Maps;
//import jaco.mp3.player.MP3Player;
import java.io.File;
import java.util.Scanner;

public class Main {
    // private static MP3Player music;
    //  private static File file;
    private static Scanner scanner = new Scanner(System.in);
    public static Player player = new Player("PLAYER", 100, 20, .5, 100);

    public static void main(String[] args) {
        chooseClass();
        chooseName();
        Maps maps = new Maps(player);
    }

    //   public static void Music() {
    //       file = new File("src/com/DND/media/The Elder Scrolls IV - Oblivion Soundtrack - 04 Harvest Dawn.mp3");
    //       music = new MP3Player(file);
    //       while (true) {
    //           music.play();
    //       }
    //   }

    public static void chooseName() {
        System.out.print("WHAT IS YOUR NAME?: ");
        player.setName(scanner.next());

    }

    public static void chooseClass() {
        System.out.println("1 - CRUSADER");
        System.out.println("HP: 120");
        System.out.println("DMG: 40");
        System.out.println("LUCK: 15");
        System.out.println("CASH: 0");
        System.out.println("---------------------------------------------------------------------");
        System.out.println(" 2 - BARBARIAN");
        System.out.println("HP: 100");
        System.out.println("DMG: 20");
        System.out.println("LUCK: 35");
        System.out.println("CASH: 100");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("3 - ASSASSIN");
        System.out.println("HP:75");
        System.out.println("DMG:10");
        System.out.println("LUCK:50");
        System.out.println("CASH:225");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("4 - NECROMANCER");
        System.out.println("HP:50");
        System.out.println("DMG:75");
        System.out.println("LUCK:10");
        System.out.println("CASH:225");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("5 - MAGE");
        System.out.println("HP:50");
        System.out.println("DMG:70");
        System.out.println("LUCK:10");
        System.out.println("CASH:225");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("6 - HUNTER");
        System.out.println("HP:45");
        System.out.println("DMG:70");
        System.out.println("LUCK:45");
        System.out.println("CASH:225");
        System.out.println("---------------------------------------------------------------------");
        System.out.println(" 7 - PALADIN");
        System.out.println("HP:100");
        System.out.println("DMG:60");
        System.out.println("LUCK:50");
        System.out.println("CASH:100");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("8 - HAM");
        System.out.println("HP:1");
        System.out.println("DMG:1");
        System.out.println("LUCK:100");
        System.out.println("CASH:1000");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("9 - CUM");
        System.out.println("HP:100");
        System.out.println("DMG:100");
        System.out.println("LUCK:0");
        System.out.println("CASH:0");
        System.out.println("---------------------------------------------------------------------");
        System.out.print("CHOOSE YOUR CLASS: ");
        int type = scanner.nextInt();
        if (type == 1) {
            player.setHealth(120);
            player.setDamage(40);
            player.setLuck(.15);
            player.setWallet(0);
            System.out.println("YOU CHOSE CRUSADER");
        } else if (type == 2) {
            player.setHealth(100);
            player.setDamage(20);
            player.setLuck(.35);
            player.setWallet(100);
            System.out.println("YOU CHOSE BARBARIAN");
        } else if (type == 3) {
            player.setHealth(75);
            player.setDamage(10);
            player.setLuck(.50);
            player.setWallet(225);
            System.out.println("YOU CHOSE ASSASSIN");
        } else if (type == 4) {
            player.setHealth(50);
            player.setDamage(75);
            player.setLuck(.10);
            player.setWallet(225);
            System.out.println("YOU CHOSE NECROMANCER");
        } else if (type == 5) {
            player.setHealth(50);
            player.setDamage(70);
            player.setLuck(.10);
            player.setWallet(225);
            System.out.println("You chose MAGE");
        } else if (type == 6) {
            player.setHealth(45);
            player.setDamage(70);
            player.setLuck(.45);
            player.setWallet(225);
            System.out.println("You chose HUNTER");
        } else if (type == 7) {
            player.setHealth(100);
            player.setDamage(60);
            player.setLuck(.50);
            player.setWallet(100);
            System.out.println("You chose PALADIN");
        } else if (type == 8) {
            player.setHealth(1);
            player.setDamage(1);
            player.setLuck(.100);
            player.setWallet(1000);
            System.out.println("You chose HAM");
        } else if (type == 9) {
            player.setHealth(100);
            player.setDamage(100);
            player.setLuck(.0);
            player.setWallet(0);
            System.out.println("You chose CUM");
        } else {
            System.out.println("Invalid choice!\n");
            chooseClass();
        }


    }

}
