package org.example;

public class Main {
    public static void main(String[] args) {

       ControleRemoto c = new ControleRemoto();

       c.ligar();
       c.play();
       c.pause();
       c.maisVolume();

       c.abrirMenu();
       c.fecharMenu();


    }
}