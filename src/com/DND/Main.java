package com.DND;

import com.DND.entities.Player;
import com.DND.map.Maps;

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
    //       file = new File("src/cz/dracak/media/The Elder Scrolls IV - Oblivion Soundtrack - 04 Harvest Dawn.mp3");
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
        System.out.println("1 - CRUSADER ; 2 - BARBARIAN ; 3 - ASSASSIN; 4 - NECROMANCER; 5 - MAGE; 6 - HUNTER; 7 - PALADIN; 8 - HAM; 9 - CUM");
        System.out.print("Choose your character type: ");
        int type = scanner.nextInt();
        if (type == 1) {
            player.setHealth(120);
            player.setDamage(40);
            player.setLuck(.15);
            player.setWallet(0);
            System.out.println("You choosed CRUSADER");
        } else if (type == 2) {
            player.setHealth(100);
            player.setDamage(20);
            player.setLuck(.35);
            player.setWallet(100);
            System.out.println("You choosed BARBARIAN");
        } else if (type == 3) {
            player.setHealth(75);
            player.setDamage(10);
            player.setLuck(.50);
            player.setWallet(225);
            System.out.println("You choosed ASSASSIN");
        } else if (type == 4) {
            player.setHealth(50);
            player.setDamage(75);
            player.setLuck(.10);
            player.setWallet(225);
            System.out.println("You choosed NECROMANCER");
        } else if (type == 5) {
            player.setHealth(50);
            player.setDamage(70);
            player.setLuck(.10);
            player.setWallet(225);
            System.out.println("You choosed MAGE");
        } else if (type == 6) {
            player.setHealth(45);
            player.setDamage(70);
            player.setLuck(.45);
            player.setWallet(225);
            System.out.println("You choosed HUNTER");
        } else if (type == 7) {
            player.setHealth(100);
            player.setDamage(60);
            player.setLuck(.50);
            player.setWallet(100);
            System.out.println("You choosed PALADIN");
        } else if (type == 8) {
            player.setHealth(1);
            player.setDamage(1);
            player.setLuck(.100);
            player.setWallet(1000);
            System.out.println("You choosed HAM");
        } else if (type == 9) {
            player.setHealth(100);
            player.setDamage(100);
            player.setLuck(.0);
            player.setWallet(0);
            System.out.println("You choosed CUM");
        } else {
            System.out.println("Invalid choice!\n");
            chooseClass();
        }


    }

}
