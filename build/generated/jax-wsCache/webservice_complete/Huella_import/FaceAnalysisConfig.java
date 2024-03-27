
package Huella_import;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FaceAnalysisConfig complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FaceAnalysisConfig"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="icaoConfig" type="{http://www.morpho.com/mbss/generic/wsdl}IcaoConfig" minOccurs="0"/&gt;
 *         &lt;element name="computeBioQuality" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="detectFeaturesAndFacialInformation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="computeBackgroundColorScores" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FaceAnalysisConfig", propOrder = {
    "icaoConfig",
    "computeBioQuality",
    "detectFeaturesAndFacialInformation",
    "computeBackgroundColorScores"
})
public class FaceAnalysisConfig {

    protected IcaoConfig icaoConfig;
    protected Boolean computeBioQuality;
    protected Boolean detectFeaturesAndFacialInformation;
    protected Boolean computeBackgroundColorScores;

    /**
     * Obtiene el valor de la propiedad icaoConfig.
     * 
     * @return
     *     possible object is
     *     {@link IcaoConfig }
     *     
     */
    public IcaoConfig getIcaoConfig() {
        return icaoConfig;
    }

    /**
     * Define el valor de la propiedad icaoConfig.
     * 
     * @param value
     *     allowed object is
     *     {@link IcaoConfig }
     *     
     */
    public void setIcaoConfig(IcaoConfig value) {
        this.icaoConfig = value;
    }

    /**
     * Obtiene el valor de la propiedad computeBioQuality.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isComputeBioQuality() {
        return computeBioQuality;
    }

    /**
     * Define el valor de la propiedad computeBioQuality.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setComputeBioQuality(Boolean value) {
        this.computeBioQuality = value;
    }

    /**
     * Obtiene el valor de la propiedad detectFeaturesAndFacialInformation.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDetectFeaturesAndFacialInformation() {
        return detectFeaturesAndFacialInformation;
    }

    /**
     * Define el valor de la propiedad detectFeaturesAndFacialInformation.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDetectFeaturesAndFacialInformation(Boolean value) {
        this.detectFeaturesAndFacialInformation = value;
    }

    /**
     * Obtiene el valor de la propiedad computeBackgroundColorScores.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isComputeBackgroundColorScores() {
        return computeBackgroundColorScores;
    }

    /**
     * Define el valor de la propiedad computeBackgroundColorScores.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setComputeBackgroundColorScores(Boolean value) {
        this.computeBackgroundColorScores = value;
    }

}
