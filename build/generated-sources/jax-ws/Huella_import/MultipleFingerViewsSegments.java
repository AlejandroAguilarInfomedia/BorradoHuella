
package Huella_import;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para MultipleFingerViewsSegments complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MultipleFingerViewsSegments"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rightThumb" type="{http://www.morpho.com/mbss/generic/wsdl}MultipleFingerViewsBoxes" minOccurs="0"/&gt;
 *         &lt;element name="rightIndex" type="{http://www.morpho.com/mbss/generic/wsdl}MultipleFingerViewsBoxes" minOccurs="0"/&gt;
 *         &lt;element name="rightMiddle" type="{http://www.morpho.com/mbss/generic/wsdl}MultipleFingerViewsBoxes" minOccurs="0"/&gt;
 *         &lt;element name="rightRing" type="{http://www.morpho.com/mbss/generic/wsdl}MultipleFingerViewsBoxes" minOccurs="0"/&gt;
 *         &lt;element name="rightLittle" type="{http://www.morpho.com/mbss/generic/wsdl}MultipleFingerViewsBoxes" minOccurs="0"/&gt;
 *         &lt;element name="leftThumb" type="{http://www.morpho.com/mbss/generic/wsdl}MultipleFingerViewsBoxes" minOccurs="0"/&gt;
 *         &lt;element name="leftIndex" type="{http://www.morpho.com/mbss/generic/wsdl}MultipleFingerViewsBoxes" minOccurs="0"/&gt;
 *         &lt;element name="leftMiddle" type="{http://www.morpho.com/mbss/generic/wsdl}MultipleFingerViewsBoxes" minOccurs="0"/&gt;
 *         &lt;element name="leftRing" type="{http://www.morpho.com/mbss/generic/wsdl}MultipleFingerViewsBoxes" minOccurs="0"/&gt;
 *         &lt;element name="leftLittle" type="{http://www.morpho.com/mbss/generic/wsdl}MultipleFingerViewsBoxes" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultipleFingerViewsSegments", propOrder = {
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
public class MultipleFingerViewsSegments {

    protected MultipleFingerViewsBoxes rightThumb;
    protected MultipleFingerViewsBoxes rightIndex;
    protected MultipleFingerViewsBoxes rightMiddle;
    protected MultipleFingerViewsBoxes rightRing;
    protected MultipleFingerViewsBoxes rightLittle;
    protected MultipleFingerViewsBoxes leftThumb;
    protected MultipleFingerViewsBoxes leftIndex;
    protected MultipleFingerViewsBoxes leftMiddle;
    protected MultipleFingerViewsBoxes leftRing;
    protected MultipleFingerViewsBoxes leftLittle;

    /**
     * Obtiene el valor de la propiedad rightThumb.
     * 
     * @return
     *     possible object is
     *     {@link MultipleFingerViewsBoxes }
     *     
     */
    public MultipleFingerViewsBoxes getRightThumb() {
        return rightThumb;
    }

    /**
     * Define el valor de la propiedad rightThumb.
     * 
     * @param value
     *     allowed object is
     *     {@link MultipleFingerViewsBoxes }
     *     
     */
    public void setRightThumb(MultipleFingerViewsBoxes value) {
        this.rightThumb = value;
    }

    /**
     * Obtiene el valor de la propiedad rightIndex.
     * 
     * @return
     *     possible object is
     *     {@link MultipleFingerViewsBoxes }
     *     
     */
    public MultipleFingerViewsBoxes getRightIndex() {
        return rightIndex;
    }

    /**
     * Define el valor de la propiedad rightIndex.
     * 
     * @param value
     *     allowed object is
     *     {@link MultipleFingerViewsBoxes }
     *     
     */
    public void setRightIndex(MultipleFingerViewsBoxes value) {
        this.rightIndex = value;
    }

    /**
     * Obtiene el valor de la propiedad rightMiddle.
     * 
     * @return
     *     possible object is
     *     {@link MultipleFingerViewsBoxes }
     *     
     */
    public MultipleFingerViewsBoxes getRightMiddle() {
        return rightMiddle;
    }

    /**
     * Define el valor de la propiedad rightMiddle.
     * 
     * @param value
     *     allowed object is
     *     {@link MultipleFingerViewsBoxes }
     *     
     */
    public void setRightMiddle(MultipleFingerViewsBoxes value) {
        this.rightMiddle = value;
    }

    /**
     * Obtiene el valor de la propiedad rightRing.
     * 
     * @return
     *     possible object is
     *     {@link MultipleFingerViewsBoxes }
     *     
     */
    public MultipleFingerViewsBoxes getRightRing() {
        return rightRing;
    }

    /**
     * Define el valor de la propiedad rightRing.
     * 
     * @param value
     *     allowed object is
     *     {@link MultipleFingerViewsBoxes }
     *     
     */
    public void setRightRing(MultipleFingerViewsBoxes value) {
        this.rightRing = value;
    }

    /**
     * Obtiene el valor de la propiedad rightLittle.
     * 
     * @return
     *     possible object is
     *     {@link MultipleFingerViewsBoxes }
     *     
     */
    public MultipleFingerViewsBoxes getRightLittle() {
        return rightLittle;
    }

    /**
     * Define el valor de la propiedad rightLittle.
     * 
     * @param value
     *     allowed object is
     *     {@link MultipleFingerViewsBoxes }
     *     
     */
    public void setRightLittle(MultipleFingerViewsBoxes value) {
        this.rightLittle = value;
    }

    /**
     * Obtiene el valor de la propiedad leftThumb.
     * 
     * @return
     *     possible object is
     *     {@link MultipleFingerViewsBoxes }
     *     
     */
    public MultipleFingerViewsBoxes getLeftThumb() {
        return leftThumb;
    }

    /**
     * Define el valor de la propiedad leftThumb.
     * 
     * @param value
     *     allowed object is
     *     {@link MultipleFingerViewsBoxes }
     *     
     */
    public void setLeftThumb(MultipleFingerViewsBoxes value) {
        this.leftThumb = value;
    }

    /**
     * Obtiene el valor de la propiedad leftIndex.
     * 
     * @return
     *     possible object is
     *     {@link MultipleFingerViewsBoxes }
     *     
     */
    public MultipleFingerViewsBoxes getLeftIndex() {
        return leftIndex;
    }

    /**
     * Define el valor de la propiedad leftIndex.
     * 
     * @param value
     *     allowed object is
     *     {@link MultipleFingerViewsBoxes }
     *     
     */
    public void setLeftIndex(MultipleFingerViewsBoxes value) {
        this.leftIndex = value;
    }

    /**
     * Obtiene el valor de la propiedad leftMiddle.
     * 
     * @return
     *     possible object is
     *     {@link MultipleFingerViewsBoxes }
     *     
     */
    public MultipleFingerViewsBoxes getLeftMiddle() {
        return leftMiddle;
    }

    /**
     * Define el valor de la propiedad leftMiddle.
     * 
     * @param value
     *     allowed object is
     *     {@link MultipleFingerViewsBoxes }
     *     
     */
    public void setLeftMiddle(MultipleFingerViewsBoxes value) {
        this.leftMiddle = value;
    }

    /**
     * Obtiene el valor de la propiedad leftRing.
     * 
     * @return
     *     possible object is
     *     {@link MultipleFingerViewsBoxes }
     *     
     */
    public MultipleFingerViewsBoxes getLeftRing() {
        return leftRing;
    }

    /**
     * Define el valor de la propiedad leftRing.
     * 
     * @param value
     *     allowed object is
     *     {@link MultipleFingerViewsBoxes }
     *     
     */
    public void setLeftRing(MultipleFingerViewsBoxes value) {
        this.leftRing = value;
    }

    /**
     * Obtiene el valor de la propiedad leftLittle.
     * 
     * @return
     *     possible object is
     *     {@link MultipleFingerViewsBoxes }
     *     
     */
    public MultipleFingerViewsBoxes getLeftLittle() {
        return leftLittle;
    }

    /**
     * Define el valor de la propiedad leftLittle.
     * 
     * @param value
     *     allowed object is
     *     {@link MultipleFingerViewsBoxes }
     *     
     */
    public void setLeftLittle(MultipleFingerViewsBoxes value) {
        this.leftLittle = value;
    }

}
