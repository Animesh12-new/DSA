package Recursion;
//Better code  Time complexity (6)^n better approach by backtracking
public class diceBoard{
    static void boardProblem(int currentValue, int endValue, String result){
        //Base Case
        if(currentValue == endValue){
            System.out.print(result +",");
            return;
        }
        //Negative Case
        if(currentValue>endValue){
            return;
        }
        //Small Problems
        for(int dice = 1; dice<=6; dice++){
            boardProblem(currentValue+dice, endValue, result+dice);
        }
    }
    public static void main(String args[]){
        boardProblem(0,10, "");
    }
}
/*My Way of Doing 
public class diceBoard {
    static void diceThrow(int n, String result)
    {
        if(n==0){
            System.out.println(result);
            return;
        }
        if(n<0){
            return;
        }
        diceThrow(n-1,result+"1");
        diceThrow(n-2,result+"2");
        diceThrow(n-3,result+"3");
        diceThrow(n-4,result+"4");
        diceThrow(n-5,result+"5");
        diceThrow(n-6,result+"6");
        
    }
    public static void main(String args[]){
        diceThrow(10,"");
    }
}*/
