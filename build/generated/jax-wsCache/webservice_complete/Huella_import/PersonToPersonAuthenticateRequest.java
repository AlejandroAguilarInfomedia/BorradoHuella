
package Huella_import;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PersonToPersonAuthenticateRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PersonToPersonAuthenticateRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basicRequest" type="{http://www.morpho.com/mbss/generic/wsdl}BasicRequest"/&gt;
 *         &lt;element name="personSearch" type="{http://www.morpho.com/mbss/generic/wsdl}Person"/&gt;
 *         &lt;element name="accuracyLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="personRef" type="{http://www.morpho.com/mbss/generic/wsdl}Person" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="fingerEarlyExit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="fingerDetailedInfoMatching" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonToPersonAuthenticateRequest", propOrder = {
    "basicRequest",
    "personSearch",
    "accuracyLevel",
    "personRef",
    "fingerEarlyExit",
    "fingerDetailedInfoMatching"
})
public class PersonToPersonAuthenticateRequest {

    @XmlElement(required = true)
    protected BasicRequest basicRequest;
    @XmlElement(required = true)
    protected Person personSearch;
    protected Integer accuracyLevel;
    protected List<Person> personRef;
    protected Boolean fingerEarlyExit;
    protected Boolean fingerDetailedInfoMatching;

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
     * Obtiene el valor de la propiedad personSearch.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getPersonSearch() {
        return personSearch;
    }

    /**
     * Define el valor de la propiedad personSearch.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setPersonSearch(Person value) {
        this.personSearch = value;
    }

    /**
     * Obtiene el valor de la propiedad accuracyLevel.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAccuracyLevel() {
        return accuracyLevel;
    }

    /**
     * Define el valor de la propiedad accuracyLevel.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAccuracyLevel(Integer value) {
        this.accuracyLevel = value;
    }

    /**
     * Gets the value of the personRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Person }
     * 
     * 
     */
    public List<Person> getPersonRef() {
        if (personRef == null) {
            personRef = new ArrayList<Person>();
        }
        return this.personRef;
    }

    /**
     * Obtiene el valor de la propiedad fingerEarlyExit.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFingerEarlyExit() {
        return fingerEarlyExit;
    }

    /**
     * Define el valor de la propiedad fingerEarlyExit.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFingerEarlyExit(Boolean value) {
        this.fingerEarlyExit = value;
    }

    /**
     * Obtiene el valor de la propiedad fingerDetailedInfoMatching.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFingerDetailedInfoMatching() {
        return fingerDetailedInfoMatching;
    }

    /**
     * Define el valor de la propiedad fingerDetailedInfoMatching.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFingerDetailedInfoMatching(Boolean value) {
        this.fingerDetailedInfoMatching = value;
    }

}
