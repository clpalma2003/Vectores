package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int vector [] = new int[3];
        vector[0] = 10;
        vector[1] = 6;
        vector[2] = 7;

        for (int i = 0; i < 3; i++){
            System.out.println(" El elemento " + (i+1) + " tiene como valor: " + vector[i]);}

        int vector2[] = {7,2,3,4};
        for (int i = 0; i < 4; i++){
            System.out.println(" El elemento " + (i+1) + " vector 2 tiene como valor: " + vector2[i]);}
    }
}
