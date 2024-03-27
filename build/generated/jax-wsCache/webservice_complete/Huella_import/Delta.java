
package Huella_import;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Delta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Delta"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="coordinates" type="{http://www.morpho.com/mbss/generic/wsdl}Point"/&gt;
 *         &lt;element name="directionUp" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="directionLeft" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="directionRight" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
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
@XmlType(name = "Delta", propOrder = {
    "coordinates",
    "directionUp",
    "directionLeft",
    "directionRight",
    "quality"
})
public class Delta {

    @XmlElement(required = true)
    protected Point coordinates;
    protected float directionUp;
    protected float directionLeft;
    protected float directionRight;
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
     * Obtiene el valor de la propiedad directionUp.
     * 
     */
    public float getDirectionUp() {
        return directionUp;
    }

    /**
     * Define el valor de la propiedad directionUp.
     * 
     */
    public void setDirectionUp(float value) {
        this.directionUp = value;
    }

    /**
     * Obtiene el valor de la propiedad directionLeft.
     * 
     */
    public float getDirectionLeft() {
        return directionLeft;
    }

    /**
     * Define el valor de la propiedad directionLeft.
     * 
     */
    public void setDirectionLeft(float value) {
        this.directionLeft = value;
    }

    /**
     * Obtiene el valor de la propiedad directionRight.
     * 
     */
    public float getDirectionRight() {
        return directionRight;
    }

    /**
     * Define el valor de la propiedad directionRight.
     * 
     */
    public void setDirectionRight(float value) {
        this.directionRight = value;
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
