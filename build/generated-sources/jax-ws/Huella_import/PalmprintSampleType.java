
package Huella_import;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PalmprintSampleType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="PalmprintSampleType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SPLIT_HAND"/&gt;
 *     &lt;enumeration value="FULL_HAND"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PalmprintSampleType")
@XmlEnum
public enum PalmprintSampleType {

    SPLIT_HAND,
    FULL_HAND;

    public String value() {
        return name();
    }

    public static PalmprintSampleType fromValue(String v) {
        return valueOf(v);
    }

}
