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
                    int score = 2;
                    for (int asciiForCapitalAtoZ = 65 ; asciiForCapitalAtoZ<= 90 ; asciiForCapitalAtoZ++){
                        letterMap.put(asciiForCapitalAtoZ,score);
                        score = score + 2;
                    }

                int total = letterMap.get(ascii);
                System.out.println("score is "+ total );
                sum += total;
                System.out.println("sum is " + sum);


            }
            else if (ascii>=97 && ascii<=122){

                Map<Integer , Integer > letterMap = new HashMap<>();
                int score = 1;
                for (int asciiForSmallAtoZ = 97; asciiForSmallAtoZ <= 122 ; asciiForSmallAtoZ++){
                    letterMap.put(asciiForSmallAtoZ,score);
                    score = score + 1 ;
                }

                int total = letterMap.get(ascii);
                System.out.println("score is "+ total );
                sum += total;
                System.out.println("sum is " + sum);

            }
            else if (ascii>=48 && ascii<=57){

                Map<Integer , Integer > letterMap = new HashMap<>();
                int score = 0;
                for (int asciiForNumbers0to9 = 48 ; asciiForNumbers0to9 <= 57 ; asciiForNumbers0to9++){
                    letterMap.put(asciiForNumbers0to9,score);
                    score +=1;

                }
                int total = letterMap.get(ascii);
                System.out.println("score is "+ total );
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
            lettersToNumbers("A7");
    }
}
