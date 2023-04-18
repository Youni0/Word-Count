import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        System.out.println(countWords("Bardzo lubie jesc placki i pic wode"));

    }
    public static int countWords(String sen){
        int sum=0;
        StringTokenizer st = new StringTokenizer(sen);
        sum = st.countTokens();
        return sum;
    }
}