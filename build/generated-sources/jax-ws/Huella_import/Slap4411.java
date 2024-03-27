
package Huella_import;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Slap4411 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Slap4411"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rightHand" type="{http://www.morpho.com/mbss/generic/wsdl}Image" minOccurs="0"/&gt;
 *         &lt;element name="leftHand" type="{http://www.morpho.com/mbss/generic/wsdl}Image" minOccurs="0"/&gt;
 *         &lt;element name="rightThumb" type="{http://www.morpho.com/mbss/generic/wsdl}Image" minOccurs="0"/&gt;
 *         &lt;element name="leftThumb" type="{http://www.morpho.com/mbss/generic/wsdl}Image" minOccurs="0"/&gt;
 *         &lt;element name="missingFingers" type="{http://www.morpho.com/mbss/generic/wsdl}MissingFingers" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Slap4411", propOrder = {
    "rightHand",
    "leftHand",
    "rightThumb",
    "leftThumb",
    "missingFingers"
})
public class Slap4411 {

    protected Image rightHand;
    protected Image leftHand;
    protected Image rightThumb;
    protected Image leftThumb;
    protected MissingFingers missingFingers;

    /**
     * Obtiene el valor de la propiedad rightHand.
     * 
     * @return
     *     possible object is
     *     {@link Image }
     *     
     */
    public Image getRightHand() {
        return rightHand;
    }

    /**
     * Define el valor de la propiedad rightHand.
     * 
     * @param value
     *     allowed object is
     *     {@link Image }
     *     
     */
    public void setRightHand(Image value) {
        this.rightHand = value;
    }

    /**
     * Obtiene el valor de la propiedad leftHand.
     * 
     * @return
     *     possible object is
     *     {@link Image }
     *     
     */
    public Image getLeftHand() {
        return leftHand;
    }

    /**
     * Define el valor de la propiedad leftHand.
     * 
     * @param value
     *     allowed object is
     *     {@link Image }
     *     
     */
    public void setLeftHand(Image value) {
        this.leftHand = value;
    }

    /**
     * Obtiene el valor de la propiedad rightThumb.
     * 
     * @return
     *     possible object is
     *     {@link Image }
     *     
     */
    public Image getRightThumb() {
        return rightThumb;
    }

    /**
     * Define el valor de la propiedad rightThumb.
     * 
     * @param value
     *     allowed object is
     *     {@link Image }
     *     
     */
    public void setRightThumb(Image value) {
        this.rightThumb = value;
    }

    /**
     * Obtiene el valor de la propiedad leftThumb.
     * 
     * @return
     *     possible object is
     *     {@link Image }
     *     
     */
    public Image getLeftThumb() {
        return leftThumb;
    }

    /**
     * Define el valor de la propiedad leftThumb.
     * 
     * @param value
     *     allowed object is
     *     {@link Image }
     *     
     */
    public void setLeftThumb(Image value) {
        this.leftThumb = value;
    }

    /**
     * Obtiene el valor de la propiedad missingFingers.
     * 
     * @return
     *     possible object is
     *     {@link MissingFingers }
     *     
     */
    public MissingFingers getMissingFingers() {
        return missingFingers;
    }

    /**
     * Define el valor de la propiedad missingFingers.
     * 
     * @param value
     *     allowed object is
     *     {@link MissingFingers }
     *     
     */
    public void setMissingFingers(MissingFingers value) {
        this.missingFingers = value;
    }

}
