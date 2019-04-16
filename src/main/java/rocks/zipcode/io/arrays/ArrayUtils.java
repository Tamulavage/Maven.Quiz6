package rocks.zipcode.io.arrays;

/**
 * @author leon on 24/01/2019.
 */
public class ArrayUtils {
    /**
     * @param start - value to begin counting
     * @param end   - value to stop counting
     * @return array of all integers between `start` and `stop`
     */
    public static Integer[] getRange(Integer start, Integer end) {
        Integer[] retVal = new Integer[end-start+1];
        for(Integer i = start, k=0; i<=end; i++){
            retVal[k] = i;
            k++;
        }
        return retVal;
    }

    /**
     * @param array - array to be unboxed
     * @return array with identical contents in primitive-array form
     */
    public static char[] unbox(Character[] array) {
        char[] retVal = new char[array.length];
        for(int i=0; i<array.length; i++) {
            retVal[i] = array[i];
        }
        return retVal;
    }

    /**
     * @param array - array to be boxed
     * @return array with identical contents in nonprimitive-array form
     */
    public static Character[] box(char[] array) {
        Character[] retVal = new Character[array.length];
        for(int i=0; i<array.length; i++) {
            retVal[i] = array[i];
        }
        return retVal;
    }
}
