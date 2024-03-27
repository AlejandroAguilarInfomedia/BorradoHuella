
package Huella_import;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ReplacePersonSampleRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ReplacePersonSampleRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basicRequest" type="{http://www.morpho.com/mbss/generic/wsdl}BasicRequest"/&gt;
 *         &lt;element name="personWithSamplesToReplace" type="{http://www.morpho.com/mbss/generic/wsdl}Person"/&gt;
 *         &lt;element name="oldClientDataVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="oldMbssDataVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReplacePersonSampleRequest", propOrder = {
    "basicRequest",
    "personWithSamplesToReplace",
    "oldClientDataVersion",
    "oldMbssDataVersion"
})
public class ReplacePersonSampleRequest {

    @XmlElement(required = true)
    protected BasicRequest basicRequest;
    @XmlElement(required = true)
    protected Person personWithSamplesToReplace;
    protected String oldClientDataVersion;
    protected String oldMbssDataVersion;

    /**
     * Obtiene el valor de la propiedad basicRequest.
     * 
     * @return
     *     possible object is
     *     {@link BasicRequest }
     *     
     */
    public BasicRequest getBasicRequest() {
        return basicRequest;
    }

    /**
     * Define el valor de la propiedad basicRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicRequest }
     *     
     */
    public void setBasicRequest(BasicRequest value) {
        this.basicRequest = value;
    }

    /**
     * Obtiene el valor de la propiedad personWithSamplesToReplace.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getPersonWithSamplesToReplace() {
        return personWithSamplesToReplace;
    }

    /**
     * Define el valor de la propiedad personWithSamplesToReplace.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setPersonWithSamplesToReplace(Person value) {
        this.personWithSamplesToReplace = value;
    }

    /**
     * Obtiene el valor de la propiedad oldClientDataVersion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldClientDataVersion() {
        return oldClientDataVersion;
    }

    /**
     * Define el valor de la propiedad oldClientDataVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldClientDataVersion(String value) {
        this.oldClientDataVersion = value;
    }

    /**
     * Obtiene el valor de la propiedad oldMbssDataVersion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldMbssDataVersion() {
        return oldMbssDataVersion;
    }

    /**
     * Define el valor de la propiedad oldMbssDataVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldMbssDataVersion(String value) {
        this.oldMbssDataVersion = value;
    }

}
