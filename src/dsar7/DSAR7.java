package dsar7;
import java.util.*;
public class DSAR7 {
public static boolean m1(String s1){
    int a=s1.length();
    for(int i=0;i<a;i++){
        if(s1.charAt(i)==s1.charAt(a-i-1)){
            return true;
        }
        else if(s1.charAt(i)!=s1.charAt(a-i-1)){
            return false;
        }
    }
    return m1(s1);
}
public static void main(String[] args) {
DSAR7 p1=new DSAR7();
//Check either string is pelindorum or not?
String h;
Scanner in=new Scanner(System.in);
System.out.println("enter a string");
h=in.next();
System.out.println("Check either string is pelindorum\nreturn true if it's pelindorum else false:\t"+p1.m1(h));
    }   
}