public class EntryPoint {
    public static void main(String[] args) {
        //cd C:\Users\Ira\IdeaProjects\Caesar cipher\src
        //javaс EntryPoint.java
        //java EntryPoint -e "First Programming Task at QA" -o 3
        //bruh
        switch (args[0]) {
            case "-e": //шифрование
                System.out.println("Enycrypt: " + args[1]);
                String str_E = "";
                int k_E = Integer.parseInt(args[3]);
                for(int i = 0; i < args[1].length(); i++) {
                    char s = args[1].charAt(i);
                    if ('a'<=s && s<='z') {  //если не добавить это условние, то шифроваться так же будут пробелы и символы
                        s += k_E % 26;
                        if ('a'>s) s+=26;   //если символы "вылетают" из алфавита, то мы эти символы возвращаем на место
                        if ('z'<s) s-=26;
                    }
                    else if ('A'<=s && s<='Z') {
                        s += k_E % 26;
                        if ('A'>s) s+=26;
                        if ('Z'<s) s-=26;
                    }
                    str_E += s;
                }
                System.out.println("The offset step: " + args[3] + "\nThe result of encryption: " + str_E);
                break;

            case "-d": //дешифрование
                System.out.println("Decrypt: " + args[1]);
                String str_D = "";
                int k_D = Integer.parseInt(args[3]);
                for(int i = 0; i < args[1].length(); i++) {
                    char s = args[1].charAt(i);
                    if ('a'<=s && s<='z') {  //если не добавить это условние, то шифроваться так же будут пробелы и символы
                        s -= k_D % 26;
                        if ('a'>s) s+=26;   //если символы "вылетают" из алфавита, то мы эти символы возвращаем на место
                        if ('z'<s) s-=26;
                    }
                    else if ('A'<=s && s<='Z') {
                        s -= k_D % 26;
                        if ('A'>s) s+=26;
                        if ('Z'<s) s-=26;
                    }
                    str_D += s;
                }
                System.out.println("The offset step: " + args[3] + "\nThe result of decryption: " + str_D);
                break;

        }

    }
}
