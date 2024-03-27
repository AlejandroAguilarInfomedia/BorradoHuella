
package Huella_import;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EncodePersonRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EncodePersonRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basicRequest" type="{http://www.morpho.com/mbss/generic/wsdl}BasicRequest"/&gt;
 *         &lt;element name="person" type="{http://www.morpho.com/mbss/generic/wsdl}Person"/&gt;
 *         &lt;element name="encodeLevel" type="{http://www.morpho.com/mbss/generic/wsdl}EncodeLevel" minOccurs="0"/&gt;
 *         &lt;element name="accuracyLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="juvenilePrintMode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="computeICBQualityPrint" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="alteredFingerPrint" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="computeNfiq" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="keepImages" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="computeNfiq2" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="alteredFingerPrint2" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="computeGenderMale" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="computeGlasses" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="computeAge" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="computeFaceness" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="computeFacialHairInfo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="faceAnalysisConfig" type="{http://www.morpho.com/mbss/generic/wsdl}FaceAnalysisConfig" minOccurs="0"/&gt;
 *         &lt;element name="computeSurgicalMask" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="computeFingerprintLiveness" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="computeFaceLiveness" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="computeParallelMinutiaeQuality" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="pedestrianAnalysisConfig" type="{http://www.morpho.com/mbss/generic/wsdl}PedestrianAnalysisConfig" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EncodePersonRequest", propOrder = {
    "basicRequest",
    "person",
    "encodeLevel",
    "accuracyLevel",
    "juvenilePrintMode",
    "computeICBQualityPrint",
    "alteredFingerPrint",
    "computeNfiq",
    "keepImages",
    "computeNfiq2",
    "alteredFingerPrint2",
    "computeGenderMale",
    "computeGlasses",
    "computeAge",
    "computeFaceness",
    "computeFacialHairInfo",
    "faceAnalysisConfig",
    "computeSurgicalMask",
    "computeFingerprintLiveness",
    "computeFaceLiveness",
    "computeParallelMinutiaeQuality",
    "pedestrianAnalysisConfig"
})
public class EncodePersonRequest {

    @XmlElement(required = true)
    protected BasicRequest basicRequest;
    @XmlElement(required = true)
    protected Person person;
    @XmlSchemaType(name = "string")
    protected EncodeLevel encodeLevel;
    protected Integer accuracyLevel;
    protected Boolean juvenilePrintMode;
    protected Boolean computeICBQualityPrint;
    protected Boolean alteredFingerPrint;
    protected Boolean computeNfiq;
    protected Boolean keepImages;
    protected Boolean computeNfiq2;
    protected Boolean alteredFingerPrint2;
    protected Boolean computeGenderMale;
    protected Boolean computeGlasses;
    protected Boolean computeAge;
    protected Boolean computeFaceness;
    protected Boolean computeFacialHairInfo;
    protected FaceAnalysisConfig faceAnalysisConfig;
    protected Boolean computeSurgicalMask;
    protected Boolean computeFingerprintLiveness;
    protected Boolean computeFaceLiveness;
    protected Boolean computeParallelMinutiaeQuality;
    protected PedestrianAnalysisConfig pedestrianAnalysisConfig;

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
     * Obtiene el valor de la propiedad person.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getPerson() {
        return person;
    }

    /**
     * Define el valor de la propiedad person.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setPerson(Person value) {
        this.person = value;
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
     * Obtiene el valor de la propiedad juvenilePrintMode.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isJuvenilePrintMode() {
        return juvenilePrintMode;
    }

    /**
     * Define el valor de la propiedad juvenilePrintMode.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setJuvenilePrintMode(Boolean value) {
        this.juvenilePrintMode = value;
    }

    /**
     * Obtiene el valor de la propiedad computeICBQualityPrint.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isComputeICBQualityPrint() {
        return computeICBQualityPrint;
    }

    /**
     * Define el valor de la propiedad computeICBQualityPrint.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setComputeICBQualityPrint(Boolean value) {
        this.computeICBQualityPrint = value;
    }

    /**
     * Obtiene el valor de la propiedad alteredFingerPrint.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAlteredFingerPrint() {
        return alteredFingerPrint;
    }

    /**
     * Define el valor de la propiedad alteredFingerPrint.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlteredFingerPrint(Boolean value) {
        this.alteredFingerPrint = value;
    }

    /**
     * Obtiene el valor de la propiedad computeNfiq.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isComputeNfiq() {
        return computeNfiq;
    }

    /**
     * Define el valor de la propiedad computeNfiq.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setComputeNfiq(Boolean value) {
        this.computeNfiq = value;
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
     * Obtiene el valor de la propiedad computeNfiq2.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isComputeNfiq2() {
        return computeNfiq2;
    }

    /**
     * Define el valor de la propiedad computeNfiq2.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setComputeNfiq2(Boolean value) {
        this.computeNfiq2 = value;
    }

    /**
     * Obtiene el valor de la propiedad alteredFingerPrint2.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAlteredFingerPrint2() {
        return alteredFingerPrint2;
    }

    /**
     * Define el valor de la propiedad alteredFingerPrint2.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlteredFingerPrint2(Boolean value) {
        this.alteredFingerPrint2 = value;
    }

    /**
     * Obtiene el valor de la propiedad computeGenderMale.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isComputeGenderMale() {
        return computeGenderMale;
    }

    /**
     * Define el valor de la propiedad computeGenderMale.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setComputeGenderMale(Boolean value) {
        this.computeGenderMale = value;
    }

    /**
     * Obtiene el valor de la propiedad computeGlasses.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isComputeGlasses() {
        return computeGlasses;
    }

    /**
     * Define el valor de la propiedad computeGlasses.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setComputeGlasses(Boolean value) {
        this.computeGlasses = value;
    }

    /**
     * Obtiene el valor de la propiedad computeAge.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isComputeAge() {
        return computeAge;
    }

    /**
     * Define el valor de la propiedad computeAge.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setComputeAge(Boolean value) {
        this.computeAge = value;
    }

    /**
     * Obtiene el valor de la propiedad computeFaceness.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isComputeFaceness() {
        return computeFaceness;
    }

    /**
     * Define el valor de la propiedad computeFaceness.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setComputeFaceness(Boolean value) {
        this.computeFaceness = value;
    }

    /**
     * Obtiene el valor de la propiedad computeFacialHairInfo.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isComputeFacialHairInfo() {
        return computeFacialHairInfo;
    }

    /**
     * Define el valor de la propiedad computeFacialHairInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setComputeFacialHairInfo(Boolean value) {
        this.computeFacialHairInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad faceAnalysisConfig.
     * 
     * @return
     *     possible object is
     *     {@link FaceAnalysisConfig }
     *     
     */
    public FaceAnalysisConfig getFaceAnalysisConfig() {
        return faceAnalysisConfig;
    }

    /**
     * Define el valor de la propiedad faceAnalysisConfig.
     * 
     * @param value
     *     allowed object is
     *     {@link FaceAnalysisConfig }
     *     
     */
    public void setFaceAnalysisConfig(FaceAnalysisConfig value) {
        this.faceAnalysisConfig = value;
    }

    /**
     * Obtiene el valor de la propiedad computeSurgicalMask.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isComputeSurgicalMask() {
        return computeSurgicalMask;
    }

    /**
     * Define el valor de la propiedad computeSurgicalMask.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setComputeSurgicalMask(Boolean value) {
        this.computeSurgicalMask = value;
    }

    /**
     * Obtiene el valor de la propiedad computeFingerprintLiveness.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isComputeFingerprintLiveness() {
        return computeFingerprintLiveness;
    }

    /**
     * Define el valor de la propiedad computeFingerprintLiveness.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setComputeFingerprintLiveness(Boolean value) {
        this.computeFingerprintLiveness = value;
    }

    /**
     * Obtiene el valor de la propiedad computeFaceLiveness.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isComputeFaceLiveness() {
        return computeFaceLiveness;
    }

    /**
     * Define el valor de la propiedad computeFaceLiveness.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setComputeFaceLiveness(Boolean value) {
        this.computeFaceLiveness = value;
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

    /**
     * Obtiene el valor de la propiedad pedestrianAnalysisConfig.
     * 
     * @return
     *     possible object is
     *     {@link PedestrianAnalysisConfig }
     *     
     */
    public PedestrianAnalysisConfig getPedestrianAnalysisConfig() {
        return pedestrianAnalysisConfig;
    }

    /**
     * Define el valor de la propiedad pedestrianAnalysisConfig.
     * 
     * @param value
     *     allowed object is
     *     {@link PedestrianAnalysisConfig }
     *     
     */
    public void setPedestrianAnalysisConfig(PedestrianAnalysisConfig value) {
        this.pedestrianAnalysisConfig = value;
    }

}
