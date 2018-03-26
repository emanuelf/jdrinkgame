package com.jdrinkgame.main;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

import com.jdrinkgame.challenge.Destill;

public class Game {

	public static void main(String[] args) {
		
		//rece o retorno da tela de configurações
		Destill destill;
		int delay = 10000;   // delay de 5 seg.
	    int interval = 10000;  // intervalo de 1 seg.
	   
		    Timer timer = new Timer();
		     timer.schedule(new TimerTask() {
		            public void run() {
		               System.out.println("Alerta: Hora de todos beberem!");
		               }              
		            
		        }, delay);
		     
		     System.out.println("dsfdf");
	    
	}
}
