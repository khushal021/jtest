/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

/**
 *
 * @author Prathamesh
 */
import java.util.Scanner;
public class ReverseString
{
    String x="strings";
    char[]y=x.toCharArray();
    int i,j;
    void reverse()
    {
        for(int i=y.length-1;i>=0;i--)
        {
            System.out.println(y[i]);
         }
         }
    public static void main(String[]argd)
    {
        ReverseString obj=new ReverseString();
        obj.reverse();
    }
}
    

    
