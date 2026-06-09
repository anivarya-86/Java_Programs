public class VaeArgs {

    public static void main() {
        System.out.println(concatenate("Anivarya"));
        System.out.println(concatenate("Saini"));
    }
    public static String concatenate(String... strs){
        StringBuilder sb = new StringBuilder();
        for (String str : strs){
            sb.append(str).append(" ");

        }
        return sb.toString();
    }
}
