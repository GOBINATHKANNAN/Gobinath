package CheckingEmptystring;

public class Main {

    public static boolean isEmpty(String[] strArr) {
        if (strArr.length == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args)
    {
        String[] strArr ={};

        System.out.println( isEmpty(strArr));
    }
    }

