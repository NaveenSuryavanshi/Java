import.java.util.*;

public class bits{
    public static void main(String[] args){
        Scanner s = new Scanner(system.in);
        int n = s.nextInt();
        int pos = s.nextInt();
        int bitmask = 1 << pos;
        int bit = n & bitmask;
        if(bit != 0){
            System.out.println("1");
        }else{
            System.out.println("0");
        }   
    }
}