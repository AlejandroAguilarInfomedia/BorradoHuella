
package Huella_import;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GetPersonInfoListForConsistencyRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GetPersonInfoListForConsistencyRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basicRequest" type="{http://www.morpho.com/mbss/generic/wsdl}BasicRequest"/&gt;
 *         &lt;element name="nbItems" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="endTime" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetPersonInfoListForConsistencyRequest", propOrder = {
    "basicRequest",
    "nbItems",
    "token",
    "startTime",
    "endTime"
})
public class GetPersonInfoListForConsistencyRequest {

    @XmlElement(required = true)
    protected BasicRequest basicRequest;
    protected int nbItems;
    protected String token;
    protected Long startTime;
    protected Long endTime;

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
     * Obtiene el valor de la propiedad nbItems.
     * 
     */
    public int getNbItems() {
        return nbItems;
    }

    /**
     * Define el valor de la propiedad nbItems.
     * 
     */
    public void setNbItems(int value) {
        this.nbItems = value;
    }

    /**
     * Obtiene el valor de la propiedad token.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Define el valor de la propiedad token.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * Obtiene el valor de la propiedad startTime.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStartTime() {
        return startTime;
    }

    /**
     * Define el valor de la propiedad startTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStartTime(Long value) {
        this.startTime = value;
    }

    /**
     * Obtiene el valor de la propiedad endTime.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEndTime() {
        return endTime;
    }

    /**
     * Define el valor de la propiedad endTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEndTime(Long value) {
        this.endTime = value;
    }

}
