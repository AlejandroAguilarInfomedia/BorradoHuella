
package Huella_import;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Minutia complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Minutia"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="coordinates" type="{http://www.morpho.com/mbss/generic/wsdl}Point"/&gt;
 *         &lt;element name="angle" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="type" type="{http://www.morpho.com/mbss/generic/wsdl}MinutiaType" minOccurs="0"/&gt;
 *         &lt;element name="quality" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Minutia", propOrder = {
    "coordinates",
    "angle",
    "type",
    "quality"
})
public class Minutia {

    @XmlElement(required = true)
    protected Point coordinates;
    protected float angle;
    @XmlSchemaType(name = "string")
    protected MinutiaType type;
    protected Integer quality;

    /**
     * Obtiene el valor de la propiedad coordinates.
     * 
     * @return
     *     possible object is
     *     {@link Point }
     *     
     */
    public Point getCoordinates() {
        return coordinates;
    }

    /**
     * Define el valor de la propiedad coordinates.
     * 
     * @param value
     *     allowed object is
     *     {@link Point }
     *     
     */
    public void setCoordinates(Point value) {
        this.coordinates = value;
    }

    /**
     * Obtiene el valor de la propiedad angle.
     * 
     */
    public float getAngle() {
        return angle;
    }

    /**
     * Define el valor de la propiedad angle.
     * 
     */
    public void setAngle(float value) {
        this.angle = value;
    }

    /**
     * Obtiene el valor de la propiedad type.
     * 
     * @return
     *     possible object is
     *     {@link MinutiaType }
     *     
     */
    public MinutiaType getType() {
        return type;
    }

    /**
     * Define el valor de la propiedad type.
     * 
     * @param value
     *     allowed object is
     *     {@link MinutiaType }
     *     
     */
    public void setType(MinutiaType value) {
        this.type = value;
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

}
