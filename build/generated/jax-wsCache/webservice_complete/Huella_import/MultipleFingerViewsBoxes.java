
package Huella_import;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para MultipleFingerViewsBoxes complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MultipleFingerViewsBoxes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rolled" type="{http://www.morpho.com/mbss/generic/wsdl}Box" minOccurs="0"/&gt;
 *         &lt;element name="leftSide" type="{http://www.morpho.com/mbss/generic/wsdl}Box" minOccurs="0"/&gt;
 *         &lt;element name="flat" type="{http://www.morpho.com/mbss/generic/wsdl}Box" minOccurs="0"/&gt;
 *         &lt;element name="rightSide" type="{http://www.morpho.com/mbss/generic/wsdl}Box" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultipleFingerViewsBoxes", propOrder = {
    "rolled",
    "leftSide",
    "flat",
    "rightSide"
})
public class MultipleFingerViewsBoxes {

    protected Box rolled;
    protected Box leftSide;
    protected Box flat;
    protected Box rightSide;

    /**
     * Obtiene el valor de la propiedad rolled.
     * 
     * @return
     *     possible object is
     *     {@link Box }
     *     
     */
    public Box getRolled() {
        return rolled;
    }

    /**
     * Define el valor de la propiedad rolled.
     * 
     * @param value
     *     allowed object is
     *     {@link Box }
     *     
     */
    public void setRolled(Box value) {
        this.rolled = value;
    }

    /**
     * Obtiene el valor de la propiedad leftSide.
     * 
     * @return
     *     possible object is
     *     {@link Box }
     *     
     */
    public Box getLeftSide() {
        return leftSide;
    }

    /**
     * Define el valor de la propiedad leftSide.
     * 
     * @param value
     *     allowed object is
     *     {@link Box }
     *     
     */
    public void setLeftSide(Box value) {
        this.leftSide = value;
    }

    /**
     * Obtiene el valor de la propiedad flat.
     * 
     * @return
     *     possible object is
     *     {@link Box }
     *     
     */
    public Box getFlat() {
        return flat;
    }

    /**
     * Define el valor de la propiedad flat.
     * 
     * @param value
     *     allowed object is
     *     {@link Box }
     *     
     */
    public void setFlat(Box value) {
        this.flat = value;
    }

    /**
     * Obtiene el valor de la propiedad rightSide.
     * 
     * @return
     *     possible object is
     *     {@link Box }
     *     
     */
    public Box getRightSide() {
        return rightSide;
    }

    /**
     * Define el valor de la propiedad rightSide.
     * 
     * @param value
     *     allowed object is
     *     {@link Box }
     *     
     */
    public void setRightSide(Box value) {
        this.rightSide = value;
    }

}
