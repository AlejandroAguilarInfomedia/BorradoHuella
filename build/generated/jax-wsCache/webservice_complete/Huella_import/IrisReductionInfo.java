
package Huella_import;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para IrisReductionInfo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="IrisReductionInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="leftEyeSampleId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="rightEyeSampleId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="leftEyeQuality" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="rightEyeQuality" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IrisReductionInfo", propOrder = {
    "leftEyeSampleId",
    "rightEyeSampleId",
    "leftEyeQuality",
    "rightEyeQuality"
})
public class IrisReductionInfo {

    protected Integer leftEyeSampleId;
    protected Integer rightEyeSampleId;
    protected Integer leftEyeQuality;
    protected Integer rightEyeQuality;

    /**
     * Obtiene el valor de la propiedad leftEyeSampleId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLeftEyeSampleId() {
        return leftEyeSampleId;
    }

    /**
     * Define el valor de la propiedad leftEyeSampleId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLeftEyeSampleId(Integer value) {
        this.leftEyeSampleId = value;
    }

    /**
     * Obtiene el valor de la propiedad rightEyeSampleId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRightEyeSampleId() {
        return rightEyeSampleId;
    }

    /**
     * Define el valor de la propiedad rightEyeSampleId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRightEyeSampleId(Integer value) {
        this.rightEyeSampleId = value;
    }

    /**
     * Obtiene el valor de la propiedad leftEyeQuality.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLeftEyeQuality() {
        return leftEyeQuality;
    }

    /**
     * Define el valor de la propiedad leftEyeQuality.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLeftEyeQuality(Integer value) {
        this.leftEyeQuality = value;
    }

    /**
     * Obtiene el valor de la propiedad rightEyeQuality.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRightEyeQuality() {
        return rightEyeQuality;
    }

    /**
     * Define el valor de la propiedad rightEyeQuality.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRightEyeQuality(Integer value) {
        this.rightEyeQuality = value;
    }

}
