package com.solvd;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class CountWords {
    private final static Logger LOGGER = LogManager.getLogger(CountWords.class);
    public static void main(String[] args) {
        String article = null;
        try {
            article = FileUtils.readFileToString(new File("src/main/resources/article.txt"),"UTF-8").toLowerCase();
        } catch (IOException e) {
            LOGGER.error(e);
        }
        //StringUtils.split(article,"\\s+");
        article = StringUtils.replaceChars(article,'"',' ');
        String[] words = article.split("[-:/,.\s\n\t]");
        HashMap<String, Integer> unique= new HashMap<>();
        for(String str:words){
            if(unique.containsKey(str)){
                unique.put(str,unique.get(str)+1);
            }
            else
                unique.put(str,1);
        }
        try {
            FileUtils.writeStringToFile(new File("src/main/resources/result.txt"),"Unique words: "+unique.size()+"\n "+unique.toString(),"UTF-8");
        } catch (IOException e) {
            LOGGER.error(e);
        }
    }
}
