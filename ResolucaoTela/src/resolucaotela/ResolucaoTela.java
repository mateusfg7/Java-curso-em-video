package resolucaotela;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoTela {

    public static void main(String[] args) {
        Toolkit res = Toolkit.getDefaultToolkit();
        Dimension d = res.getScreenSize();
        System.out.println("Sua tela tem a resolução " + d.width + " X " + d.height);
    }
    
}
