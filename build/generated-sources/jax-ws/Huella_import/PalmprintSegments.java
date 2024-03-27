
package Huella_import;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PalmprintSegments complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PalmprintSegments"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rightLowerHand" type="{http://www.morpho.com/mbss/generic/wsdl}Box" minOccurs="0"/&gt;
 *         &lt;element name="rightWriterPalm" type="{http://www.morpho.com/mbss/generic/wsdl}Box" minOccurs="0"/&gt;
 *         &lt;element name="leftLowerHand" type="{http://www.morpho.com/mbss/generic/wsdl}Box" minOccurs="0"/&gt;
 *         &lt;element name="leftWriterPalm" type="{http://www.morpho.com/mbss/generic/wsdl}Box" minOccurs="0"/&gt;
 *         &lt;element name="rightUpperHand" type="{http://www.morpho.com/mbss/generic/wsdl}Box" minOccurs="0"/&gt;
 *         &lt;element name="leftUpperHand" type="{http://www.morpho.com/mbss/generic/wsdl}Box" minOccurs="0"/&gt;
 *         &lt;element name="rightThenar" type="{http://www.morpho.com/mbss/generic/wsdl}Box" minOccurs="0"/&gt;
 *         &lt;element name="leftThenar" type="{http://www.morpho.com/mbss/generic/wsdl}Box" minOccurs="0"/&gt;
 *         &lt;element name="rightHypothenar" type="{http://www.morpho.com/mbss/generic/wsdl}Box" minOccurs="0"/&gt;
 *         &lt;element name="leftHypothenar" type="{http://www.morpho.com/mbss/generic/wsdl}Box" minOccurs="0"/&gt;
 *         &lt;element name="rightInterdigital" type="{http://www.morpho.com/mbss/generic/wsdl}Box" minOccurs="0"/&gt;
 *         &lt;element name="leftInterdigital" type="{http://www.morpho.com/mbss/generic/wsdl}Box" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PalmprintSegments", propOrder = {
    "rightLowerHand",
    "rightWriterPalm",
    "leftLowerHand",
    "leftWriterPalm",
    "rightUpperHand",
    "leftUpperHand",
    "rightThenar",
    "leftThenar",
    "rightHypothenar",
    "leftHypothenar",
    "rightInterdigital",
    "leftInterdigital"
})
public class PalmprintSegments {

    protected Box rightLowerHand;
    protected Box rightWriterPalm;
    protected Box leftLowerHand;
    protected Box leftWriterPalm;
    protected Box rightUpperHand;
    protected Box leftUpperHand;
    protected Box rightThenar;
    protected Box leftThenar;
    protected Box rightHypothenar;
    protected Box leftHypothenar;
    protected Box rightInterdigital;
    protected Box leftInterdigital;

    /**
     * Obtiene el valor de la propiedad rightLowerHand.
     * 
     * @return
     *     possible object is
     *     {@link Box }
     *     
     */
    public Box getRightLowerHand() {
        return rightLowerHand;
    }

    /**
     * Define el valor de la propiedad rightLowerHand.
     * 
     * @param value
     *     allowed object is
     *     {@link Box }
     *     
     */
    public void setRightLowerHand(Box value) {
        this.rightLowerHand = value;
    }

    /**
     * Obtiene el valor de la propiedad rightWriterPalm.
     * 
     * @return
     *     possible object is
     *     {@link Box }
     *     
     */
    public Box getRightWriterPalm() {
        return rightWriterPalm;
    }

    /**
     * Define el valor de la propiedad rightWriterPalm.
     * 
     * @param value
     *     allowed object is
     *     {@link Box }
     *     
     */
    public void setRightWriterPalm(Box value) {
        this.rightWriterPalm = value;
    }

    /**
     * Obtiene el valor de la propiedad leftLowerHand.
     * 
     * @return
     *     possible object is
     *     {@link Box }
     *     
     */
    public Box getLeftLowerHand() {
        return leftLowerHand;
    }

    /**
     * Define el valor de la propiedad leftLowerHand.
     * 
     * @param value
     *     allowed object is
     *     {@link Box }
     *     
     */
    public void setLeftLowerHand(Box value) {
        this.leftLowerHand = value;
    }

    /**
     * Obtiene el valor de la propiedad leftWriterPalm.
     * 
     * @return
     *     possible object is
     *     {@link Box }
     *     
     */
    public Box getLeftWriterPalm() {
        return leftWriterPalm;
    }

    /**
     * Define el valor de la propiedad leftWriterPalm.
     * 
     * @param value
     *     allowed object is
     *     {@link Box }
     *     
     */
    public void setLeftWriterPalm(Box value) {
        this.leftWriterPalm = value;
    }

    /**
     * Obtiene el valor de la propiedad rightUpperHand.
     * 
     * @return
     *     possible object is
     *     {@link Box }
     *     
     */
    public Box getRightUpperHand() {
        return rightUpperHand;
    }

    /**
     * Define el valor de la propiedad rightUpperHand.
     * 
     * @param value
     *     allowed object is
     *     {@link Box }
     *     
     */
    public void setRightUpperHand(Box value) {
        this.rightUpperHand = value;
    }

    /**
     * Obtiene el valor de la propiedad leftUpperHand.
     * 
     * @return
     *     possible object is
     *     {@link Box }
     *     
     */
    public Box getLeftUpperHand() {
        return leftUpperHand;
    }

    /**
     * Define el valor de la propiedad leftUpperHand.
     * 
     * @param value
     *     allowed object is
     *     {@link Box }
     *     
     */
    public void setLeftUpperHand(Box value) {
        this.leftUpperHand = value;
    }

    /**
     * Obtiene el valor de la propiedad rightThenar.
     * 
     * @return
     *     possible object is
     *     {@link Box }
     *     
     */
    public Box getRightThenar() {
        return rightThenar;
    }

    /**
     * Define el valor de la propiedad rightThenar.
     * 
     * @param value
     *     allowed object is
     *     {@link Box }
     *     
     */
    public void setRightThenar(Box value) {
        this.rightThenar = value;
    }

    /**
     * Obtiene el valor de la propiedad leftThenar.
     * 
     * @return
     *     possible object is
     *     {@link Box }
     *     
     */
    public Box getLeftThenar() {
        return leftThenar;
    }

    /**
     * Define el valor de la propiedad leftThenar.
     * 
     * @param value
     *     allowed object is
     *     {@link Box }
     *     
     */
    public void setLeftThenar(Box value) {
        this.leftThenar = value;
    }

    /**
     * Obtiene el valor de la propiedad rightHypothenar.
     * 
     * @return
     *     possible object is
     *     {@link Box }
     *     
     */
    public Box getRightHypothenar() {
        return rightHypothenar;
    }

    /**
     * Define el valor de la propiedad rightHypothenar.
     * 
     * @param value
     *     allowed object is
     *     {@link Box }
     *     
     */
    public void setRightHypothenar(Box value) {
        this.rightHypothenar = value;
    }

    /**
     * Obtiene el valor de la propiedad leftHypothenar.
     * 
     * @return
     *     possible object is
     *     {@link Box }
     *     
     */
    public Box getLeftHypothenar() {
        return leftHypothenar;
    }

    /**
     * Define el valor de la propiedad leftHypothenar.
     * 
     * @param value
     *     allowed object is
     *     {@link Box }
     *     
     */
    public void setLeftHypothenar(Box value) {
        this.leftHypothenar = value;
    }

    /**
     * Obtiene el valor de la propiedad rightInterdigital.
     * 
     * @return
     *     possible object is
     *     {@link Box }
     *     
     */
    public Box getRightInterdigital() {
        return rightInterdigital;
    }

    /**
     * Define el valor de la propiedad rightInterdigital.
     * 
     * @param value
     *     allowed object is
     *     {@link Box }
     *     
     */
    public void setRightInterdigital(Box value) {
        this.rightInterdigital = value;
    }

    /**
     * Obtiene el valor de la propiedad leftInterdigital.
     * 
     * @return
     *     possible object is
     *     {@link Box }
     *     
     */
    public Box getLeftInterdigital() {
        return leftInterdigital;
    }

    /**
     * Define el valor de la propiedad leftInterdigital.
     * 
     * @param value
     *     allowed object is
     *     {@link Box }
     *     
     */
    public void setLeftInterdigital(Box value) {
        this.leftInterdigital = value;
    }

}
