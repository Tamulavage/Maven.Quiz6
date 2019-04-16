package rocks.zipcode.io.fundamentals;


import rocks.zipcode.io.collections.PowerSet;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author leon on 10/01/2019.
 */
public class StringUtils {
    /**
     * @param string - string to be evaluated
     * @return collection containing all permutations of casing of this string
     */
    public static Collection<String> getAllCasings(String string) {

        Integer len = string.length();
        Collection<String> retVal = new ArrayList<>();


        return retVal;
    }

    /**
     * @param string  - string to be evaluated
     * @param indices - indices to be evaluated
     * @return near-identical string whose characters at specified indices are capitalized
     */
    public static String upperCaseIndices(String string, Integer... indices) {
        Integer len = indices.length;
        String retVal = string;
        for(int i =0; i<len; i++){
            retVal = replaceAtIndex(retVal, string.toUpperCase().charAt(indices[i]), indices[i]);
        }

        return retVal;
    }

    /**
     * @param stringToBeManipulated - string to be evaluated
     * @param valueToBeInserted     - value to insert into string
     * @param index                 - string-index at which to insert value into string
     * @return near-identical string with `valueToBeInserted` inserted at `index`
     */
    public static String insertAtIndex(String stringToBeManipulated, String valueToBeInserted, Integer index) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < stringToBeManipulated.length(); i++){
            if(i==index){
                sb.append(valueToBeInserted);
            }
                sb.append(stringToBeManipulated.charAt(i));
        }
        return sb.toString();
    }

    /**
     * @param stringToBeManipulated - string to be evaluated
     * @param replacementValue      - value to insert at `index`
     * @param index                 - position of string to be manipulated
     * @return near-identical string with character at `index` replaced with `replacementValue`
     */
    public static String replaceAtIndex(String stringToBeManipulated, Character replacementValue, Integer index) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < stringToBeManipulated.length(); i++){
            if(i==index){
                sb.append(replacementValue);
            }
            else
            {
                sb.append(stringToBeManipulated.charAt(i));
            }
        }
        return sb.toString();
    }
}