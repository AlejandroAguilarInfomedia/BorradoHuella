
package Huella_import;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PlanCoordinate complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PlanCoordinate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="latidude" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="unit" type="{http://www.morpho.com/mbss/generic/wsdl}UnitPlan"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlanCoordinate", propOrder = {
    "longitude",
    "latidude",
    "unit"
})
public class PlanCoordinate {

    protected float longitude;
    protected float latidude;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected UnitPlan unit;

    /**
     * Obtiene el valor de la propiedad longitude.
     * 
     */
    public float getLongitude() {
        return longitude;
    }

    /**
     * Define el valor de la propiedad longitude.
     * 
     */
    public void setLongitude(float value) {
        this.longitude = value;
    }

    /**
     * Obtiene el valor de la propiedad latidude.
     * 
     */
    public float getLatidude() {
        return latidude;
    }

    /**
     * Define el valor de la propiedad latidude.
     * 
     */
    public void setLatidude(float value) {
        this.latidude = value;
    }

    /**
     * Obtiene el valor de la propiedad unit.
     * 
     * @return
     *     possible object is
     *     {@link UnitPlan }
     *     
     */
    public UnitPlan getUnit() {
        return unit;
    }

    /**
     * Define el valor de la propiedad unit.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitPlan }
     *     
     */
    public void setUnit(UnitPlan value) {
        this.unit = value;
    }

}
