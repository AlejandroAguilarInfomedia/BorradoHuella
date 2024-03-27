
package Huella_import;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Slap442 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Slap442"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rightHand" type="{http://www.morpho.com/mbss/generic/wsdl}Image" minOccurs="0"/&gt;
 *         &lt;element name="leftHand" type="{http://www.morpho.com/mbss/generic/wsdl}Image" minOccurs="0"/&gt;
 *         &lt;element name="thumbs" type="{http://www.morpho.com/mbss/generic/wsdl}Image" minOccurs="0"/&gt;
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
@XmlType(name = "Slap442", propOrder = {
    "rightHand",
    "leftHand",
    "thumbs",
    "missingFingers"
})
public class Slap442 {

    protected Image rightHand;
    protected Image leftHand;
    protected Image thumbs;
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
     * Obtiene el valor de la propiedad thumbs.
     * 
     * @return
     *     possible object is
     *     {@link Image }
     *     
     */
    public Image getThumbs() {
        return thumbs;
    }

    /**
     * Define el valor de la propiedad thumbs.
     * 
     * @param value
     *     allowed object is
     *     {@link Image }
     *     
     */
    public void setThumbs(Image value) {
        this.thumbs = value;
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
