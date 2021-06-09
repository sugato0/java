import jdk.internal.jmod.JmodFile;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class JsonoSQL {



    public static void main(String [] args) throws IOException {
        System.out.println("Введите порядковый номер элемента :");
        Scanner input= new Scanner(System.in);

        int val = input.nextInt ();
        File file = new File("C:\\Programs for programing\\Java\\musor\\text.txt");
        Scanner in = new Scanner(file);
        String temp;
        int count  = 0;
        int count1 = 0;
        PrintStream out = new PrintStream(new FileOutputStream("C:\\Programs for programing\\Java\\musor\\writer.txt"));


// option 1
        while(in.hasNext())
        {
            temp = in.next();
            char[] temparr = temp.toCharArray();
            for(Character j: temparr)
            {
                count ++;
                if(j == '{'){

                    count1 ++;
                }
                if(j=='"' || j == '{'|| j == '}'){
                    continue;
                }
                if(count1  == val) {
                        System.out.print(j);
                        out.print(j);
                        if (j==','){
                            out.println();
                            System.out.println();
                        }
                }

            }
        }

        in.useDelimiter("");
        while(in.hasNext())
        {
            temp = in.next();

        }
    }



}
