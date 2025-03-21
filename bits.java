import java.util.Scanner;

public class bits{
    public static void main(String[] args) {
    update(4, 2, 0);
    }
    // public static void main(String[] args){
    //     Scanner s = new Scanner(System.in);
    //     int n = s.nextInt();
    //     int pos = s.nextInt();
    //     int bitmask = 1 << pos;
    //     int bit = n & bitmask;
    //     if(bit != 0){
    //         System.out.println("1");
    //     }else{
    //         System.out.println("0");
    //     }
    // }


// set bit

//     public static void main(String[] args){
//         Scanner s = new Scanner(System.in);
//         int n = s.nextInt();
//         int pos = s.nextInt();
//         int bitmask = 1 << pos;
//         int bit = n | bitmask;
//         System.out.println(bit);
//     }
// // }


// clear bit
    // public static void main(String[] args){
    //     Scanner s = new Scanner(System.in);
    //     int n = s.nextInt();
    //     int pos = s.nextInt();
    //     int bitmask = 1 << pos;
    //     int notbitmask = ~(bitmask);
    //     notbitmask = n & notbitmask;
    //     System.out.println(notbitmask);
    // }


    public static void update(int n, int p, int op){
        Scanner s = new Scanner(System.in);
        int mask;
        if(op==0){
            mask = 1 <<p;
            n = n | mask;
        }
        else{
            mask = ~( 1 <<p);
            n = n & mask;
        }

        System.out.println(n);

    }
}


