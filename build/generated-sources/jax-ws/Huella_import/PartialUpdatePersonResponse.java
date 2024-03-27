
package Huella_import;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PartialUpdatePersonResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PartialUpdatePersonResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basicResponse" type="{http://www.morpho.com/mbss/generic/wsdl}BasicResponse"/&gt;
 *         &lt;element name="flatPerson" type="{http://www.morpho.com/mbss/generic/wsdl}Person" minOccurs="0"/&gt;
 *         &lt;element name="error" type="{http://www.morpho.com/mbss/generic/wsdl}EncodeError" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartialUpdatePersonResponse", propOrder = {
    "basicResponse",
    "flatPerson",
    "error"
})
public class PartialUpdatePersonResponse {

    @XmlElement(required = true)
    protected BasicResponse basicResponse;
    protected Person flatPerson;
    protected List<EncodeError> error;

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
     * Obtiene el valor de la propiedad flatPerson.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getFlatPerson() {
        return flatPerson;
    }

    /**
     * Define el valor de la propiedad flatPerson.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setFlatPerson(Person value) {
        this.flatPerson = value;
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

}
