package com.java.simple_game_oop;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Player1 player = new Player1("John", "sword", -20);
        //System.out.println(player.getName());
        //System.out.println(player.getWeapon());
        //System.out.println(player.getHealth());

        player.damageByWeapon1();
        //player.damageByWeapon1();
        player.damageByWeapon2();
        //Player2 betterPlayer = new Player2("Smith", "Water Bottle", 80, true);
       // betterPlayer.damageByWeapon1();
    }
}


