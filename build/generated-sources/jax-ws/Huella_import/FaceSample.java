
package Huella_import;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FaceSample complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FaceSample"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="sampleType" type="{http://www.morpho.com/mbss/generic/wsdl}FaceSampleType" minOccurs="0"/&gt;
 *         &lt;element name="stillImage" type="{http://www.morpho.com/mbss/generic/wsdl}StillImage" minOccurs="0"/&gt;
 *         &lt;element name="video" type="{http://www.morpho.com/mbss/generic/wsdl}Video" minOccurs="0"/&gt;
 *         &lt;element name="template" type="{http://www.morpho.com/mbss/generic/wsdl}Template" minOccurs="0"/&gt;
 *         &lt;element name="eyePositions" type="{http://www.morpho.com/mbss/generic/wsdl}EyePositions" minOccurs="0"/&gt;
 *         &lt;element name="userQuality" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="mbssSampleQuality" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FaceSample", propOrder = {
    "id",
    "sampleType",
    "stillImage",
    "video",
    "template",
    "eyePositions",
    "userQuality",
    "mbssSampleQuality"
})
public class FaceSample {

    protected long id;
    @XmlSchemaType(name = "string")
    protected FaceSampleType sampleType;
    protected StillImage stillImage;
    protected Video video;
    protected Template template;
    protected EyePositions eyePositions;
    protected Integer userQuality;
    protected Double mbssSampleQuality;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad sampleType.
     * 
     * @return
     *     possible object is
     *     {@link FaceSampleType }
     *     
     */
    public FaceSampleType getSampleType() {
        return sampleType;
    }

    /**
     * Define el valor de la propiedad sampleType.
     * 
     * @param value
     *     allowed object is
     *     {@link FaceSampleType }
     *     
     */
    public void setSampleType(FaceSampleType value) {
        this.sampleType = value;
    }

    /**
     * Obtiene el valor de la propiedad stillImage.
     * 
     * @return
     *     possible object is
     *     {@link StillImage }
     *     
     */
    public StillImage getStillImage() {
        return stillImage;
    }

    /**
     * Define el valor de la propiedad stillImage.
     * 
     * @param value
     *     allowed object is
     *     {@link StillImage }
     *     
     */
    public void setStillImage(StillImage value) {
        this.stillImage = value;
    }

    /**
     * Obtiene el valor de la propiedad video.
     * 
     * @return
     *     possible object is
     *     {@link Video }
     *     
     */
    public Video getVideo() {
        return video;
    }

    /**
     * Define el valor de la propiedad video.
     * 
     * @param value
     *     allowed object is
     *     {@link Video }
     *     
     */
    public void setVideo(Video value) {
        this.video = value;
    }

    /**
     * Obtiene el valor de la propiedad template.
     * 
     * @return
     *     possible object is
     *     {@link Template }
     *     
     */
    public Template getTemplate() {
        return template;
    }

    /**
     * Define el valor de la propiedad template.
     * 
     * @param value
     *     allowed object is
     *     {@link Template }
     *     
     */
    public void setTemplate(Template value) {
        this.template = value;
    }

    /**
     * Obtiene el valor de la propiedad eyePositions.
     * 
     * @return
     *     possible object is
     *     {@link EyePositions }
     *     
     */
    public EyePositions getEyePositions() {
        return eyePositions;
    }

    /**
     * Define el valor de la propiedad eyePositions.
     * 
     * @param value
     *     allowed object is
     *     {@link EyePositions }
     *     
     */
    public void setEyePositions(EyePositions value) {
        this.eyePositions = value;
    }

    /**
     * Obtiene el valor de la propiedad userQuality.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUserQuality() {
        return userQuality;
    }

    /**
     * Define el valor de la propiedad userQuality.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUserQuality(Integer value) {
        this.userQuality = value;
    }

    /**
     * Obtiene el valor de la propiedad mbssSampleQuality.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMbssSampleQuality() {
        return mbssSampleQuality;
    }

    /**
     * Define el valor de la propiedad mbssSampleQuality.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMbssSampleQuality(Double value) {
        this.mbssSampleQuality = value;
    }

}
