package ee.vikk.course;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Ex07_Mastery {
    //  How to do deep dive:
    //  Step 1: Select the method name, Press the Run Button
    //  Step 2: Read the name of the method that failed
    //  Step 3: Fill in the blank (___) to make it pass
    //  Step 4: Consider at least one thing you just learned
    //  Step 5: Advance to the next method
    //  Do not change anything except the blank (___)
    //
    @Test
    void findTheLargestNumber() {
        int[] array =  get10Numbers(3);
        int max = max(array);
        int temp, size;
        size = array.length;
        for(int i = 0; i < size; i++){
            for(int j = i+1; j < size; j++){
                if(array[i] > array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                    return;
                }
            }
        }
        System.out.println(array[size-1]);

        assertEquals(19, max);
    }

    private int max(int[] numbers) {
       return -1;
    }

    @Test
    void findTheSmallestNumber() {
        int[] array = get10Numbers(55);
        int max = min(array);
        int temp, size;
        size = array.length;
        for(int i = 0; i < size; i++){
            for(int j = i + 1; j < size; j++){
                if(array[i] < array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                    return;
                }

            }
        }

        assertEquals(1, max);
    }

    private int min(int[] numbers) {

        return -1;
    }

    @Test
    void isNumberEven() {
        assertTrue(isEven(2));
        assertFalse(isEven(3));

    }



    private boolean isEven(int number) {

        return number % 2 == 0;
    }

    @Test
    void isNumberOdd() {
        assertTrue(isOdd(5));
        assertFalse(isOdd(4));
    }

    private boolean isOdd(int number) {

        return !isEven(number);
    }

    @Test
    void findHowManyEvenNumbers() {
        int[] array = get10Numbers(5);

        int evenOnes = countEvenNumbers(array);

        assertEquals(6, evenOnes);
    }

    private int countEvenNumbers(int[] array) {
        int i, size = 10, evenOnes = 0;
        for(i = 0; i < size; i++){
            if(array[i] % 2 ==0){
                evenOnes++;
            }
        }
        return evenOnes;
    }

    @Test
    void findAllEvenNumbers() {
        int[] array = get10Numbers(44);

        int[] evenOnes = collectEvenNumbers(array);

        assertArrayEquals(new int[]{12, 0, 4, 8, 14, 0, 22, 10}, evenOnes);
    }

    private int[] collectEvenNumbers(int[] array) {
        int i;
        int howManyEven = countEvenNumbers(array);
        int[] evenNumbers = new int[howManyEven];
            for(i = 0; i < array.length; i++){
                if(array[i] % 2 == 0){
                    array[i]++;
                    //System.out.println(evenNumbers);
                }
            }
      return evenNumbers;
    }


    @Test
    void howManyVowels() {
        String input = "Oskar on tubli poiss ja Birgit on tubli tüdruk.";

        int vowelCount = countVowels(input);

        assertEquals(14, vowelCount);
    }

    private int countVowels(String input) {
        int count = 0;
        String[] letters = input.toLowerCase().split("");
        for(String letter: letters){
            if("a".equals(letter)
                    || "e".equals(letter)
                    || "i".equals(letter)
                    || "o".equals(letter)
                    || "u".equals(letter)
            ) {
                count++;
            }

        }

        return count;
    }

    @Test
    void findCountOfWordsWith3orLessLetters() {
        String input = """
                See oli läinud aastasaja kolmanda veerandi lõpul. Päike lähenes
                silmapiirile, seistes sedavõrd madalas, et enam ei ulatunud valgustama ei
                mäkke ronivat hobust, kes puutelgedega vankrit vedas, ei vankril istuvat noort
                naist ega ka ligi kolmekümnelist meest, kes kõndis vankri kõrval.
                Varsti jõudsid teelised mäerinnakul nii kõrgele, et päikeses helendama lõid
                mehe nägu – laiavõitu, tugevate lõuapäradega, terassilmadega, lühikese, kuid
                tiheda musta habemega –, naise nukrad silmad, look ja hobuse kikkis
                kõrvadega pea.
                «Seal ta ongi, see Vargamäe,» lausus mees ja näitas käega üle soo
                järgmise väljamäe poole, kus lömitas rühm madalaid hooneid. «Meie hooned
                paistavad, teiste omad seisavad mäe taga orus, sellest siis rahva suus Mäe ja
                Oru, mõisakirjas aga Eespere ja Tagapere. Paremat kätt see männitukk seal
                kõrges mäe otsas on meie oma: igavesed vanad jändrikud teised, mõned
                poolkuivad juba.»
                Nii palju tegi mees juttu, siis logises vanker endiselt tummas vaikuses.
                Naine silmitses ümbrust: siin mägi, seal mägi, kaugemal kolmas, pahemat
                kätt neljas, paremat viies ja nende taga kuues, seitsmes veel ning rohkemgi.
                Mägedel põllud ja hooned, mägede ümber, nende vahel aina soo, tükati raba,
                kaetud kidura võserikuga.""";

        int shortWords = countWordsWith3orLessLetters(input);

        assertEquals(32, shortWords);
    }

    private int countWordsWith3orLessLetters(String input) {
        int count = 0;
        String[] words = input.split("\\s+");
        //int  count = 0;
        for(String word : words ){
            if(word.length() <= 3){
                count++;
            }
        }



        return count;
    }

    @Test
    void findWordsWith5orLessLetters() {
        String input = """
                See oli läinud aastasaja kolmanda veerandi lõpul. Päike lähenes
                silmapiirile, seistes sedavõrd madalas, et enam ei ulatunud valgustama ei
                mäkke ronivat hobust, kes puutelgedega vankrit vedas, ei vankril istuvat noort
                naist ega ka ligi kolmekümnelist meest, kes kõndis vankri kõrval.
                Varsti jõudsid teelised mäerinnakul nii kõrgele, et päikeses helendama lõid
                mehe nägu – laiavõitu, tugevate lõuapäradega, terassilmadega, lühikese, kuid
                tiheda musta habemega –, naise nukrad silmad, look ja hobuse kikkis
                kõrvadega pea.
                «Seal ta ongi, see Vargamäe,» lausus mees ja näitas käega üle soo
                järgmise väljamäe poole, kus lömitas rühm madalaid hooneid. «Meie hooned
                paistavad, teiste omad seisavad mäe taga orus, sellest siis rahva suus Mäe ja
                Oru, mõisakirjas aga Eespere ja Tagapere. Paremat kätt see männitukk seal
                kõrges mäe otsas on meie oma: igavesed vanad jändrikud teised, mõned
                poolkuivad juba.»
                Nii palju tegi mees juttu, siis logises vanker endiselt tummas vaikuses.
                Naine silmitses ümbrust: siin mägi, seal mägi, kaugemal kolmas, pahemat
                kätt neljas, paremat viies ja nende taga kuues, seitsmes veel ning rohkemgi.
                Mägedel põllud ja hooned, mägede ümber, nende vahel aina soo, tükati raba,
                kaetud kidura võserikuga.""";

        int shortWords = countWordsWith5orLessLetters(input);

        assertEquals(86, shortWords);
    }

    private int countWordsWith5orLessLetters(String input) {
        return -1;
    }


    @Test
    void findCountOfSentences() {
        String input = """
                See oli läinud aastasaja kolmanda veerandi lõpul. Päike lähenes
                silmapiirile, seistes sedavõrd madalas, et enam ei ulatunud valgustama ei
                mäkke ronivat hobust, kes puutelgedega vankrit vedas, ei vankril istuvat noort
                naist ega ka ligi kolmekümnelist meest, kes kõndis vankri kõrval.
                Varsti jõudsid teelised mäerinnakul nii kõrgele, et päikeses helendama lõid
                mehe nägu – laiavõitu, tugevate lõuapäradega, terassilmadega, lühikese, kuid
                tiheda musta habemega –, naise nukrad silmad, look ja hobuse kikkis
                kõrvadega pea.
                «Seal ta ongi, see Vargamäe,» lausus mees ja näitas käega üle soo
                järgmise väljamäe poole, kus lömitas rühm madalaid hooneid. «Meie hooned
                paistavad, teiste omad seisavad mäe taga orus, sellest siis rahva suus Mäe ja
                Oru, mõisakirjas aga Eespere ja Tagapere. Paremat kätt see männitukk seal
                kõrges mäe otsas on meie oma: igavesed vanad jändrikud teised, mõned
                poolkuivad juba.»
                Nii palju tegi mees juttu, siis logises vanker endiselt tummas vaikuses.
                Naine silmitses ümbrust: siin mägi, seal mägi, kaugemal kolmas, pahemat
                kätt neljas, paremat viies ja nende taga kuues, seitsmes veel ning rohkemgi.
                Mägedel põllud ja hooned, mägede ümber, nende vahel aina soo, tükati raba,
                kaetud kidura võserikuga.""";



    }




    @Test
    void findSentenceWordCount() {
        String input = """
                See oli läinud aastasaja kolmanda veerandi lõpul. Päike lähenes
                silmapiirile, seistes sedavõrd madalas, et enam ei ulatunud valgustama ei
                mäkke ronivat hobust, kes puutelgedega vankrit vedas, ei vankril istuvat noort
                naist ega ka ligi kolmekümnelist meest, kes kõndis vankri kõrval.
                Varsti jõudsid teelised mäerinnakul nii kõrgele, et päikeses helendama lõid
                mehe nägu – laiavõitu, tugevate lõuapäradega, terassilmadega, lühikese, kuid
                tiheda musta habemega –, naise nukrad silmad, look ja hobuse kikkis
                kõrvadega pea.
                «Seal ta ongi, see Vargamäe,» lausus mees ja näitas käega üle soo
                järgmise väljamäe poole, kus lömitas rühm madalaid hooneid. «Meie hooned
                paistavad, teiste omad seisavad mäe taga orus, sellest siis rahva suus Mäe ja
                Oru, mõisakirjas aga Eespere ja Tagapere. Paremat kätt see männitukk seal
                kõrges mäe otsas on meie oma: igavesed vanad jändrikud teised, mõned
                poolkuivad juba.»
                Nii palju tegi mees juttu, siis logises vanker endiselt tummas vaikuses.
                Naine silmitses ümbrust: siin mägi, seal mägi, kaugemal kolmas, pahemat
                kätt neljas, paremat viies ja nende taga kuues, seitsmes veel ning rohkemgi.
                Mägedel põllud ja hooned, mägede ümber, nende vahel aina soo, tükati raba,
                kaetud kidura võserikuga.""";

        String result = sentenceWordCount(input);

        assertEquals("""
                1: 7 words
                2: 31 words
                3: 29 words
                4: 19 words
                5: 20 words
                6: 17 words
                7: 11 words
                8: 21 words
                9: 14 words
                """, result);
    }

    private String sentenceWordCount(String input) {
        return "";
    }


    /**
     * Ignore the following, it's needed to compile & run the exercises.
     */
    private int[] get10Numbers(int seed) {
        Random random = new Random(42 + seed);
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(25);
        }
        System.out.println(Arrays.toString(numbers));
        return numbers;
    }
}
