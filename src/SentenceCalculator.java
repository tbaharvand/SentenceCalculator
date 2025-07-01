import java.util.HashMap;
import java.util.Map;

public class SentenceCalculator {
    public static int lettersToNumbers(String s) {
        int sum = 0;
        //2-this is for Iteration all words of a given string
        for (int i = 0; i < s.length(); i++) {
            //3-get ascii code of each word
            char c = s.charAt(i);
            int ascii = c;

            //4-ascii code for words that in range of A-Z
            if (ascii>=65 && ascii <= 90){
                    Map<Integer , Integer > letterMap = new HashMap<>();
                    int score = 2;
                    for (int asciiForCapitalAtoZ = 65 ; asciiForCapitalAtoZ<= 90 ; asciiForCapitalAtoZ++){
                        letterMap.put(asciiForCapitalAtoZ,score);
                        score = score + 2;
                    }
                int total = letterMap.get(ascii);
                sum += total;
            }
            //4-ascii code for words that in range of a-z
            else if (ascii>=97 && ascii<=122){

                Map<Integer , Integer > letterMap = new HashMap<>();
                int score = 1;
                for (int asciiForSmallAtoZ = 97; asciiForSmallAtoZ <= 122 ; asciiForSmallAtoZ++){
                    letterMap.put(asciiForSmallAtoZ,score);
                    score = score + 1 ;
                }
                int total = letterMap.get(ascii);
                sum += total;
            }
            //4-ascii code for words that in range of 0-9
            else if (ascii>=48 && ascii<=57){
                Map<Integer , Integer > letterMap = new HashMap<>();
                int score = 0;
                for (int asciiForNumbers0to9 = 48 ; asciiForNumbers0to9 <= 57 ; asciiForNumbers0to9++){
                    letterMap.put(asciiForNumbers0to9,score);
                    score +=1;
                }
                int total = letterMap.get(ascii);
                sum += total;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        //1-write a sentence for calculate its score
            System.out.println(lettersToNumbers("12345 12345"));
    }
}
