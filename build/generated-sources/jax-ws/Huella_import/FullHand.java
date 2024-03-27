
package Huella_import;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FullHand complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FullHand"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rightFullHand" type="{http://www.morpho.com/mbss/generic/wsdl}Image" minOccurs="0"/&gt;
 *         &lt;element name="rightWriterPalm" type="{http://www.morpho.com/mbss/generic/wsdl}Image" minOccurs="0"/&gt;
 *         &lt;element name="leftFullHand" type="{http://www.morpho.com/mbss/generic/wsdl}Image" minOccurs="0"/&gt;
 *         &lt;element name="leftWriterPalm" type="{http://www.morpho.com/mbss/generic/wsdl}Image" minOccurs="0"/&gt;
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
@XmlType(name = "FullHand", propOrder = {
    "rightFullHand",
    "rightWriterPalm",
    "leftFullHand",
    "leftWriterPalm",
    "missingFingers"
})
public class FullHand {

    protected Image rightFullHand;
    protected Image rightWriterPalm;
    protected Image leftFullHand;
    protected Image leftWriterPalm;
    protected MissingFingers missingFingers;

    /**
     * Obtiene el valor de la propiedad rightFullHand.
     * 
     * @return
     *     possible object is
     *     {@link Image }
     *     
     */
    public Image getRightFullHand() {
        return rightFullHand;
    }

    /**
     * Define el valor de la propiedad rightFullHand.
     * 
     * @param value
     *     allowed object is
     *     {@link Image }
     *     
     */
    public void setRightFullHand(Image value) {
        this.rightFullHand = value;
    }

    /**
     * Obtiene el valor de la propiedad rightWriterPalm.
     * 
     * @return
     *     possible object is
     *     {@link Image }
     *     
     */
    public Image getRightWriterPalm() {
        return rightWriterPalm;
    }

    /**
     * Define el valor de la propiedad rightWriterPalm.
     * 
     * @param value
     *     allowed object is
     *     {@link Image }
     *     
     */
    public void setRightWriterPalm(Image value) {
        this.rightWriterPalm = value;
    }

    /**
     * Obtiene el valor de la propiedad leftFullHand.
     * 
     * @return
     *     possible object is
     *     {@link Image }
     *     
     */
    public Image getLeftFullHand() {
        return leftFullHand;
    }

    /**
     * Define el valor de la propiedad leftFullHand.
     * 
     * @param value
     *     allowed object is
     *     {@link Image }
     *     
     */
    public void setLeftFullHand(Image value) {
        this.leftFullHand = value;
    }

    /**
     * Obtiene el valor de la propiedad leftWriterPalm.
     * 
     * @return
     *     possible object is
     *     {@link Image }
     *     
     */
    public Image getLeftWriterPalm() {
        return leftWriterPalm;
    }

    /**
     * Define el valor de la propiedad leftWriterPalm.
     * 
     * @param value
     *     allowed object is
     *     {@link Image }
     *     
     */
    public void setLeftWriterPalm(Image value) {
        this.leftWriterPalm = value;
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
