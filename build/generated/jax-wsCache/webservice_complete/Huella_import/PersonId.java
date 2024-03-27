
package Huella_import;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PersonId complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PersonId"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="registrationId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="sampleId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="position" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
@XmlType(name = "PersonId", propOrder = {
    "registrationId",
    "sampleId",
    "position",
    "decodedPosition"
})
public class PersonId {

    protected long registrationId;
    protected long sampleId;
    protected int position;
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
