package tasks;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Построить частотный словарь(Map) символов английского или русского алфавита.
 * Для этого взять любой большой кусок текста и сохранить его в файле.
 * Соответственно в коде надо из файла читать.
 */
public class Task03 {

    public static void main(String[] args) {
        Map<Character, Integer> frequencies = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("filename"))){
            String line = reader.readLine();
            while (line != null) {
                line = line.toLowerCase();
                for (int i = 0;  i < line.length(); ++i){
                    char ch = line.charAt(i);
                    if(ch >= 'a' && ch <= 'z'){
                        frequencies.compute(ch, (character, integer)
                                -> integer == null ? 1 : integer + 1);
                    }
                }
                line = reader.readLine();
            }

        } catch (IOException e){
            e.printStackTrace();
        }
    }

}
