
package Huella_import;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FaceAnalysisResult complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FaceAnalysisResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="icaoScores" type="{http://www.morpho.com/mbss/generic/wsdl}IcaoScores" minOccurs="0"/&gt;
 *         &lt;element name="bioQuality" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="featurePoints" type="{http://www.morpho.com/mbss/generic/wsdl}FeaturePoints" minOccurs="0"/&gt;
 *         &lt;element name="facialInformation" type="{http://www.morpho.com/mbss/generic/wsdl}FacialInformation" minOccurs="0"/&gt;
 *         &lt;element name="backgroundColorScores" type="{http://www.morpho.com/mbss/generic/wsdl}BackgroundColorScores" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FaceAnalysisResult", propOrder = {
    "icaoScores",
    "bioQuality",
    "featurePoints",
    "facialInformation",
    "backgroundColorScores"
})
public class FaceAnalysisResult {

    protected IcaoScores icaoScores;
    protected Integer bioQuality;
    protected FeaturePoints featurePoints;
    protected FacialInformation facialInformation;
    protected BackgroundColorScores backgroundColorScores;

    /**
     * Obtiene el valor de la propiedad icaoScores.
     * 
     * @return
     *     possible object is
     *     {@link IcaoScores }
     *     
     */
    public IcaoScores getIcaoScores() {
        return icaoScores;
    }

    /**
     * Define el valor de la propiedad icaoScores.
     * 
     * @param value
     *     allowed object is
     *     {@link IcaoScores }
     *     
     */
    public void setIcaoScores(IcaoScores value) {
        this.icaoScores = value;
    }

    /**
     * Obtiene el valor de la propiedad bioQuality.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBioQuality() {
        return bioQuality;
    }

    /**
     * Define el valor de la propiedad bioQuality.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBioQuality(Integer value) {
        this.bioQuality = value;
    }

    /**
     * Obtiene el valor de la propiedad featurePoints.
     * 
     * @return
     *     possible object is
     *     {@link FeaturePoints }
     *     
     */
    public FeaturePoints getFeaturePoints() {
        return featurePoints;
    }

    /**
     * Define el valor de la propiedad featurePoints.
     * 
     * @param value
     *     allowed object is
     *     {@link FeaturePoints }
     *     
     */
    public void setFeaturePoints(FeaturePoints value) {
        this.featurePoints = value;
    }

    /**
     * Obtiene el valor de la propiedad facialInformation.
     * 
     * @return
     *     possible object is
     *     {@link FacialInformation }
     *     
     */
    public FacialInformation getFacialInformation() {
        return facialInformation;
    }

    /**
     * Define el valor de la propiedad facialInformation.
     * 
     * @param value
     *     allowed object is
     *     {@link FacialInformation }
     *     
     */
    public void setFacialInformation(FacialInformation value) {
        this.facialInformation = value;
    }

    /**
     * Obtiene el valor de la propiedad backgroundColorScores.
     * 
     * @return
     *     possible object is
     *     {@link BackgroundColorScores }
     *     
     */
    public BackgroundColorScores getBackgroundColorScores() {
        return backgroundColorScores;
    }

    /**
     * Define el valor de la propiedad backgroundColorScores.
     * 
     * @param value
     *     allowed object is
     *     {@link BackgroundColorScores }
     *     
     */
    public void setBackgroundColorScores(BackgroundColorScores value) {
        this.backgroundColorScores = value;
    }

}
