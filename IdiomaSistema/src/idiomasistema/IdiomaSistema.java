package idiomasistema;

import java.util.Locale;



public class IdiomaSistema {

    public static void main(String[] args) {
       Locale linguagem = Locale.getDefault();
        System.out.print("Seu sistema esta em ");
        System.out.println(linguagem.getDisplayLanguage());
    }
    
}
