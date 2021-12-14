package com.DND.entities;

import java.util.Random;

public enum Enemies {

    DIO(new Entity("DIO", 500, 45, 0.8)),
    TURRET(new Entity("TURRET", 120, 20, 0.4)),
    CRAB(new Entity("CRAB", 80, 20, 0.35)),
    SLIME(new Entity("SLIME", 50, 15, 0.3));


    private Random random = new Random();

    private Entity entity;

    Enemies(Entity entity) {
        this.entity = entity;
    }

    public Entity getEntity() {
        return entity;
    }

    public void setEntity(Entity entity) {
        this.entity = entity;
    }
}
