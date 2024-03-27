
package Huella_import;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EncodeLatentRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EncodeLatentRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basicRequest" type="{http://www.morpho.com/mbss/generic/wsdl}BasicRequest"/&gt;
 *         &lt;element name="latentPrint" type="{http://www.morpho.com/mbss/generic/wsdl}LatentPrint"/&gt;
 *         &lt;element name="encodeLevel" type="{http://www.morpho.com/mbss/generic/wsdl}EncodeLevel" minOccurs="0"/&gt;
 *         &lt;element name="accuracyLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="keepImages" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="computeParallelMinutiaeQuality" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EncodeLatentRequest", propOrder = {
    "basicRequest",
    "latentPrint",
    "encodeLevel",
    "accuracyLevel",
    "keepImages",
    "computeParallelMinutiaeQuality"
})
public class EncodeLatentRequest {

    @XmlElement(required = true)
    protected BasicRequest basicRequest;
    @XmlElement(required = true)
    protected LatentPrint latentPrint;
    @XmlSchemaType(name = "string")
    protected EncodeLevel encodeLevel;
    protected Integer accuracyLevel;
    protected Boolean keepImages;
    protected Boolean computeParallelMinutiaeQuality;

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
     * Obtiene el valor de la propiedad encodeLevel.
     * 
     * @return
     *     possible object is
     *     {@link EncodeLevel }
     *     
     */
    public EncodeLevel getEncodeLevel() {
        return encodeLevel;
    }

    /**
     * Define el valor de la propiedad encodeLevel.
     * 
     * @param value
     *     allowed object is
     *     {@link EncodeLevel }
     *     
     */
    public void setEncodeLevel(EncodeLevel value) {
        this.encodeLevel = value;
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
     * Obtiene el valor de la propiedad keepImages.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKeepImages() {
        return keepImages;
    }

    /**
     * Define el valor de la propiedad keepImages.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKeepImages(Boolean value) {
        this.keepImages = value;
    }

    /**
     * Obtiene el valor de la propiedad computeParallelMinutiaeQuality.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isComputeParallelMinutiaeQuality() {
        return computeParallelMinutiaeQuality;
    }

    /**
     * Define el valor de la propiedad computeParallelMinutiaeQuality.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setComputeParallelMinutiaeQuality(Boolean value) {
        this.computeParallelMinutiaeQuality = value;
    }

}
