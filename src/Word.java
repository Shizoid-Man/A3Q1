// A class to hold a word and its frequency
public class Word {
    String pattern;
    int frequency;

    // Constructor for task 3
    public Word(String pattern) {
        this.pattern = pattern;
        this.frequency = 0;        
    }

    // Constructor for task 5
    public Word(String pattern, int frequency) {
        this.pattern = pattern;
        this.frequency = frequency;
    }

    // Method to compare the word having another word as argument
    public boolean equals(Word word) {
        return this.pattern.equals(word.pattern);
    }

    // Method to compare the word having a String as argument
    public boolean equals(String text) {
        return this.pattern.equals(text);
    }

    // To clone the object
    public Word clone() {
        return new Word(pattern, frequency);
    }

    // Return the frequency
    public int getFrequency() {
        return frequency;
    }

    // Return the pattern
    public String getPattern() {
        return pattern;
    }

    public String toString() {
        // return "new Word(\"" + pattern + "\", " + frequency + ")";
        // return pattern + "(" + frequency + ")";
        return pattern;
    }
}