package hw_1_base_operations_vasyl_zablotskyi.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ведите номер урока (от 1 до 10) который вас интересует:");
        String lesson = reader.readLine();

        switch (lesson) {
            case ("1") : {
                int h = 9;
                int m = 45;
                System.out.println("Окончание урока в: " + h + " : " + m);
            }
            break;
            case ("2") : {
                int h = 10;
                int m = 35;
                System.out.println("Окончание урока в: " + h + " : " + m);
            }
            break;
            case ("3") : {
                int h = 11;
                int m = 35;
                System.out.println("Окончание урока в: " + h + " : " + m);
            }
            break;
            case ("4") : {
                int h = 12;
                int m = 25;
                System.out.println("Окончание урока в: " + h + " : " + m);
            }
            break;
            case ("5") : {
                int h = 13;
                int m = 25;
                System.out.println("Окончание урока в: " + h + " : " + m);
            }
            break;
            case ("6") : {
                int h = 14;
                int m = 15;
                System.out.println("Окончание урока в: " + h + " : " + m);
            }
            break;
            case ("7") : {
                int h = 15;
                int m = 15;
                System.out.println("Окончание урока в: " + h + " : " + m);
            }
            break;
            case ("8") : {
                int h = 16;
                int m = 05;
                System.out.println("Окончание урока в: " + h + " : " + m);
            }
            break;
            case ("9") : {
                int h = 17;
                int m = 05;
                System.out.println("Окончание урока в: " + h + " : " + m);
            }
            break;
            case ("10") : {
                int h = 17;
                int m = 55;
                System.out.println("Окончание урока в: " + h + " : " + m);
            }
            default : {
                System.out.println("Введен неправильный номер урока");
            }
            break;
        }
    }
}
