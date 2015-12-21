package com.levelup.model;

import javax.persistence.*;

/**
 * Class {@link com.levelup.model.Cars}
 *
 * @author Skityashin Vladimir
 * @version 1.0
 * @since 21.12.15
 */

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "carstype", discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("Cars")
public class Cars {
    private long id;
    private int speed;
    private int power;
    private int doorsCount;
    private String color;

    public Cars() {
    }


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }



    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }



    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }



    public int getDoorsCount() {
        return doorsCount;
    }

    public void setDoorsCount(int doorsCount) {
        this.doorsCount = doorsCount;
    }



    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
