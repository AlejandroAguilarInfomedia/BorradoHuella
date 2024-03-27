
package Huella_import;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PedestrianHardHatAnalysisResult complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PedestrianHardHatAnalysisResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hardHatNoneProbability" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="hardHatOnProbability" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PedestrianHardHatAnalysisResult", propOrder = {
    "hardHatNoneProbability",
    "hardHatOnProbability"
})
public class PedestrianHardHatAnalysisResult {

    protected Float hardHatNoneProbability;
    protected Float hardHatOnProbability;

    /**
     * Obtiene el valor de la propiedad hardHatNoneProbability.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getHardHatNoneProbability() {
        return hardHatNoneProbability;
    }

    /**
     * Define el valor de la propiedad hardHatNoneProbability.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setHardHatNoneProbability(Float value) {
        this.hardHatNoneProbability = value;
    }

    /**
     * Obtiene el valor de la propiedad hardHatOnProbability.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getHardHatOnProbability() {
        return hardHatOnProbability;
    }

    /**
     * Define el valor de la propiedad hardHatOnProbability.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setHardHatOnProbability(Float value) {
        this.hardHatOnProbability = value;
    }

}
