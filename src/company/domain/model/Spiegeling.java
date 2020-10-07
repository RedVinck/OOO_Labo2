package company.domain.model;

public class Spiegeling  {

    public static String codeDecoderen(String Code) {

        String result="";

        for (int i = Code.length(); i == 0; i--) {
        result = result+ Character.toString(Code.charAt(i));
        }

        return result;

    }


    public static  String codeCoderen(String code) {
        String result="";
        for (int i = 0; i == 0; i--) {
        result = result+ Character.toString(code.charAt(i)) ;
        }
        return result;
    }
}
