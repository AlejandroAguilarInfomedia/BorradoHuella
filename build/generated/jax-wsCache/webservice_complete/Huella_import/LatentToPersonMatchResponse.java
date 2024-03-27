
package Huella_import;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para LatentToPersonMatchResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="LatentToPersonMatchResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basicResponse" type="{http://www.morpho.com/mbss/generic/wsdl}BasicResponse"/&gt;
 *         &lt;element name="candidate" type="{http://www.morpho.com/mbss/generic/wsdl}Candidate" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="noHitRank" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="missAnalysis" type="{http://www.morpho.com/mbss/generic/wsdl}MissAnalysis" minOccurs="0"/&gt;
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
@XmlType(name = "LatentToPersonMatchResponse", propOrder = {
    "basicResponse",
    "candidate",
    "noHitRank",
    "missAnalysis",
    "error"
})
public class LatentToPersonMatchResponse {

    @XmlElement(required = true)
    protected BasicResponse basicResponse;
    protected List<Candidate> candidate;
    protected Integer noHitRank;
    protected MissAnalysis missAnalysis;
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
     * Gets the value of the candidate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the candidate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCandidate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Candidate }
     * 
     * 
     */
    public List<Candidate> getCandidate() {
        if (candidate == null) {
            candidate = new ArrayList<Candidate>();
        }
        return this.candidate;
    }

    /**
     * Obtiene el valor de la propiedad noHitRank.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNoHitRank() {
        return noHitRank;
    }

    /**
     * Define el valor de la propiedad noHitRank.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNoHitRank(Integer value) {
        this.noHitRank = value;
    }

    /**
     * Obtiene el valor de la propiedad missAnalysis.
     * 
     * @return
     *     possible object is
     *     {@link MissAnalysis }
     *     
     */
    public MissAnalysis getMissAnalysis() {
        return missAnalysis;
    }

    /**
     * Define el valor de la propiedad missAnalysis.
     * 
     * @param value
     *     allowed object is
     *     {@link MissAnalysis }
     *     
     */
    public void setMissAnalysis(MissAnalysis value) {
        this.missAnalysis = value;
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
