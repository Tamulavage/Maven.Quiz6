package rocks.zipcode.io.fundamentals;

public class BasicStringUtils {
    /**
     * @param chars - characters used to instantiate a new string object
     * @return new String which wraps the arguments passed in
     */
    public static String getString(char[] chars) {
        StringBuilder sb = new StringBuilder();
        for(char c: chars){
            sb.append(c);
        }
        return sb.toString();
    }

    /**
     * @param chars - characters used to instantiate a new string object
     * @return new String which wraps the arguments passed in
     */
    public static String getString(Character[] chars) {
        StringBuilder sb = new StringBuilder();
        for(Character c: chars){
            sb.append(c);
        }
        return sb.toString();
    }

    /**
     * @param string - string to be manipulated
     * @return identical string with lowercase and uppercase vowels removed
     */
    public static String removeAllVowels(String string) {
        String vowels = "AEIOUaeiou";

        return removeSpecifiedCharacters(string, vowels);
    }

    /**
     * @param string             - string to be manipulated
     * @param charactersToRemove - characters to be removed from string
     * @return
     */
    public static String removeSpecifiedCharacters(String string, String charactersToRemove) {
        StringBuilder sb = new StringBuilder();
        for(Character c:string.toCharArray()){
            if(!inString(c, charactersToRemove)){
                sb.append(c);
            }
        }
        return sb.toString();
    }

    private static Boolean inString(Character character, String string){
        for(Character c: string.toCharArray()){
            if(c.equals(character)){
                return true;
            }
        }
        return false;
    }
}
