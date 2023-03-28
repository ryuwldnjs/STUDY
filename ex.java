package study;

import static java.lang.Math.abs;
import java.util.*;
public class ex {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i=0;i<n;i++){
            int sz = abs(n/2 - i);
            for(int j=0;j < sz;j++){
                System.out.print(' ');
            }
            sz = (n/2 - abs(n/2 - i)) * 2 + 1;
            for(int j=0;j < sz;j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
