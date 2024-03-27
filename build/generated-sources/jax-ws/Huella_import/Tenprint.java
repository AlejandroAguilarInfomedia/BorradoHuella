
package Huella_import;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Tenprint complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Tenprint"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rightThumb" type="{http://www.morpho.com/mbss/generic/wsdl}Image" minOccurs="0"/&gt;
 *         &lt;element name="rightIndex" type="{http://www.morpho.com/mbss/generic/wsdl}Image" minOccurs="0"/&gt;
 *         &lt;element name="rightMiddle" type="{http://www.morpho.com/mbss/generic/wsdl}Image" minOccurs="0"/&gt;
 *         &lt;element name="rightRing" type="{http://www.morpho.com/mbss/generic/wsdl}Image" minOccurs="0"/&gt;
 *         &lt;element name="rightLittle" type="{http://www.morpho.com/mbss/generic/wsdl}Image" minOccurs="0"/&gt;
 *         &lt;element name="leftThumb" type="{http://www.morpho.com/mbss/generic/wsdl}Image" minOccurs="0"/&gt;
 *         &lt;element name="leftIndex" type="{http://www.morpho.com/mbss/generic/wsdl}Image" minOccurs="0"/&gt;
 *         &lt;element name="leftMiddle" type="{http://www.morpho.com/mbss/generic/wsdl}Image" minOccurs="0"/&gt;
 *         &lt;element name="leftRing" type="{http://www.morpho.com/mbss/generic/wsdl}Image" minOccurs="0"/&gt;
 *         &lt;element name="leftLittle" type="{http://www.morpho.com/mbss/generic/wsdl}Image" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Tenprint", propOrder = {
    "rightThumb",
    "rightIndex",
    "rightMiddle",
    "rightRing",
    "rightLittle",
    "leftThumb",
    "leftIndex",
    "leftMiddle",
    "leftRing",
    "leftLittle"
})
public class Tenprint {

    protected Image rightThumb;
    protected Image rightIndex;
    protected Image rightMiddle;
    protected Image rightRing;
    protected Image rightLittle;
    protected Image leftThumb;
    protected Image leftIndex;
    protected Image leftMiddle;
    protected Image leftRing;
    protected Image leftLittle;

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
     * Obtiene el valor de la propiedad rightIndex.
     * 
     * @return
     *     possible object is
     *     {@link Image }
     *     
     */
    public Image getRightIndex() {
        return rightIndex;
    }

    /**
     * Define el valor de la propiedad rightIndex.
     * 
     * @param value
     *     allowed object is
     *     {@link Image }
     *     
     */
    public void setRightIndex(Image value) {
        this.rightIndex = value;
    }

    /**
     * Obtiene el valor de la propiedad rightMiddle.
     * 
     * @return
     *     possible object is
     *     {@link Image }
     *     
     */
    public Image getRightMiddle() {
        return rightMiddle;
    }

    /**
     * Define el valor de la propiedad rightMiddle.
     * 
     * @param value
     *     allowed object is
     *     {@link Image }
     *     
     */
    public void setRightMiddle(Image value) {
        this.rightMiddle = value;
    }

    /**
     * Obtiene el valor de la propiedad rightRing.
     * 
     * @return
     *     possible object is
     *     {@link Image }
     *     
     */
    public Image getRightRing() {
        return rightRing;
    }

    /**
     * Define el valor de la propiedad rightRing.
     * 
     * @param value
     *     allowed object is
     *     {@link Image }
     *     
     */
    public void setRightRing(Image value) {
        this.rightRing = value;
    }

    /**
     * Obtiene el valor de la propiedad rightLittle.
     * 
     * @return
     *     possible object is
     *     {@link Image }
     *     
     */
    public Image getRightLittle() {
        return rightLittle;
    }

    /**
     * Define el valor de la propiedad rightLittle.
     * 
     * @param value
     *     allowed object is
     *     {@link Image }
     *     
     */
    public void setRightLittle(Image value) {
        this.rightLittle = value;
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
     * Obtiene el valor de la propiedad leftIndex.
     * 
     * @return
     *     possible object is
     *     {@link Image }
     *     
     */
    public Image getLeftIndex() {
        return leftIndex;
    }

    /**
     * Define el valor de la propiedad leftIndex.
     * 
     * @param value
     *     allowed object is
     *     {@link Image }
     *     
     */
    public void setLeftIndex(Image value) {
        this.leftIndex = value;
    }

    /**
     * Obtiene el valor de la propiedad leftMiddle.
     * 
     * @return
     *     possible object is
     *     {@link Image }
     *     
     */
    public Image getLeftMiddle() {
        return leftMiddle;
    }

    /**
     * Define el valor de la propiedad leftMiddle.
     * 
     * @param value
     *     allowed object is
     *     {@link Image }
     *     
     */
    public void setLeftMiddle(Image value) {
        this.leftMiddle = value;
    }

    /**
     * Obtiene el valor de la propiedad leftRing.
     * 
     * @return
     *     possible object is
     *     {@link Image }
     *     
     */
    public Image getLeftRing() {
        return leftRing;
    }

    /**
     * Define el valor de la propiedad leftRing.
     * 
     * @param value
     *     allowed object is
     *     {@link Image }
     *     
     */
    public void setLeftRing(Image value) {
        this.leftRing = value;
    }

    /**
     * Obtiene el valor de la propiedad leftLittle.
     * 
     * @return
     *     possible object is
     *     {@link Image }
     *     
     */
    public Image getLeftLittle() {
        return leftLittle;
    }

    /**
     * Define el valor de la propiedad leftLittle.
     * 
     * @param value
     *     allowed object is
     *     {@link Image }
     *     
     */
    public void setLeftLittle(Image value) {
        this.leftLittle = value;
    }

}
