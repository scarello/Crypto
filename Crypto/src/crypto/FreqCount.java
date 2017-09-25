package crypto;
import java.io.*;
import java.io.FileReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mikem
 */
public class FreqCount {
    private final String inputFile = "C:\\Users\\mikem\\OneDrive\\Documents\\NetBeansProjects\\Crytpo\\Crypto\\src\\crypto\\freqTest.txt";
    double[] letterCount = new double[26];
    
    public void analyze(){
        
        double lc = 0;
        try{
            FileReader fr = new FileReader(inputFile);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null){
                for (int i =0; i < line.length(); i++){
                    char c = line.charAt(i);
                    int ic = (int) c;
                    if( ic >= 97 && ic <= 122){
                        letterCount[ic-97]++;
                        lc++;
                    }
                    else if (ic >= 65 && ic <= 90){
                         letterCount[ic-65]++;
                         lc++;
                    }
                }
            }
            System.out.println("Letter | Relative Frequency (%)");
            for(int i = 0; i < letterCount.length; i++){
                System.out.printf("%c      | %.2f\n", (char) (i + 65), letterCount[i]/lc * 100);
            }
        }catch (FileNotFoundException ex){
                   System.out.println("not a file");
        }catch (IOException ex){
                   System.out.println("input/output exception");
        }
        
    }
    
    public double[] getLetterCount(){
        return null;
    }
}

