
package Huella_import;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FingerprintTemplates complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FingerprintTemplates"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rightThumb" type="{http://www.morpho.com/mbss/generic/wsdl}Template" minOccurs="0"/&gt;
 *         &lt;element name="rightIndex" type="{http://www.morpho.com/mbss/generic/wsdl}Template" minOccurs="0"/&gt;
 *         &lt;element name="rightMiddle" type="{http://www.morpho.com/mbss/generic/wsdl}Template" minOccurs="0"/&gt;
 *         &lt;element name="rightRing" type="{http://www.morpho.com/mbss/generic/wsdl}Template" minOccurs="0"/&gt;
 *         &lt;element name="rightLittle" type="{http://www.morpho.com/mbss/generic/wsdl}Template" minOccurs="0"/&gt;
 *         &lt;element name="leftThumb" type="{http://www.morpho.com/mbss/generic/wsdl}Template" minOccurs="0"/&gt;
 *         &lt;element name="leftIndex" type="{http://www.morpho.com/mbss/generic/wsdl}Template" minOccurs="0"/&gt;
 *         &lt;element name="leftMiddle" type="{http://www.morpho.com/mbss/generic/wsdl}Template" minOccurs="0"/&gt;
 *         &lt;element name="leftRing" type="{http://www.morpho.com/mbss/generic/wsdl}Template" minOccurs="0"/&gt;
 *         &lt;element name="leftLittle" type="{http://www.morpho.com/mbss/generic/wsdl}Template" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FingerprintTemplates", propOrder = {
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
public class FingerprintTemplates {

    protected Template rightThumb;
    protected Template rightIndex;
    protected Template rightMiddle;
    protected Template rightRing;
    protected Template rightLittle;
    protected Template leftThumb;
    protected Template leftIndex;
    protected Template leftMiddle;
    protected Template leftRing;
    protected Template leftLittle;

    /**
     * Obtiene el valor de la propiedad rightThumb.
     * 
     * @return
     *     possible object is
     *     {@link Template }
     *     
     */
    public Template getRightThumb() {
        return rightThumb;
    }

    /**
     * Define el valor de la propiedad rightThumb.
     * 
     * @param value
     *     allowed object is
     *     {@link Template }
     *     
     */
    public void setRightThumb(Template value) {
        this.rightThumb = value;
    }

    /**
     * Obtiene el valor de la propiedad rightIndex.
     * 
     * @return
     *     possible object is
     *     {@link Template }
     *     
     */
    public Template getRightIndex() {
        return rightIndex;
    }

    /**
     * Define el valor de la propiedad rightIndex.
     * 
     * @param value
     *     allowed object is
     *     {@link Template }
     *     
     */
    public void setRightIndex(Template value) {
        this.rightIndex = value;
    }

    /**
     * Obtiene el valor de la propiedad rightMiddle.
     * 
     * @return
     *     possible object is
     *     {@link Template }
     *     
     */
    public Template getRightMiddle() {
        return rightMiddle;
    }

    /**
     * Define el valor de la propiedad rightMiddle.
     * 
     * @param value
     *     allowed object is
     *     {@link Template }
     *     
     */
    public void setRightMiddle(Template value) {
        this.rightMiddle = value;
    }

    /**
     * Obtiene el valor de la propiedad rightRing.
     * 
     * @return
     *     possible object is
     *     {@link Template }
     *     
     */
    public Template getRightRing() {
        return rightRing;
    }

    /**
     * Define el valor de la propiedad rightRing.
     * 
     * @param value
     *     allowed object is
     *     {@link Template }
     *     
     */
    public void setRightRing(Template value) {
        this.rightRing = value;
    }

    /**
     * Obtiene el valor de la propiedad rightLittle.
     * 
     * @return
     *     possible object is
     *     {@link Template }
     *     
     */
    public Template getRightLittle() {
        return rightLittle;
    }

    /**
     * Define el valor de la propiedad rightLittle.
     * 
     * @param value
     *     allowed object is
     *     {@link Template }
     *     
     */
    public void setRightLittle(Template value) {
        this.rightLittle = value;
    }

    /**
     * Obtiene el valor de la propiedad leftThumb.
     * 
     * @return
     *     possible object is
     *     {@link Template }
     *     
     */
    public Template getLeftThumb() {
        return leftThumb;
    }

    /**
     * Define el valor de la propiedad leftThumb.
     * 
     * @param value
     *     allowed object is
     *     {@link Template }
     *     
     */
    public void setLeftThumb(Template value) {
        this.leftThumb = value;
    }

    /**
     * Obtiene el valor de la propiedad leftIndex.
     * 
     * @return
     *     possible object is
     *     {@link Template }
     *     
     */
    public Template getLeftIndex() {
        return leftIndex;
    }

    /**
     * Define el valor de la propiedad leftIndex.
     * 
     * @param value
     *     allowed object is
     *     {@link Template }
     *     
     */
    public void setLeftIndex(Template value) {
        this.leftIndex = value;
    }

    /**
     * Obtiene el valor de la propiedad leftMiddle.
     * 
     * @return
     *     possible object is
     *     {@link Template }
     *     
     */
    public Template getLeftMiddle() {
        return leftMiddle;
    }

    /**
     * Define el valor de la propiedad leftMiddle.
     * 
     * @param value
     *     allowed object is
     *     {@link Template }
     *     
     */
    public void setLeftMiddle(Template value) {
        this.leftMiddle = value;
    }

    /**
     * Obtiene el valor de la propiedad leftRing.
     * 
     * @return
     *     possible object is
     *     {@link Template }
     *     
     */
    public Template getLeftRing() {
        return leftRing;
    }

    /**
     * Define el valor de la propiedad leftRing.
     * 
     * @param value
     *     allowed object is
     *     {@link Template }
     *     
     */
    public void setLeftRing(Template value) {
        this.leftRing = value;
    }

    /**
     * Obtiene el valor de la propiedad leftLittle.
     * 
     * @return
     *     possible object is
     *     {@link Template }
     *     
     */
    public Template getLeftLittle() {
        return leftLittle;
    }

    /**
     * Define el valor de la propiedad leftLittle.
     * 
     * @param value
     *     allowed object is
     *     {@link Template }
     *     
     */
    public void setLeftLittle(Template value) {
        this.leftLittle = value;
    }

}
