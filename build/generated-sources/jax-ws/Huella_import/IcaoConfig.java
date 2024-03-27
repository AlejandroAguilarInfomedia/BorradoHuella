
package Huella_import;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para IcaoConfig complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="IcaoConfig"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="computeScores" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isChild" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="computeShadowsFacial" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="computeShadowsEyeSocket" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="computeUniformLighting" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IcaoConfig", propOrder = {
    "computeScores",
    "isChild",
    "computeShadowsFacial",
    "computeShadowsEyeSocket",
    "computeUniformLighting"
})
public class IcaoConfig {

    protected Boolean computeScores;
    protected Boolean isChild;
    protected Boolean computeShadowsFacial;
    protected Boolean computeShadowsEyeSocket;
    protected Boolean computeUniformLighting;

    /**
     * Obtiene el valor de la propiedad computeScores.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isComputeScores() {
        return computeScores;
    }

    /**
     * Define el valor de la propiedad computeScores.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setComputeScores(Boolean value) {
        this.computeScores = value;
    }

    /**
     * Obtiene el valor de la propiedad isChild.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsChild() {
        return isChild;
    }

    /**
     * Define el valor de la propiedad isChild.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsChild(Boolean value) {
        this.isChild = value;
    }

    /**
     * Obtiene el valor de la propiedad computeShadowsFacial.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isComputeShadowsFacial() {
        return computeShadowsFacial;
    }

    /**
     * Define el valor de la propiedad computeShadowsFacial.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setComputeShadowsFacial(Boolean value) {
        this.computeShadowsFacial = value;
    }

    /**
     * Obtiene el valor de la propiedad computeShadowsEyeSocket.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isComputeShadowsEyeSocket() {
        return computeShadowsEyeSocket;
    }

    /**
     * Define el valor de la propiedad computeShadowsEyeSocket.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setComputeShadowsEyeSocket(Boolean value) {
        this.computeShadowsEyeSocket = value;
    }

    /**
     * Obtiene el valor de la propiedad computeUniformLighting.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isComputeUniformLighting() {
        return computeUniformLighting;
    }

    /**
     * Define el valor de la propiedad computeUniformLighting.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setComputeUniformLighting(Boolean value) {
        this.computeUniformLighting = value;
    }

}
