package com.jdrinkgame.challenge;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public enum Destill {
	UMADOSE("Indique algu�m para beber uma dose","Voc� pode escolher alguem para beber uma dose ou voc� mesmo pode beber um dose"),
	DUASDOSE("Indique duas para beber uma dose cada","Voc� pode duas pessoas para cada uma delas beba uma dose"),
	TRESDOSE("Indique tr�s pessoas para beber uma dose cada","Voc� pode indicar tr�s pessoa para que cada uma delas beba uma dose"),
	VOCEBEBE("Voc� que bebe",""),
	BANHEIRO("Ganhou o direito de ir ao banheiro","Voc� pode ir ao banheiro ou guardar a card para mais tarde. Se optar em guardar para mais tarde deve beber uma dose"),
	EQUILIBRIO("Desafie algu�m a ficar sobre uma perna","O desafiado deve permanecer por 30 segundos sobre uma perna, se perder ele deve beber uma dose"),
	TODOSBEBEM("Dessa vez tudos bebem",""),
	HOMENSBEBEM("Todos os homens bebem.","Se voc� se sente homem, pode beber tamb�m"),
	MULHERESBEBEM("Todas as mulheres bebem", "Se voc� se sente mulher, pode beber tamb�m"),
	PIN3("Deve falar PIN toda vez que for o numero 3 ou multiplo de 3","A contagem vai at� 30, se algu�m errar deve beber uma dose"),
	PIN5("Deve falar PIN toda vez que for o numero 5 ou multiplo de 5","A contagem vai at� 30, se algu�m errar deve beber uma dose"),
	PIN7("Deve falar PIN toda vez que for o numero 7 ou multiplo de 7","A contagem vai at� 30, se algu�m errar deve beber uma dose"),
	PALAVRA("Palavra especial","Defina uma palavra, n�o conte para ninguem, se alguem falar a palavra deve beber uma dose"),
	MEMORIA("Teste de mem�ria","Diga uma alguma coisa, a pr�xima pessoa deve repetir o que voc� disse e acrescentar mais uma palavra, caso a pessoa demore ou erre ela deve beber uma dose"),
	LETRAINICIAL("Jogo do Stop","Escolhe uma categoria e uma letra, e diga uma palvra que comece com a letra definida e que perten�a a categoria definida"),
	DORMINHOCO("Identificando o dorminhoco", "Coloque o dedo indicador sobre a mesa, todos devem repetir o gesto de acordo com o que voc� fizer o �ltimo a repetir o gesto bebe. Voc� pode usar quando quiser essa carta");
	
	
	
	private static final ArrayList<Destill> VALUES = (ArrayList<Destill>) Collections.unmodifiableList(Arrays.asList(values()));
	private static final int SIZE = VALUES.size();
	private static final Random RANDOM = new Random();
	
	public static Destill randomDestill() {
		return VALUES.get(RANDOM.nextInt(SIZE));
	}
		
	Destill(String desc, String descComplete){
		
	}
	
	
}
