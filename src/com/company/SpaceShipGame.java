package com.company;

// делаем корабль и 10 астероидов и 100 звезд


import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.Timer;

import sun.audio.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;



import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class SpaceShipGame extends JPanel  {


    public SpaceShip ship = new SpaceShip(); // вызываем корабль из ШИПА
    public ArrayList<Asteroid> asteroid;        //создаем лист для хранения астероидов
    public int score = 0;                    //Наш счет начинаем с нуля  = 0
    public int myLife = 30;                //количество жизней
    public int x, y;                         // переменные для астероидов
    public Timer asteroidTimer;                //таймер для астероидов
    public int delay2 = 100;             // скорость астероидов можно менять
    public int shootX, shootY;                //координаты для астерроидов при стрельбе
    public int boomX, boomY;            //координаты для удара
    public Stage window;
    public Scene scene1, scene2;






    public SpaceShipGame() {
        SpaceshipListener monitor = new SpaceshipListener(); // вызываем внутренний класс
        asteroid = new ArrayList<Asteroid>(); // лист для астероидов

        for (int i = 0; i < 15; i++) {  //   количество астероидов . если надо добавляем в цикл
            //!! важно !! менять надо и в цикле движения!!! иначе не попрет
            asteroid.add(new Asteroid(x, y)); // цикл фор считает и добавляет астероиды в заданные координаты
        }
        addMouseMotionListener(monitor);  // цепляем движение мышкойб как повесить на кнопку хз не разобрался
        addMouseListener(monitor);


        asteroidTimer = new Timer(delay2, new AsteroidTimer()); // таймер для астероидов

        setBackground(Color.black);  // цвет экрана бэкграунда
        setPreferredSize(new Dimension(800, 800)); // размер нашего окна


        //Button button = new Button();

        asteroidTimer.start();        //стартуем движение астероидов. запускаем таймер


    }

    public static void main(String[] args) { // метод мэйн

        JFrame frame = new JFrame("STARWARS");// название игры и установка фрейма экрана
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// выход при закрытии

        frame.getContentPane().add(new SpaceShipGame()); // натягиваем контентпэйн для всей фигни

        frame.pack();// после всех компонентов
        // устанавливает такой минимальный размер контейнера,
        // который достаточен для отображения всех компонентов.
        // без него окно сворачиваеться
        frame.setVisible(true);// делаем видимым !!!!
    }

    @Override // оверрайдим
    public void paintComponent(Graphics g) {
        //рисуем лазерный луч
        super.paintComponent(g);
        ship.draw(g, 800); // длинна  видимого лазерного луча 800 до конца нашего экрана
        // если уменьшить - станет короче

        //рисуем астероиды
        for (Asteroid a : asteroid)
            a.draw(g);

        // печатаем эффект при столкновении
        g.setColor(Color.white); // устанавливаем цвет текста - зеленый или любой
        //печатаем бабах при столкновении
        if (myLife > 0 && ship.getPosition().x == 0 && ship.getPosition().y == 0) {
            g.drawString("БАБАХ ", boomX, boomY);
            // соответственно

        } else {
            g.drawString("", boomX, boomY);
        }

        //печатаем эффект от выстрела
        if (myLife > 0 && ship.getShooting()) {
            g.drawString(" Я ПОПАЛ!!!", shootX, shootY);
        } else {
            //если не попал - пустая строка
            g.drawString("", shootX, shootY);
        }
// отображаем счет и жизни по координатам в верхнем левом углу
        // можно переместить и в другое место
        //отображение счета и жизней только пока есть жизни
        // иначе GAME OVER  в центре эрана
        if (myLife > 0) {
            g.drawString("СЧЕТ !!! : " + score, 20, 40);
            g.drawString("ЖИЗНИ!!! : " + myLife, 20, 60);

        } else {
            g.drawString("КОНЕЦ ИГРЫ", 400, 400);// отрисовка в центр
            //JButton = new Button();

        }
    }




    private class AsteroidTimer implements ActionListener { // наследник евентлистенера

        public void actionPerformed(ActionEvent event) {
            for (int i = 0; i < 15; i++) {
                asteroid.get(i).move();        //двигаем все астероиды

                if (asteroid.get(i).getPosition().x < 0) {// при долете до конца экрана -убираем
                    asteroid.remove(i);  // метод уборки
                    asteroid.add(i, new Asteroid(x, y)); //  добавляем новый
                }
                ///////////////// этот кусок кода свиснут с другого проекта
                // столкновение корабля
                if (asteroid.get(i).getPosition().x < ship.getPosition().x + 55
                        && asteroid.get(i).getPosition().y + 30 > ship.getPosition().y
                        && asteroid.get(i).getPosition().y < ship.getPosition().y + 50) {
                    boomX = asteroid.get(i).getPosition().x;
                    boomY = asteroid.get(i).getPosition().y;
                    asteroid.remove(i);      //удаляем астероид когда касаеться корабля
                    ship.move(0, 0);    //перемещаем корабль в нулевые координаты после коллизии
                    myLife--;              //отнимаем жизнь по одной
                    asteroid.add(i, new Asteroid(x, y));   //восстанавливаем астероид после столкновения
                }
                if (asteroid.get(i).getPosition().y < ship.getPosition().y + 25
                        && asteroid.get(i).getPosition().y + 30 > ship.getPosition().y + 25
                        && ship.getShooting()) { // логика стрельбы - честно украл из другого проекта
                    shootX = asteroid.get(i).getPosition().x;
                    shootY = asteroid.get(i).getPosition().y;
                    //////////////////////////////////
                    asteroid.remove(i);    // убираем астероид после попадания
                    score = score + 1;     //прибавляем счет
                    asteroid.add(i, new Asteroid(x, y));   //добавляем астероид после попадания
                }
            }
            if (myLife == 0) { //  жизней ноль - таймер стоп
                asteroidTimer.stop();

                asteroid.clear(); // чистим экран
            }
            repaint(); /// рипэйнт
        }
    }

    ///   движение за мышой
    private class SpaceshipListener implements MouseListener, MouseMotionListener {
        public void mouseMoved(MouseEvent event) {
            ship.move(event.getX(), event.getY());   //обновляет позицию корабля за мышой
            repaint();
        }

        public void mousePressed(MouseEvent event) { // ивент нажатие на кнопку стрельба
            ship.setShooting(true);                    //рисуем лазер
            repaint();
        }

        public void mouseReleased(MouseEvent event) { // отпускаем - ничего
            ship.setShooting(false);
            shootX = 0;
            shootY = 0;
            repaint();
        }

        public void mouseDragged(MouseEvent event) {
        }

        public void mouseClicked(MouseEvent event) {
        }

        public void mouseEntered(MouseEvent event) {
        }

        public void mouseExited(MouseEvent event) {
        }




    }





    }



