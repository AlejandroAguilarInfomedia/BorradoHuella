
package Huella_import;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FacialInformation complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FacialInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="male" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="female" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="glasses" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="age" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="pitch" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="roll" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="yaw" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FacialInformation", propOrder = {
    "male",
    "female",
    "glasses",
    "age",
    "pitch",
    "roll",
    "yaw"
})
public class FacialInformation {

    protected Float male;
    protected Float female;
    protected Float glasses;
    protected Float age;
    protected Float pitch;
    protected Float roll;
    protected Float yaw;

    /**
     * Obtiene el valor de la propiedad male.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMale() {
        return male;
    }

    /**
     * Define el valor de la propiedad male.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMale(Float value) {
        this.male = value;
    }

    /**
     * Obtiene el valor de la propiedad female.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getFemale() {
        return female;
    }

    /**
     * Define el valor de la propiedad female.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setFemale(Float value) {
        this.female = value;
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
     * Obtiene el valor de la propiedad pitch.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPitch() {
        return pitch;
    }

    /**
     * Define el valor de la propiedad pitch.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPitch(Float value) {
        this.pitch = value;
    }

    /**
     * Obtiene el valor de la propiedad roll.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRoll() {
        return roll;
    }

    /**
     * Define el valor de la propiedad roll.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRoll(Float value) {
        this.roll = value;
    }

    /**
     * Obtiene el valor de la propiedad yaw.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getYaw() {
        return yaw;
    }

    /**
     * Define el valor de la propiedad yaw.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setYaw(Float value) {
        this.yaw = value;
    }

}
