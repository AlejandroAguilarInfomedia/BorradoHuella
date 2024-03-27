
package Huella_import;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ImageFormatType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="ImageFormatType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RAW"/&gt;
 *     &lt;enumeration value="BMP"/&gt;
 *     &lt;enumeration value="WSQ"/&gt;
 *     &lt;enumeration value="JPEG"/&gt;
 *     &lt;enumeration value="JP2"/&gt;
 *     &lt;enumeration value="TIFF"/&gt;
 *     &lt;enumeration value="PNG"/&gt;
 *     &lt;enumeration value="ISO_19794_4"/&gt;
 *     &lt;enumeration value="ISO_19794_5"/&gt;
 *     &lt;enumeration value="ISO_19794_6"/&gt;
 *     &lt;enumeration value="GIF"/&gt;
 *     &lt;enumeration value="UNSPECIFIED"/&gt;
 *     &lt;enumeration value="NOT_RAW"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ImageFormatType")
@XmlEnum
public enum ImageFormatType {

    RAW("RAW"),
    BMP("BMP"),
    WSQ("WSQ"),
    JPEG("JPEG"),
    @XmlEnumValue("JP2")
    JP_2("JP2"),
    TIFF("TIFF"),
    PNG("PNG"),
    ISO_19794_4("ISO_19794_4"),
    ISO_19794_5("ISO_19794_5"),
    ISO_19794_6("ISO_19794_6"),
    GIF("GIF"),
    UNSPECIFIED("UNSPECIFIED"),
    NOT_RAW("NOT_RAW");
    private final String value;

    ImageFormatType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ImageFormatType fromValue(String v) {
        for (ImageFormatType c: ImageFormatType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
