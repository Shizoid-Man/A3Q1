/*
 * TestTask04
 *
 * ASSIGNMENT    Assignment 3, question 4
 * @author       Rogerio de Leon Pereira
 * @version      2023-02-01
 *
 * PURPOSE:      Tests different cases for Task 04
 * 
 * It expects to find a class named Genomic and a method findTopFrequency() with the following signature:
 *  public int findTopFrequency(ArrayList<Word> words) {}
 * 
 * If all the tests passes you are good to go to the next task
 */
import java.util.ArrayList;
import java.util.Arrays;

 public class TestTask04 {
    private static String messageColor = ConsoleColors.CYAN;
    private static String headerColor = ConsoleColors.YELLOW;

    public static void main(String[] args) {
        String message;
        ArrayList<Word> words = new ArrayList<Word>();
        int output;

        /* Starting Tests - Task 04*/
        System.out.print(headerColor + "--------------------------");        
        System.out.print(headerColor + "Starting tests for Task 04");        
        System.out.println(headerColor + "--------------------------");         

        /* Test 01 */
        message = "Check if it does not have duplicates.....";
        words = new ArrayList<Word>(Arrays.asList(new Word("ACGT", 1), new Word("CGTT", 1), new Word("GTTG", 1), new Word("TTGC", 1), new Word("TGCA", 2), new Word("GCAT", 3), new Word("CATG", 3), new Word("ATGT", 1), new Word("TGTC", 1), new Word("GTCG", 1), new Word("TCGC", 1), new Word("CGCA", 1), new Word("ATGA", 2), new Word("TGAT", 1), new Word("GATG", 1), new Word("ATGC", 1), new Word("TGAG", 1), new Word("GAGA", 1), new Word("AGAG", 1), new Word("GAGC", 1), new Word("AGCT", 1)));
        output = 3;
        runTest(message, words, output); 

        // // /* Test 02 */
        message = "Check if the code finds the first kmer...";
        words = new ArrayList<Word>(Arrays.asList(new Word("TGG", 6), new Word("GGT", 5), new Word("GTA", 2), new Word("TAG", 2), new Word("AGC", 4), new Word("GCG", 1), new Word("CGA", 1), new Word("GAC", 2), new Word("ACG", 1), new Word("CGT", 2), new Word("GTT", 1), new Word("TTG", 4), new Word("GTC", 4), new Word("TCC", 3), new Word("CCC", 3), new Word("CCG", 3), new Word("CGC", 2), new Word("GCC", 3), new Word("GCT", 4), new Word("CTT", 5), new Word("TGA", 3), new Word("GAG", 3), new Word("AGA", 4), new Word("GAA", 3), new Word("AAT", 3), new Word("ATC", 2), new Word("TCT", 4), new Word("CTG", 4), new Word("GGA", 1), new Word("GAT", 1), new Word("ATG", 2), new Word("AAC", 4), new Word("ACA", 3), new Word("CAT", 1), new Word("ATA", 2), new Word("TAA", 2), new Word("AAG", 1), new 
        Word("CTC", 3), new Word("CCA", 5), new Word("CAC", 5), new Word("ACT", 5), new Word("GGC", 2), new Word("TTA", 2), new Word("TAT", 2), new Word("ATT", 1), new Word("TTC", 1), new Word("TCA", 2), new Word("CAG", 3), new Word("CAA", 3), new Word("TGT", 1), new Word("AGG", 1), new Word("ACC", 2), new Word("CGG", 1), new Word("GGG", 1), new Word("GCA", 2), new Word("TTT", 2), new Word("CTA", 1), new Word("TCG", 1), new Word("GTG", 1), new Word("TAC", 1), new Word("AAA", 1), new Word("TGC", 2)));
        output = 6;
        runTest(message, words, output);
        
        // // /* Test 03 */
        message = "Check if the code finds the last kmer....";
        words = new ArrayList<Word>(Arrays.asList(new Word("CAGT", 1), new Word("AGTG", 1), new Word("GTGG", 1), new Word("TGGC", 1), new Word("GGCA", 1), new Word("GCAG", 1), new Word("CAGA", 1), new Word("AGAT", 1), new Word("GATG", 1), new Word("ATGA", 2), new Word("TGAC", 1), new Word("GACA", 1), new Word("ACAT", 1), new Word("CATT", 1), new Word("ATTT", 1), new Word("TTTT", 4), new Word("TTTG", 3), new Word("TTGC", 3), new Word("TGCT", 2), new Word("GCTG", 2), new Word("CTGG", 3), new Word("TGGT", 2), new Word("GGTC", 1), new Word("GTCG", 1), new Word("TCGA", 1), new Word("CGAC", 1), new Word("GACT", 2), new Word("ACTG", 1), new Word("GGTT", 1), new Word("GTTA", 1), new Word("TTAC", 1), new Word("TACA", 1), new Word("ACAA", 3), new Word("CAAC", 3), new Word("AACA", 2), new Word("AACG", 3), new Word("ACGC", 2), new Word("CGCC", 2), new Word("GCCT", 2), new Word("CCTG", 1), new Word("TGGG", 1), new Word("GGGG", 1), new Word("GGGC", 1), new Word("GGCT", 1), new Word("GCTT", 2), new Word("CTTT", 3), new Word("TTGA", 2), new Word("TGAG", 1), new Word("GAGC", 1), new Word("AGCA", 1), new Word("GCAA", 1), new Word("ACGA", 1), new Word("CGAG", 1), new Word("GAGA", 1), new Word("AGAC", 1), new Word("ACTT", 1), new Word("TTTC", 1), new Word("TTCA", 1), new Word("TCAA", 1), new Word("CAAT", 2), new Word("AATG", 1), new Word("ATGT", 1), new Word("TGTT", 1), new Word("GTTG", 
        1), new Word("TGCA", 2), new Word("GCAC", 1), new Word("CACC", 2), new Word("ACCG", 1), new Word("CCGT", 1), new Word("CGTT", 1), new Word("GTTT", 1), new Word("CTGC", 1), new Word("GCAT", 1), new Word("CATG", 1), new Word("TGAT", 1), new Word("GATA", 1), new Word("ATAT", 2), new Word("TATT", 1), 
        new Word("ATTG", 1), new Word("TGAA", 1), new Word("GAAA", 1), new Word("AAAA", 1), new Word("AAAC", 1), new Word("AATA", 3), new Word("TATC", 1), new Word("ATCA", 1), new Word("TCAC", 1), new Word("ACCA", 1), new Word("CCAA", 1), new Word("CAAA", 1), new Word("AAAT", 2), new Word("ATAA", 2), new 
        Word("TAAA", 1), new Word("TAAC", 1), new Word("CCTT", 1), new Word("CTTA", 1), new Word("TTAG", 1), new Word("TAGT", 1), new Word("AGTA", 2), new Word("GTAA", 1), new Word("TAAG", 1), new Word("AAGT", 1), new Word("GTAG", 1), new Word("TAGC", 1), new Word("AGCT", 1))); 
        output = 4;
        runTest(message, words, output);

        // // /* Test 04 */
        message = "Check if the code test for overlaps......";
        words = new ArrayList<Word>(Arrays.asList(new Word("ATACA", 1), new Word("TACAA", 1), new Word("ACAAT", 3), new Word("CAATT", 1), new Word("AATTA", 1), new Word("ATTAC", 1), new Word("TTACA", 1), new Word("TACAG", 1), new Word("ACAGT", 1), new Word("CAGTC", 1), new Word("AGTCT", 1), new Word("GTCTG", 1), new Word("TCTGG", 1), new Word("CTGGA", 1), new Word("TGGAA", 1), new Word("GGAAC", 1), new Word("GAACC", 1), new Word("AACCG", 1), new Word("ACCGG", 1), new Word("CCGGA", 1), new Word("CGGAT", 1), new Word("GGATG", 2), new Word("GATGA", 1), new Word("ATGAA", 1), new Word("TGAAC", 1), new Word("GAACT", 2), new Word("AACTG", 2), new Word("ACTGG", 1), new Word("CTGGC", 1), new Word("TGGCC", 1), new Word("GGCCG", 1), new Word("GCCGC", 3), new Word("CCGCA", 2), new Word("CGCAG", 
        1), new Word("GCAGG", 1), new Word("CAGGT", 1), new Word("AGGTT", 1), new Word("GGTTA", 1), new Word("GTTAA", 1), new Word("TTAAC", 2), new Word("TAACA", 2), new Word("AACAA", 5), new Word("ACAAC", 3), new Word("CAACA", 4), new Word("AACAG", 1), new Word("ACAGA", 1), new Word("CAGAG", 1), new Word("AGAGT", 1), new Word("GAGTT", 1), new Word("AGTTG", 1), new Word("GTTGC", 2), new Word("TTGCC", 1), new Word("TGCCA", 1), new Word("GCCAG", 1), new Word("CCAGG", 1), new Word("CAGGC", 1), new Word("AGGCA", 1), new Word("GGCAC", 1), new Word("GCACT", 1), new Word("CACTG", 1), new Word("ACTGC", 1), new Word("CTGCC", 1), new Word("TGCCG", 1), new Word("CCGCT", 1), new Word("CGCTG", 1), new Word("GCTGA", 2), new Word("CTGAC", 2), new Word("TGACC", 2), new Word("GACCA", 1), new Word("ACCAG", 1), new Word("CCAGC", 1), new Word("CAGCA", 2), new Word("AGCAA", 2), new Word("GCAAC", 2), new Word("CAATG", 1), new Word("AATGA", 1), new Word("ATGAC", 1), new Word("TGACT", 1), new Word("GACTT", 1), new Word("ACTTT", 1), new Word("CTTTG", 1), new Word("TTTGA", 1), new Word("TTGAC", 1), new Word("TGACG", 1), new Word("GACGC", 1), new Word("ACGCG", 1), new Word("CGCGA", 1), new Word("GCGAA", 2), 
        new Word("CGAAG", 1), new Word("GAAGG", 1), new Word("AAGGG", 1), new Word("AGGGG", 1), new Word("GGGGA", 1), new Word("GGGAT", 1), new Word("GATGG", 1), new Word("ATGGC", 1), new Word("TGGCA", 1), new Word("GGCAT", 1), new Word("GCATG", 1), new Word("CATGA", 1), new Word("ATGAG", 1), new Word("TGAGC", 1), new Word("GAGCG", 1), new Word("AGCGA", 1), new Word("CGAAC", 1), new Word("ACTGA", 1), new Word("CTGAT", 1), new Word("TGATC", 1), new Word("GATCG", 1), new Word("ATCGT", 1), new Word("TCGTC", 1), new Word("CGTCA", 2), new Word("GTCAG", 2), new Word("TCAGC", 2), new Word("CAGCC", 1), new Word("AGCCG", 1), new Word("GCCGT", 1), new Word("CCGTC", 1), new Word("CAACG", 1), new Word("AACGA", 1), new Word("ACGAG", 1), new Word("CGAGT", 1), new Word("GAGTA", 1), new Word("AGTAT", 1), new Word("GTATT", 1), new Word("TATTG", 1), new Word("ATTGT", 1), new Word("TTGTT", 1), new Word("TGTTG", 1), new Word("TTGCT", 1), new Word("TGCTG", 2), new Word("GACCC", 1), new Word("ACCCT", 1), new Word("CCCTT", 1), new Word("CCTTA", 1), new Word("CTTAA", 1), new Word("CAATC", 1), new Word("AATCC", 1), new Word("ATCCC", 1), new Word("TCCCG", 1), new Word("CCCGC", 1), new Word("CCGCC", 1), new 
        Word("CGCCG", 1), new Word("CGCAC", 1), new Word("GCACG", 1), new Word("CACGT", 1), new Word("ACGTA", 1), new Word("CGTAA", 1), new Word("GTAAT", 1), new Word("TAATG", 2), new Word("AATGC", 2), new Word("ATGCG", 1), new Word("TGCGC", 1), new Word("GCGCT", 1), new Word("CGCTA", 1), new Word("GCTAA", 1), new Word("CTAAC", 1), new Word("TAACT", 1), new Word("AACTA", 1), new Word("ACTAA", 1), new Word("CTAAT", 1), new Word("ATGCC", 1), new Word("TGCCC", 1), new Word("GCCCT", 1), new Word("CCCTG", 1), new Word("CCTGC", 1), new Word("CTGCT", 1)));
        output = 5;
        runTest(message, words, output);
        
        // // /* Test 05 */
        message = "Check it the code count for ties.........";
        words = new ArrayList<Word>(Arrays.asList(new Word("AAAAT", 4), new Word("GGGGT", 4), new Word("TTTTA", 4), new Word("TAAAA", 3), new Word("TTTTT", 3), new Word("AAATG", 2), new Word("AGATT", 2), new Word("ATGTT", 2), new Word("ATTGC", 2), new Word("CATTT", 2), new Word("CGGGG", 2), new Word("GATGC", 2), new Word("GCGGG", 2), new Word("GGGGG", 2), new Word("GGGTT", 2), new Word("GGTTG", 2), new Word("GTTTT", 2), new Word("TGGGG", 2), new Word("TGTTT", 2), new Word("TTAAA", 2), new Word("TTGCA", 2), new Word("TTTAA", 2), new Word("TTTAC", 2), new Word("AAAAA", 1), new Word("AAATA", 1), new Word("AAATC", 1), new Word("AACGT", 1), new Word("AAGAT", 1), new Word("AATAG", 1), new Word("AATCG", 1), new Word("AATGC", 1), new Word("AATGT", 1), new Word("ACAAC", 1), new Word("ACAAG", 
        1), new Word("ACATA", 1), new Word("ACGGC", 1), new Word("ACGTA", 1), new Word("ACTGG", 1), new Word("AGACA", 1), new Word("AGATG", 1), new Word("AGCCC", 1), new Word("AGCGG", 1), new Word("AGGCG", 1), new Word("ATAGC", 1), new Word("ATAGG", 1), new Word("ATCGT", 1), new Word("ATGCC", 1), new Word("ATGCG", 1), new Word("ATGCT", 1), new Word("ATGGG", 1), new Word("ATTCA", 1), new Word("ATTTA", 1), new Word("ATTTT", 1), new Word("CAAAA", 1), new Word("CAACG", 1), new Word("CAAGA", 1), new Word("CACAA", 1), new Word("CACTG", 1), new Word("CAGAT", 1), new Word("CAGCG", 1), new Word("CATAG", 1), new Word("CCACT", 1), new Word("CCAGC", 1), new Word("CCCAC", 1), new Word("CCCGG", 1), new Word("CCGGA", 1), new Word("CGCGT", 1), new Word("CGGAT", 1), new Word("CGGCA", 1), new Word("CGTAA", 1), new Word("CGTAG", 1), new Word("CGTAT", 1), new Word("CGTCT", 1), new Word("CTCTG", 1), new Word("CTGGA", 1), new Word("CTGGC", 1), new Word("CTGGG", 1), new Word("CTTTT", 1), new Word("GACAT", 1), new Word("GAGAC", 1), new Word("GATGT", 1), new Word("GATTC", 1), new Word("GATTG", 1), new Word("GCAAA", 1), new Word("GCAGA", 1), new Word("GCATT", 1), new Word("GCCCA", 1), new Word("GCCCG", 1), 
        new Word("GCGCG", 1), new Word("GCGTA", 1), new Word("GCGTC", 1), new Word("GCTCT", 1), new Word("GCTGG", 1), new Word("GGAGA", 1), new Word("GGATG", 1), new Word("GGCAG", 1), new Word("GGCGT", 1), new Word("GGCTG", 1), new Word("GGGTA", 1), new Word("GGGTC", 1), new Word("GGTAA", 1), new Word("GGTCA", 1), new Word("GTAAA", 1), new Word("GTAAC", 1), new Word("GTAGA", 1), new Word("GTATT", 1), new Word("GTCAC", 1), new Word("GTCTT", 1), new Word("GTTGA", 1), new Word("GTTGC", 1), new Word("TACAA", 1), new Word("TACGG", 1), new Word("TAGAT", 1), new Word("TAGCC", 1), new Word("TAGGC", 1), new Word("TATGG", 1), new Word("TATTG", 1), new Word("TCACA", 1), new Word("TCATT", 1), new Word("TCGTA", 1), new Word("TCTGG", 1), new Word("TCTTT", 1), new Word("TGATG", 1), new Word("TGCAA", 1), new Word("TGCAT", 1), new Word("TGCCC", 1), new Word("TGCGC", 1), new Word("TGCGG", 1), new Word("TGCTC", 1), new Word("TGGAG", 1), new Word("TGGCT", 1), new Word("TTACA", 1), new Word("TTACG", 1), new Word("TTATG", 1), new Word("TTCAT", 1), new Word("TTGAT", 1), new Word("TTGCG", 1), new Word("TTTAT", 1)));       
        output = 4;
        runTest(message, words, output);         
    }

    private static void runTest(String message, ArrayList<Word> words, int output) {
        System.out.print(messageColor + message + ": ");
        boolean result = output == Genomic.findTopFrequency(words);
        String color = result ? ConsoleColors.GREEN : ConsoleColors.RED;
        System.out.print(color + result);
        System.out.println(ConsoleColors.RESET);  
    }
}