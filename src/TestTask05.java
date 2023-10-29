/*
 * TestTask05
 *
 * ASSIGNMENT    Assignment 3, question 5
 * @author       Rogerio de Leon Pereira
 * @version      2023-02-01
 *
 * PURPOSE:      Tests different cases for Task 05
 * 
 * It expect to find a class named Genomic and a method frequentWords() with the following signature:
 *  public String frequentWords(String text, int k) {}
 * 
 * If all the tests passes you are good to go to the next task
 */
public class TestTask05 {
    private static String messageColor = ConsoleColors.CYAN;
    private static String headerColor = ConsoleColors.YELLOW;

    public static void main(String[] args) {
        String message;
        String text;
        String output;
        int k;

        /* Starting Tests - Task 05*/
        System.out.print(headerColor + "--------------------------");        
        System.out.print(headerColor + "Starting tests for Task 05");        
        System.out.println(headerColor + "--------------------------");         

        /* Test 01 */
        message = "Check if it does not have duplicates.....";
        text = "ACGTTGCATGTCGCATGATGCATGAGAGCT";
        k = 4;
        output = "[CATG, GCAT]";
        runTest(message, text, k, output);

        /* Test 02 */
        message = "Check if the code finds the first kmer...";
        text = "TGGTAGCGACGTTGGTCCCGCCGCTTGAGAATCTGGATGAACATAAGCTCCCACTTGGCTTATTCAGAGAACTGGTCAACACTTGTCTCTCCCAGCCAGGTCTGACCACCGGGCAACTTTTAGAGCACTATCGTGGTACAAATAATGCTGCCAC";
        k = 3;
        output = "[TGG]";
        runTest(message, text, k, output);
        
        /* Test 03 */
        message = "Check if the code finds the last kmer....";
        text = "CAGTGGCAGATGACATTTTGCTGGTCGACTGGTTACAACAACGCCTGGGGCTTTTGAGCAACGAGACTTTTCAATGTTGCACCGTTTGCTGCATGATATTGAAAACAATATCACCAAATAAATAACGCCTTAGTAAGTAGCTTTT";
        k = 4;
        output = "[TTTT]";
        runTest(message, text, k, output);

        /* Test 04 */
        message = "Check if the code test for overlaps......";
        text = "ATACAATTACAGTCTGGAACCGGATGAACTGGCCGCAGGTTAACAACAGAGTTGCCAGGCACTGCCGCTGACCAGCAACAACAACAATGACTTTGACGCGAAGGGGATGGCATGAGCGAACTGATCGTCAGCCGTCAGCAACGAGTATTGTTGCTGACCCTTAACAATCCCGCCGCACGTAATGCGCTAACTAATGCCCTGCTG";
        k = 5;
        output = "[AACAA]";
        runTest(message, text, k, output);
        
        /* Test 05 */
        message = "Check it the code count for ties.........";
        text = "CCAGCGGGGGTTGATGCTCTGGGGGTCACAAGATTGCATTTTTATGGGGTTGCAAAAATGTTTTTTACGGCAGATTCATTTAAAATGCCCACTGGCTGGAGACATAGCCCGGATGCGCGTCTTTTACAACGTATTGCGGGGTAAAATCGTAGATGTTTTAAAATAGGCGTAAC";
        k = 5;
        output = "[AAAAT, GGGGT, TTTTA]";
        runTest(message, text, k, output);        
    }

    private static void runTest(String message, String text, int k, String output) {
        System.out.print(messageColor + message + ": ");
        boolean result = output.equals(Genomic.frequentWords(text, k));
        String color = result ? ConsoleColors.GREEN : ConsoleColors.RED;
        System.out.print(color + result);
        System.out.println(ConsoleColors.RESET);  
    }
}