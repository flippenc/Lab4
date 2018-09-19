import java.util.Arrays;
/**
 * Write a description of class Lab4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lab4
{
    public static void main(String[] args)
    {
        int[] in = new int[4];
        in = null;
        int[] in2 = new int[10];
        boolean notNull = false;
        for (int i = 0; i<in2.length; i++)
        {
            in2[i] = (int)(Math.random()*100);
        }
        int[] in3 = new int[20];
        for (int i = 0; i<in3.length; i++)
        {
            in3[i] = (int)(Math.random()*100);
        }
        int[] in4 = new int[30];
        for (int i = 0; i<in4.length; i++)
        {
            in4[i] = (int)(Math.random()*100);
        }
        try
        {
            sort(in);
        }
        catch (IllegalArgumentException E)
        {
            System.out.println("Input can't be null");
        }
        try
        {
            sort(in2);
        }
        catch (IllegalArgumentException E)
        {
        }
        try
        {
            sort(in3);
        }
        catch (IllegalArgumentException E)
        {
        }
        try
        {
            sort(in4);
        }
        catch (IllegalArgumentException E)
        {
        }        
        for (int i = in2.length-1; i>-1; i--)
        {
            System.out.println(in2[i]);
        }
        for (int i = in3.length-1; i>-1; i--)
        {
            System.out.println(in3[i]);
        }
        for (int i = in4.length-1; i>-1; i--)
        {
            System.out.println(in4[i]);
        }
    }
    public static int[] sort(int[] input) throws IllegalArgumentException 
    {
        if (input == null)
        {
            throw new IllegalArgumentException("Input can't be null");
        }
        if (input.length == 0||input.length==1)
        {
            return input;
        }
        Arrays.sort(input);
        return input;
    }
    public static int[] reverse(int[] in)
    {
        int[] a = in;
        int temp = 0;
        for (int i = 0; i<a.length; i++)
        {
            temp = a[i];
            a[i] = a[a.length-(i+1)];
            a[a.length-(i+1)]=temp;
        }
        return a;
    }
}
