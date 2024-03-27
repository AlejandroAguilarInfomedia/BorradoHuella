
package Huella_import;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PedestrianGenderAnalysisResult complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PedestrianGenderAnalysisResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="maleGenderProbability" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="femaleGenderProbability" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PedestrianGenderAnalysisResult", propOrder = {
    "maleGenderProbability",
    "femaleGenderProbability"
})
public class PedestrianGenderAnalysisResult {

    protected Float maleGenderProbability;
    protected Float femaleGenderProbability;

    /**
     * Obtiene el valor de la propiedad maleGenderProbability.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaleGenderProbability() {
        return maleGenderProbability;
    }

    /**
     * Define el valor de la propiedad maleGenderProbability.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaleGenderProbability(Float value) {
        this.maleGenderProbability = value;
    }

    /**
     * Obtiene el valor de la propiedad femaleGenderProbability.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getFemaleGenderProbability() {
        return femaleGenderProbability;
    }

    /**
     * Define el valor de la propiedad femaleGenderProbability.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setFemaleGenderProbability(Float value) {
        this.femaleGenderProbability = value;
    }

}
