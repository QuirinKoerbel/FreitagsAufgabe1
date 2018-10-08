package com.company;

public class Main {

    public static void main(String[] args) {


       donau();

//        for (int i = 1; i <= 100; i++) {
//            System.out.println(zahlZuWort(i));
//        }


    }

    public static void donau() {
        for (int i = 1; i <= 100; i++) {

            if (i % 2 == 0 && i % 3 == 0) {
                if (i % 5 == 0) {
                    System.out.println("DampfSchiffFahrt");
                } else {
                    System.out.println("DampfSchiff");
                }
            } else if (i % 5 == 0 && i % 3 == 0) {
                System.out.println("SchiffFahrt");
            } else {
                System.out.println(zahlZuWort(i));
            }


        }
    }


    public static String zahlZuWort(int i) {
        String[] einer = {"ein", "zwei", "drei", "vier", "fünf", "sechs", "sieben", "acht", "neun"};
        String[] zehner = {"zehn", "zwanzig", "dreißig", "vierzig", "fünfzig", "sechzig", "siebzig", "achtzig", "neunzig"};


        if (i == 1 || i == 11 || i == 12 || i == 100) {

            return printSpecial(i);


        } else if (i % 10 == 0) {

            return printZehner(i);

        } else if (i < 10) {
            return einer[i - 1];

        } else if (i < 20) {
            int z = i/10;
            int e = i % 10;

            return einer[e - 1]  + zehner[z - 1];
        }else if ( i< 100){


                int z = i/10;
                int e = i % 10;

                return einer[e - 1] + "und" + zehner[z - 1];


            }
        return "Error";
    }




    private static String printZehner(int i) {
        String[] zehner = {"zehn", "zwanzig", "dreißig", "vierzig", "fünfzig", "sechzig", "siebzig", "achtzig", "neunzig"};




        return zehner[i/10-1];



    }

    private static String printSpecial(int i) {

        if (i == 1) {
            return "eins";
        }


        if (i == 11) {
            return "elf";
        }


        if (i == 12) {
            return "zwölf";
        }


        if (i == 100) {
            return "hundert";
        }

        return "error";
    }


}
