
package Huella_import;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PersonToLatentMatchRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PersonToLatentMatchRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basicRequest" type="{http://www.morpho.com/mbss/generic/wsdl}BasicRequest"/&gt;
 *         &lt;element name="person" type="{http://www.morpho.com/mbss/generic/wsdl}Person"/&gt;
 *         &lt;element name="accuracyLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="referenceId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="missanalysisId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonToLatentMatchRequest", propOrder = {
    "basicRequest",
    "person",
    "accuracyLevel",
    "referenceId",
    "missanalysisId"
})
public class PersonToLatentMatchRequest {

    @XmlElement(required = true)
    protected BasicRequest basicRequest;
    @XmlElement(required = true)
    protected Person person;
    protected Integer accuracyLevel;
    protected List<String> referenceId;
    protected List<String> missanalysisId;

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
     * Gets the value of the referenceId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referenceId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferenceId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getReferenceId() {
        if (referenceId == null) {
            referenceId = new ArrayList<String>();
        }
        return this.referenceId;
    }

    /**
     * Gets the value of the missanalysisId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the missanalysisId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMissanalysisId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMissanalysisId() {
        if (missanalysisId == null) {
            missanalysisId = new ArrayList<String>();
        }
        return this.missanalysisId;
    }

}
