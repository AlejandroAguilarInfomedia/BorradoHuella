
package Huella_import;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TimingReference complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TimingReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="absoluteTime" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="unit" type="{http://www.morpho.com/mbss/generic/wsdl}UnitTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimingReference", propOrder = {
    "absoluteTime",
    "unit"
})
public class TimingReference {

    protected int absoluteTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected UnitTime unit;

    /**
     * Obtiene el valor de la propiedad absoluteTime.
     * 
     */
    public int getAbsoluteTime() {
        return absoluteTime;
    }

    /**
     * Define el valor de la propiedad absoluteTime.
     * 
     */
    public void setAbsoluteTime(int value) {
        this.absoluteTime = value;
    }

    /**
     * Obtiene el valor de la propiedad unit.
     * 
     * @return
     *     possible object is
     *     {@link UnitTime }
     *     
     */
    public UnitTime getUnit() {
        return unit;
    }

    /**
     * Define el valor de la propiedad unit.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitTime }
     *     
     */
    public void setUnit(UnitTime value) {
        this.unit = value;
    }

}
