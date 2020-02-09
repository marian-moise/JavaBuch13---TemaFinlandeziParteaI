package week1;

import nhlstats.NHLStatistics;

import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);

        System.out.println("Top ten by goals:");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        System.out.println("Top ten based on penalty amounts:");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        System.out.println("Statistics for Sidney Crosby:");
        NHLStatistics.searchByPlayer("Sidney Crosby");
        System.out.println("Statistics for Philadelphia Flyers:");
        NHLStatistics.teamStatistics("PHI");
        NHLStatistics.sortByPoints();
        System.out.println("Players in Anaheim Ducks");
        NHLStatistics.teamStatistics("ANA");
        NHLStatistics.sortByPoints();
    }
}
