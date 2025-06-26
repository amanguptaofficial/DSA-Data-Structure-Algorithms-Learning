// 1.create  the given pattern 
// 000000
// 000000
// 000000
// 000000

// 2.create the given pattern 
// 0
// 00
// 000
// 0000

// section 2-------------------------------------------

// Question 1.
// for n=3     
// pattern is 
// 1
// 2 2
// 3 3 3

// for n=5
// pattern is 
// 1
// 2 2
// 3 3 3
// 4 4 4 4
// 5 5 5 5 5
// now print for n=6!!

// Print the following pattern for the given N number of rows.
// Pattern for N = 3
// A
// BB
// CCC

// Input format :
// Integer N (Total no. of rows)

// Pattern for N = 4
// A
// B C
// C D E
// D E F G

// Input format :
// Integer N (Total no. of rows)

// Q2.Print the following pattern for the given number of rows.
// Pattern for N = 5
// E
// D E
// C D E
// B C D E
// A B C D E

// Pattern for N = 5
// E
// D E
// C D E
// B C D E
// A B C D E

//sample input for n= 8,7,10,6

public class Pattern1 {
    public static void main(String[] args) {

        // // Question:1
        // for (int i = 0; i <= 4; i++) {
        // for (int j = 0; j < 6; j++) {
        // System.out.print(0);
        // }
        // System.out.println();
        // }

        // Question:2
        // for (int i = 0; i < 4; i++) {
        // for (int j = 0; j <= i; j++) {
        // System.out.print(0);
        // }
        // System.out.println();
        // }

        // // Question:3
        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(i);
        // }
        // System.out.println();
        // }

        // // Question:3
        // int n = 6;

        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j <= i; j++) {
        // System.out.print((char) (i + j + 65) + " ");
        // }
        // System.out.println();
        // }
        // }

        int n = 6;
        // for (int i = n; i >= 1; i--) {
        // for (int j = n; j <= i; j--) {
        // System.out.print((char) (i + 65) + " ");
        // }
        // System.out.println();
        // }

        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j <= i; j++) {
        // System.out.print((char) (n - 1 - i + j + 65) + " ");
        // }
        // System.out.println();
        // }

        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n - 1 - i; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 0; j <= i; j++) {
        // System.out.print(j + 1);
        // }
        // System.out.println();
        // }

        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n - 1 - i; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 0; j <= i; j++) {
        // System.out.print(j + 1);
        // }
        // System.out.println();
        // }

        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n - i; j++) {
        // System.out.print(n - i);
        // }
        // System.out.println();
        // }

        
    }

}
