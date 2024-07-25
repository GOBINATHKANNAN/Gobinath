public class Employee {
    public static void main(String[] args) {
        String[] array = {"a", "b", "c", "d"};
        String hyp = "-";
        String result = joinWithSeparator(array, hyp);
        System.out.println(result);
    }

    public static String joinWithSeparator(String[] array, String separator) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            result.append(array[i]);
            if (i < array.length - 1) {
                result.append(separator);
            }
        }
        return result.toString();
    }
}
