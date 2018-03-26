package com.jdrinkgame.util;

import java.util.*;


public class TimerGame {

		public void ShootTimer(int minutes) {		

			int delay = 10000;   // delay de 5 seg.
		    int interval = 10000;  // intervalo de 1 seg.
		    
		  	    Timer timer = new Timer();
			     timer.schedule(new TimerTask() {
			            public void run() {
			               System.out.println("Alerta: Hora de todoas beberem!");
			            }
			        }, delay);
			     
		}
		
		
}
