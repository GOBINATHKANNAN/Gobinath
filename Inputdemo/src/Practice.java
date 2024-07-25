import java.util.Scanner;

public class Practice {
    int a;
    int b;

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public static void main(String[] args) {
        System.out.println();

//        int o,p,q,s;
          Scanner sc = new Scanner(System.in);
//         System.out.println("Enter word : ");
//        String word = sc.nextLine();
//        word = word.toLowerCase();
//        System.out.println("enter the index to find charAt " + word + "is :");
//        int n = sc.nextInt();
//        System.out.println("char at index " + n+" is "+word.charAt(n));// charAt represents the index of the string.
//        System.out.println("Enter the index to find codepointAt  :");
//        o = sc.nextInt();
//        int res = word.codePointAt(o); // codepointat givs the codepoint of the string
//        System.out.println( "code point at 0 is :" +res);
//        System.out.println("Enter the index to find codePointBefore  :");
//        p = sc.nextInt();
//        int r = word.codePointBefore(p); // codepointat givs the codepoint of the before string
//        System.out.println(" code point before 2 is :" +r);
//        System.out.println("Enter the index to find codepointCount from  and to  :");
//        q = sc.nextInt();
//        s = sc.nextInt();
//        int e = word.codePointCount( q, s); // codepointat givs the codepoint of the string from to to
//        System.out.println("code point count from "+ q+ " to " +s+" is :" +e);
//        System.out.println("Enter the another word : ");
//        char[] word1 = sc.next().toCharArray(); // char array is used
//        String w2 = String.valueOf(word1);
//        System.out.println("after w1 compared to w2 :"+word.compareTo(w2)); // prints 0 is 2 strings are equal
//        System.out.println("w1 compared to w2 using ignore case is :"+word.compareToIgnoreCase(w2)); // 0 if equal
//        System.out.println("after concating two words :"+word.concat(w2));
//        System.out.println("checking " + word+"  contains  "+ w2 +" or not :"+word.contains(w2));// returns true if the char is found
//        System.out.println("w1,w2 compared using content equals :"+word.contentEquals(w2)); // returns false if the two words are not equal
//       // w2 = word.copyValueOf();
//        //System.out.println(w2);
//        sc.nextLine();
//        System.out.println("Enter the  word to check for the ends with for "+ word +" and "+ w2+ " is : ");
//        String a = sc.nextLine();
//        System.out.println( word +" ends  with " +a + " is " + word.endsWith(a));// returns true
//        String b = sc.nextLine();
//        System.out.println(w2 +" ends with " + b +" is " + w2.endsWith(b));
//        System.out.println(word +" equals " +w2 + " is " + word.equals(a));
//        System.out.println(word +" equals ignore case  " +w2 + " is " + word.equalsIgnoreCase(a));
       String name = "myself %s my age is %d";
       String re = String.format(name,"gobinath" , 19);
       System.out.println(" using format :"+re);

//        System.out.println(re +" is empty : "+re.isEmpty()); // returns true if string is empty
//        String ss = String.join(" ","car" , "is" , "a","vehicle"); // join function uses a separator at first and then elements the
//        System.out.println(" car is a vehicle  after joining  : "+ss);
//        String gg ="Hello everyone ";
//        System.out.println("the word everyone has the last index of :"+ gg.lastIndexOf("everyone"));// defines where the everyone starts with respect to index of the starting letter
//        System.out.println(" the length of the"+ gg +" string is :" +gg.length()); // shows the length of the string
//        System.out.println( " the word hello matches " + gg +"  is :" +"Hello".matches(gg)); // found the hello matches the gg string or not if found returns true
//        System.out.println(" the word Hello everyone " + gg +"  is :" + "Hello everyone ".matches(gg));  // same from the above one
//        System.out.println("replacing the letter l from Hello to e :" + gg.replace('l','e')); // replacing the char with the help of replace function
//        System.out.println("replacing the string everyone to all :" + gg.replace("everyone " , "all")); // replacing the char with the help of replace function
//        System.out.println("replacing the string hello everyone  to good morning :" + gg.replaceAll(gg,"good morning")); // replacing the char with the help of replace function
//        String sm = "i10 is a red colored car with red light and red colored wheels";
//        System.out.println(sm);
//        String re = "red";
//        String er ="[0-9]+";
//        System.out.println("replacing the red to blue using replaceAll :" + sm.replaceAll(re,"blue")); // using a seperate function to call the replace all function with new substring
//        System.out.println("replacing the first red to blue using replaceAt first : "+ sm.replaceFirst(re,"blue"));
//        System.out.println("replacing the first 10 to (10) using replaceAt first : "+ sm.replaceFirst(er,"($0)"));
//        System.out.println("checking red starts with r :"+ re.startsWith("r"));
//        String ok=" the string is seperated,using split function !";
//        String o = "[,\\ !\\s]";
//        String[] myarr = ok.split(o);
//        for(String i :myarr)
//        {
//            System.out.println("the string is seperated,using split function"+i);
//        }
//        System.out.println("Enter the string : ");
//        String z = sc.nextLine();
//        System.out.println("Enter the starting word : ");
//        char[] i = sc.nextLine().toCharArray();
//        String j= String.valueOf(i);
//        System.out.println("the starting word " + j +" matches the string "+ z +" : " + z.startsWith(j));
//          String ot ="how are you!";
//           System.out.println("the subsequence of the string " + ot+ " from 4 to 12 is :" + ot.subSequence(4,12)); // returns the string's subsequence as a char sequence
//           System.out.println("the substring of the string " + ot+ " from 4 to 12 is :" + ot.substring(0,12)); // returns the string's subsequence as a string sequence
   //         char[] so = ot.toCharArray();
//            System.out.println("using toCharArray the first char of the string "+ ot +" is :"+so[0]); // to char array is used to convert the sttring into char
//            System.out.println("using upper case the string "+ ot +" is :"+ ot.toUpperCase());
//            System.out.println("using lower case the string "+ ot +" is :"+ ot.toLowerCase());
//            System.out.println("using tostring the stringvalue  is :"+ ot.toString());          // this method may seem redundant, but its purpose is to allow code that is treating the string as a more generalized object to know its string value without casting it to String type.
//            String str = "      Rohit is a cricketer!      " ;// Remove whitespace from both sides of a string:
//            System.out.println("using trim func. the the string"+ str + " can be written as :" + str.trim());
           char[] sir = {'g','o','a'};
           String sg = String.valueOf(sir);
            System.out.println("using value of the char " + sg + " is :" + String.valueOf(sir)); //The valueOf() method returns the string representation of the specified value.
        System.out.println("using value of the char " + sg + " is :" + String.valueOf('G'));
        System.out.println("using value of the char " + sg + " is :" + String.valueOf(6942f));
    }
}
