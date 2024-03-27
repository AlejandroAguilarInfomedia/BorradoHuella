
package Huella_import;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PersonToPersonAuthenticateError complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PersonToPersonAuthenticateError"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="type" type="{http://www.morpho.com/mbss/generic/wsdl}PersonToPersonAuthenticateErrorType"/&gt;
 *         &lt;element name="reference" type="{http://www.morpho.com/mbss/generic/wsdl}SampleReference" minOccurs="0"/&gt;
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonToPersonAuthenticateError", propOrder = {
    "type",
    "reference",
    "message"
})
public class PersonToPersonAuthenticateError {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected PersonToPersonAuthenticateErrorType type;
    protected SampleReference reference;
    protected String message;

    /**
     * Obtiene el valor de la propiedad type.
     * 
     * @return
     *     possible object is
     *     {@link PersonToPersonAuthenticateErrorType }
     *     
     */
    public PersonToPersonAuthenticateErrorType getType() {
        return type;
    }

    /**
     * Define el valor de la propiedad type.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonToPersonAuthenticateErrorType }
     *     
     */
    public void setType(PersonToPersonAuthenticateErrorType value) {
        this.type = value;
    }

    /**
     * Obtiene el valor de la propiedad reference.
     * 
     * @return
     *     possible object is
     *     {@link SampleReference }
     *     
     */
    public SampleReference getReference() {
        return reference;
    }

    /**
     * Define el valor de la propiedad reference.
     * 
     * @param value
     *     allowed object is
     *     {@link SampleReference }
     *     
     */
    public void setReference(SampleReference value) {
        this.reference = value;
    }

    /**
     * Obtiene el valor de la propiedad message.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Define el valor de la propiedad message.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

}
