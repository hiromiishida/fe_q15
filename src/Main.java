public class Main {
    public static void main(String[] args) {
        String[] result = conversion(100);
        for (int i = result.length - 1 ; i >= 0 ; i--){
            System.out.println(result[i]);
        }
    }

    private static String[] conversion(int j) {
        if(j > 255 || j < 0) {
            System.out.println("扱える範囲外です");
            return new String[0];
        }

        String[] NISHIN = new String[8];

        for(int k = 1 ; k <= 8; k++){
            NISHIN[k - 1] = String.valueOf(j % 2);
            j = j / 2;
        }

        return NISHIN;
    }
}