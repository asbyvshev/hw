public class Palendrom {
    public static void main(String[] args) {
        String str = "123435";
        String str1 = "/123/321/";
        String str2 = "111";
        System.out.println(isPalendrom(str));
        System.out.println(isPalendrom(str1));
        System.out.println(isPalendrom(str2));

    }
    public static boolean isPalendrom(String string){
        String srt = String.valueOf(new StringBuilder(string).reverse());
        return string.equalsIgnoreCase(srt);
    }
}
