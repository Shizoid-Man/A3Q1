public class Genomic {

    public static int patternCount(String ori, String pattern) {
        int length=pattern.length();
        int count=0;
        for (int i = 0; i < ori.length()-length+1; i++) {
            String current =ori.substring(i,i+length);
            if(current.equals(pattern))
                count++;
        }
        return count;
    }
}


