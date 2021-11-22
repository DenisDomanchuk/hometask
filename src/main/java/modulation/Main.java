package modulation;

public class Main {

    public static void main(String[] args) {
        int[] array = {1,8,1,8,2,3,6,5,5,5,5,5,7,9};
        System.out.println(uniqueElements(array));
    }

    static int uniqueElements(int[] array) {
        int result = 0;
        int uniqueChar = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            uniqueChar++;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] == array[i]) {
                    count++;
                    break;
                }
            }
        }
        return result = uniqueChar - count;

    }

}
