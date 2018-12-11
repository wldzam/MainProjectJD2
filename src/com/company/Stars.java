package com.company;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Random;



public class Stars {

    public  int xPosition2; // координаты
    public  int yPosition2;
    public  static  int height2 = 2; // размеры
    public  static  int width2 = 2;

    public Stars (int x2, int y2)

    {
        Random random = new Random(); // начальная позиция рандомная
        xPosition2 = 800 + random.nextInt(50);		//начальная позиция астероида Х плюс рандом
        yPosition2 = 30 + random.nextInt(700);		//начальная позиция У плюс рандом
    }

    public void move() { // вызываем метод мув из СпейсШИПА
        xPosition2 = xPosition2 - 2;				//двигаем астероиды по 10 пикселей
        // если ставить больше - дергаеться
    }

    public void draw(Graphics g) { // вызываем метод дроу из СПЕЙСШИПА
        g.setColor(Color.gray); // цвет астероидов можно любой
        g.fillOval(xPosition2, yPosition2, width2, height2);	//рисуем астероиды как серый кружок
    }

    public Point getPosition() {// метод пойнт
        return new Point(xPosition2, yPosition2);		//возвращает астероиды в начало
    }
}


