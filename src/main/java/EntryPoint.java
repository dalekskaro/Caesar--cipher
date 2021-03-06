package com.daleks.junit;

public class EntryPoint {
    public static void main(String[] args) {
        for (int n = 0; n < args.length; n++) {  //n- -e or -d;
            switch (args[n]) {
                case "-e": //шифрование
                    for (int o = 0; o < args.length; o++) { //o -о
                        switch (args[o]) {
                            case "-o":
                                for (int num = 0; num < args.length; num++) { //num число сдвига
                                    if (args[num].matches("^\\d+$")) { //args[num].matches("^\\d+$")
                                        int number = Integer.parseInt(args[num]);
                                        for (int m = 0; m < args.length; m++) //m - фраза
                                            if (n != m && o != m && num != m) {
                                                String str_E = Enycrypt(args[m], number);
                                                System.out.println("The offset number: " + number + "\nThe result of encryption: " + str_E + "\n-------");
                                            }
                                    }
                                }
                                break;
                        }
                    }
                    break;


                case "-d": //дешифрование
                    for (int o = 0; o < args.length; o++) { //o -о
                        switch (args[o]) {
                            case "-o":
                                for (int num = 0; num < args.length; num++) { //num число сдвига
                                    if (args[num].matches("^\\d+$")) { //args[num].matches("^\\d+$")
                                        int number = Integer.parseInt(args[num]);
                                        for (int m = 0; m < args.length; m++) //m - фраза
                                            if (n != m && o != m && num != m) {
                                                String str_D = Decrypt(args[m], number);
                                                System.out.println("The offset number: " + number + "\nThe result of decryption: " + str_D + "\n-------");
                                                 }
                                    }
                                }
                                break;
                        }
                    }
                    break;

            }
        }

    }

    public static String Enycrypt(String m, int k_E) {
        System.out.println("Enycrypt: " + m);
        System.out.println("FOR ENYCRYPT: The offset: " + k_E);
        String str_E = "";
        for (int i = 0; i < m.length(); i++) {
            char s = m.charAt(i);
            if ('a' <= s && s <= 'z') {  //если не добавить это условние, то шифроваться так же будут пробелы и символы
                s += k_E % 26;
                if ('a' > s) s += 26;   //если символы "вылетают" из алфавита, то мы эти символы возвращаем на место
                if ('z' < s) s -= 26;
            } else if ('A' <= s && s <= 'Z') {
                s += k_E % 26;
                if ('A' > s) s += 26;
                if ('Z' < s) s -= 26;
            }
            str_E += s;
        }
        System.out.println("FOR ENYCRYPT: Result: " + str_E);
        return str_E;
    }

    public static String Decrypt(String m, int k_D) {
        System.out.println("Decrypt: " + m);
        System.out.println("FOR DECRYPT: The offset: " + k_D);
        String str_D = "";
        for (int i = 0; i < m.length(); i++) {
            char s = m.charAt(i);
            if ('a' <= s && s <= 'z') {  //если не добавить это условние, то шифроваться так же будут пробелы и символы
                s -= k_D % 26;
                if ('a' > s)
                    s += 26;   //если символы "вылетают" из алфавита, то мы эти символы возвращаем на место
                if ('z' < s) s -= 26;
            } else if ('A' <= s && s <= 'Z') {
                s -= k_D % 26;
                if ('A' > s) s += 26;
                if ('Z' < s) s -= 26;
            }
            str_D += s;
        }
        System.out.println("FOR DECRYPT: Result: " + str_D);
        return str_D;
    }
}
