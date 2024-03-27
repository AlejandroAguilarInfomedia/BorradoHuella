
package Huella_import;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PedestrianAnalysisConfig complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PedestrianAnalysisConfig"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="performGenderAnalysis" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="performBagAnalysis" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="performColorAnalysis" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="performHardHatAnalysis" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PedestrianAnalysisConfig", propOrder = {
    "performGenderAnalysis",
    "performBagAnalysis",
    "performColorAnalysis",
    "performHardHatAnalysis"
})
public class PedestrianAnalysisConfig {

    protected Boolean performGenderAnalysis;
    protected Boolean performBagAnalysis;
    protected Boolean performColorAnalysis;
    protected Boolean performHardHatAnalysis;

    /**
     * Obtiene el valor de la propiedad performGenderAnalysis.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPerformGenderAnalysis() {
        return performGenderAnalysis;
    }

    /**
     * Define el valor de la propiedad performGenderAnalysis.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPerformGenderAnalysis(Boolean value) {
        this.performGenderAnalysis = value;
    }

    /**
     * Obtiene el valor de la propiedad performBagAnalysis.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPerformBagAnalysis() {
        return performBagAnalysis;
    }

    /**
     * Define el valor de la propiedad performBagAnalysis.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPerformBagAnalysis(Boolean value) {
        this.performBagAnalysis = value;
    }

    /**
     * Obtiene el valor de la propiedad performColorAnalysis.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPerformColorAnalysis() {
        return performColorAnalysis;
    }

    /**
     * Define el valor de la propiedad performColorAnalysis.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPerformColorAnalysis(Boolean value) {
        this.performColorAnalysis = value;
    }

    /**
     * Obtiene el valor de la propiedad performHardHatAnalysis.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPerformHardHatAnalysis() {
        return performHardHatAnalysis;
    }

    /**
     * Define el valor de la propiedad performHardHatAnalysis.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPerformHardHatAnalysis(Boolean value) {
        this.performHardHatAnalysis = value;
    }

}
