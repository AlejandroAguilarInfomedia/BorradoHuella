
package Huella_import;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SequenceCheckErrorItem complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SequenceCheckErrorItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="registrationId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="sampleId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="position" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="sampleType" type="{http://www.morpho.com/mbss/generic/wsdl}FingerprintSampleType" minOccurs="0"/&gt;
 *         &lt;element name="palmSampleType" type="{http://www.morpho.com/mbss/generic/wsdl}PalmprintSampleType" minOccurs="0"/&gt;
 *         &lt;element name="decodedPosition" type="{http://www.morpho.com/mbss/generic/wsdl}DecodedPosition" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SequenceCheckErrorItem", propOrder = {
    "registrationId",
    "sampleId",
    "position",
    "sampleType",
    "palmSampleType",
    "decodedPosition"
})
public class SequenceCheckErrorItem {

    protected long registrationId;
    protected long sampleId;
    protected int position;
    @XmlSchemaType(name = "string")
    protected FingerprintSampleType sampleType;
    @XmlSchemaType(name = "string")
    protected PalmprintSampleType palmSampleType;
    protected DecodedPosition decodedPosition;

    /**
     * Obtiene el valor de la propiedad registrationId.
     * 
     */
    public long getRegistrationId() {
        return registrationId;
    }

    /**
     * Define el valor de la propiedad registrationId.
     * 
     */
    public void setRegistrationId(long value) {
        this.registrationId = value;
    }

    /**
     * Obtiene el valor de la propiedad sampleId.
     * 
     */
    public long getSampleId() {
        return sampleId;
    }

    /**
     * Define el valor de la propiedad sampleId.
     * 
     */
    public void setSampleId(long value) {
        this.sampleId = value;
    }

    /**
     * Obtiene el valor de la propiedad position.
     * 
     */
    public int getPosition() {
        return position;
    }

    /**
     * Define el valor de la propiedad position.
     * 
     */
    public void setPosition(int value) {
        this.position = value;
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
     * Obtiene el valor de la propiedad palmSampleType.
     * 
     * @return
     *     possible object is
     *     {@link PalmprintSampleType }
     *     
     */
    public PalmprintSampleType getPalmSampleType() {
        return palmSampleType;
    }

    /**
     * Define el valor de la propiedad palmSampleType.
     * 
     * @param value
     *     allowed object is
     *     {@link PalmprintSampleType }
     *     
     */
    public void setPalmSampleType(PalmprintSampleType value) {
        this.palmSampleType = value;
    }

    /**
     * Obtiene el valor de la propiedad decodedPosition.
     * 
     * @return
     *     possible object is
     *     {@link DecodedPosition }
     *     
     */
    public DecodedPosition getDecodedPosition() {
        return decodedPosition;
    }

    /**
     * Define el valor de la propiedad decodedPosition.
     * 
     * @param value
     *     allowed object is
     *     {@link DecodedPosition }
     *     
     */
    public void setDecodedPosition(DecodedPosition value) {
        this.decodedPosition = value;
    }

}
