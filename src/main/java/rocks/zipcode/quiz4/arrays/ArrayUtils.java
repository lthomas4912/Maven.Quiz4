package rocks.zipcode.quiz4.arrays;


/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {

        return values[values.length/2];
    }

    public static String[] removeMiddleElement(String[] values) {
        String[] array = new String[values.length - 1];
        for(int i = 0; i < values.length; i++){
            if(i < values.length / 2){
                array[i] = values[i];
            }
            if(i >  values.length / 2){
                array[i - 1] = values[i];
            }
        }
        return array;
    }

    public static String getLastElement(String[] values) {
       return values[values.length -1];
    }

    public static String[] removeLastElement(String[] values) {
        String[] array = new String[values.length - 1];
        for (int i = 0; i < values.length - 1; i++){
            array[i] = values[i];
        }
        return array;
    }
}
