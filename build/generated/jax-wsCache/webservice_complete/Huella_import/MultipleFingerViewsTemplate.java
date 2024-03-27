
package Huella_import;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para MultipleFingerViewsTemplate complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MultipleFingerViewsTemplate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rolled" type="{http://www.morpho.com/mbss/generic/wsdl}Template" minOccurs="0"/&gt;
 *         &lt;element name="leftSide" type="{http://www.morpho.com/mbss/generic/wsdl}Template" minOccurs="0"/&gt;
 *         &lt;element name="flat" type="{http://www.morpho.com/mbss/generic/wsdl}Template" minOccurs="0"/&gt;
 *         &lt;element name="rightSide" type="{http://www.morpho.com/mbss/generic/wsdl}Template" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultipleFingerViewsTemplate", propOrder = {
    "rolled",
    "leftSide",
    "flat",
    "rightSide"
})
public class MultipleFingerViewsTemplate {

    protected Template rolled;
    protected Template leftSide;
    protected Template flat;
    protected Template rightSide;

    /**
     * Obtiene el valor de la propiedad rolled.
     * 
     * @return
     *     possible object is
     *     {@link Template }
     *     
     */
    public Template getRolled() {
        return rolled;
    }

    /**
     * Define el valor de la propiedad rolled.
     * 
     * @param value
     *     allowed object is
     *     {@link Template }
     *     
     */
    public void setRolled(Template value) {
        this.rolled = value;
    }

    /**
     * Obtiene el valor de la propiedad leftSide.
     * 
     * @return
     *     possible object is
     *     {@link Template }
     *     
     */
    public Template getLeftSide() {
        return leftSide;
    }

    /**
     * Define el valor de la propiedad leftSide.
     * 
     * @param value
     *     allowed object is
     *     {@link Template }
     *     
     */
    public void setLeftSide(Template value) {
        this.leftSide = value;
    }

    /**
     * Obtiene el valor de la propiedad flat.
     * 
     * @return
     *     possible object is
     *     {@link Template }
     *     
     */
    public Template getFlat() {
        return flat;
    }

    /**
     * Define el valor de la propiedad flat.
     * 
     * @param value
     *     allowed object is
     *     {@link Template }
     *     
     */
    public void setFlat(Template value) {
        this.flat = value;
    }

    /**
     * Obtiene el valor de la propiedad rightSide.
     * 
     * @return
     *     possible object is
     *     {@link Template }
     *     
     */
    public Template getRightSide() {
        return rightSide;
    }

    /**
     * Define el valor de la propiedad rightSide.
     * 
     * @param value
     *     allowed object is
     *     {@link Template }
     *     
     */
    public void setRightSide(Template value) {
        this.rightSide = value;
    }

}
