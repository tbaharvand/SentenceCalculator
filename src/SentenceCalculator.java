import java.util.HashMap;
import java.util.Map;

public class SentenceCalculator {
    public static int lettersToNumbers(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int ascii = c;
            System.out.println(c + "="+ ascii);
            if (ascii>=65 && ascii <= 90){
                    Map<Integer , Integer > letterMap = new HashMap<>();
                    letterMap.put(65,2);
                    letterMap.put(66,4);
                    letterMap.put(67,6);
                    letterMap.put(68,8);
                    letterMap.put(69,10);
                    letterMap.put(70,12);
                    letterMap.put(71,14);
                    letterMap.put(72,16);
                    letterMap.put(73,18);
                    letterMap.put(74,20);
                    letterMap.put(75,22);
                    letterMap.put(76,24);
                    letterMap.put(77,26);
                    letterMap.put(78,28);
                    letterMap.put(79,30);
                    letterMap.put(80,32);
                    letterMap.put(81,34);
                    letterMap.put(82,36);
                    letterMap.put(83,38);
                    letterMap.put(84,40);
                    letterMap.put(85,42);
                    letterMap.put(86,44);
                    letterMap.put(87,46);
                    letterMap.put(88,48);
                    letterMap.put(89,50);
                    letterMap.put(90,52);

                int total = letterMap.get(ascii);
                System.out.println("letterMap is "+ total );
                sum += total;
                System.out.println("sum is " + sum);


            }
            else if (ascii>=97 && ascii<=122){

                Map<Integer , Integer > letterMap = new HashMap<>();

              letterMap.put(97,1);
              letterMap.put(98,2);
              letterMap.put(99,3);
              letterMap.put(100,4);
              letterMap.put(101,5);
              letterMap.put(102,6);
              letterMap.put(103,7);
              letterMap.put(104,8);
              letterMap.put(105,9);
              letterMap.put(106,10);
              letterMap.put(107,11);
              letterMap.put(108,12);
              letterMap.put(109,13);
              letterMap.put(110,14);
              letterMap.put(111,15);
              letterMap.put(112,16);
              letterMap.put(113,17);
              letterMap.put(114,18);
              letterMap.put(115,19);
              letterMap.put(116,20);
              letterMap.put(117,21);
              letterMap.put(118,22);
              letterMap.put(119,23);
              letterMap.put(120,24);
              letterMap.put(121,25);
              letterMap.put(122,26);

                int total = letterMap.get(ascii);
                System.out.println("letterMap is "+ total );
                sum += total;
                System.out.println("sum is " + sum);

            }
            else if (ascii>=48 && ascii<=57){

                Map<Integer , Integer > letterMap = new HashMap<>();

                letterMap.put(48,0);
                letterMap.put(49,1);
                letterMap.put(50,2);
                letterMap.put(51,3);
                letterMap.put(52,4);
                letterMap.put(53,5);
                letterMap.put(54,6);
                letterMap.put(55,7);
                letterMap.put(56,8);
                letterMap.put(57,9);


                int total = letterMap.get(ascii);
                System.out.println("letterMap is "+ total );
                sum += total;
                System.out.println("sum is " + sum);

            }
            else if(!(ascii>=48 && ascii<=57 || ascii>=65 && ascii <= 90 || ascii>=97 && ascii<=122)){
                System.out.println("0");
            }

        }
        return sum;

    }

    public static void main(String[] args) {
            lettersToNumbers("Baharvand");
    }
}
