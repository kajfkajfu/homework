package strings;

public class Strings {
    final static String[] END_THOUSANDS = {" тысяча ", " тысячи ", " тысяч "};
    final static String[] END_MILLIONS = {" миллион ", " миллиона ", " миллионов "};
    final static String[] END_NUMBERS = {"одна", "две"};
    final static String[] START_THOUSANDS = {"", "одна", "две"};

    public static String toString(int number) {

        StringBuilder result = new StringBuilder();

        if (number < 0) {
            result.append("минус ");
            number = -number;
        }
        if (number <= 999) {
            result.append(toStringBeforeThousand(number));
        } else if (number <= 999_999) {
            //начало метода
            int thousand = number / 1000;
            //установка буквенного значения для числе меньше 100_000
            if ((thousand % 10 == 1 || thousand % 10 == 2 || thousand % 10 == 3 || thousand % 10 == 4)
                    && thousand > 20 && thousand < 100) {
                switch (thousand % 10) {
                    case 1:
                        result.append(toStringBeforeThousand(thousand - 1)).append(" ").append(START_THOUSANDS[1])
                                .append(END_THOUSANDS[0]);
                        break;
                    case 2:
                        result.append(toStringBeforeThousand(thousand - 2)).append(" ").append(START_THOUSANDS[2])
                                .append(END_THOUSANDS[1]);
                        break;
                    case 3:
                        result.append(toStringBeforeThousand(thousand - 3)).append(" ")
                                .append(toStringBeforeThousand(thousand % 10)).append(END_THOUSANDS[1]);
                        break;
                    case 4:
                        result.append(toStringBeforeThousand(thousand - 4)).append(" ")
                                .append(toStringBeforeThousand(thousand % 10)).append(END_THOUSANDS[1]);
                }
                //установка буквенного значения для числе больше 100_000
            } else if ((thousand % 10 == 1 || thousand % 10 == 2 || thousand % 10 == 3 || thousand % 10 == 4)
                    && thousand > 100 && (thousand % 100) > 20) {
                switch (thousand % 10) {
                    case 1:
                        result.append(toStringBeforeThousand(thousand - 1)).append(" ").append(START_THOUSANDS[1])
                                .append(END_THOUSANDS[0]);
                        break;
                    case 2:
                        result.append(toStringBeforeThousand(thousand - 2)).append(" ").append(START_THOUSANDS[2])
                                .append(END_THOUSANDS[1]);
                        break;
                    case 3:
                        result.append(toStringBeforeThousand(thousand - 3)).append(" ")
                                .append(toStringBeforeThousand(thousand % 10)).append(END_THOUSANDS[1]);
                        break;
                    case 4:
                        result.append(toStringBeforeThousand(thousand - 4)).append(" ")
                                .append(toStringBeforeThousand(thousand % 10)).append(END_THOUSANDS[1]);
                }
                //конец метода
            } else {

                switch (thousand) {
                    case 1:
                        result.append(START_THOUSANDS[1]).append(END_THOUSANDS[0]); //0 0
                        break;
                    case 2:
                        result.append(START_THOUSANDS[2]).append(END_THOUSANDS[1]); //0 1
                        break;
                    case 3:
                    case 4:
                        result.append(toStringBeforeThousand(thousand)).append(END_THOUSANDS[1]); //0 1
                        break;
                    default:
                        result.append(toStringBeforeThousand(thousand)).append(END_THOUSANDS[2]); //0 2
                }
            }


            if ((number % 1000) != 0) {
                result.append(toStringBeforeThousand(number % 1000));
            }

        } else if (number <= 999_999_999) {
            int millions = number / 1000000;
            int thousand = (number / 1000) % 1000;

            if ((millions % 10 == 1 || (millions % 10) == 2 || (millions % 10) == 3 || (millions % 10) == 4)
                    && millions > 20 && millions < 100) {
                switch (millions % 10) {
                    case 1:
                        result.append(toStringBeforeThousand(millions - 1)).append(" ")
                                .append(toStringBeforeThousand(1)).append(END_MILLIONS[0]);
                        break;
                    case 2:
                        result.append(toStringBeforeThousand(millions - 2)).append(" ")
                                .append(toStringBeforeThousand(2)).append(END_MILLIONS[1]);
                        break;
                    case 3:
                        result.append(toStringBeforeThousand(millions - 3)).append(" ")
                                .append(toStringBeforeThousand(3)).append(END_MILLIONS[1]);
                        break;
                    case 4:
                        result.append(toStringBeforeThousand(millions - 4)).append(" ")
                                .append(toStringBeforeThousand(4)).append(END_MILLIONS[1]);
                        break;
                }
            } else if ((millions % 10 == 1 || millions % 10 == 2 || millions % 10 == 3 || millions % 10 == 4)
                    && millions > 100 && (millions % 100) > 20) {
                switch (millions % 10) {
                    case 1:
                        result.append(toStringBeforeThousand(millions)).append(END_MILLIONS[0]);
                        break;
                    case 2:
                    case 3:
                    case 4:
                        result.append(toStringBeforeThousand(millions)).append(END_MILLIONS[1]);
                        break;
                }

            } else {
                switch (millions) {
                    case 1:
                        result.append(toStringBeforeThousand(millions)).append(END_MILLIONS[0]); //1 0
                        break;
                    case 2:
                    case 3:
                    case 4:
                        result.append(toStringBeforeThousand(millions)).append(END_MILLIONS[1]); //1 1
                        break;
                    default:
                        result.append(toStringBeforeThousand(millions)).append(END_MILLIONS[2]); //1 2
                }
            }
            //установка буквенного значения для числа < 100_000
            if ((thousand % 10 == 1 || thousand % 10 == 2 || thousand % 10 == 3 || thousand % 10 == 4)
                    && thousand > 20 && thousand < 100) {
                switch (thousand % 10) {
                    case 1:
                        result.append(toStringBeforeThousand(thousand - 1)).append(" ").append(START_THOUSANDS[1])
                                .append(END_THOUSANDS[0]);
                        break;
                    case 2:
                        result.append(toStringBeforeThousand(thousand - 2)).append(" ").append(START_THOUSANDS[2])
                                .append(END_THOUSANDS[1]);
                        break;
                    case 3:
                        result.append(toStringBeforeThousand(thousand - 3)).append(" ")
                                .append(toStringBeforeThousand(thousand % 10)).append(END_THOUSANDS[1]);
                        break;
                    case 4:
                        result.append(toStringBeforeThousand(thousand - 4)).append(" ")
                                .append(toStringBeforeThousand(thousand % 10)).append(END_THOUSANDS[1]);
                }
                //установка буквенного значения для числа > 100_000
            } else if ((thousand % 10 == 1 || thousand % 10 == 2 || thousand % 10 == 3 || thousand % 10 == 4)
                    && thousand > 100 && (thousand % 100) > 20) {
                switch (thousand % 10) {
                    case 1:
                        result.append(toStringBeforeThousand(thousand - 1)).append(" ").append(START_THOUSANDS[1])
                                .append(END_THOUSANDS[0]);
                        break;
                    case 2:
                        result.append(toStringBeforeThousand(thousand - 2)).append(" ").append(START_THOUSANDS[2])
                                .append(END_THOUSANDS[1]);
                        break;
                    case 3:
                        result.append(toStringBeforeThousand(thousand - 3)).append(" ")
                                .append(toStringBeforeThousand(thousand % 10)).append(END_THOUSANDS[1]);
                        break;
                    case 4:
                        result.append(toStringBeforeThousand(thousand - 4)).append(" ")
                                .append(toStringBeforeThousand(thousand % 10)).append(END_THOUSANDS[1]);
                }
                //конец метода
            } else {

                switch (thousand) {
                    case 0:
                        break;
                    case 1:
                        result.append(START_THOUSANDS[1]).append(END_THOUSANDS[0]); //0 0
                        break;
                    case 2:
                        result.append(START_THOUSANDS[2]).append(END_THOUSANDS[1]); //0 1
                        break;
                    case 3:
                    case 4:
                        result.append(toStringBeforeThousand(thousand)).append(END_THOUSANDS[1]); //0 1
                        break;
                    default:
                        result.append(toStringBeforeThousand(thousand)).append(END_THOUSANDS[2]); //0 2
                }
            }
            if ((number % 1_000_000) != 0) {
                result.append(toStringBeforeThousand(number % 1000));
            }
        }

        return result.toString();
    }

    public static String toString(double number) {

        int beforePoint = (int) number;
        int afterPoint = (int) (((long) (number * 100)) % 100);


        StringBuilder result = new StringBuilder();

        if (beforePoint == 1) {
            result.append(END_NUMBERS[0]).append(" целая ");
        } else if (beforePoint == -1) {
            result.append("минус ").append(END_NUMBERS[0]).append(" целая ");
        } else if (beforePoint == 2) {
            result.append(END_NUMBERS[1]).append(" целых ");
        } else if (beforePoint == -2) {
            result.append("минус ").append(END_NUMBERS[1]).append(" целых ");
        } else {
            if (afterPoint == 0) {
                return result.append(toString(beforePoint)).toString();
            }
            result.append(toString((beforePoint))).append(" целых ");
        }


        if (afterPoint < 0) {
            afterPoint = -afterPoint;
        }

        if (afterPoint != 0) {
            if ((afterPoint % 10) == 0) {
                if (afterPoint == 10) {
                    return result.append(END_NUMBERS[0]).append(" десятая").toString();
                }
                if (afterPoint == 20) {
                    return result.append(END_NUMBERS[1]).append(" десятых").toString();
                }
                result.append(toString(afterPoint / 10)).append(" десятых");
            } else {
                result.append(toString(afterPoint)).append(" сотых");
            }
        }

        return result.toString();
    }

    private static String toStringBeforeThousand(int number) {
        final String[] BELOW_TWENTY = {"ноль", "один", "два", "три", "четыре",
                "пять", "шесть", "семь", "восемь", "девять", "десять",
                "одинадцать", "двенадцадь", "тринадцать", "четырнадцать",
                "пятнадцать", "шестнадцать", "семнадцать",
                "восемнадцать", "девятнадцать"};
        final String[] DOZENS = {"сто", "десять", "двадцать", "тридцать",
                "сорок", "пятьдесят", "шестьдесят", "семьдесят",
                "восемьдесят", "девяносто"};
        final String[] HUNDREDS = {"тысяча", "сто", "двесте", "триста",
                "четыреста", "пятьсот", "шестьсот", "семьсот",
                "восемьсот", "девятьсот"};

        StringBuilder result = new StringBuilder();

        if (number < 20) {
            result.append(BELOW_TWENTY[number]);
            //проверка на десятки
        } else if (number < 100) {
            result.append(DOZENS[number / 10]);
            //проверка на остаток от десятки, например 9
            if (number % 10 != 0) {
                result.append(" ").append(BELOW_TWENTY[number % 10]);
            }
            //проверка числа на меньше косаря
        } else if (number < 1_000) {
            result.append(HUNDREDS[number / 100]);
            //проверка на остаток от ста на число < 20
            if ((number % 100) < 20 && (number % 100) > 0) {
                result.append(" ").append(BELOW_TWENTY[number % 100]);
            }
            //проверка на остаток от ста на число > 20
            if (number % 100 >= 20 && number % 10 == 0) {
                result.append(" ").append(DOZENS[(number % 100) / 10]);
            }
            //проверка на остаток от ста на число > 20 и не кратное 10
            if (number % 100 > 20 && number % 10 != 0) {
                result.append(" ").append(DOZENS[(number % 100) / 10]).append(" ").append(BELOW_TWENTY[number % 10]);
            }
        }


        return result.toString();
    }

    public static String toWeek(int day) {
        return (day / 7) + " недель";
    }

}
