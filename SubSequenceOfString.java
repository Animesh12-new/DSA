package Recursion;
//Time Complexity (2)^n
public class SubSequenceOfString {
    static void subSequenceGen(String str, String result){
        if(str.length()==0){
            System.out.print(result + " ,");
            return;
        }
        //Take it
        subSequenceGen(str.substring(1),result);
        //Take it
        subSequenceGen(str.substring(1),result + str.charAt(0));
    }
    public static void main(String[] args){
        subSequenceGen("Hello","");
    }
}
