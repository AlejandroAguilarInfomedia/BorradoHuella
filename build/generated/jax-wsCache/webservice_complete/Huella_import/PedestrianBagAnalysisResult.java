
package Huella_import;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PedestrianBagAnalysisResult complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PedestrianBagAnalysisResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="noBagProbability" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="bagOnBackProbability" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="bagInHandProbability" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="bagOnShoulderProbability" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PedestrianBagAnalysisResult", propOrder = {
    "noBagProbability",
    "bagOnBackProbability",
    "bagInHandProbability",
    "bagOnShoulderProbability"
})
public class PedestrianBagAnalysisResult {

    protected Float noBagProbability;
    protected Float bagOnBackProbability;
    protected Float bagInHandProbability;
    protected Float bagOnShoulderProbability;

    /**
     * Obtiene el valor de la propiedad noBagProbability.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getNoBagProbability() {
        return noBagProbability;
    }

    /**
     * Define el valor de la propiedad noBagProbability.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setNoBagProbability(Float value) {
        this.noBagProbability = value;
    }

    /**
     * Obtiene el valor de la propiedad bagOnBackProbability.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getBagOnBackProbability() {
        return bagOnBackProbability;
    }

    /**
     * Define el valor de la propiedad bagOnBackProbability.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setBagOnBackProbability(Float value) {
        this.bagOnBackProbability = value;
    }

    /**
     * Obtiene el valor de la propiedad bagInHandProbability.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getBagInHandProbability() {
        return bagInHandProbability;
    }

    /**
     * Define el valor de la propiedad bagInHandProbability.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setBagInHandProbability(Float value) {
        this.bagInHandProbability = value;
    }

    /**
     * Obtiene el valor de la propiedad bagOnShoulderProbability.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getBagOnShoulderProbability() {
        return bagOnShoulderProbability;
    }

    /**
     * Define el valor de la propiedad bagOnShoulderProbability.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setBagOnShoulderProbability(Float value) {
        this.bagOnShoulderProbability = value;
    }

}
