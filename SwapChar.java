/**
 * Created by theartiste on 1/3/16.
 */
public class SwapChar extends StringProcessor {

    public Object process(Object s) {
        String result = "";
        String temp = (String) s;
        char[] strArray = temp.toCharArray();
        int middleIndex = strArray.length/2;
        for (int i = 0, j = (strArray.length-1); (i < middleIndex) && (j > middleIndex); i++, j--) {
            char c = strArray[j];
            strArray[j] = strArray[i];
            strArray[i] = c;
        }

        for (char c : strArray) {
            result += c;
        }

        return result;
    }


}
