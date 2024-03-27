
package Huella_import;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RequestType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="RequestType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ENCODE_PERSON"/&gt;
 *     &lt;enumeration value="ENCODE_LATENT"/&gt;
 *     &lt;enumeration value="INSERT_PERSON"/&gt;
 *     &lt;enumeration value="DELETE_PERSON"/&gt;
 *     &lt;enumeration value="GET_PERSON"/&gt;
 *     &lt;enumeration value="COUNT_PERSON"/&gt;
 *     &lt;enumeration value="EXIST_PERSON"/&gt;
 *     &lt;enumeration value="INSERT_LATENT"/&gt;
 *     &lt;enumeration value="DELETE_LATENT"/&gt;
 *     &lt;enumeration value="GET_LATENT"/&gt;
 *     &lt;enumeration value="GET_TEMPLATES"/&gt;
 *     &lt;enumeration value="AUTHENTICATE_PERSON"/&gt;
 *     &lt;enumeration value="AUTHENTICATE_PERSON_TO_PERSON"/&gt;
 *     &lt;enumeration value="INSERT_WITH_FILTER_THEN_MATCH_WITHOUT_FILTER_PERSON"/&gt;
 *     &lt;enumeration value="MATCH_PERSON_TO_PERSON"/&gt;
 *     &lt;enumeration value="MATCH_PERSON_TO_LATENT"/&gt;
 *     &lt;enumeration value="MATCH_LATENT_TO_PERSON"/&gt;
 *     &lt;enumeration value="MATCH_LATENT_TO_LATENT"/&gt;
 *     &lt;enumeration value="UPDATE_PERSON"/&gt;
 *     &lt;enumeration value="UPDATE_LATENT"/&gt;
 *     &lt;enumeration value="COUNT_LATENT"/&gt;
 *     &lt;enumeration value="EXIST_LATENT"/&gt;
 *     &lt;enumeration value="PARTIAL_UPDATE_PERSON"/&gt;
 *     &lt;enumeration value="INTERNAL"/&gt;
 *     &lt;enumeration value="ERR"/&gt;
 *     &lt;enumeration value="GET_PERSON_INFO_LIST_NUMBER"/&gt;
 *     &lt;enumeration value="GET_PERSON_INFO_LIST"/&gt;
 *     &lt;enumeration value="GET_LATENT_INFO_LIST_NUMBER"/&gt;
 *     &lt;enumeration value="GET_LATENT_INFO_LIST"/&gt;
 *     &lt;enumeration value="REPLACE_PERSON_SAMPLE"/&gt;
 *     &lt;enumeration value="GET_PERSON_INFO_LIST_FOR_CONSISTENCY"/&gt;
 *     &lt;enumeration value="GET_PERSON_LIST_FOR_CONSISTENCY"/&gt;
 *     &lt;enumeration value="DETECT_FACES"/&gt;
 *     &lt;enumeration value="GET_LATENT_INFO_LIST_FOR_CONSISTENCY"/&gt;
 *     &lt;enumeration value="GET_LATENT_LIST_FOR_CONSISTENCY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RequestType")
@XmlEnum
public enum RequestType {

    ENCODE_PERSON,
    ENCODE_LATENT,
    INSERT_PERSON,
    DELETE_PERSON,
    GET_PERSON,
    COUNT_PERSON,
    EXIST_PERSON,
    INSERT_LATENT,
    DELETE_LATENT,
    GET_LATENT,
    GET_TEMPLATES,
    AUTHENTICATE_PERSON,
    AUTHENTICATE_PERSON_TO_PERSON,
    INSERT_WITH_FILTER_THEN_MATCH_WITHOUT_FILTER_PERSON,
    MATCH_PERSON_TO_PERSON,
    MATCH_PERSON_TO_LATENT,
    MATCH_LATENT_TO_PERSON,
    MATCH_LATENT_TO_LATENT,
    UPDATE_PERSON,
    UPDATE_LATENT,
    COUNT_LATENT,
    EXIST_LATENT,
    PARTIAL_UPDATE_PERSON,
    INTERNAL,
    ERR,
    GET_PERSON_INFO_LIST_NUMBER,
    GET_PERSON_INFO_LIST,
    GET_LATENT_INFO_LIST_NUMBER,
    GET_LATENT_INFO_LIST,
    REPLACE_PERSON_SAMPLE,
    GET_PERSON_INFO_LIST_FOR_CONSISTENCY,
    GET_PERSON_LIST_FOR_CONSISTENCY,
    DETECT_FACES,
    GET_LATENT_INFO_LIST_FOR_CONSISTENCY,
    GET_LATENT_LIST_FOR_CONSISTENCY;

    public String value() {
        return name();
    }

    public static RequestType fromValue(String v) {
        return valueOf(v);
    }

}
