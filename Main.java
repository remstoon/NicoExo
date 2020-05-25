package com.company;
import java.util.*;

public class Main {

    public static String morse(String maPhrase) {
        String maPhraseMORSE = "Ma phrase en morse =";
        for (int i = 0; i < maPhrase.length(); i++) {
            switch (maPhrase.charAt(i)) {
                case 'a':
                    maPhraseMORSE = maPhraseMORSE + " .-";
                    break;
                case 'b':
                    maPhraseMORSE = maPhraseMORSE + " -...";
                    break;
                case 'c':
                    maPhraseMORSE = maPhraseMORSE + " -.-.";
                    break;
                case 'd':
                    maPhraseMORSE = maPhraseMORSE + " -..";
                    break;
                case 'e':
                    maPhraseMORSE = maPhraseMORSE + " .";
                    break;
                case 'f':
                    maPhraseMORSE = maPhraseMORSE + " ..-.";
                    break;
                case 'g':
                    maPhraseMORSE = maPhraseMORSE + " --.";
                    break;
                case 'h':
                    maPhraseMORSE = maPhraseMORSE + " ....";
                    break;
                case 'i':
                    maPhraseMORSE = maPhraseMORSE + " ..";
                    break;
                case 'j':
                    maPhraseMORSE = maPhraseMORSE + " .---";
                    break;
                case 'k':
                    maPhraseMORSE = maPhraseMORSE + " -.-";
                    break;
                case 'l':
                    maPhraseMORSE = maPhraseMORSE + " .-..";
                    break;
                case 'm':
                    maPhraseMORSE = maPhraseMORSE + " --";
                    break;
                case 'n':
                    maPhraseMORSE = maPhraseMORSE + " -.";
                    break;
                case 'o':
                    maPhraseMORSE = maPhraseMORSE + " ---";
                    break;
                case 'p':
                    maPhraseMORSE = maPhraseMORSE + " .--.";
                    break;
                case 'q':
                    maPhraseMORSE = maPhraseMORSE + " --.-";
                    break;
                case 'r':
                    maPhraseMORSE = maPhraseMORSE + " .-.";
                    break;
                case 's':
                    maPhraseMORSE = maPhraseMORSE + " ...";
                    break;
                case 't':
                    maPhraseMORSE = maPhraseMORSE + " -";
                    break;
                case 'u':
                    maPhraseMORSE = maPhraseMORSE + " ..-";
                    break;
                case 'v':
                    maPhraseMORSE = maPhraseMORSE + " ...-";
                    break;
                case 'w':
                    maPhraseMORSE = maPhraseMORSE + " .--";
                    break;
                case 'x':
                    maPhraseMORSE = maPhraseMORSE + " -..-";
                    break;
                case 'y':
                    maPhraseMORSE = maPhraseMORSE + " -.--";
                    break;
                case 'z':
                    maPhraseMORSE = maPhraseMORSE + " --..";
                    break;
                case ' ':
                    maPhraseMORSE = maPhraseMORSE + "/";
                    break;
            }
        }
        return maPhraseMORSE;
    }
    public static void main(String[] args) {


        System.out.println("Phrase: ");
        Scanner sc=new Scanner(System.in);
        String maPhrase = sc.nextLine();
        System.out.println(maPhrase);
        String maPhraseMORSE = morse(maPhrase);

        System.out.println(maPhraseMORSE);

    }
}
