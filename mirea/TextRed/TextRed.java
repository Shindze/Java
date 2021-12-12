package ru.mirea.textred;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File {
    public static void main(String[] args) {
        try(FileWriter writer = new FileWriter("./src/ru/mirea/textred/file.txt", false))
        {
            // запись всей строки
            String text;
            Scanner in = new Scanner(System.in);
            text = in.next();
            writer.write(text);
            // запись по символам
            writer.append('\n');

            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

        try(FileReader reader = new FileReader("./src/ru/mirea/textred/file.txt"))
        {
            int c;
            while((c=reader.read())!=-1){

                System.out.print((char)c);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

        try(FileWriter writer = new FileWriter("./src/ru/mirea/textred/file.txt", true))
        {

            String text;
            Scanner in = new Scanner(System.in);
            text = in.next();

            writer.append(text);

            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}