package net.stredniskola.ondrejkohout.it;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }


    public static int operace(char zna, int a, int b){
        switch (zna){
            case '+':
                return a+b;
            case '-':
                return a-b;
            case '*':
                return a*b;
            case '/':
                return a/b;

            default:
                return Integer.MIN_VALUE;
        }

    }

}
