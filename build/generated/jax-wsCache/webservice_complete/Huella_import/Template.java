
package Huella_import;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Template complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Template"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="buffer" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="format" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="templateFormat" type="{http://www.morpho.com/mbss/generic/wsdl}TemplateFormatType" minOccurs="0"/&gt;
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="quality" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="qualityScores" type="{http://www.morpho.com/mbss/generic/wsdl}QualityScore" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="bufferAN2" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="softBiometricScores" type="{http://www.morpho.com/mbss/generic/wsdl}SoftBiometricScores" minOccurs="0"/&gt;
 *         &lt;element name="faceAnalysisResult" type="{http://www.morpho.com/mbss/generic/wsdl}FaceAnalysisResult" minOccurs="0"/&gt;
 *         &lt;element name="isAlive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="pedestrianAnalysisResult" type="{http://www.morpho.com/mbss/generic/wsdl}PedestrianAnalysisResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Template", propOrder = {
    "buffer",
    "format",
    "templateFormat",
    "version",
    "quality",
    "qualityScores",
    "bufferAN2",
    "softBiometricScores",
    "faceAnalysisResult",
    "isAlive",
    "pedestrianAnalysisResult"
})
public class Template {

    protected byte[] buffer;
    protected String format;
    @XmlSchemaType(name = "string")
    protected TemplateFormatType templateFormat;
    protected String version;
    protected Integer quality;
    protected List<QualityScore> qualityScores;
    protected byte[] bufferAN2;
    protected SoftBiometricScores softBiometricScores;
    protected FaceAnalysisResult faceAnalysisResult;
    protected Boolean isAlive;
    protected PedestrianAnalysisResult pedestrianAnalysisResult;

    /**
     * Obtiene el valor de la propiedad buffer.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getBuffer() {
        return buffer;
    }

    /**
     * Define el valor de la propiedad buffer.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setBuffer(byte[] value) {
        this.buffer = value;
    }

    /**
     * Obtiene el valor de la propiedad format.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormat() {
        return format;
    }

    /**
     * Define el valor de la propiedad format.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormat(String value) {
        this.format = value;
    }

    /**
     * Obtiene el valor de la propiedad templateFormat.
     * 
     * @return
     *     possible object is
     *     {@link TemplateFormatType }
     *     
     */
    public TemplateFormatType getTemplateFormat() {
        return templateFormat;
    }

    /**
     * Define el valor de la propiedad templateFormat.
     * 
     * @param value
     *     allowed object is
     *     {@link TemplateFormatType }
     *     
     */
    public void setTemplateFormat(TemplateFormatType value) {
        this.templateFormat = value;
    }

    /**
     * Obtiene el valor de la propiedad version.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Define el valor de la propiedad version.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Obtiene el valor de la propiedad quality.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuality() {
        return quality;
    }

    /**
     * Define el valor de la propiedad quality.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuality(Integer value) {
        this.quality = value;
    }

    /**
     * Gets the value of the qualityScores property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qualityScores property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQualityScores().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QualityScore }
     * 
     * 
     */
    public List<QualityScore> getQualityScores() {
        if (qualityScores == null) {
            qualityScores = new ArrayList<QualityScore>();
        }
        return this.qualityScores;
    }

    /**
     * Obtiene el valor de la propiedad bufferAN2.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getBufferAN2() {
        return bufferAN2;
    }

    /**
     * Define el valor de la propiedad bufferAN2.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setBufferAN2(byte[] value) {
        this.bufferAN2 = value;
    }

    /**
     * Obtiene el valor de la propiedad softBiometricScores.
     * 
     * @return
     *     possible object is
     *     {@link SoftBiometricScores }
     *     
     */
    public SoftBiometricScores getSoftBiometricScores() {
        return softBiometricScores;
    }

    /**
     * Define el valor de la propiedad softBiometricScores.
     * 
     * @param value
     *     allowed object is
     *     {@link SoftBiometricScores }
     *     
     */
    public void setSoftBiometricScores(SoftBiometricScores value) {
        this.softBiometricScores = value;
    }

    /**
     * Obtiene el valor de la propiedad faceAnalysisResult.
     * 
     * @return
     *     possible object is
     *     {@link FaceAnalysisResult }
     *     
     */
    public FaceAnalysisResult getFaceAnalysisResult() {
        return faceAnalysisResult;
    }

    /**
     * Define el valor de la propiedad faceAnalysisResult.
     * 
     * @param value
     *     allowed object is
     *     {@link FaceAnalysisResult }
     *     
     */
    public void setFaceAnalysisResult(FaceAnalysisResult value) {
        this.faceAnalysisResult = value;
    }

    /**
     * Obtiene el valor de la propiedad isAlive.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAlive() {
        return isAlive;
    }

    /**
     * Define el valor de la propiedad isAlive.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAlive(Boolean value) {
        this.isAlive = value;
    }

    /**
     * Obtiene el valor de la propiedad pedestrianAnalysisResult.
     * 
     * @return
     *     possible object is
     *     {@link PedestrianAnalysisResult }
     *     
     */
    public PedestrianAnalysisResult getPedestrianAnalysisResult() {
        return pedestrianAnalysisResult;
    }

    /**
     * Define el valor de la propiedad pedestrianAnalysisResult.
     * 
     * @param value
     *     allowed object is
     *     {@link PedestrianAnalysisResult }
     *     
     */
    public void setPedestrianAnalysisResult(PedestrianAnalysisResult value) {
        this.pedestrianAnalysisResult = value;
    }

}
