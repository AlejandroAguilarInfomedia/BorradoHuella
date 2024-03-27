
package Huella_import;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para MultipleFingerViewsTemplates complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MultipleFingerViewsTemplates"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rightThumb" type="{http://www.morpho.com/mbss/generic/wsdl}MultipleFingerViewsTemplate" minOccurs="0"/&gt;
 *         &lt;element name="rightIndex" type="{http://www.morpho.com/mbss/generic/wsdl}MultipleFingerViewsTemplate" minOccurs="0"/&gt;
 *         &lt;element name="rightMiddle" type="{http://www.morpho.com/mbss/generic/wsdl}MultipleFingerViewsTemplate" minOccurs="0"/&gt;
 *         &lt;element name="rightRing" type="{http://www.morpho.com/mbss/generic/wsdl}MultipleFingerViewsTemplate" minOccurs="0"/&gt;
 *         &lt;element name="rightLittle" type="{http://www.morpho.com/mbss/generic/wsdl}MultipleFingerViewsTemplate" minOccurs="0"/&gt;
 *         &lt;element name="leftThumb" type="{http://www.morpho.com/mbss/generic/wsdl}MultipleFingerViewsTemplate" minOccurs="0"/&gt;
 *         &lt;element name="leftIndex" type="{http://www.morpho.com/mbss/generic/wsdl}MultipleFingerViewsTemplate" minOccurs="0"/&gt;
 *         &lt;element name="leftMiddle" type="{http://www.morpho.com/mbss/generic/wsdl}MultipleFingerViewsTemplate" minOccurs="0"/&gt;
 *         &lt;element name="leftRing" type="{http://www.morpho.com/mbss/generic/wsdl}MultipleFingerViewsTemplate" minOccurs="0"/&gt;
 *         &lt;element name="leftLittle" type="{http://www.morpho.com/mbss/generic/wsdl}MultipleFingerViewsTemplate" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultipleFingerViewsTemplates", propOrder = {
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
public class MultipleFingerViewsTemplates {

    protected MultipleFingerViewsTemplate rightThumb;
    protected MultipleFingerViewsTemplate rightIndex;
    protected MultipleFingerViewsTemplate rightMiddle;
    protected MultipleFingerViewsTemplate rightRing;
    protected MultipleFingerViewsTemplate rightLittle;
    protected MultipleFingerViewsTemplate leftThumb;
    protected MultipleFingerViewsTemplate leftIndex;
    protected MultipleFingerViewsTemplate leftMiddle;
    protected MultipleFingerViewsTemplate leftRing;
    protected MultipleFingerViewsTemplate leftLittle;

    /**
     * Obtiene el valor de la propiedad rightThumb.
     * 
     * @return
     *     possible object is
     *     {@link MultipleFingerViewsTemplate }
     *     
     */
    public MultipleFingerViewsTemplate getRightThumb() {
        return rightThumb;
    }

    /**
     * Define el valor de la propiedad rightThumb.
     * 
     * @param value
     *     allowed object is
     *     {@link MultipleFingerViewsTemplate }
     *     
     */
    public void setRightThumb(MultipleFingerViewsTemplate value) {
        this.rightThumb = value;
    }

    /**
     * Obtiene el valor de la propiedad rightIndex.
     * 
     * @return
     *     possible object is
     *     {@link MultipleFingerViewsTemplate }
     *     
     */
    public MultipleFingerViewsTemplate getRightIndex() {
        return rightIndex;
    }

    /**
     * Define el valor de la propiedad rightIndex.
     * 
     * @param value
     *     allowed object is
     *     {@link MultipleFingerViewsTemplate }
     *     
     */
    public void setRightIndex(MultipleFingerViewsTemplate value) {
        this.rightIndex = value;
    }

    /**
     * Obtiene el valor de la propiedad rightMiddle.
     * 
     * @return
     *     possible object is
     *     {@link MultipleFingerViewsTemplate }
     *     
     */
    public MultipleFingerViewsTemplate getRightMiddle() {
        return rightMiddle;
    }

    /**
     * Define el valor de la propiedad rightMiddle.
     * 
     * @param value
     *     allowed object is
     *     {@link MultipleFingerViewsTemplate }
     *     
     */
    public void setRightMiddle(MultipleFingerViewsTemplate value) {
        this.rightMiddle = value;
    }

    /**
     * Obtiene el valor de la propiedad rightRing.
     * 
     * @return
     *     possible object is
     *     {@link MultipleFingerViewsTemplate }
     *     
     */
    public MultipleFingerViewsTemplate getRightRing() {
        return rightRing;
    }

    /**
     * Define el valor de la propiedad rightRing.
     * 
     * @param value
     *     allowed object is
     *     {@link MultipleFingerViewsTemplate }
     *     
     */
    public void setRightRing(MultipleFingerViewsTemplate value) {
        this.rightRing = value;
    }

    /**
     * Obtiene el valor de la propiedad rightLittle.
     * 
     * @return
     *     possible object is
     *     {@link MultipleFingerViewsTemplate }
     *     
     */
    public MultipleFingerViewsTemplate getRightLittle() {
        return rightLittle;
    }

    /**
     * Define el valor de la propiedad rightLittle.
     * 
     * @param value
     *     allowed object is
     *     {@link MultipleFingerViewsTemplate }
     *     
     */
    public void setRightLittle(MultipleFingerViewsTemplate value) {
        this.rightLittle = value;
    }

    /**
     * Obtiene el valor de la propiedad leftThumb.
     * 
     * @return
     *     possible object is
     *     {@link MultipleFingerViewsTemplate }
     *     
     */
    public MultipleFingerViewsTemplate getLeftThumb() {
        return leftThumb;
    }

    /**
     * Define el valor de la propiedad leftThumb.
     * 
     * @param value
     *     allowed object is
     *     {@link MultipleFingerViewsTemplate }
     *     
     */
    public void setLeftThumb(MultipleFingerViewsTemplate value) {
        this.leftThumb = value;
    }

    /**
     * Obtiene el valor de la propiedad leftIndex.
     * 
     * @return
     *     possible object is
     *     {@link MultipleFingerViewsTemplate }
     *     
     */
    public MultipleFingerViewsTemplate getLeftIndex() {
        return leftIndex;
    }

    /**
     * Define el valor de la propiedad leftIndex.
     * 
     * @param value
     *     allowed object is
     *     {@link MultipleFingerViewsTemplate }
     *     
     */
    public void setLeftIndex(MultipleFingerViewsTemplate value) {
        this.leftIndex = value;
    }

    /**
     * Obtiene el valor de la propiedad leftMiddle.
     * 
     * @return
     *     possible object is
     *     {@link MultipleFingerViewsTemplate }
     *     
     */
    public MultipleFingerViewsTemplate getLeftMiddle() {
        return leftMiddle;
    }

    /**
     * Define el valor de la propiedad leftMiddle.
     * 
     * @param value
     *     allowed object is
     *     {@link MultipleFingerViewsTemplate }
     *     
     */
    public void setLeftMiddle(MultipleFingerViewsTemplate value) {
        this.leftMiddle = value;
    }

    /**
     * Obtiene el valor de la propiedad leftRing.
     * 
     * @return
     *     possible object is
     *     {@link MultipleFingerViewsTemplate }
     *     
     */
    public MultipleFingerViewsTemplate getLeftRing() {
        return leftRing;
    }

    /**
     * Define el valor de la propiedad leftRing.
     * 
     * @param value
     *     allowed object is
     *     {@link MultipleFingerViewsTemplate }
     *     
     */
    public void setLeftRing(MultipleFingerViewsTemplate value) {
        this.leftRing = value;
    }

    /**
     * Obtiene el valor de la propiedad leftLittle.
     * 
     * @return
     *     possible object is
     *     {@link MultipleFingerViewsTemplate }
     *     
     */
    public MultipleFingerViewsTemplate getLeftLittle() {
        return leftLittle;
    }

    /**
     * Define el valor de la propiedad leftLittle.
     * 
     * @param value
     *     allowed object is
     *     {@link MultipleFingerViewsTemplate }
     *     
     */
    public void setLeftLittle(MultipleFingerViewsTemplate value) {
        this.leftLittle = value;
    }

}
