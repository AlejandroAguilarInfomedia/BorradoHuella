
package Huella_import;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para VerticalCoordinate complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="VerticalCoordinate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="altitude" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="unit" type="{http://www.morpho.com/mbss/generic/wsdl}UnitVertical"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerticalCoordinate", propOrder = {
    "altitude",
    "unit"
})
public class VerticalCoordinate {

    protected float altitude;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected UnitVertical unit;

    /**
     * Obtiene el valor de la propiedad altitude.
     * 
     */
    public float getAltitude() {
        return altitude;
    }

    /**
     * Define el valor de la propiedad altitude.
     * 
     */
    public void setAltitude(float value) {
        this.altitude = value;
    }

    /**
     * Obtiene el valor de la propiedad unit.
     * 
     * @return
     *     possible object is
     *     {@link UnitVertical }
     *     
     */
    public UnitVertical getUnit() {
        return unit;
    }

    /**
     * Define el valor de la propiedad unit.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitVertical }
     *     
     */
    public void setUnit(UnitVertical value) {
        this.unit = value;
    }

}
