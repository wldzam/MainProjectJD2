package com.company;
import javafx.application.Application;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;

public class Music extends Application {
    //public static void main(String[] args) throws Exception {
       // launch();


    @Override
    public void start(Stage primaryStage) throws Exception {
        Media media = new Media(getClass().getResource("/Music.mp3").toURI().toString());
        MediaPlayer player = new MediaPlayer(media);
        player.play();

        System.out.println("end");
    }
}