package hw_1_base_operations_vasyl_zablotskyi.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //считываем с клавиатуры строку
        System.out.println("Введите строку:");
        String s = reader.readLine();

        //преабразовуем строку в массив символов
        char[] str = s.toCharArray();

        //создаем переменную нашего результата
        int sum = 0;
        for (char c : str) {
            //если символ число значит суммируем его в нашу переменную sum
            if (Character.isDigit(c)) {
                sum += Character.getNumericValue(c);
            }
        }
        System.out.println("Сумма всех чисел в строке: " + sum);
    }
}
