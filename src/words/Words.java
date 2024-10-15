package words;

import java.util.*;
import java.io.*;
import java.security.SecureRandom;


public class Words {
   protected HashMap<Words, Integer> nextWords; //to store all of the next words
   protected String word; 
   protected int totalWords; //to store total number of possible next words

   public Words(){}

    public HashMap<Words, Integer> getNextWords() {
        return nextWords;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.nextWords = new HashMap<Words, Integer>();
        this.word = word;
        this.totalWords = 0;
    }

    public void addNext(Words word){
        if(nextWords.containsKey(word)){
            //System.out.printf("%s is already a next word\n",word.getWord());
            int count = nextWords.get(word);
            count++;
            nextWords.put(word, count);
        }else{
            //System.out.printf("New next word added: %s\n",word.getWord());
            nextWords.put(word,1);
        }
        this.totalWords++;
    }

    public void getCounter(){
        for(Words word: this.nextWords.keySet()){
            String currentWord = word.getWord();
            float counter = (float) nextWords.get(word) / this.totalWords;
            //System.out.printf("The total number of next words: %d\n",this.totalWords);
            System.out.printf("   %s  %.2f\n",currentWord,counter);

        }
    }

    public Words getNext(){
        ArrayList<Words> next = new ArrayList<>();
        for(Words words : nextWords.keySet()){
            int counter = nextWords.get(words);
            while(counter > 0){
                next.add(words);
                counter--;
            }
        }

        Random rand = new SecureRandom();

        int toGet= rand.nextInt(this.totalWords);

        return next.get(toGet);
    }


   
    

}
