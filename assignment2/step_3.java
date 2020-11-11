import java.io.*;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;
import java.util.Arrays;
import java.util.LinkedList;

public class step_3
{
    private static Hashtable <String, LinkedList<String>> chunked ;
    public static void chunkFile(char start, char fin) {
    String fname;
    Scanner scan = new Scanner("eng_newscrawl-public_2018_1M-words.txt");
    TreeMap<String, Integer> uniqueMap = new TreeMap<String, Integer>();

    /* enter filename with extension to open and read its content */

    // System.out.print("Enter File Name to Open (with extension like file.txt) : ");
    fname = scan.nextLine();


    /* this will reference only one line at a time */

    String line = null;
    try
    {

        while(start!='d'){
            // chunked.put(Character.toString(start),new LinkedList<>()) ;
            System.out.println(chunked);
            //do work on txt file
            start++;
            // System.out.println(start);
        }
        System.out.println(chunked);
        /* FileReader reads text files in the default encoding */
        FileReader fileReader = new FileReader(fname);

        /* always wrap the FileReader in BufferedReader */
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String[] nline;
        while((line = bufferedReader.readLine()) != null)
        {
            nline = line.split("\\s+");
            List <String> cocktailsausage = new ArrayList <String> ();
            cocktailsausage = Arrays.asList(nline);
            // System.out.println(cocktailsausage);
            // System.out.println(cocktailsausage.get(0));
        }

        // System.out.println(start + " " + fin);
        /* always close the file after use */
        bufferedReader.close();
    }
    catch(IOException ex)
    {
        System.out.println("Error reading file named '" + fname + "'");
    }
    // return uniqueMap;
        
    }


public TreeMap get_meta()
{
    String fname;
    Scanner scan = new Scanner("sample.txt");
    TreeMap<String, Integer> uniqueMap = new TreeMap<String, Integer>();

    /* enter filename with extension to open and read its content */

    // System.out.print("Enter File Name to Open (with extension like file.txt) : ");
    fname = scan.nextLine();

    /* this will reference only one line at a time */

    String line = null;
    try
    {
        /* FileReader reads text files in the default encoding */
        FileReader fileReader = new FileReader(fname);

        /* always wrap the FileReader in BufferedReader */
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        while((line = bufferedReader.readLine()) != null)
        {
            int i=0;
            String strArray[] = line.split(" ");
            String word;
            Integer currentVal;
            while(i<strArray.length){
                if (strArray[i].contains(".")){
                word = strArray[i].replace(".", "");
                } else {
                    word = strArray[i];
                };


                if (uniqueMap.containsKey(word)){
                    
                    currentVal = uniqueMap.get(word);
                    currentVal+=1;
                    uniqueMap.put(word, currentVal);
                }
                else{
                    uniqueMap.put(word.toLowerCase(), 1);
                };
                i+=1;
            }
            
        }

        /* always close the file after use */
        bufferedReader.close();
    }
    catch(IOException ex)
    {
        System.out.println("Error reading file named '" + fname + "'");
    }
    return uniqueMap;
}

public static void main(String[] args){
    // System.out.println(new step_3().get_meta().toString());
    TreeMap<String, Integer> uniqueMap = new step_3().get_meta();
    String stringMap = new step_3().get_meta().toString();
    // writing to txt file
    Writer writer = null;
    int i = 0;
    chunkFile('a', 'z');


    // try {
    //     writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("meta.txt"), "utf-8"));
    //     for(Map.Entry<String, Integer> entry: uniqueMap.entrySet()){
    //         writer.write(i + " " + entry.getKey() + " " + entry.getKey() + " " + entry.getValue() + System.lineSeparator());
    //         i+=1;
    //     }
    // } catch (IOException ex) {
    //     // Report
    // } finally {
    // try {writer.close();} catch (Exception ex) {/*ignore*/}
    // }


}
}