/*
 * Problem :
 * Algorithm to shift the discs placed in ascending order(size wise) from top to bottom in tower A(source) to
 * tower B(destination) using tower C(auxillary tower).
 * Conditions : never should a bigger disk be on smaller disk
 * n=number of disks
 */

package Algorithms;

public class TowersOfHanoi {

    public static void main(String[] args) {
        TowersOfHanoi towersOfHanoi = new TowersOfHanoi();
        towersOfHanoi.towersOfHanoi(3, 'A', 'B', 'C');
    }

    public void towersOfHanoi(int n, char A, char B, char C) {
        if (n == 1) {
            System.out.println("Transfer disk from " + A + " to " + B);
            return;
        }
        //shift n-1 disks from tower A to tower C using tower B
        towersOfHanoi(n - 1, A, C, B);
        System.out.println("Transfer disk from " + A + " to " + B);
        //shift n-1 disks from tower C to tower B using tower A
        towersOfHanoi(n - 1, C, B, A);
    }
}
