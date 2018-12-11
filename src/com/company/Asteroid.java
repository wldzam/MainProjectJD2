package com.company;


// Автор Влад

//Этот класс устанавливает начальные позиции для астероидов x y
//также рисует астероиды и двигает слева направо


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Random;

public class Asteroid {
    public int xPosition;
    public int yPosition;
    public int xPosition2;
    public int yPosition2;
    public static int height = 30;        //высота астероида. можно менять
    public static int width = 35;   //ширина - можно менять
    public int height2 = 2;
    public int width2 = 2;


    public Asteroid(int x, int y)

    {
        Random random = new Random(); // начальная позиция рандомная
        xPosition = 800 + random.nextInt(50);        //начальная позиция астероида Х плюс рандом
        yPosition = 50 + random.nextInt(700);        //начальная позиция У плюс рандом

        xPosition2 = 800 + random.nextInt(50);
        yPosition2 = 50 + random.nextInt(700);



    }

    public void move() { // вызываем метод мув из СпейсШИПА
        xPosition = xPosition - 4;                //двигаем астероиды по 10 пикселей

        xPosition2 =xPosition2 - 10;
        // если ставить больше - дергаеться
    }

    public void draw(Graphics g) { // вызываем метод дроу из СПЕЙСШИПА
        g.setColor(Color.gray); // цвет астероидов можно любой
        g.fillOval(xPosition, yPosition, width, height);    //рисуем астероиды как серый кружок

        g.setColor(Color.white);
        g.fillOval(xPosition2, yPosition2,width2,height2);
    }

    public Point getPosition() {// метод пойнт
        return new Point(xPosition, yPosition);        //возвращает астероиды в начало
    }


    }