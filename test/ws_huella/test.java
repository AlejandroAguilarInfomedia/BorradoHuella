
package ws_huella;

import WS_Huella.Huella;
import java.net.MalformedURLException;

public class test{
    public static void main(String[] args) throws MalformedURLException {
        Huella huella= new Huella();
        huella.exist_person("1", 0, 5);
    }
}
