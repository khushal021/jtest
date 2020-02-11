/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

/**
 *
 * @author Prathamesh
 */

/**
 *
 * @author kareena
 */

import java.util.Scanner;

public class CountVowels {
    void DemoCount(String str){
        char[] inp = str.toCharArray();
        int vowels=0;
        int consonants=0;

        for(int i=0; i<str.length(); i++){
            if(inp[i] == 'a' || inp[i] == 'e' || inp[i] == 'i' || inp[i] == 'o' || inp[i] == 'u'){
                vowels++;
            }
            else{
                consonants++;
            }
        }

        System.out.println("Vowels = "+vowels+" and Consonants = "+consonants);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input String: ");
        String str = scanner.next();

        CountVowels countVowels = new CountVowels();
        countVowels.DemoCount(str);
    }
}

