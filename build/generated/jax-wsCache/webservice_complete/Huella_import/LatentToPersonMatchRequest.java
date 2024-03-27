
package Huella_import;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para LatentToPersonMatchRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="LatentToPersonMatchRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basicRequest" type="{http://www.morpho.com/mbss/generic/wsdl}BasicRequest"/&gt;
 *         &lt;element name="latentPrint" type="{http://www.morpho.com/mbss/generic/wsdl}LatentPrint"/&gt;
 *         &lt;element name="accuracyLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="referenceId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="juvenilePrintMode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
@XmlType(name = "LatentToPersonMatchRequest", propOrder = {
    "basicRequest",
    "latentPrint",
    "accuracyLevel",
    "referenceId",
    "juvenilePrintMode",
    "missanalysisId"
})
public class LatentToPersonMatchRequest {

    @XmlElement(required = true)
    protected BasicRequest basicRequest;
    @XmlElement(required = true)
    protected LatentPrint latentPrint;
    protected Integer accuracyLevel;
    protected List<String> referenceId;
    protected Boolean juvenilePrintMode;
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
     * Obtiene el valor de la propiedad latentPrint.
     * 
     * @return
     *     possible object is
     *     {@link LatentPrint }
     *     
     */
    public LatentPrint getLatentPrint() {
        return latentPrint;
    }

    /**
     * Define el valor de la propiedad latentPrint.
     * 
     * @param value
     *     allowed object is
     *     {@link LatentPrint }
     *     
     */
    public void setLatentPrint(LatentPrint value) {
        this.latentPrint = value;
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
     * Obtiene el valor de la propiedad juvenilePrintMode.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isJuvenilePrintMode() {
        return juvenilePrintMode;
    }

    /**
     * Define el valor de la propiedad juvenilePrintMode.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setJuvenilePrintMode(Boolean value) {
        this.juvenilePrintMode = value;
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
