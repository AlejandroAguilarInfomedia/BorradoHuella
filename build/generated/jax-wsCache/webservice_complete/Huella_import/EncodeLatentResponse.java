
package Huella_import;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EncodeLatentResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EncodeLatentResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basicResponse" type="{http://www.morpho.com/mbss/generic/wsdl}BasicResponse"/&gt;
 *         &lt;element name="latentPrint" type="{http://www.morpho.com/mbss/generic/wsdl}LatentPrint" minOccurs="0"/&gt;
 *         &lt;element name="error" type="{http://www.morpho.com/mbss/generic/wsdl}EncodeError" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="encodeLevel" type="{http://www.morpho.com/mbss/generic/wsdl}EncodeLevel" minOccurs="0"/&gt;
 *         &lt;element name="coderParameters" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="segmentationResult" type="{http://www.morpho.com/mbss/generic/wsdl}SegmentationResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EncodeLatentResponse", propOrder = {
    "basicResponse",
    "latentPrint",
    "error",
    "encodeLevel",
    "coderParameters",
    "segmentationResult"
})
public class EncodeLatentResponse {

    @XmlElement(required = true)
    protected BasicResponse basicResponse;
    protected LatentPrint latentPrint;
    protected List<EncodeError> error;
    @XmlSchemaType(name = "string")
    protected EncodeLevel encodeLevel;
    protected String coderParameters;
    protected List<SegmentationResult> segmentationResult;

    /**
     * Obtiene el valor de la propiedad basicResponse.
     * 
     * @return
     *     possible object is
     *     {@link BasicResponse }
     *     
     */
    public BasicResponse getBasicResponse() {
        return basicResponse;
    }

    /**
     * Define el valor de la propiedad basicResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicResponse }
     *     
     */
    public void setBasicResponse(BasicResponse value) {
        this.basicResponse = value;
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
     * Gets the value of the error property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the error property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EncodeError }
     * 
     * 
     */
    public List<EncodeError> getError() {
        if (error == null) {
            error = new ArrayList<EncodeError>();
        }
        return this.error;
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
     * Obtiene el valor de la propiedad coderParameters.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoderParameters() {
        return coderParameters;
    }

    /**
     * Define el valor de la propiedad coderParameters.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoderParameters(String value) {
        this.coderParameters = value;
    }

    /**
     * Gets the value of the segmentationResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segmentationResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegmentationResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SegmentationResult }
     * 
     * 
     */
    public List<SegmentationResult> getSegmentationResult() {
        if (segmentationResult == null) {
            segmentationResult = new ArrayList<SegmentationResult>();
        }
        return this.segmentationResult;
    }

}
