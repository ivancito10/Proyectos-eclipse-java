package geral_11078;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long TInicio, TFin, tiempo;           //Para determinar el tiempo
		 TInicio = System.currentTimeMillis(); //de ejecución
		Scanner sc = new Scanner(System.in);
		int tc= sc.nextInt();
		while(tc-- >0) {
		 int noOfStud = sc.nextInt();
		 int dif =-999999,max=0;
		 int marks[] = new int[noOfStud];
		 //int maxAr [] = new int[noOfStud-1];
		 for(int idx=0;idx<noOfStud;idx++) {
		  marks[idx]=sc.nextInt();
		  
		 }
		 max=-9999999;
		 //int min = marks[1];
		 //maxAr[0]= max-min;

		 
		 for (int idx=0;idx < noOfStud-1; idx++) {
		  
		  if (max< marks[idx]) max= marks[idx];
		  if (max-marks[idx+1]>dif) dif = max-marks[idx+1];
		  
		  
		 }
		 
		 System.out.println(dif);
		 }
		TFin = System.currentTimeMillis();
		 tiempo = TFin - TInicio;
		  System.out.println("Tiempo de ejecución en milisegundos: " + tiempo);
		
		}


}
