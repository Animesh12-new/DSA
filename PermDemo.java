package Recursion;
public class PermDemo {
    static void genPerm(String str, String output){
        if(str.length() == 0){
            System.out.println(output);
            return;
        }
        for(int i = 0; i<str.length(); i++){
            char currentStr = str.charAt(i);
            String remString = str.substring(0,i) + str.substring(i+1);
            genPerm(remString, output + currentStr);
        }
    }
    public static void main(String[] args){
        genPerm("abc","");
    }
}
