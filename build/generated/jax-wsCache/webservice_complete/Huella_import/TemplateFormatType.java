
package Huella_import;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TemplateFormatType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="TemplateFormatType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CFV"/&gt;
 *     &lt;enumeration value="PKCOMPV2"/&gt;
 *     &lt;enumeration value="PKMAT"/&gt;
 *     &lt;enumeration value="ISO_19794_2"/&gt;
 *     &lt;enumeration value="ISO_19794_2_NS"/&gt;
 *     &lt;enumeration value="ISO_19794_2_CS"/&gt;
 *     &lt;enumeration value="ISO_19794_2_2011"/&gt;
 *     &lt;enumeration value="ANSI_378_2009"/&gt;
 *     &lt;enumeration value="ANSI_378"/&gt;
 *     &lt;enumeration value="AN2"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TemplateFormatType")
@XmlEnum
public enum TemplateFormatType {

    CFV("CFV"),
    @XmlEnumValue("PKCOMPV2")
    PKCOMPV_2("PKCOMPV2"),
    PKMAT("PKMAT"),
    ISO_19794_2("ISO_19794_2"),
    ISO_19794_2_NS("ISO_19794_2_NS"),
    ISO_19794_2_CS("ISO_19794_2_CS"),
    ISO_19794_2_2011("ISO_19794_2_2011"),
    ANSI_378_2009("ANSI_378_2009"),
    ANSI_378("ANSI_378"),
    @XmlEnumValue("AN2")
    AN_2("AN2");
    private final String value;

    TemplateFormatType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TemplateFormatType fromValue(String v) {
        for (TemplateFormatType c: TemplateFormatType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
