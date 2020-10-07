package company.domain.model;

public class Spiegeling implements  CodeBewerking {

    public static String codeDecoderen(String Code) {  //APO -> OPA

        String result="";

        for (int i = Code.length()-1; i >= 0; i--) {
        result += Character.toString(Code.charAt(i));
        }
        return result;

    }


    public static  String codeCoderen(String code) { //OPA -> APO
        String result="";

        for (int i = code.length()-1; i >= 0; i--) {
            result += Character.toString(code.charAt(i));
        }
        return result;
    }
}
