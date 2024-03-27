
package Huella_import;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SoftBiometricScores complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SoftBiometricScores"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="genderMale" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="glasses" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="age" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="faceness" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="facialHairInfo" type="{http://www.morpho.com/mbss/generic/wsdl}FacialHairInfo" minOccurs="0"/&gt;
 *         &lt;element name="surgicalMask" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SoftBiometricScores", propOrder = {
    "genderMale",
    "glasses",
    "age",
    "faceness",
    "facialHairInfo",
    "surgicalMask"
})
public class SoftBiometricScores {

    protected Float genderMale;
    protected Float glasses;
    protected Float age;
    protected Float faceness;
    protected FacialHairInfo facialHairInfo;
    protected Float surgicalMask;

    /**
     * Obtiene el valor de la propiedad genderMale.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getGenderMale() {
        return genderMale;
    }

    /**
     * Define el valor de la propiedad genderMale.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setGenderMale(Float value) {
        this.genderMale = value;
    }

    /**
     * Obtiene el valor de la propiedad glasses.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getGlasses() {
        return glasses;
    }

    /**
     * Define el valor de la propiedad glasses.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setGlasses(Float value) {
        this.glasses = value;
    }

    /**
     * Obtiene el valor de la propiedad age.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAge() {
        return age;
    }

    /**
     * Define el valor de la propiedad age.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAge(Float value) {
        this.age = value;
    }

    /**
     * Obtiene el valor de la propiedad faceness.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getFaceness() {
        return faceness;
    }

    /**
     * Define el valor de la propiedad faceness.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setFaceness(Float value) {
        this.faceness = value;
    }

    /**
     * Obtiene el valor de la propiedad facialHairInfo.
     * 
     * @return
     *     possible object is
     *     {@link FacialHairInfo }
     *     
     */
    public FacialHairInfo getFacialHairInfo() {
        return facialHairInfo;
    }

    /**
     * Define el valor de la propiedad facialHairInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link FacialHairInfo }
     *     
     */
    public void setFacialHairInfo(FacialHairInfo value) {
        this.facialHairInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad surgicalMask.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSurgicalMask() {
        return surgicalMask;
    }

    /**
     * Define el valor de la propiedad surgicalMask.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSurgicalMask(Float value) {
        this.surgicalMask = value;
    }

}
