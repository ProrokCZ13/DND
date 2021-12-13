package com.DND.map;

import com.DND.entities.Enemies;
import com.DND.entities.Entity;
import com.DND.entities.Player;
import com.DND.map.content.Fight;
import com.DND.map.content.Shop;

import java.util.Random;
import java.util.Scanner;

public class Maps {

    private Scanner scanner = new Scanner(System.in);
    private Random random = new Random();

    Player player;
    public enum MapElements {
        FIGHT,
        SHOP,
        CHEST
    }

    public Maps(Player player) {
        this.player = player;
        WetLands();
    }

    public void WetLands() {
        Entity[] enemies = {
                new Entity(Enemies.SLIME),
                new Entity(Enemies.SLIME),
                new Entity(Enemies.SLIME)
        };
        for (Entity enemy : enemies) {
        }
        MapElements[][] map = {
            {MapElements.CHEST, MapElements.SHOP},
            {MapElements.FIGHT, MapElements.FIGHT, MapElements.FIGHT},
            {MapElements.SHOP, MapElements.CHEST},
            {MapElements.CHEST, MapElements.FIGHT, MapElements.FIGHT, MapElements.CHEST},
            {MapElements.FIGHT},
            {MapElements.SHOP, MapElements.SHOP}
        };
        System.out.println("\nWET LANDS:");
        System.out.println("YOUR MOTHER IS SICK. THE ONLY CURE IS IN MANSION OF VAMPIRE. YOUR TRAVEL WILL TAKE 50 DAYS.");
        System.out.println("YOUR JOURNEY STARTED AT WET LANDS. IT'S LAND FULL OF SLIMES");
        Map(enemies, map);
        CrabBeach();
    }

    public void CrabBeach() {
        Entity[] enemies = {
                new Entity(Enemies.CRAB),
                new Entity(Enemies.CRAB),
                new Entity(Enemies.CRAB)
        };
        for (Entity enemy : enemies) {
        }
        MapElements[][] map = {
                {MapElements.SHOP},
                {MapElements.FIGHT, MapElements.CHEST, MapElements.FIGHT},
                {MapElements.SHOP, MapElements.CHEST},
                {MapElements.FIGHT, MapElements.FIGHT, MapElements.CHEST},
                {MapElements.FIGHT, MapElements.FIGHT},
                {MapElements.SHOP}
        };
        System.out.println("\nSPIDER CAVE:");
        System.out.println("WHEN YOU CAME TO THE END OF WETLANDS YOU ENTERED OLD FORTRESS");
        System.out.println("WHEN YOU CRAB BEACH YOU ENTERED OLD FORTRESS");
        Map(enemies, map);
        OldFortress();
    }

    public void OldFortress() {
        Entity[] enemies = {
                new Entity(Enemies.KOKOT),
                new Entity(Enemies.KOKOT),
                new Entity(Enemies.KOKOT)
        };
        for (Entity enemy : enemies) {
        }
        MapElements[][] map = {
                {MapElements.SHOP},
                {MapElements.CHEST, MapElements.CHEST},
                {MapElements.FIGHT, MapElements.FIGHT, MapElements.FIGHT, MapElements.FIGHT},
                {MapElements.SHOP},
                {MapElements.FIGHT, MapElements.FIGHT},
                {MapElements.CHEST, MapElements.FIGHT, MapElements.CHEST},
                {MapElements.SHOP}
        };
        System.out.println("YOU CAME OUT OF OLD FORTRESS AND FOUND GOAL OF YOUR JOURNEY.");
        Map(enemies, map);
        DioBrando();
    }

    public void DioBrando() {
        Entity[] enemies = {
                new Entity(Enemies.DIO)
        };
        for (Entity enemy : enemies) {
        }
        MapElements[][] map = {
                {MapElements.SHOP},
                {MapElements.FIGHT}
        };
        System.out.println("\nDIO BRANDO:");
        System.out.println("YOU ENTERED THE MANSION OF IMMORTAL VAMPIRE. YOU WALKED STRAIGHT RIGHT TO HIS ROOM AND HE SAID \"OH! YOU APPROACHING ME INSTEAD OF RUNNING AWAY\"");
        System.out.println("YOU FOUND CURE FOR YOUR MOTHER AND WENT BACK AND CURED HER AND SHE IS HEALTHY NOW.");
        Map(enemies, map);
        System.out.println();
    }

    public void Map(Entity[] enemies, MapElements[][] map) {
        int enemy = 0;
        for (MapElements[] mapElements : map) {
            System.out.print("\n( ");
            for (int j = 0; j < mapElements.length; j++) {
                System.out.print(j + " ");
            }
            System.out.println(")");
            System.out.print("Choose your way: ");
            int choice = scanner.nextInt();
            if (mapElements[choice] == MapElements.FIGHT) {
                System.out.println("YOU'VE ENCOUNTERED AN ENEMY.");
                new Fight(enemies[enemy], player).startFight();
                enemy++;
            } else if (mapElements[choice] == MapElements.SHOP) {
                System.out.println("YOU'VE ENCOUNTERED A TRADER.");

                new Shop(player).goShopping();
            } else if (mapElements[choice] == MapElements.CHEST) {
                System.out.println("YOU'VE FOUND A CHEST.");
                int coins = random.nextInt(100) + 1;
                player.setWallet(player.getWallet() + coins);
                System.out.println(" - You gain " + coins + " CR (" + player.getWallet() + ")");
            }
        }
    }

}
