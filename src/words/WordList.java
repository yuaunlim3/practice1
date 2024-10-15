package words;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Random;

public class WordList {
    protected ArrayList<Words> wordsUsed;


    public WordList(){
        wordsUsed = new ArrayList<>();
    }

    private boolean isExist(Words words){
        for(Words word: this.wordsUsed){
            String currentWord = word.getWord();
            if(currentWord.equals(words.getWord())){
                return true;
            }
        }
        return false;
    }

    public void addUsedWord(Words word){
        //System.out.printf("Trying to put %s into list\n",word.getWord());
        if (!isExist(word)){
            this.wordsUsed.add(word);
            //System.out.printf("%s added to list\n",word.getWord());
        }else{
            //System.out.printf("%s is already in the list\n",word.getWord());
        }
    }

    public void showList(){
        System.out.printf("WORD USED:%d\n",wordsUsed.size());
        for(Words word: this.wordsUsed){
            word.getCounter();
        }
    }

    public Words setWords(String words){
        Words current = new Words();
        for(Words word: this.wordsUsed){
            String currentWord = word.getWord();
            if(currentWord.equals(words)){
                return word;
            }
        }
        current.setWord(words);
        return current;
        

    }

    public boolean isExist(String words){
        for(Words word: this.wordsUsed){
            String currentWord = word.getWord();
            if(currentWord.equals(words)){
                return true;
            }
        }
        return false;
    }
}
