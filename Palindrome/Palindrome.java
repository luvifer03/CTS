import java.util.Scanner;
public class Palindrome{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        String str;
        System.out.println("Enter the word :");
        str=sc.nextLine();
        int count=0;
        int l=str.length();
        char ch[]=str.toCharArray();
        for(int i=0;i<l;i++){
            if(Character.isLetter(ch[i])){
                count++;
            }
        }
        if(count == l){
            StringBuffer string=new StringBuffer(str);
            String rev=string.reverse().toString();
            if(str.equalsIgnoreCase(rev)){
             System.out.println(str+" is a Palindrome");   
            }else{
             System.out.println(str+" is not a Palindrome");   
            }
        }else{
            System.out.println("Invalid Input");
        }
    }
}

