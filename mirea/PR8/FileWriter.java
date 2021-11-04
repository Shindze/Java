package ru.mirea.pr8;

import java.io.*;

public class Main
{
    
  static void First (String str) throws IOException
  {
    FileWriter FilW = new FileWriter ("Texqqqq.txt", false);
      FilW.write (str);
      FilW.flush ();
  }
  
  static void Second () throws IOException
  {
    FileReader FilR = new FileReader ("Texqqqq.txt");
    int R;
    while ((R = FilR.read ()) != -1)
      {
	System.out.print ((char) R);
      }
  }
  
  static void Fourth (String str) throws IOException
  {
    FileWriter FilW = new FileWriter ("Texqqqq.txt", true);
      FilW.write (str);
      FilW.close ();
  }
  
  public static void main (String[]args) throws IOException
  {
    InputStreamReader isr = new InputStreamReader (System.in);
    BufferedReader br = new BufferedReader (isr);
    String str = br.readLine ();
      First (str);
      Second ();
      str = br.readLine ();
      Fourth (str);
      Second ();
  }
}
