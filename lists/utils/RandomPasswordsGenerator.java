package lists.utils;

import java.util.Random;

//Класс содержит 1 статический метод getRandomPasswords() который возвращает 100_000
//рандомных пароллей длинной от 3 до 8 символов.
public class RandomPasswordsGenerator {
    public static String[] getRandomPasswords() {
        char[] chars = new char[]{'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'a', 's', 'd', 'f', 'g',
                'h', 'j', 'k', 'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm', 'Q', 'W', 'E', 'R', 'T', 'Y', 'I', 'O',
                'P', 'A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'Z', 'X', 'C', 'V', 'B', 'N', 'M', '0', '1'
                , '2', '3', '4', '5', '6', '7', '8', '9'};
        Random rnd = new Random();
        String[] passwords = new String[100_000];
        for (int i = 0; i < passwords.length; i++) {
            String tmpStr = "";
            int rndPassLength = rnd.nextInt(8);
            if (rndPassLength < 3) {
                rndPassLength = rndPassLength + 3;
            }
            for (int j = 0; j < rndPassLength; j++) {
                int rndCharForPass = rnd.nextInt(chars.length - 1);
                char[] tmpChars = new char[rndPassLength];
                tmpChars[j] = chars[rndCharForPass];
                tmpStr += tmpChars[j];
                passwords[i] = tmpStr;
            }
        }
        return passwords;
    }
}
