
package Huella_import;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SampleReference complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SampleReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="registrationId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="fingerprintSampleId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="irisSampleId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="faceSampleId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="palmprintSampleId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="decodedPosition" type="{http://www.morpho.com/mbss/generic/wsdl}DecodedPosition" minOccurs="0"/&gt;
 *         &lt;element name="tattooSampleId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="pedestrianSampleId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="bagSampleId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SampleReference", propOrder = {
    "registrationId",
    "fingerprintSampleId",
    "irisSampleId",
    "faceSampleId",
    "palmprintSampleId",
    "decodedPosition",
    "tattooSampleId",
    "pedestrianSampleId",
    "bagSampleId"
})
public class SampleReference {

    protected Long registrationId;
    protected Long fingerprintSampleId;
    protected Long irisSampleId;
    protected Long faceSampleId;
    protected Long palmprintSampleId;
    protected DecodedPosition decodedPosition;
    protected Long tattooSampleId;
    protected Long pedestrianSampleId;
    protected Long bagSampleId;

    /**
     * Obtiene el valor de la propiedad registrationId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRegistrationId() {
        return registrationId;
    }

    /**
     * Define el valor de la propiedad registrationId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRegistrationId(Long value) {
        this.registrationId = value;
    }

    /**
     * Obtiene el valor de la propiedad fingerprintSampleId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFingerprintSampleId() {
        return fingerprintSampleId;
    }

    /**
     * Define el valor de la propiedad fingerprintSampleId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFingerprintSampleId(Long value) {
        this.fingerprintSampleId = value;
    }

    /**
     * Obtiene el valor de la propiedad irisSampleId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIrisSampleId() {
        return irisSampleId;
    }

    /**
     * Define el valor de la propiedad irisSampleId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIrisSampleId(Long value) {
        this.irisSampleId = value;
    }

    /**
     * Obtiene el valor de la propiedad faceSampleId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFaceSampleId() {
        return faceSampleId;
    }

    /**
     * Define el valor de la propiedad faceSampleId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFaceSampleId(Long value) {
        this.faceSampleId = value;
    }

    /**
     * Obtiene el valor de la propiedad palmprintSampleId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPalmprintSampleId() {
        return palmprintSampleId;
    }

    /**
     * Define el valor de la propiedad palmprintSampleId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPalmprintSampleId(Long value) {
        this.palmprintSampleId = value;
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

    /**
     * Obtiene el valor de la propiedad tattooSampleId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTattooSampleId() {
        return tattooSampleId;
    }

    /**
     * Define el valor de la propiedad tattooSampleId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTattooSampleId(Long value) {
        this.tattooSampleId = value;
    }

    /**
     * Obtiene el valor de la propiedad pedestrianSampleId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPedestrianSampleId() {
        return pedestrianSampleId;
    }

    /**
     * Define el valor de la propiedad pedestrianSampleId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPedestrianSampleId(Long value) {
        this.pedestrianSampleId = value;
    }

    /**
     * Obtiene el valor de la propiedad bagSampleId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBagSampleId() {
        return bagSampleId;
    }

    /**
     * Define el valor de la propiedad bagSampleId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBagSampleId(Long value) {
        this.bagSampleId = value;
    }

}
