package company.domain.model;

public class Caesarcijfer {
    public static String codeDecoderen(String Code) {
        String result="";
        for (int i = 0; i < Code.length(); i++) {
            result = result+ Character.toString((char) ((((int)Code.charAt(i)-1-97+26)%26)+97))    ;
            ;
        }



        return result;
    }

    public static String codeCoderen(String code) {
        String result="";
        for (int i = 0; i < code.length(); i++) {
            result = result+ Character.toString((char) ((((int)code.charAt(i)+1-97+26)%26)+97))  ;
            ;
        }
    return result;
    }
}
