
package Huella_import;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FaceSampleType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="FaceSampleType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="STILL"/&gt;
 *     &lt;enumeration value="VIDEO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FaceSampleType")
@XmlEnum
public enum FaceSampleType {

    STILL,
    VIDEO;

    public String value() {
        return name();
    }

    public static FaceSampleType fromValue(String v) {
        return valueOf(v);
    }

}
