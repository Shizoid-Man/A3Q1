import java.util.ArrayList;
import java.util.Arrays;
/*
Assignment A3
Submitted to Lauren Himbeault
Submitted by Rudy Kreutzer
For COMP-1020-A1
Class Name: Genomic
It is used to find and sort patterns in the ori string
 */

public class Genomic {

    //takes a string and splits it into an arrayList of strings of a given length
    public static ArrayList<String> oriSplit(String ori, int length) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < ori.length() - length + 1; i++) {
            String current = ori.substring(i, i + length);
            list.add(current);
        }

        return list;
    }
    //uses ori split to count the amount of times the pattern is found in ori
    public static int patternCount(String ori, String pattern) {
        int count=0;
        for (String current : oriSplit(ori, pattern.length())) {
            if (current.equals(pattern)) {
                count++;
            }
        }
        return count;
    }
    //finds all patterns in ori of k length
    public static ArrayList<Word> findAllPatterns(String ori, int k) {


        ArrayList<Word> list = new ArrayList<>();
        for (String current : oriSplit(ori, k)) {
            boolean unique = true;
            for (Word word : list) {
                if (word.equals(current)) {
                    unique = false;
                }
            }
            if (unique) {
                list.add(new Word(current, patternCount(ori, current)));
            }
        }
        return list;
    }
    //converts the ArrayList into an array for use in the sorting algorithm then converts
    //back and returns the sorted list
    public static ArrayList<Word> sortPatternsByFrequency(ArrayList<Word> words) {
        Word[] list = new Word[words.size()];
        list = words.toArray(list);

        mergeSort(list);
        return new ArrayList<>(Arrays.asList(list));
    }
    //returns the frequency of the first element in the sorted array
    public static int findTopFrequency(ArrayList<Word> words) {
        return sortPatternsByFrequency(words).get(0).getFrequency();
    }
    //combines previous methods to compose an Array List of patterns k long in ori that are of the top frequency
    public static String frequentWords(String ori, int k) {
        ArrayList<Word> freq = new ArrayList<>();
        ArrayList<Word> words = sortPatternsByFrequency(findAllPatterns(ori, k));
        int topFrequency = findTopFrequency(words);
        for (Word word : words) {
            if (word.getFrequency() == topFrequency) {
                freq.add(word);
            }
        }
        return freq.toString();
    }
    //Using merge sort where we split the array in half until all sizes are one, then we use the knowledge that all
    //single part arrays must be sorted to sort and merge up until the array is complete again.
    public static void mergeSort(Word[] words) {

        int length = words.length;
        if (words.length == 1) {
            return;
        }
        int middle = length / 2;
        Word[] first = new Word[middle];
        Word[] second = new Word[length - middle];
        System.arraycopy(words, 0, first, 0, middle);
        if (length - middle >= 0) System.arraycopy(words, middle, second, 0, length - middle);
        mergeSort(first);
        mergeSort(second);
        mergeWords(words, first, second);
    }

    public static void mergeWords(Word[] input, Word[] first, Word[] second) {

        int firstSize = first.length;
        int secondSize = second.length;
        int i = 0, j = 0, k = 0;

        while (i < firstSize && j < secondSize) {
            int firstFrequency = first[i].getFrequency();
            int secondFrequency = second[j].getFrequency();


            if (firstFrequency > secondFrequency) {

                input[k] = first[i];
                i++;
            } else if (secondFrequency > firstFrequency) {

                input[k] = second[j];
                j++;
            } else {
                int n = 0;
                char firstChar;
                char secondChar;
                boolean done = false;
                while (!done) {
                    firstChar = first[i].getPattern().charAt(n);
                    secondChar = second[j].getPattern().charAt(n);

                    if (firstChar < secondChar) {

                        input[k] = first[i];
                        i++;
                        done = true;
                    } else if (secondChar < firstChar) {

                        input[k] = second[j];
                        j++;
                        done = true;
                    } else n++;
                }
            }
            k++;
        }
        while (i < firstSize) {
            input[k] = first[i];
            i++;
            k++;
        }
        while (j < secondSize) {
            input[k] = second[j];
            j++;
            k++;
        }
    }
}


