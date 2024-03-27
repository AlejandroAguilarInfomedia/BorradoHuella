
package Huella_import;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PalmprintSample complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PalmprintSample"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="sampleType" type="{http://www.morpho.com/mbss/generic/wsdl}PalmprintSampleType"/&gt;
 *         &lt;element name="splitHand" type="{http://www.morpho.com/mbss/generic/wsdl}SplitHand" minOccurs="0"/&gt;
 *         &lt;element name="fullHand" type="{http://www.morpho.com/mbss/generic/wsdl}FullHand" minOccurs="0"/&gt;
 *         &lt;element name="templates" type="{http://www.morpho.com/mbss/generic/wsdl}PalmprintTemplates" minOccurs="0"/&gt;
 *         &lt;element name="segments" type="{http://www.morpho.com/mbss/generic/wsdl}PalmprintSegments" minOccurs="0"/&gt;
 *         &lt;element name="userQuality" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="fingerPrintTemplates" type="{http://www.morpho.com/mbss/generic/wsdl}FingerprintTemplates" minOccurs="0"/&gt;
 *         &lt;element name="fingerPrintSegments" type="{http://www.morpho.com/mbss/generic/wsdl}FingerprintSegments" minOccurs="0"/&gt;
 *         &lt;element name="mbssPalmprintSampleQuality" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="mbssFingerprintSampleQuality" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PalmprintSample", propOrder = {
    "id",
    "sampleType",
    "splitHand",
    "fullHand",
    "templates",
    "segments",
    "userQuality",
    "fingerPrintTemplates",
    "fingerPrintSegments",
    "mbssPalmprintSampleQuality",
    "mbssFingerprintSampleQuality"
})
public class PalmprintSample {

    protected long id;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected PalmprintSampleType sampleType;
    protected SplitHand splitHand;
    protected FullHand fullHand;
    protected PalmprintTemplates templates;
    protected PalmprintSegments segments;
    protected Integer userQuality;
    protected FingerprintTemplates fingerPrintTemplates;
    protected FingerprintSegments fingerPrintSegments;
    protected Double mbssPalmprintSampleQuality;
    protected Double mbssFingerprintSampleQuality;

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
     *     {@link PalmprintSampleType }
     *     
     */
    public PalmprintSampleType getSampleType() {
        return sampleType;
    }

    /**
     * Define el valor de la propiedad sampleType.
     * 
     * @param value
     *     allowed object is
     *     {@link PalmprintSampleType }
     *     
     */
    public void setSampleType(PalmprintSampleType value) {
        this.sampleType = value;
    }

    /**
     * Obtiene el valor de la propiedad splitHand.
     * 
     * @return
     *     possible object is
     *     {@link SplitHand }
     *     
     */
    public SplitHand getSplitHand() {
        return splitHand;
    }

    /**
     * Define el valor de la propiedad splitHand.
     * 
     * @param value
     *     allowed object is
     *     {@link SplitHand }
     *     
     */
    public void setSplitHand(SplitHand value) {
        this.splitHand = value;
    }

    /**
     * Obtiene el valor de la propiedad fullHand.
     * 
     * @return
     *     possible object is
     *     {@link FullHand }
     *     
     */
    public FullHand getFullHand() {
        return fullHand;
    }

    /**
     * Define el valor de la propiedad fullHand.
     * 
     * @param value
     *     allowed object is
     *     {@link FullHand }
     *     
     */
    public void setFullHand(FullHand value) {
        this.fullHand = value;
    }

    /**
     * Obtiene el valor de la propiedad templates.
     * 
     * @return
     *     possible object is
     *     {@link PalmprintTemplates }
     *     
     */
    public PalmprintTemplates getTemplates() {
        return templates;
    }

    /**
     * Define el valor de la propiedad templates.
     * 
     * @param value
     *     allowed object is
     *     {@link PalmprintTemplates }
     *     
     */
    public void setTemplates(PalmprintTemplates value) {
        this.templates = value;
    }

    /**
     * Obtiene el valor de la propiedad segments.
     * 
     * @return
     *     possible object is
     *     {@link PalmprintSegments }
     *     
     */
    public PalmprintSegments getSegments() {
        return segments;
    }

    /**
     * Define el valor de la propiedad segments.
     * 
     * @param value
     *     allowed object is
     *     {@link PalmprintSegments }
     *     
     */
    public void setSegments(PalmprintSegments value) {
        this.segments = value;
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
     * Obtiene el valor de la propiedad fingerPrintTemplates.
     * 
     * @return
     *     possible object is
     *     {@link FingerprintTemplates }
     *     
     */
    public FingerprintTemplates getFingerPrintTemplates() {
        return fingerPrintTemplates;
    }

    /**
     * Define el valor de la propiedad fingerPrintTemplates.
     * 
     * @param value
     *     allowed object is
     *     {@link FingerprintTemplates }
     *     
     */
    public void setFingerPrintTemplates(FingerprintTemplates value) {
        this.fingerPrintTemplates = value;
    }

    /**
     * Obtiene el valor de la propiedad fingerPrintSegments.
     * 
     * @return
     *     possible object is
     *     {@link FingerprintSegments }
     *     
     */
    public FingerprintSegments getFingerPrintSegments() {
        return fingerPrintSegments;
    }

    /**
     * Define el valor de la propiedad fingerPrintSegments.
     * 
     * @param value
     *     allowed object is
     *     {@link FingerprintSegments }
     *     
     */
    public void setFingerPrintSegments(FingerprintSegments value) {
        this.fingerPrintSegments = value;
    }

    /**
     * Obtiene el valor de la propiedad mbssPalmprintSampleQuality.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMbssPalmprintSampleQuality() {
        return mbssPalmprintSampleQuality;
    }

    /**
     * Define el valor de la propiedad mbssPalmprintSampleQuality.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMbssPalmprintSampleQuality(Double value) {
        this.mbssPalmprintSampleQuality = value;
    }

    /**
     * Obtiene el valor de la propiedad mbssFingerprintSampleQuality.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMbssFingerprintSampleQuality() {
        return mbssFingerprintSampleQuality;
    }

    /**
     * Define el valor de la propiedad mbssFingerprintSampleQuality.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMbssFingerprintSampleQuality(Double value) {
        this.mbssFingerprintSampleQuality = value;
    }

}
