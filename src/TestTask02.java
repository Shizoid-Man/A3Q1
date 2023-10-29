/*
 * TestTask02
 *
 * ASSIGNMENT    Assignment 3, question 2
 * @author       Rogerio de Leon Pereira
 * @version      2023-02-01
 *
 * PURPOSE:      Tests different cases for Task 02
 * 
 * It expects to find a class named Genomic and a method findAllPatterns() with the following signature:
 *  public ArrayList<Word> findAllPatterns(String text, int k) {}
 * 
 * If all the tests pass, you are good to go to the next task
 */
public class TestTask02 {
    private static String messageColor = ConsoleColors.CYAN;
    private static String headerColor = ConsoleColors.YELLOW;

    public static void main(String[] args) {
        String message;
        String text;
        String output;
        int k;

        /* Starting Tests - Task 02*/
        System.out.print(headerColor + "--------------------------");        
        System.out.print(headerColor + "Starting tests for Task 02");        
        System.out.println(headerColor + "--------------------------");         

        /* Test 01 */
        message = "Check if it does not have duplicates.....";
        text = "ACGTTGCATGTCGCATGATGCATGAGAGCT";
        k = 4;
        output = "[ACGT, CGTT, GTTG, TTGC, TGCA, GCAT, CATG, ATGT, TGTC, GTCG, TCGC, CGCA, ATGA, TGAT, GATG, ATGC, TGAG, GAGA, AGAG, GAGC, AGCT]";
        runTest(message, text, k, output); 

        /* Test 02 */
        message = "Check if the code finds the first kmer...";
        text = "TGGTAGCGACGTTGGTCCCGCCGCTTGAGAATCTGGATGAACATAAGCTCCCACTTGGCTTATTCAGAGAACTGGTCAACACTTGTCTCTCCCAGCCAGGTCTGACCACCGGGCAACTTTTAGAGCACTATCGTGGTACAAATAATGCTGCCAC";
        k = 3;
        output = "[TGG, GGT, GTA, TAG, AGC, GCG, CGA, GAC, ACG, CGT, GTT, TTG, GTC, TCC, CCC, CCG, CGC, GCC, GCT, CTT, TGA, GAG, AGA, GAA, AAT, ATC, TCT, CTG, GGA, GAT, ATG, AAC, ACA, CAT, ATA, TAA, AAG, CTC, CCA, CAC, ACT, GGC, TTA, TAT, ATT, TTC, TCA, CAG, CAA, TGT, AGG, ACC, CGG, GGG, GCA, TTT, CTA, TCG, GTG, TAC, AAA, TGC]";
        runTest(message, text, k, output);
        
        /* Test 03 */
        message = "Check if the code finds the last kmer....";
        text = "CAGTGGCAGATGACATTTTGCTGGTCGACTGGTTACAACAACGCCTGGGGCTTTTGAGCAACGAGACTTTTCAATGTTGCACCGTTTGCTGCATGATATTGAAAACAATATCACCAAATAAATAACGCCTTAGTAAGTAGCTTTT";
        k = 4;
        output = "[CAGT, AGTG, GTGG, TGGC, GGCA, GCAG, CAGA, AGAT, GATG, ATGA, TGAC, GACA, ACAT, CATT, ATTT, TTTT, TTTG, TTGC, TGCT, GCTG, CTGG, TGGT, GGTC, GTCG, TCGA, CGAC, GACT, ACTG, GGTT, GTTA, TTAC, TACA, ACAA, CAAC, AACA, AACG, ACGC, CGCC, GCCT, CCTG, TGGG, GGGG, GGGC, GGCT, GCTT, CTTT, TTGA, TGAG, GAGC, AGCA, GCAA, ACGA, CGAG, GAGA, AGAC, ACTT, TTTC, TTCA, TCAA, CAAT, AATG, ATGT, TGTT, GTTG, TGCA, GCAC, CACC, ACCG, CCGT, CGTT, GTTT, CTGC, GCAT, CATG, TGAT, GATA, ATAT, TATT, ATTG, TGAA, GAAA, AAAA, AAAC, AATA, TATC, ATCA, TCAC, ACCA, CCAA, CAAA, AAAT, ATAA, TAAA, TAAC, CCTT, CTTA, TTAG, TAGT, AGTA, GTAA, TAAG, AAGT, GTAG, TAGC, AGCT]";
        runTest(message, text, k, output);

        /* Test 04 */
        message = "Check if the code test for overlaps......";
        text = "ATACAATTACAGTCTGGAACCGGATGAACTGGCCGCAGGTTAACAACAGAGTTGCCAGGCACTGCCGCTGACCAGCAACAACAACAATGACTTTGACGCGAAGGGGATGGCATGAGCGAACTGATCGTCAGCCGTCAGCAACGAGTATTGTTGCTGACCCTTAACAATCCCGCCGCACGTAATGCGCTAACTAATGCCCTGCTG";
        k = 5;
        output = "[ATACA, TACAA, ACAAT, CAATT, AATTA, ATTAC, TTACA, TACAG, ACAGT, CAGTC, AGTCT, GTCTG, TCTGG, CTGGA, TGGAA, GGAAC, GAACC, AACCG, ACCGG, CCGGA, CGGAT, GGATG, GATGA, ATGAA, TGAAC, GAACT, AACTG, ACTGG, CTGGC, TGGCC, GGCCG, GCCGC, CCGCA, CGCAG, GCAGG, CAGGT, AGGTT, GGTTA, GTTAA, TTAAC, TAACA, AACAA, ACAAC, CAACA, AACAG, ACAGA, CAGAG, AGAGT, GAGTT, AGTTG, GTTGC, TTGCC, TGCCA, GCCAG, CCAGG, CAGGC, AGGCA, GGCAC, GCACT, CACTG, ACTGC, CTGCC, TGCCG, CCGCT, CGCTG, GCTGA, CTGAC, TGACC, GACCA, ACCAG, CCAGC, CAGCA, AGCAA, GCAAC, CAATG, AATGA, ATGAC, TGACT, GACTT, ACTTT, CTTTG, TTTGA, TTGAC, TGACG, GACGC, ACGCG, CGCGA, GCGAA, CGAAG, GAAGG, AAGGG, AGGGG, GGGGA, GGGAT, GATGG, ATGGC, TGGCA, GGCAT, GCATG, CATGA, ATGAG, TGAGC, GAGCG, AGCGA, CGAAC, ACTGA, CTGAT, TGATC, GATCG, ATCGT, TCGTC, CGTCA, GTCAG, TCAGC, CAGCC, AGCCG, GCCGT, CCGTC, CAACG, AACGA, ACGAG, CGAGT, GAGTA, AGTAT, GTATT, TATTG, ATTGT, TTGTT, TGTTG, TTGCT, TGCTG, GACCC, ACCCT, CCCTT, CCTTA, CTTAA, CAATC, AATCC, ATCCC, TCCCG, CCCGC, CCGCC, CGCCG, CGCAC, GCACG, CACGT, ACGTA, CGTAA, GTAAT, TAATG, AATGC, ATGCG, TGCGC, GCGCT, CGCTA, GCTAA, CTAAC, TAACT, AACTA, ACTAA, CTAAT, ATGCC, TGCCC, GCCCT, CCCTG, CCTGC, CTGCT]";
        runTest(message, text, k, output);
        
        /* Test 05 */
        message = "Check it the code count for ties.........";
        text = "CCAGCGGGGGTTGATGCTCTGGGGGTCACAAGATTGCATTTTTATGGGGTTGCAAAAATGTTTTTTACGGCAGATTCATTTAAAATGCCCACTGGCTGGAGACATAGCCCGGATGCGCGTCTTTTACAACGTATTGCGGGGTAAAATCGTAGATGTTTTAAAATAGGCGTAAC";
        k = 5;
        output = "[CCAGC, CAGCG, AGCGG, GCGGG, CGGGG, GGGGG, GGGGT, GGGTT, GGTTG, GTTGA, TTGAT, TGATG, GATGC, ATGCT, TGCTC, GCTCT, CTCTG, TCTGG, CTGGG, TGGGG, GGGTC, GGTCA, GTCAC, TCACA, CACAA, ACAAG, CAAGA, AAGAT, AGATT, GATTG, ATTGC, TTGCA, TGCAT, GCATT, CATTT, ATTTT, TTTTT, TTTTA, TTTAT, TTATG, TATGG, ATGGG, GTTGC, TGCAA, GCAAA, CAAAA, AAAAA, AAAAT, AAATG, AATGT, ATGTT, TGTTT, GTTTT, TTTAC, TTACG, TACGG, ACGGC, CGGCA, GGCAG, GCAGA, CAGAT, GATTC, ATTCA, TTCAT, TCATT, ATTTA, TTTAA, TTAAA, TAAAA, AATGC, ATGCC, TGCCC, GCCCA, CCCAC, CCACT, CACTG, ACTGG, CTGGC, TGGCT, GGCTG, GCTGG, CTGGA, TGGAG, GGAGA, GAGAC, AGACA, GACAT, ACATA, CATAG, ATAGC, TAGCC, AGCCC, GCCCG, CCCGG, CCGGA, CGGAT, GGATG, ATGCG, TGCGC, GCGCG, CGCGT, GCGTC, CGTCT, GTCTT, TCTTT, CTTTT, TTACA, TACAA, ACAAC, CAACG, AACGT, ACGTA, CGTAT, GTATT, TATTG, TTGCG, TGCGG, GGGTA, GGTAA, GTAAA, AAATC, AATCG, ATCGT, TCGTA, CGTAG, GTAGA, TAGAT, AGATG, GATGT, AAATA, AATAG, ATAGG, TAGGC, AGGCG, GGCGT, GCGTA, CGTAA, GTAAC]";
        runTest(message, text, k, output);         
    }

    private static void runTest(String message, String text, int k, String output) {
        System.out.print(messageColor + message + ": ");
        boolean result = output.equals(Genomic.findAllPatterns(text, k).toString());
        String color = result  ? ConsoleColors.GREEN : ConsoleColors.RED;
        System.out.print(color + result);
        System.out.println(ConsoleColors.RESET);  
    }
}