import java.util.ArrayList;

public class GSOA {

    private static ArrayList<String> PossibleSubStringswithMAjorInvestments(String string) {

        ArrayList<String> result = new ArrayList<String>();
        int countA = 0, countB = 0, countC = 0;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'A')
                countA++;
            if (string.charAt(i) == 'B')
                countB++;
            if (string.charAt(i) == 'C')
                countC++;
        }

        for (int i = 0; i < string.length(); i++) {
            int j = i;
            boolean investmentA = false;
            boolean investmentB = false;
            boolean investmentC = false;

            while (j < string.length()) {
                if (string.charAt(j) == 'A')
                    investmentA = true;
                if (string.charAt(j) == 'B')
                    investmentB = true;
                if (string.charAt(j) == 'C')
                    investmentC = true;
                if ((investmentA || countA == 0) && (investmentB || countB == 0) && (investmentC || countC == 0)) {
                    result.add(string.substring(i, j + 1));
                }
                j++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        //System.out.println(PossibleSubStringswithMAjorInvestments("ABBCZBAC"));
        System.out.println(PossibleSubStringswithMAjorInvestments("PQACBA"));
    }
}
