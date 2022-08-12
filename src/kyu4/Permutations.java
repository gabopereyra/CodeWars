//LEVEL: kyu 4
//link: https://www.codewars.com/kata/5254ca2719453dcc0b00027d/train/java

/**DESCRIPTION
 * In this kata you have to create all permutations of a non empty input string and remove duplicates, if present.
 * This means, you have to shuffle all letters from the input in all possible orders.
 *
 * Examples:
 *
 * * With input 'a'
 * * Your function should return: ['a']
 * * With input 'ab'
 * * Your function should return ['ab', 'ba']
 * * With input 'aabb'
 * * Your function should return ['aabb', 'abab', 'abba', 'baab', 'baba'
* */

package kyu4;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static List<String> singlePermutations(String s) {
        return permutations("", s, new ArrayList<>());
    }
    
    private static List<String> permutations(String candidate, String remaining, List<String> result) {

        if (remaining == null) {
            return result;
        }

        if (remaining.length() == 0) {
            if(!result.contains(candidate)){
                result.add(candidate);
            }
        }

        for (int i = 0; i < remaining.length(); i++) {
            String newCandidate = candidate + remaining.charAt(i);

            String newRemaining = remaining.substring(0, i) +
                    remaining.substring(i + 1);

            permutations(newCandidate, newRemaining, result);
        }
        return result;
    }
}
