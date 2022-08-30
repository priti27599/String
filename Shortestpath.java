import java.util.*;

public class Shortestpath{
    public static float findshortestpath(String str){
        int x=0, y=0;
        float sum =0;
        for(int i=0; i<str.length();i++)
        {
          if(str.charAt(i)=='E'){
            x=x+1;
          }
          else if(str.charAt(i) == 'W')
          {
            x = x-1;
          }
          else if(str.charAt(i) =='N'){
            y = y+1;
          }
          else{
            y = y-1;
          }
        }
        int x2 = x*x;
        int y2 = y*y;
        sum =  (float)Math.sqrt(x2 + y2);
       return sum;
    }
    public static void main(String args[]){
        String str="WNEENESENNN";
        System.out.println(findshortestpath(str));
    }
}