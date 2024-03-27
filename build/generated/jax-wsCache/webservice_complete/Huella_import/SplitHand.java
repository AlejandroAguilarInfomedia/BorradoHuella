
package Huella_import;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SplitHand complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SplitHand"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rightLowerHand" type="{http://www.morpho.com/mbss/generic/wsdl}Image" minOccurs="0"/&gt;
 *         &lt;element name="rightWriterPalm" type="{http://www.morpho.com/mbss/generic/wsdl}Image" minOccurs="0"/&gt;
 *         &lt;element name="leftLowerHand" type="{http://www.morpho.com/mbss/generic/wsdl}Image" minOccurs="0"/&gt;
 *         &lt;element name="leftWriterPalm" type="{http://www.morpho.com/mbss/generic/wsdl}Image" minOccurs="0"/&gt;
 *         &lt;element name="rightUpperHand" type="{http://www.morpho.com/mbss/generic/wsdl}Image" minOccurs="0"/&gt;
 *         &lt;element name="leftUpperHand" type="{http://www.morpho.com/mbss/generic/wsdl}Image" minOccurs="0"/&gt;
 *         &lt;element name="rightThenar" type="{http://www.morpho.com/mbss/generic/wsdl}Image" minOccurs="0"/&gt;
 *         &lt;element name="leftThenar" type="{http://www.morpho.com/mbss/generic/wsdl}Image" minOccurs="0"/&gt;
 *         &lt;element name="rightHypothenar" type="{http://www.morpho.com/mbss/generic/wsdl}Image" minOccurs="0"/&gt;
 *         &lt;element name="leftHypothenar" type="{http://www.morpho.com/mbss/generic/wsdl}Image" minOccurs="0"/&gt;
 *         &lt;element name="rightInterdigital" type="{http://www.morpho.com/mbss/generic/wsdl}Image" minOccurs="0"/&gt;
 *         &lt;element name="leftInterdigital" type="{http://www.morpho.com/mbss/generic/wsdl}Image" minOccurs="0"/&gt;
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
@XmlType(name = "SplitHand", propOrder = {
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
    "leftInterdigital",
    "missingFingers"
})
public class SplitHand {

    protected Image rightLowerHand;
    protected Image rightWriterPalm;
    protected Image leftLowerHand;
    protected Image leftWriterPalm;
    protected Image rightUpperHand;
    protected Image leftUpperHand;
    protected Image rightThenar;
    protected Image leftThenar;
    protected Image rightHypothenar;
    protected Image leftHypothenar;
    protected Image rightInterdigital;
    protected Image leftInterdigital;
    protected MissingFingers missingFingers;

    /**
     * Obtiene el valor de la propiedad rightLowerHand.
     * 
     * @return
     *     possible object is
     *     {@link Image }
     *     
     */
    public Image getRightLowerHand() {
        return rightLowerHand;
    }

    /**
     * Define el valor de la propiedad rightLowerHand.
     * 
     * @param value
     *     allowed object is
     *     {@link Image }
     *     
     */
    public void setRightLowerHand(Image value) {
        this.rightLowerHand = value;
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
     * Obtiene el valor de la propiedad leftLowerHand.
     * 
     * @return
     *     possible object is
     *     {@link Image }
     *     
     */
    public Image getLeftLowerHand() {
        return leftLowerHand;
    }

    /**
     * Define el valor de la propiedad leftLowerHand.
     * 
     * @param value
     *     allowed object is
     *     {@link Image }
     *     
     */
    public void setLeftLowerHand(Image value) {
        this.leftLowerHand = value;
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
     * Obtiene el valor de la propiedad rightUpperHand.
     * 
     * @return
     *     possible object is
     *     {@link Image }
     *     
     */
    public Image getRightUpperHand() {
        return rightUpperHand;
    }

    /**
     * Define el valor de la propiedad rightUpperHand.
     * 
     * @param value
     *     allowed object is
     *     {@link Image }
     *     
     */
    public void setRightUpperHand(Image value) {
        this.rightUpperHand = value;
    }

    /**
     * Obtiene el valor de la propiedad leftUpperHand.
     * 
     * @return
     *     possible object is
     *     {@link Image }
     *     
     */
    public Image getLeftUpperHand() {
        return leftUpperHand;
    }

    /**
     * Define el valor de la propiedad leftUpperHand.
     * 
     * @param value
     *     allowed object is
     *     {@link Image }
     *     
     */
    public void setLeftUpperHand(Image value) {
        this.leftUpperHand = value;
    }

    /**
     * Obtiene el valor de la propiedad rightThenar.
     * 
     * @return
     *     possible object is
     *     {@link Image }
     *     
     */
    public Image getRightThenar() {
        return rightThenar;
    }

    /**
     * Define el valor de la propiedad rightThenar.
     * 
     * @param value
     *     allowed object is
     *     {@link Image }
     *     
     */
    public void setRightThenar(Image value) {
        this.rightThenar = value;
    }

    /**
     * Obtiene el valor de la propiedad leftThenar.
     * 
     * @return
     *     possible object is
     *     {@link Image }
     *     
     */
    public Image getLeftThenar() {
        return leftThenar;
    }

    /**
     * Define el valor de la propiedad leftThenar.
     * 
     * @param value
     *     allowed object is
     *     {@link Image }
     *     
     */
    public void setLeftThenar(Image value) {
        this.leftThenar = value;
    }

    /**
     * Obtiene el valor de la propiedad rightHypothenar.
     * 
     * @return
     *     possible object is
     *     {@link Image }
     *     
     */
    public Image getRightHypothenar() {
        return rightHypothenar;
    }

    /**
     * Define el valor de la propiedad rightHypothenar.
     * 
     * @param value
     *     allowed object is
     *     {@link Image }
     *     
     */
    public void setRightHypothenar(Image value) {
        this.rightHypothenar = value;
    }

    /**
     * Obtiene el valor de la propiedad leftHypothenar.
     * 
     * @return
     *     possible object is
     *     {@link Image }
     *     
     */
    public Image getLeftHypothenar() {
        return leftHypothenar;
    }

    /**
     * Define el valor de la propiedad leftHypothenar.
     * 
     * @param value
     *     allowed object is
     *     {@link Image }
     *     
     */
    public void setLeftHypothenar(Image value) {
        this.leftHypothenar = value;
    }

    /**
     * Obtiene el valor de la propiedad rightInterdigital.
     * 
     * @return
     *     possible object is
     *     {@link Image }
     *     
     */
    public Image getRightInterdigital() {
        return rightInterdigital;
    }

    /**
     * Define el valor de la propiedad rightInterdigital.
     * 
     * @param value
     *     allowed object is
     *     {@link Image }
     *     
     */
    public void setRightInterdigital(Image value) {
        this.rightInterdigital = value;
    }

    /**
     * Obtiene el valor de la propiedad leftInterdigital.
     * 
     * @return
     *     possible object is
     *     {@link Image }
     *     
     */
    public Image getLeftInterdigital() {
        return leftInterdigital;
    }

    /**
     * Define el valor de la propiedad leftInterdigital.
     * 
     * @param value
     *     allowed object is
     *     {@link Image }
     *     
     */
    public void setLeftInterdigital(Image value) {
        this.leftInterdigital = value;
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
