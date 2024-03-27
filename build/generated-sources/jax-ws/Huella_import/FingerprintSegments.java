
package Huella_import;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FingerprintSegments complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FingerprintSegments"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rightThumb" type="{http://www.morpho.com/mbss/generic/wsdl}Box" minOccurs="0"/&gt;
 *         &lt;element name="rightIndex" type="{http://www.morpho.com/mbss/generic/wsdl}Box" minOccurs="0"/&gt;
 *         &lt;element name="rightMiddle" type="{http://www.morpho.com/mbss/generic/wsdl}Box" minOccurs="0"/&gt;
 *         &lt;element name="rightRing" type="{http://www.morpho.com/mbss/generic/wsdl}Box" minOccurs="0"/&gt;
 *         &lt;element name="rightLittle" type="{http://www.morpho.com/mbss/generic/wsdl}Box" minOccurs="0"/&gt;
 *         &lt;element name="leftThumb" type="{http://www.morpho.com/mbss/generic/wsdl}Box" minOccurs="0"/&gt;
 *         &lt;element name="leftIndex" type="{http://www.morpho.com/mbss/generic/wsdl}Box" minOccurs="0"/&gt;
 *         &lt;element name="leftMiddle" type="{http://www.morpho.com/mbss/generic/wsdl}Box" minOccurs="0"/&gt;
 *         &lt;element name="leftRing" type="{http://www.morpho.com/mbss/generic/wsdl}Box" minOccurs="0"/&gt;
 *         &lt;element name="leftLittle" type="{http://www.morpho.com/mbss/generic/wsdl}Box" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FingerprintSegments", propOrder = {
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
public class FingerprintSegments {

    protected Box rightThumb;
    protected Box rightIndex;
    protected Box rightMiddle;
    protected Box rightRing;
    protected Box rightLittle;
    protected Box leftThumb;
    protected Box leftIndex;
    protected Box leftMiddle;
    protected Box leftRing;
    protected Box leftLittle;

    /**
     * Obtiene el valor de la propiedad rightThumb.
     * 
     * @return
     *     possible object is
     *     {@link Box }
     *     
     */
    public Box getRightThumb() {
        return rightThumb;
    }

    /**
     * Define el valor de la propiedad rightThumb.
     * 
     * @param value
     *     allowed object is
     *     {@link Box }
     *     
     */
    public void setRightThumb(Box value) {
        this.rightThumb = value;
    }

    /**
     * Obtiene el valor de la propiedad rightIndex.
     * 
     * @return
     *     possible object is
     *     {@link Box }
     *     
     */
    public Box getRightIndex() {
        return rightIndex;
    }

    /**
     * Define el valor de la propiedad rightIndex.
     * 
     * @param value
     *     allowed object is
     *     {@link Box }
     *     
     */
    public void setRightIndex(Box value) {
        this.rightIndex = value;
    }

    /**
     * Obtiene el valor de la propiedad rightMiddle.
     * 
     * @return
     *     possible object is
     *     {@link Box }
     *     
     */
    public Box getRightMiddle() {
        return rightMiddle;
    }

    /**
     * Define el valor de la propiedad rightMiddle.
     * 
     * @param value
     *     allowed object is
     *     {@link Box }
     *     
     */
    public void setRightMiddle(Box value) {
        this.rightMiddle = value;
    }

    /**
     * Obtiene el valor de la propiedad rightRing.
     * 
     * @return
     *     possible object is
     *     {@link Box }
     *     
     */
    public Box getRightRing() {
        return rightRing;
    }

    /**
     * Define el valor de la propiedad rightRing.
     * 
     * @param value
     *     allowed object is
     *     {@link Box }
     *     
     */
    public void setRightRing(Box value) {
        this.rightRing = value;
    }

    /**
     * Obtiene el valor de la propiedad rightLittle.
     * 
     * @return
     *     possible object is
     *     {@link Box }
     *     
     */
    public Box getRightLittle() {
        return rightLittle;
    }

    /**
     * Define el valor de la propiedad rightLittle.
     * 
     * @param value
     *     allowed object is
     *     {@link Box }
     *     
     */
    public void setRightLittle(Box value) {
        this.rightLittle = value;
    }

    /**
     * Obtiene el valor de la propiedad leftThumb.
     * 
     * @return
     *     possible object is
     *     {@link Box }
     *     
     */
    public Box getLeftThumb() {
        return leftThumb;
    }

    /**
     * Define el valor de la propiedad leftThumb.
     * 
     * @param value
     *     allowed object is
     *     {@link Box }
     *     
     */
    public void setLeftThumb(Box value) {
        this.leftThumb = value;
    }

    /**
     * Obtiene el valor de la propiedad leftIndex.
     * 
     * @return
     *     possible object is
     *     {@link Box }
     *     
     */
    public Box getLeftIndex() {
        return leftIndex;
    }

    /**
     * Define el valor de la propiedad leftIndex.
     * 
     * @param value
     *     allowed object is
     *     {@link Box }
     *     
     */
    public void setLeftIndex(Box value) {
        this.leftIndex = value;
    }

    /**
     * Obtiene el valor de la propiedad leftMiddle.
     * 
     * @return
     *     possible object is
     *     {@link Box }
     *     
     */
    public Box getLeftMiddle() {
        return leftMiddle;
    }

    /**
     * Define el valor de la propiedad leftMiddle.
     * 
     * @param value
     *     allowed object is
     *     {@link Box }
     *     
     */
    public void setLeftMiddle(Box value) {
        this.leftMiddle = value;
    }

    /**
     * Obtiene el valor de la propiedad leftRing.
     * 
     * @return
     *     possible object is
     *     {@link Box }
     *     
     */
    public Box getLeftRing() {
        return leftRing;
    }

    /**
     * Define el valor de la propiedad leftRing.
     * 
     * @param value
     *     allowed object is
     *     {@link Box }
     *     
     */
    public void setLeftRing(Box value) {
        this.leftRing = value;
    }

    /**
     * Obtiene el valor de la propiedad leftLittle.
     * 
     * @return
     *     possible object is
     *     {@link Box }
     *     
     */
    public Box getLeftLittle() {
        return leftLittle;
    }

    /**
     * Define el valor de la propiedad leftLittle.
     * 
     * @param value
     *     allowed object is
     *     {@link Box }
     *     
     */
    public void setLeftLittle(Box value) {
        this.leftLittle = value;
    }

}
