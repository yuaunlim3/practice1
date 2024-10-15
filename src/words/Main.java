package words;

import java.io.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException{
        String path = "C:\\Users\\limyu\\Desktop\\practice1\\texts";
        File folder = new File(path);
        File[] fileList = folder.listFiles();

        WordList wordList = new WordList();
        
        for (File file : fileList) {
            //System.out.println(file.getName());
            String line = "a";
            Words currentWords = new Words();
            Words nextWord = new Words();
            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);
            while (line != null) {
                line = bufferedReader.readLine();
                if(line == null){
                    break;
                }
                line = line.replaceAll("\\p{Punct}","").toLowerCase().trim();
                //System.out.println(line); 
                //Get array of the words in the sentence
                String[] sentence = line.split(" ");
                for(int idx = 0; idx < sentence.length -1 ; idx++){
                    currentWords = wordList.setWords(sentence[idx]);
                    nextWord = wordList.setWords(sentence[idx + 1]);
                    //System.out.printf(" Current word: %s  Next Word: %s \n",currentWords.getWord(),nextWord.getWord());
                    currentWords.addNext(nextWord);
                    wordList.addUsedWord(currentWords);
                    //System.out.println("_________________");
                    currentWords = new Words();
                    nextWord = new Words();
                }

            }
            bufferedReader.close();
            reader.close();
        }
        //wordList.showList();

        Console cons = System.console();
        String input = cons.readLine(">>> ");
        System.out.println(input);
        while (wordList.isExist(input)) {
            Words current = wordList.setWords(input);
            current.getCounter();
            current = current.getNext();
            input = current.getWord();
            System.out.println(input);
            
        }







    }
}
