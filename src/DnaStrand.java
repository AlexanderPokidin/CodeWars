public class DnaStrand {
    public static String makeComplement(String dna) {

        char[] mString = dna.toCharArray();

        for (int i = 0; i < mString.length; i++) {
            switch (mString[i]) {
                case 'T':
                    mString[i] = 'A';
                    break;
                case 'A':
                    mString[i] = 'T';
                    break;
                case 'C':
                    mString[i] = 'G';
                    break;
                case 'G':
                    mString[i] = 'C';
                    break;
            }
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < mString.length; i++) {
            builder.append(mString[i]);
        }
        return String.valueOf(builder);
    }

    public static void main(String[] args) {
        System.out.println(makeComplement("TTTT"));
    }
}
