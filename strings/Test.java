package strings;

public class Test {
    public static void main(String[] args) {
        System.out.println(toString(-12334));
    }

    private static String toString(int number) {
        char[] chars = String.valueOf(number).replaceAll("\\s", "")
                .replaceAll("_", "").toCharArray();
        String[] arrayStringName = makeArrayFromChars(chars);
        return makeStringFromArray(arrayStringName);
    }

    private static String[] makeArrayFromChars(char[] chars) {
        //12
        String[] arrayStringName = new String[chars.length];
        int place = 1;
        for (int i = chars.length - 1; i >= 0; i--) {

            if (chars[i] == '_') {
                arrayStringName[i] = String.valueOf(chars[i]);
                place = 1;
                continue;
            } else if (chars[i] == '.' || chars[i] == ',') {
                arrayStringName[i] = "целых";
                place = 1;
                continue;
            }
            arrayStringName[i] = currentValue(chars[i], place);
            place = place != 3 ? ++place : 1;
        }

        replaceSomePairNumbers(arrayStringName);

        return arrayStringName;
    }

    private static String currentValue(char ch, int place) {

        switch (place) {
            case 2:
                switch (ch) {
                    case '1':
                        return "десять";
                    case '2':
                        return "Двадцать";
                    case '3':
                        return "тридцать";
                    case '4':
                        return "сорок";
                    case '5':
                        return "пятьдесят";
                    case '6':
                        return "шестьдесят";
                    case '7':
                        return "семьдесят";
                    case '8':
                        return "восемьдесят";
                    case '9':
                        return "девяносто";
                    default:
                        return "ноль";
                }
            case 3:
                switch (ch) {
                    case '1':
                        return "сто";
                    case '2':
                        return "двесте";
                    case '3':
                        return "триста";
                    case '4':
                        return "четыреста";
                    case '5':
                        return "пятьсот";
                    case '6':
                        return "шестьсот";
                    case '7':
                        return "восемьсот";
                    case '9':
                        return "девятьсот";
                    default:
                        return "ноль";
                }
            default:
                switch (ch) {
                    case '1':
                        return "один";
                    case '2':
                        return "два";
                    case '3':
                        return "три";
                    case '4':
                        return "четыре";
                    case '5':
                        return "пять";
                    case '6':
                        return "шесть";
                    case '7':
                        return "семь";
                    case '8':
                        return "восемь";
                    case '9':
                        return "девять";
                    default:
                        return "ноль";
                }
        }
    }

    private static String makeStringFromArray(String[] lines) {

        String[] placeNames = {"", "тысяч", "миллион", "миллиард"};

        StringBuilder sb = new StringBuilder();
        int length = lines.length - 1;
        String lastSymbol = "";

        if (lines[lines.length - 3].equals("целых")) {
            length = lines.length - 4;
            lastSymbol = "сотых";
        }

        for (int i = 0; i < lines.length; i++) {

            if (lines[i].equals("-")) {
                sb.append("минус").append(" ");
                continue;
            }

            String placeName = "";
            if ((length - i) % 3 == 0 && (length - i) != 0 & length - i >= 0) {
                placeName = getPlaceName(placeNames[(length - i) / 3], lines[i]);
            }

            if (lines[i].equals("ноль")) {
                if (placeName.length() > 0) {
                    sb.append(placeName).append(" ");
                }
                continue;
            }
            sb.append(lines[i]).append(" ");
            if (placeName.length() > 0) {
                sb.append(placeName).append(" ");
            }
        }
        sb.append(lastSymbol);

        return sb.toString().replaceAll("один тысяча", "одна тысяча")
                .replaceAll("два тысячи", "две тысячи");
    }

    private static String getPlaceName(String placeName, String elem) {

        String ending;
        switch (elem) {
            case "один":
                ending = placeName.equals("тысяч") ? "a" : "";
                break;
            case "два":
            case "три":
            case "четыре":
                ending = placeName.equals("тысяч") ? "и" : "а";
                break;
            default:
                ending = placeName.equals("тысяч") ? "ь" : "ов";
                break;
        }

        return "" + placeName + ending;
    }

    private static void replaceSomePairNumbers(String[] lines) {
        //12 -> 2
        int i = lines.length - 1;
        while (true) {
            if (i - 1 >= 0) {
                switch ("" + lines[i - 1] + " " + lines[i]) {
                    case "десять один":
                        lines[i - 1] = "ноль";
                        lines[i] = "одинадцать";
                        break;
                    case "десять два":
                        lines[i - 1] = "ноль";
                        lines[i] = "двенадцать";
                        break;
                    case "десять три":
                        lines[i - 1] = "ноль";
                        lines[i] = "тринадцать";
                        break;
                    case "десять четыре":
                        lines[i - 1] = "ноль";
                        lines[i] = "четырнадцать";
                        break;
                    case "десять пять":
                        lines[i - 1] = "ноль";
                        lines[i] = "пятнадцать";
                        break;
                    case "десять шесть":
                        lines[i - 1] = "ноль";
                        lines[i] = "шеснадцать";
                        break;
                    case "десять семь":
                        lines[i - 1] = "ноль";
                        lines[i] = "семьнадцать";
                        break;
                    case "десять восемь":
                        lines[i - 1] = "ноль";
                        lines[i] = "восемьнадцать";
                        break;
                    case "десять девять":
                        lines[i - 1] = "ноль";
                        lines[i] = "девятнадцать";
                        break;
                }
            } else {
                return;
            }
            i -= 3;
        }
    }
}
