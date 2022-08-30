import java.util.*;

public class Basics{
    public static void printLetters(String str){
        for(int i=0; i< str.length();i++)
        {
            System.out.print(str.charAt(i)+ " ");
        }
        System.out.println();
    }

    public static String substring(String str, int si, int ei){
        String substr = "";
        for(int i=si; i<ei;i++){
            substr += str.charAt(i);
        }
        return substr;
    }

    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1; i<str.length();i++)
        {
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String args[]){
        // char arr[]={'a','b','c','d'};
        // String str = "abcd";
        // String str2 = new String("xyz");

        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.print(name);

        // String fullName = "Priti Kumari";
        // System.out.println(fullName.length());

        //Concatenation
        // String firstName = "Priti";
        // String lastName = "Kumari";
        // String fullName = firstName +" "+lastName;
        // System.out.println(fullName.charAt(0));
        //printLetters(fullName);

        //String str = "Hello world";
        //System.out.print(str.substring(0,10));
        //System.out.print(substring(str,0,7));

        // String fruits[] = {"apple","mango","banana"};
        // String largest = fruits[0];

        // for(int i=0 ;i<fruits.length; i++)
        // {
        //     if(largest.compareToIgnoreCase(fruits[i]) < 0)
        //     {
        //         largest = fruits[i];
        //     }
        // }
        // System.out.println(largest);


        //String Builder

        // StringBuilder sb = new StringBuilder("");
        // for(char ch='a'; ch<='z';ch++)
        // {
        //     sb.append(ch);
        //     System.out.println(ch);
        // }
        // System.out.println(sb.length());

        String str = "hi, i am priti.";
        System.out.println(toUpperCase(str));
    }

}