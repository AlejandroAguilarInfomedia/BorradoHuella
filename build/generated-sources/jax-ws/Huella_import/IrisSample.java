
package Huella_import;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para IrisSample complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="IrisSample"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="sampleType" type="{http://www.morpho.com/mbss/generic/wsdl}IrisDataType" minOccurs="0"/&gt;
 *         &lt;element name="irisImage11" type="{http://www.morpho.com/mbss/generic/wsdl}IrisImage11" minOccurs="0"/&gt;
 *         &lt;element name="irisImage2" type="{http://www.morpho.com/mbss/generic/wsdl}IrisImage2" minOccurs="0"/&gt;
 *         &lt;element name="templateType" type="{http://www.morpho.com/mbss/generic/wsdl}IrisDataType" minOccurs="0"/&gt;
 *         &lt;element name="irisTemplate11" type="{http://www.morpho.com/mbss/generic/wsdl}IrisTemplate11" minOccurs="0"/&gt;
 *         &lt;element name="irisTemplate2" type="{http://www.morpho.com/mbss/generic/wsdl}IrisTemplate2" minOccurs="0"/&gt;
 *         &lt;element name="reductionInfo" type="{http://www.morpho.com/mbss/generic/wsdl}IrisReductionInfo" minOccurs="0"/&gt;
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
@XmlType(name = "IrisSample", propOrder = {
    "id",
    "sampleType",
    "irisImage11",
    "irisImage2",
    "templateType",
    "irisTemplate11",
    "irisTemplate2",
    "reductionInfo",
    "userQuality",
    "mbssSampleQuality"
})
public class IrisSample {

    protected long id;
    @XmlSchemaType(name = "string")
    protected IrisDataType sampleType;
    protected IrisImage11 irisImage11;
    protected IrisImage2 irisImage2;
    @XmlSchemaType(name = "string")
    protected IrisDataType templateType;
    protected IrisTemplate11 irisTemplate11;
    protected IrisTemplate2 irisTemplate2;
    protected IrisReductionInfo reductionInfo;
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
     *     {@link IrisDataType }
     *     
     */
    public IrisDataType getSampleType() {
        return sampleType;
    }

    /**
     * Define el valor de la propiedad sampleType.
     * 
     * @param value
     *     allowed object is
     *     {@link IrisDataType }
     *     
     */
    public void setSampleType(IrisDataType value) {
        this.sampleType = value;
    }

    /**
     * Obtiene el valor de la propiedad irisImage11.
     * 
     * @return
     *     possible object is
     *     {@link IrisImage11 }
     *     
     */
    public IrisImage11 getIrisImage11() {
        return irisImage11;
    }

    /**
     * Define el valor de la propiedad irisImage11.
     * 
     * @param value
     *     allowed object is
     *     {@link IrisImage11 }
     *     
     */
    public void setIrisImage11(IrisImage11 value) {
        this.irisImage11 = value;
    }

    /**
     * Obtiene el valor de la propiedad irisImage2.
     * 
     * @return
     *     possible object is
     *     {@link IrisImage2 }
     *     
     */
    public IrisImage2 getIrisImage2() {
        return irisImage2;
    }

    /**
     * Define el valor de la propiedad irisImage2.
     * 
     * @param value
     *     allowed object is
     *     {@link IrisImage2 }
     *     
     */
    public void setIrisImage2(IrisImage2 value) {
        this.irisImage2 = value;
    }

    /**
     * Obtiene el valor de la propiedad templateType.
     * 
     * @return
     *     possible object is
     *     {@link IrisDataType }
     *     
     */
    public IrisDataType getTemplateType() {
        return templateType;
    }

    /**
     * Define el valor de la propiedad templateType.
     * 
     * @param value
     *     allowed object is
     *     {@link IrisDataType }
     *     
     */
    public void setTemplateType(IrisDataType value) {
        this.templateType = value;
    }

    /**
     * Obtiene el valor de la propiedad irisTemplate11.
     * 
     * @return
     *     possible object is
     *     {@link IrisTemplate11 }
     *     
     */
    public IrisTemplate11 getIrisTemplate11() {
        return irisTemplate11;
    }

    /**
     * Define el valor de la propiedad irisTemplate11.
     * 
     * @param value
     *     allowed object is
     *     {@link IrisTemplate11 }
     *     
     */
    public void setIrisTemplate11(IrisTemplate11 value) {
        this.irisTemplate11 = value;
    }

    /**
     * Obtiene el valor de la propiedad irisTemplate2.
     * 
     * @return
     *     possible object is
     *     {@link IrisTemplate2 }
     *     
     */
    public IrisTemplate2 getIrisTemplate2() {
        return irisTemplate2;
    }

    /**
     * Define el valor de la propiedad irisTemplate2.
     * 
     * @param value
     *     allowed object is
     *     {@link IrisTemplate2 }
     *     
     */
    public void setIrisTemplate2(IrisTemplate2 value) {
        this.irisTemplate2 = value;
    }

    /**
     * Obtiene el valor de la propiedad reductionInfo.
     * 
     * @return
     *     possible object is
     *     {@link IrisReductionInfo }
     *     
     */
    public IrisReductionInfo getReductionInfo() {
        return reductionInfo;
    }

    /**
     * Define el valor de la propiedad reductionInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link IrisReductionInfo }
     *     
     */
    public void setReductionInfo(IrisReductionInfo value) {
        this.reductionInfo = value;
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
