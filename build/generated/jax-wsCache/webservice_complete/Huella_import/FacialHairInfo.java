
package Huella_import;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FacialHairInfo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FacialHairInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="noFacialHair" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="mustache" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="beard" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FacialHairInfo", propOrder = {
    "noFacialHair",
    "mustache",
    "beard"
})
public class FacialHairInfo {

    protected Float noFacialHair;
    protected Float mustache;
    protected Float beard;

    /**
     * Obtiene el valor de la propiedad noFacialHair.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getNoFacialHair() {
        return noFacialHair;
    }

    /**
     * Define el valor de la propiedad noFacialHair.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setNoFacialHair(Float value) {
        this.noFacialHair = value;
    }

    /**
     * Obtiene el valor de la propiedad mustache.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMustache() {
        return mustache;
    }

    /**
     * Define el valor de la propiedad mustache.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMustache(Float value) {
        this.mustache = value;
    }

    /**
     * Obtiene el valor de la propiedad beard.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getBeard() {
        return beard;
    }

    /**
     * Define el valor de la propiedad beard.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setBeard(Float value) {
        this.beard = value;
    }

}
