import java.util.Scanner;

public class Classwork
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("1st word: ");
    String s1 = sc.nextLine();
    System.out.println("2nd word: ");
    String s2 = sc.nextLine();
    System.out.println("Number: ");
    int n = sc.nextInt();
    lastFirstN(s1, s2, n);

    Scanner sc2 = new Scanner(System.in);
    System.out.println("\n1st word: ");
    s1 = sc2.nextLine();
    System.out.println("\n2nd word: ");
    s2 = sc2.nextLine();
    stringManip(s1, s2);
  }
  
  public static void lastFirstN(String s1, String s2, int n)
  {
    String output = s1.substring(n - 1) + s2.substring(0, n);
    System.out.println(output);
  }

  public static void stringManip(String s1, String s2)
  {
    s1 = s1.toUpperCase();
    System.out.println(s1);

    String firstLetter = s2.substring(0, 1);
    firstLetter = firstLetter.toUpperCase();
    s2 = s2.substring(1);
    s2 = s2.toLowerCase();
    System.out.println(firstLetter + s2);
  }

}