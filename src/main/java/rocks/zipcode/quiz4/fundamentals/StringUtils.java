package rocks.zipcode.quiz4.fundamentals;



/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        Character mid = string.charAt(string.length()/2);
        return mid;
    }

    public static String capitalizeMiddleCharacter(String str) {
        int index = str.length()/2;

        return str.substring(0, index) + Character.toUpperCase(getMiddleCharacter(str))
                + str.substring(index + 1);
    }

    public static String lowerCaseMiddleCharacter(String str) {
        int index = str.length()/2;
        return str.substring(0, index) + Character.toLowerCase(getMiddleCharacter(str))
                + str.substring(index + 1);
    }

    public static Boolean isIsogram(String str) {
        char[] array = str.toCharArray();
        for(int i = 0; i < array.length; i++){
            for (int j = i + 1; j < array.length; j++){
                if (array[i] == array[j]){
                    return false;
                }
            }
        }
        return true;


    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {

        for (int i = 0; i < str.length()-1 ; i++) {
            char c = str.charAt(i);
            if((c == str.charAt(i +1 ))){
                return true;
            }
            }
        return false;
    }


    public static String removeConsecutiveDuplicateCharacters(String str) {
        String result = "";
        int index = 0;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                result += str.substring(index, i - 1);
                index = i + 1;
            }
        }
        result += str.substring(index);
        return result;
    }
    public static String invertCasing(String str) {
        String string = "";
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(Character.isLowerCase(c)) {
                string += Character.toUpperCase(c);
            } else {
                string += Character.toLowerCase(c);
            }
        }

        return string;
    }
}