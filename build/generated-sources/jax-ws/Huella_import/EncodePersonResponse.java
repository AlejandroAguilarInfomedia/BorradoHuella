
package Huella_import;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EncodePersonResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EncodePersonResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basicResponse" type="{http://www.morpho.com/mbss/generic/wsdl}BasicResponse"/&gt;
 *         &lt;element name="person" type="{http://www.morpho.com/mbss/generic/wsdl}Person" minOccurs="0"/&gt;
 *         &lt;element name="error" type="{http://www.morpho.com/mbss/generic/wsdl}EncodeError" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="encodeLevel" type="{http://www.morpho.com/mbss/generic/wsdl}EncodeLevel" minOccurs="0"/&gt;
 *         &lt;element name="sequenceCheckErrors" type="{http://www.morpho.com/mbss/generic/wsdl}SequenceCheckError" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="coderParameters" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EncodePersonResponse", propOrder = {
    "basicResponse",
    "person",
    "error",
    "encodeLevel",
    "sequenceCheckErrors",
    "coderParameters"
})
public class EncodePersonResponse {

    @XmlElement(required = true)
    protected BasicResponse basicResponse;
    protected Person person;
    protected List<EncodeError> error;
    @XmlSchemaType(name = "string")
    protected EncodeLevel encodeLevel;
    protected List<SequenceCheckError> sequenceCheckErrors;
    protected String coderParameters;

    /**
     * Obtiene el valor de la propiedad basicResponse.
     * 
     * @return
     *     possible object is
     *     {@link BasicResponse }
     *     
     */
    public BasicResponse getBasicResponse() {
        return basicResponse;
    }

    /**
     * Define el valor de la propiedad basicResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicResponse }
     *     
     */
    public void setBasicResponse(BasicResponse value) {
        this.basicResponse = value;
    }

    /**
     * Obtiene el valor de la propiedad person.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getPerson() {
        return person;
    }

    /**
     * Define el valor de la propiedad person.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setPerson(Person value) {
        this.person = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the error property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EncodeError }
     * 
     * 
     */
    public List<EncodeError> getError() {
        if (error == null) {
            error = new ArrayList<EncodeError>();
        }
        return this.error;
    }

    /**
     * Obtiene el valor de la propiedad encodeLevel.
     * 
     * @return
     *     possible object is
     *     {@link EncodeLevel }
     *     
     */
    public EncodeLevel getEncodeLevel() {
        return encodeLevel;
    }

    /**
     * Define el valor de la propiedad encodeLevel.
     * 
     * @param value
     *     allowed object is
     *     {@link EncodeLevel }
     *     
     */
    public void setEncodeLevel(EncodeLevel value) {
        this.encodeLevel = value;
    }

    /**
     * Gets the value of the sequenceCheckErrors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sequenceCheckErrors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSequenceCheckErrors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SequenceCheckError }
     * 
     * 
     */
    public List<SequenceCheckError> getSequenceCheckErrors() {
        if (sequenceCheckErrors == null) {
            sequenceCheckErrors = new ArrayList<SequenceCheckError>();
        }
        return this.sequenceCheckErrors;
    }

    /**
     * Obtiene el valor de la propiedad coderParameters.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoderParameters() {
        return coderParameters;
    }

    /**
     * Define el valor de la propiedad coderParameters.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoderParameters(String value) {
        this.coderParameters = value;
    }

}
