
package Huella_import;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para LatentPosition complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="LatentPosition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="type" type="{http://www.morpho.com/mbss/generic/wsdl}LatentType"/&gt;
 *         &lt;element name="fingerPosition" type="{http://www.morpho.com/mbss/generic/wsdl}FingerLatentPosition" minOccurs="0"/&gt;
 *         &lt;element name="palmOrSupplementalsPosition" type="{http://www.morpho.com/mbss/generic/wsdl}PalmOrSupplementalsLatentPosition" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LatentPosition", propOrder = {
    "type",
    "fingerPosition",
    "palmOrSupplementalsPosition"
})
public class LatentPosition {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected LatentType type;
    protected FingerLatentPosition fingerPosition;
    protected PalmOrSupplementalsLatentPosition palmOrSupplementalsPosition;

    /**
     * Obtiene el valor de la propiedad type.
     * 
     * @return
     *     possible object is
     *     {@link LatentType }
     *     
     */
    public LatentType getType() {
        return type;
    }

    /**
     * Define el valor de la propiedad type.
     * 
     * @param value
     *     allowed object is
     *     {@link LatentType }
     *     
     */
    public void setType(LatentType value) {
        this.type = value;
    }

    /**
     * Obtiene el valor de la propiedad fingerPosition.
     * 
     * @return
     *     possible object is
     *     {@link FingerLatentPosition }
     *     
     */
    public FingerLatentPosition getFingerPosition() {
        return fingerPosition;
    }

    /**
     * Define el valor de la propiedad fingerPosition.
     * 
     * @param value
     *     allowed object is
     *     {@link FingerLatentPosition }
     *     
     */
    public void setFingerPosition(FingerLatentPosition value) {
        this.fingerPosition = value;
    }

    /**
     * Obtiene el valor de la propiedad palmOrSupplementalsPosition.
     * 
     * @return
     *     possible object is
     *     {@link PalmOrSupplementalsLatentPosition }
     *     
     */
    public PalmOrSupplementalsLatentPosition getPalmOrSupplementalsPosition() {
        return palmOrSupplementalsPosition;
    }

    /**
     * Define el valor de la propiedad palmOrSupplementalsPosition.
     * 
     * @param value
     *     allowed object is
     *     {@link PalmOrSupplementalsLatentPosition }
     *     
     */
    public void setPalmOrSupplementalsPosition(PalmOrSupplementalsLatentPosition value) {
        this.palmOrSupplementalsPosition = value;
    }

}
