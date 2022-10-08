package Buoi1;
import java.util.function.Function;
public class Main
{ public static void main (String[] argv)
{
 Function<Integer,String> fA = x->Integer.toBinaryString(x);
 System.out.println(fA.apply(111));
}
}