
package Huella_import;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FingerprintSample complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FingerprintSample"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="sampleType" type="{http://www.morpho.com/mbss/generic/wsdl}FingerprintSampleType"/&gt;
 *         &lt;element name="tenprint" type="{http://www.morpho.com/mbss/generic/wsdl}Tenprint" minOccurs="0"/&gt;
 *         &lt;element name="slap442" type="{http://www.morpho.com/mbss/generic/wsdl}Slap442" minOccurs="0"/&gt;
 *         &lt;element name="slap4411" type="{http://www.morpho.com/mbss/generic/wsdl}Slap4411" minOccurs="0"/&gt;
 *         &lt;element name="segments" type="{http://www.morpho.com/mbss/generic/wsdl}FingerprintSegments" minOccurs="0"/&gt;
 *         &lt;element name="templates" type="{http://www.morpho.com/mbss/generic/wsdl}FingerprintTemplates" minOccurs="0"/&gt;
 *         &lt;element name="mfvSegments" type="{http://www.morpho.com/mbss/generic/wsdl}MultipleFingerViewsSegments" minOccurs="0"/&gt;
 *         &lt;element name="mfvTemplates" type="{http://www.morpho.com/mbss/generic/wsdl}MultipleFingerViewsTemplates" minOccurs="0"/&gt;
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
@XmlType(name = "FingerprintSample", propOrder = {
    "id",
    "sampleType",
    "tenprint",
    "slap442",
    "slap4411",
    "segments",
    "templates",
    "mfvSegments",
    "mfvTemplates",
    "userQuality",
    "mbssSampleQuality"
})
public class FingerprintSample {

    protected long id;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected FingerprintSampleType sampleType;
    protected Tenprint tenprint;
    protected Slap442 slap442;
    protected Slap4411 slap4411;
    protected FingerprintSegments segments;
    protected FingerprintTemplates templates;
    protected MultipleFingerViewsSegments mfvSegments;
    protected MultipleFingerViewsTemplates mfvTemplates;
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
     *     {@link FingerprintSampleType }
     *     
     */
    public FingerprintSampleType getSampleType() {
        return sampleType;
    }

    /**
     * Define el valor de la propiedad sampleType.
     * 
     * @param value
     *     allowed object is
     *     {@link FingerprintSampleType }
     *     
     */
    public void setSampleType(FingerprintSampleType value) {
        this.sampleType = value;
    }

    /**
     * Obtiene el valor de la propiedad tenprint.
     * 
     * @return
     *     possible object is
     *     {@link Tenprint }
     *     
     */
    public Tenprint getTenprint() {
        return tenprint;
    }

    /**
     * Define el valor de la propiedad tenprint.
     * 
     * @param value
     *     allowed object is
     *     {@link Tenprint }
     *     
     */
    public void setTenprint(Tenprint value) {
        this.tenprint = value;
    }

    /**
     * Obtiene el valor de la propiedad slap442.
     * 
     * @return
     *     possible object is
     *     {@link Slap442 }
     *     
     */
    public Slap442 getSlap442() {
        return slap442;
    }

    /**
     * Define el valor de la propiedad slap442.
     * 
     * @param value
     *     allowed object is
     *     {@link Slap442 }
     *     
     */
    public void setSlap442(Slap442 value) {
        this.slap442 = value;
    }

    /**
     * Obtiene el valor de la propiedad slap4411.
     * 
     * @return
     *     possible object is
     *     {@link Slap4411 }
     *     
     */
    public Slap4411 getSlap4411() {
        return slap4411;
    }

    /**
     * Define el valor de la propiedad slap4411.
     * 
     * @param value
     *     allowed object is
     *     {@link Slap4411 }
     *     
     */
    public void setSlap4411(Slap4411 value) {
        this.slap4411 = value;
    }

    /**
     * Obtiene el valor de la propiedad segments.
     * 
     * @return
     *     possible object is
     *     {@link FingerprintSegments }
     *     
     */
    public FingerprintSegments getSegments() {
        return segments;
    }

    /**
     * Define el valor de la propiedad segments.
     * 
     * @param value
     *     allowed object is
     *     {@link FingerprintSegments }
     *     
     */
    public void setSegments(FingerprintSegments value) {
        this.segments = value;
    }

    /**
     * Obtiene el valor de la propiedad templates.
     * 
     * @return
     *     possible object is
     *     {@link FingerprintTemplates }
     *     
     */
    public FingerprintTemplates getTemplates() {
        return templates;
    }

    /**
     * Define el valor de la propiedad templates.
     * 
     * @param value
     *     allowed object is
     *     {@link FingerprintTemplates }
     *     
     */
    public void setTemplates(FingerprintTemplates value) {
        this.templates = value;
    }

    /**
     * Obtiene el valor de la propiedad mfvSegments.
     * 
     * @return
     *     possible object is
     *     {@link MultipleFingerViewsSegments }
     *     
     */
    public MultipleFingerViewsSegments getMfvSegments() {
        return mfvSegments;
    }

    /**
     * Define el valor de la propiedad mfvSegments.
     * 
     * @param value
     *     allowed object is
     *     {@link MultipleFingerViewsSegments }
     *     
     */
    public void setMfvSegments(MultipleFingerViewsSegments value) {
        this.mfvSegments = value;
    }

    /**
     * Obtiene el valor de la propiedad mfvTemplates.
     * 
     * @return
     *     possible object is
     *     {@link MultipleFingerViewsTemplates }
     *     
     */
    public MultipleFingerViewsTemplates getMfvTemplates() {
        return mfvTemplates;
    }

    /**
     * Define el valor de la propiedad mfvTemplates.
     * 
     * @param value
     *     allowed object is
     *     {@link MultipleFingerViewsTemplates }
     *     
     */
    public void setMfvTemplates(MultipleFingerViewsTemplates value) {
        this.mfvTemplates = value;
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
