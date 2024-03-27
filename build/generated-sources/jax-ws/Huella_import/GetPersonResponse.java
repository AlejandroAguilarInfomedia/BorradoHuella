
package Huella_import;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GetPersonResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GetPersonResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basicResponse" type="{http://www.morpho.com/mbss/generic/wsdl}BasicResponse"/&gt;
 *         &lt;element name="person" type="{http://www.morpho.com/mbss/generic/wsdl}Person" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetPersonResponse", propOrder = {
    "basicResponse",
    "person"
})
public class GetPersonResponse {

    @XmlElement(required = true)
    protected BasicResponse basicResponse;
    protected Person person;

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

}
