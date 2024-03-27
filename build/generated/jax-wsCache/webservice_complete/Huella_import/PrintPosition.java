
package Huella_import;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PrintPosition complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PrintPosition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="handPosition" type="{http://www.morpho.com/mbss/generic/wsdl}HandPosition"/&gt;
 *         &lt;element name="fingerPosition" type="{http://www.morpho.com/mbss/generic/wsdl}FingerPosition" minOccurs="0"/&gt;
 *         &lt;element name="palmPosition" type="{http://www.morpho.com/mbss/generic/wsdl}PalmPosition" minOccurs="0"/&gt;
 *         &lt;element name="fingerprintType" type="{http://www.morpho.com/mbss/generic/wsdl}FingerprintType" minOccurs="0"/&gt;
 *         &lt;element name="acquisitionType" type="{http://www.morpho.com/mbss/generic/wsdl}AcquisitionType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrintPosition", propOrder = {
    "handPosition",
    "fingerPosition",
    "palmPosition",
    "fingerprintType",
    "acquisitionType"
})
public class PrintPosition {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected HandPosition handPosition;
    @XmlSchemaType(name = "string")
    protected FingerPosition fingerPosition;
    @XmlSchemaType(name = "string")
    protected PalmPosition palmPosition;
    @XmlSchemaType(name = "string")
    protected FingerprintType fingerprintType;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected AcquisitionType acquisitionType;

    /**
     * Obtiene el valor de la propiedad handPosition.
     * 
     * @return
     *     possible object is
     *     {@link HandPosition }
     *     
     */
    public HandPosition getHandPosition() {
        return handPosition;
    }

    /**
     * Define el valor de la propiedad handPosition.
     * 
     * @param value
     *     allowed object is
     *     {@link HandPosition }
     *     
     */
    public void setHandPosition(HandPosition value) {
        this.handPosition = value;
    }

    /**
     * Obtiene el valor de la propiedad fingerPosition.
     * 
     * @return
     *     possible object is
     *     {@link FingerPosition }
     *     
     */
    public FingerPosition getFingerPosition() {
        return fingerPosition;
    }

    /**
     * Define el valor de la propiedad fingerPosition.
     * 
     * @param value
     *     allowed object is
     *     {@link FingerPosition }
     *     
     */
    public void setFingerPosition(FingerPosition value) {
        this.fingerPosition = value;
    }

    /**
     * Obtiene el valor de la propiedad palmPosition.
     * 
     * @return
     *     possible object is
     *     {@link PalmPosition }
     *     
     */
    public PalmPosition getPalmPosition() {
        return palmPosition;
    }

    /**
     * Define el valor de la propiedad palmPosition.
     * 
     * @param value
     *     allowed object is
     *     {@link PalmPosition }
     *     
     */
    public void setPalmPosition(PalmPosition value) {
        this.palmPosition = value;
    }

    /**
     * Obtiene el valor de la propiedad fingerprintType.
     * 
     * @return
     *     possible object is
     *     {@link FingerprintType }
     *     
     */
    public FingerprintType getFingerprintType() {
        return fingerprintType;
    }

    /**
     * Define el valor de la propiedad fingerprintType.
     * 
     * @param value
     *     allowed object is
     *     {@link FingerprintType }
     *     
     */
    public void setFingerprintType(FingerprintType value) {
        this.fingerprintType = value;
    }

    /**
     * Obtiene el valor de la propiedad acquisitionType.
     * 
     * @return
     *     possible object is
     *     {@link AcquisitionType }
     *     
     */
    public AcquisitionType getAcquisitionType() {
        return acquisitionType;
    }

    /**
     * Define el valor de la propiedad acquisitionType.
     * 
     * @param value
     *     allowed object is
     *     {@link AcquisitionType }
     *     
     */
    public void setAcquisitionType(AcquisitionType value) {
        this.acquisitionType = value;
    }

}
