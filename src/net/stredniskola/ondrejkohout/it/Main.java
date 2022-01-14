package net.stredniskola.ondrejkohout.it;

public class Main {

    public static void main(String[] args) {
        System.out.println(operace('+',2,1));
        System.out.println(operace('-',2,1));
        System.out.println(operace('*',2,1));
        System.out.println(operace('/',2,1));
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
