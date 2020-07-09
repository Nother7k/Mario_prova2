package br.edu.univas.main;
import java.util.Scanner;

public class Questao_3 {
	public static void main(String[] args){
		Scanner Scanner = new Scanner(System.in);
		 float salario[] = new float[150];
	     float totalAtual = 0;
	     float totalAumentado = 0;
	     int contador = 0;

	        for (int i = 0; i < 150; i++) {
	        	contador++;
	            System.out.println("Digite o valor do "+contador+"° salário"); 
	            salario[i] = Scanner.nextFloat();
	            totalAumentado = totalAumentado + (salario[i]*1.15f);
	            totalAtual =+ salario[i];
	        }
			
			System.out.println("Salário atual: "+ totalAtual);
			System.out.println("Salário com aumento de 15%: "+totalAumentado);
			System.out.println("===================================================================");
		}
	}

