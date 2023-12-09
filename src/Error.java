public class Error {
    public static void main(String[] args){
        try{
            String str = "壱百満";
            int value = Integer.parseInt(str);
            System.out.println(value);
        } catch (NumberFormatException e) {
            String str = "1000000";
            int value = Integer.parseInt(str);
            System.out.println(value);
        }
    }
}