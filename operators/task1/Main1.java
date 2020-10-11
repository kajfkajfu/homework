package Operators.task1;

public class Homework1 {
    public static void main(String[] args) {
        int a = 42;  //  42 = 0010 1010
        int b = 15;  //  15 = 0000 1111
        int c = 1;   //   1 = 0000 0001
        int x = -42; // -42 = 1101 0110
        int y = -15; // -15 = 1111 0001

        System.out.println(~a);     // результат: -43 = 1101 0101
        System.out.println(~b);     // результат: -16 = 1111 0000
        System.out.println(~x);     // результат: 41 = 0010 1001
        System.out.println(~y);     // результат: 14 = 0000 1110

        System.out.println(a & b);  // результат: 10 = 0000 1010
        System.out.println(b & a);  // результат: 10 = 0000 1010
        System.out.println(x & y);  // результат: -48 = 0011 0000
        System.out.println(y & x);  // результат: -48 = 0011 0000

        System.out.println(a | b);  // результат: 47 = 0010 1111
        System.out.println(b | a);  // результат: 47 = 0010 1111
        System.out.println(x | y);  // результат: -9 = 1111 0111
        System.out.println(y | x);  // результат: -9 = 1111 0111

        System.out.println(a ^ b);  // результат: 37 = 0010 0101
        System.out.println(b ^ a);  // результат: 37 = 0010 0101
        System.out.println(x ^ y);  // результат: 39 = 0010 0111
        System.out.println(y ^ x);  // результат: 39 = 0010 0111

        System.out.println(a >> c); // результат: 21 = 0001 0101
        System.out.println(b >> c); // результат: 7 = 0000 0111
        System.out.println(x >> c); // результат: -21 = 1110 1011
        System.out.println(y >> c); // результат: -8 = 1111 1000

        System.out.println(a << c); // результат: 84 = 0101 0100
        System.out.println(b << c); // результат: 30 = 0001 1110
        System.out.println(x << c); // результат: -84 = 1010 1100
        System.out.println(y << c); // результат: -30 = 1110 0010

        System.out.println(a >>> c);// результат: 21 = 0001 0101
        System.out.println(b >>> c);// результат: 7 = 0000 0111
        System.out.println(x >>> c);// результат: 2147483627 = 0111 1111 1111 1111 1111 1111 1110 1011
        System.out.println(y >>> c);// результат: 2147483640 = 0111 1111 1111 1111 1111 1111 1111 1000

        System.out.println(a &= b); // результат: 10 = 0000 1010
        System.out.println(b |= a); // a = 10 (0000 1010) результат: 15 = 0000 1111
        System.out.println(x ^= y); // результат: 39 = 0010 0111
        System.out.println(y >>= c);// результат: -8 = 1111 1000

        a = 42;    //  42 = 0010 1010
        b = 15;    //  15 = 0000 1111

        System.out.println(a <<= c); //результат: 84 = 0101 0100;
        System.out.println(b >>>= c);//результат: 7 = 0000 0111;

    }
}
