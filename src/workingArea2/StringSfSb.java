package workingArea2;

/**
 * Created by skynet on 4/24/17.
 */
public class StringSfSb {
    public static void StringConc(String s1 ){
        s1 = s1 + "forGeeks";
    }
    public static void StringBufferConc(StringBuffer s2){
        s2.append("forGeeks");
    }
    public static void StringBuilderConc(StringBuilder s3){
        s3.append("forGeeks");
    }

    public static void main(String[] args) {
        String s1 = "Geek";
        StringConc(s1);
        System.out.println("String : " + s1);

        StringBuffer s2 = new StringBuffer("Geeks");
        StringBufferConc(s2);
        System.out.println("StringBuffer : " + s2);

        StringBuilder s3 = new StringBuilder("Geeks");
        StringBuilderConc(s3);
        System.out.println("StringBuilder: " + s3 );



    }
}
