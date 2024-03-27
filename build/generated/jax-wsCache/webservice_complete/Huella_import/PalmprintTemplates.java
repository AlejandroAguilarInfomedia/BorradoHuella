
package Huella_import;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PalmprintTemplates complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PalmprintTemplates"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rightLowerHand" type="{http://www.morpho.com/mbss/generic/wsdl}Template" minOccurs="0"/&gt;
 *         &lt;element name="rightWriterPalm" type="{http://www.morpho.com/mbss/generic/wsdl}Template" minOccurs="0"/&gt;
 *         &lt;element name="leftLowerHand" type="{http://www.morpho.com/mbss/generic/wsdl}Template" minOccurs="0"/&gt;
 *         &lt;element name="leftWriterPalm" type="{http://www.morpho.com/mbss/generic/wsdl}Template" minOccurs="0"/&gt;
 *         &lt;element name="rightUpperHand" type="{http://www.morpho.com/mbss/generic/wsdl}Template" minOccurs="0"/&gt;
 *         &lt;element name="leftUpperHand" type="{http://www.morpho.com/mbss/generic/wsdl}Template" minOccurs="0"/&gt;
 *         &lt;element name="rightThenar" type="{http://www.morpho.com/mbss/generic/wsdl}Template" minOccurs="0"/&gt;
 *         &lt;element name="leftThenar" type="{http://www.morpho.com/mbss/generic/wsdl}Template" minOccurs="0"/&gt;
 *         &lt;element name="rightHypothenar" type="{http://www.morpho.com/mbss/generic/wsdl}Template" minOccurs="0"/&gt;
 *         &lt;element name="leftHypothenar" type="{http://www.morpho.com/mbss/generic/wsdl}Template" minOccurs="0"/&gt;
 *         &lt;element name="rightInterdigital" type="{http://www.morpho.com/mbss/generic/wsdl}Template" minOccurs="0"/&gt;
 *         &lt;element name="leftInterdigital" type="{http://www.morpho.com/mbss/generic/wsdl}Template" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PalmprintTemplates", propOrder = {
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
public class PalmprintTemplates {

    protected Template rightLowerHand;
    protected Template rightWriterPalm;
    protected Template leftLowerHand;
    protected Template leftWriterPalm;
    protected Template rightUpperHand;
    protected Template leftUpperHand;
    protected Template rightThenar;
    protected Template leftThenar;
    protected Template rightHypothenar;
    protected Template leftHypothenar;
    protected Template rightInterdigital;
    protected Template leftInterdigital;

    /**
     * Obtiene el valor de la propiedad rightLowerHand.
     * 
     * @return
     *     possible object is
     *     {@link Template }
     *     
     */
    public Template getRightLowerHand() {
        return rightLowerHand;
    }

    /**
     * Define el valor de la propiedad rightLowerHand.
     * 
     * @param value
     *     allowed object is
     *     {@link Template }
     *     
     */
    public void setRightLowerHand(Template value) {
        this.rightLowerHand = value;
    }

    /**
     * Obtiene el valor de la propiedad rightWriterPalm.
     * 
     * @return
     *     possible object is
     *     {@link Template }
     *     
     */
    public Template getRightWriterPalm() {
        return rightWriterPalm;
    }

    /**
     * Define el valor de la propiedad rightWriterPalm.
     * 
     * @param value
     *     allowed object is
     *     {@link Template }
     *     
     */
    public void setRightWriterPalm(Template value) {
        this.rightWriterPalm = value;
    }

    /**
     * Obtiene el valor de la propiedad leftLowerHand.
     * 
     * @return
     *     possible object is
     *     {@link Template }
     *     
     */
    public Template getLeftLowerHand() {
        return leftLowerHand;
    }

    /**
     * Define el valor de la propiedad leftLowerHand.
     * 
     * @param value
     *     allowed object is
     *     {@link Template }
     *     
     */
    public void setLeftLowerHand(Template value) {
        this.leftLowerHand = value;
    }

    /**
     * Obtiene el valor de la propiedad leftWriterPalm.
     * 
     * @return
     *     possible object is
     *     {@link Template }
     *     
     */
    public Template getLeftWriterPalm() {
        return leftWriterPalm;
    }

    /**
     * Define el valor de la propiedad leftWriterPalm.
     * 
     * @param value
     *     allowed object is
     *     {@link Template }
     *     
     */
    public void setLeftWriterPalm(Template value) {
        this.leftWriterPalm = value;
    }

    /**
     * Obtiene el valor de la propiedad rightUpperHand.
     * 
     * @return
     *     possible object is
     *     {@link Template }
     *     
     */
    public Template getRightUpperHand() {
        return rightUpperHand;
    }

    /**
     * Define el valor de la propiedad rightUpperHand.
     * 
     * @param value
     *     allowed object is
     *     {@link Template }
     *     
     */
    public void setRightUpperHand(Template value) {
        this.rightUpperHand = value;
    }

    /**
     * Obtiene el valor de la propiedad leftUpperHand.
     * 
     * @return
     *     possible object is
     *     {@link Template }
     *     
     */
    public Template getLeftUpperHand() {
        return leftUpperHand;
    }

    /**
     * Define el valor de la propiedad leftUpperHand.
     * 
     * @param value
     *     allowed object is
     *     {@link Template }
     *     
     */
    public void setLeftUpperHand(Template value) {
        this.leftUpperHand = value;
    }

    /**
     * Obtiene el valor de la propiedad rightThenar.
     * 
     * @return
     *     possible object is
     *     {@link Template }
     *     
     */
    public Template getRightThenar() {
        return rightThenar;
    }

    /**
     * Define el valor de la propiedad rightThenar.
     * 
     * @param value
     *     allowed object is
     *     {@link Template }
     *     
     */
    public void setRightThenar(Template value) {
        this.rightThenar = value;
    }

    /**
     * Obtiene el valor de la propiedad leftThenar.
     * 
     * @return
     *     possible object is
     *     {@link Template }
     *     
     */
    public Template getLeftThenar() {
        return leftThenar;
    }

    /**
     * Define el valor de la propiedad leftThenar.
     * 
     * @param value
     *     allowed object is
     *     {@link Template }
     *     
     */
    public void setLeftThenar(Template value) {
        this.leftThenar = value;
    }

    /**
     * Obtiene el valor de la propiedad rightHypothenar.
     * 
     * @return
     *     possible object is
     *     {@link Template }
     *     
     */
    public Template getRightHypothenar() {
        return rightHypothenar;
    }

    /**
     * Define el valor de la propiedad rightHypothenar.
     * 
     * @param value
     *     allowed object is
     *     {@link Template }
     *     
     */
    public void setRightHypothenar(Template value) {
        this.rightHypothenar = value;
    }

    /**
     * Obtiene el valor de la propiedad leftHypothenar.
     * 
     * @return
     *     possible object is
     *     {@link Template }
     *     
     */
    public Template getLeftHypothenar() {
        return leftHypothenar;
    }

    /**
     * Define el valor de la propiedad leftHypothenar.
     * 
     * @param value
     *     allowed object is
     *     {@link Template }
     *     
     */
    public void setLeftHypothenar(Template value) {
        this.leftHypothenar = value;
    }

    /**
     * Obtiene el valor de la propiedad rightInterdigital.
     * 
     * @return
     *     possible object is
     *     {@link Template }
     *     
     */
    public Template getRightInterdigital() {
        return rightInterdigital;
    }

    /**
     * Define el valor de la propiedad rightInterdigital.
     * 
     * @param value
     *     allowed object is
     *     {@link Template }
     *     
     */
    public void setRightInterdigital(Template value) {
        this.rightInterdigital = value;
    }

    /**
     * Obtiene el valor de la propiedad leftInterdigital.
     * 
     * @return
     *     possible object is
     *     {@link Template }
     *     
     */
    public Template getLeftInterdigital() {
        return leftInterdigital;
    }

    /**
     * Define el valor de la propiedad leftInterdigital.
     * 
     * @param value
     *     allowed object is
     *     {@link Template }
     *     
     */
    public void setLeftInterdigital(Template value) {
        this.leftInterdigital = value;
    }

}
