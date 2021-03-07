package com.text.conversion.util;

import com.text.conversion.entity.UyText;
import org.springframework.http.converter.json.GsonBuilderUtils;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class TextUtil {

    public List<UyText> readFile(String path){
        File file = new File(path);
        List<UyText> list = new ArrayList<>();
        if (file.isFile() && file.exists()){
            try {

                InputStreamReader reader = new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8);
                BufferedReader bufferedReader = new BufferedReader(reader);
                String lineText = null;
                while((lineText = bufferedReader.readLine())!= null){
                    String[] text = lineText.split(" ");
                    UyText uyText = new UyText(text[0], text[1]);
                    list.add(uyText);
                }
                return list;
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        String name ="ئۇيغۇرچە";
        StringBuilder result = new StringBuilder();
        List<UyText> data = new TextUtil().readFile("/Users/ilyarmurat/work/code/my/conversion/src/main/resources/text.txt");
        for (int i=0;i<name.length();i++){
            for (UyText datum : data) {
                if (datum.getUEY().equals(""+name.charAt(i))) {
                    result.append(datum.getULY());
                    break;
                }
                if (" ".equals(""+name.charAt(i))){
                    result.append(" ");
                    break;
                }
            }
        }
        System.out.println(result.toString());
    }
}
