/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mrahman
 */
public class StopWatchClient {

    public static void main(String[] args) {

        int n = 1000000;

        // sum of square roots of integers from 1 to n using Math.sqrt(x).
        // You need to create a StopWatch class, then this line should work.
        StopWatch timer = new StopWatch();

        timer.start();
        double sum1 = 0.0;
        for (int i = 1; i <= n; i++) {
            sum1 += Math.sqrt(i);
        }
        timer.stop();

        System.out.println(sum1 + " (" + timer.getElapsedTime() + " milliseconds)");

        System.out.printf("%e (%.2f seconds)\n", sum1, timer.getElapsedTimeInSec());

        // sum of square roots of integers from 1 to n using Math.pow(x, 0.5).
        timer.start();
        double sum2 = 0.0;
        for (int i = 1; i <= n; i++) {
            sum2 += Math.pow(i, 0.5);
        }
        timer.stop();

        System.out.println(sum2 + " (" + timer.getElapsedTime() + " milliseconds)");
        System.out.printf("%e (%.2f seconds)\n", sum2, timer.getElapsedTimeInSec());

    }
}
