package com.company;

// первоначальная позиция
//лазер
//раскраска


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class SpaceShip {
    private int xPos;
    private int yPos;
    private static int height = 50;        // высота корабля
    private static int width = 70;        // ширина корабля
    private boolean shooting;

    public SpaceShip() {
        xPos = 0;                //начальная позиция
        yPos = 0;                //начальная позиция
        shooting = false;
    }

    // метод для перемещения за мышой
    public void move(int x, int y) {
        xPos = x;
        yPos = y;
    }

    public void setShooting(boolean value) {
        shooting = value;
    }

    public Boolean getShooting() {
        return Boolean.valueOf(shooting);
    }

    public Point getPosition() {
        return new Point(xPos, yPos);
    }

    public void draw(Graphics g, int laserlength) {
        g.setColor(Color.blue); // цвет
        g.fillOval(xPos, yPos, width, height);        //тело корабля
        g.setColor(Color.white);
        g.fillOval(xPos + 35, yPos + 10, 23, 17);        //кабина
        g.drawLine(xPos, yPos + height / 2, xPos + width, yPos + height / 2);
        g.setColor(Color.white);
        g.drawLine(xPos, yPos + height / 2 + 3, xPos + width, yPos + height / 2 + 3);
        g.drawLine(xPos, yPos + height / 2 - 3, xPos + width, yPos + height / 2 - 3);


        g.setColor(Color.red);

        // лазер - просто красная линия
        if (shooting)
            g.drawLine(xPos + width, yPos + height / 2, laserlength, yPos + height / 2);
    }
}
