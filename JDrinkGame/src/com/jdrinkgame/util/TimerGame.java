package com.jdrinkgame.util;

import java.util.*;


public class TimerGame {

		public void ShootTimer(int minutes) {		

			  int delay = 5000;   // delay de 5 seg.
			    int interval = 1000;  // intervalo de 1 seg.
			    Timer timer = new Timer();
			    
			    timer.scheduleAtFixedRate(new TimerTask() {
			            public void run() {
			               System.out.println("Alerta: Hora de todoas beberem!");
			            }
			        }, delay, interval);
			
		}
		
		
		
}
