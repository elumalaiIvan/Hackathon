//•A coach must ensure that two teams in a combettion are
//        equally strong. Teams A and B have nand m players. The players ski levels are stored in arravs TeamA and TeamB. A 0 value
//        indicates that the team lacks a player in that position. The coach wants to add plavers in each emptv position such that the teams Skill levels have equal sums. Return the minimum possible equal
//        SUm o- TEs not possiole to optain such a sum

/*
teamA = [5, 10, 0, 47]
teamB = [2,  4,  0,  5, 0]

Add a plaver of skill level 1 in teamA. and plavers of skill levels 3 and
6 in teamB. Now teamA = 5, 10, 1, 41, and teamB = 2, 4, 3, 5, 6
with sUms 5+10+1+4 = 2+4+3+5+6 = 20
 */

import java.util.Arrays;
import java.util.List;

public class BalanceArray {
    public static void main(String[] args) {
        equalTeamSkill(Arrays.asList(5, 0, 0, 0), Arrays.asList(2, 4, 0, 5, 0));
    }
//    teamA = [5, 10, 0, 47] => [5, 10, 1, 41]
//    teamB = [2,  4,  0,  5, 0] => [2, 4, 3, 5, 6]
    public static void equalTeamSkill(List<Integer> teamA, List<Integer> teamB) {
        int teamATotalStrength = teamA.stream().mapToInt(Integer::intValue).sum();
        int teamBTotalStrength = teamB.stream().mapToInt(Integer::intValue).sum();
        if (teamATotalStrength > teamBTotalStrength) {
            adjustTeamStrength(teamA, teamB, teamATotalStrength, teamBTotalStrength);
        } else {
            adjustTeamStrength(teamB, teamA, teamBTotalStrength, teamATotalStrength);
        }
    }

    private static void adjustTeamStrength(List<Integer> strongTeam, List<Integer> weakTeam, int strongTeamTotalStrength, int weakTeamTotalStrength) {
        for (int index = 0; index < strongTeam.size(); index++) {
            if (strongTeam.get(index) == 0) {
                strongTeamTotalStrength++;
                strongTeam.set(index, 1);
            }
        }
        int weakTeamOpenPosition = (int) weakTeam.stream().filter(level -> level == 0).count();
        if (weakTeamOpenPosition == 0) {
            System.out.println("There is no open position to adjust");
            return;
        }
        System.out.println("weak team open positions are " + weakTeamOpenPosition);
        int strengthToBeAdjusted = strongTeamTotalStrength - weakTeamTotalStrength; // > 1
        System.out.println("strength to be adjusted " + strengthToBeAdjusted);

        if (strengthToBeAdjusted > weakTeamOpenPosition) {
            int quotient = strengthToBeAdjusted / weakTeamOpenPosition;
            int remainder = strengthToBeAdjusted % weakTeamOpenPosition;
            boolean remainderFilled = remainder == 0;
            for (int index = 0; index < weakTeam.size(); index++) {
                if (weakTeam.get(index) == 0) {
                    if (!remainderFilled) {
                        remainderFilled = true;
                        weakTeam.set(index, quotient + remainder);
                        weakTeamTotalStrength = weakTeamTotalStrength + remainder + quotient;
                    } else {
                        weakTeam.set(index, quotient);
                        weakTeamTotalStrength += quotient;
                    }
                }
            }
        } else {
            System.out.println("can not adjust");
        }
        //
        System.out.println("strong team :" + strongTeam + " total: " + strongTeamTotalStrength);
        System.out.println("weak team " + weakTeam + " total: " + weakTeamTotalStrength);
    }


}
