import java.io.*;
import java.util.Scanner;
class alphabet
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
char ch=s.next().charAt(0);
if(ch>='a'&&ch<='z')
{
System.out.println("alphabet");
}
else
System.out.println("not an alphabet");
}
}
