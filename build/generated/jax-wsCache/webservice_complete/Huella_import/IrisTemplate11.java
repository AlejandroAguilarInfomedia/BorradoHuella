
package Huella_import;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para IrisTemplate11 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="IrisTemplate11"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="leftEye" type="{http://www.morpho.com/mbss/generic/wsdl}Template" minOccurs="0"/&gt;
 *         &lt;element name="rightEye" type="{http://www.morpho.com/mbss/generic/wsdl}Template" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IrisTemplate11", propOrder = {
    "leftEye",
    "rightEye"
})
public class IrisTemplate11 {

    protected Template leftEye;
    protected Template rightEye;

    /**
     * Obtiene el valor de la propiedad leftEye.
     * 
     * @return
     *     possible object is
     *     {@link Template }
     *     
     */
    public Template getLeftEye() {
        return leftEye;
    }

    /**
     * Define el valor de la propiedad leftEye.
     * 
     * @param value
     *     allowed object is
     *     {@link Template }
     *     
     */
    public void setLeftEye(Template value) {
        this.leftEye = value;
    }

    /**
     * Obtiene el valor de la propiedad rightEye.
     * 
     * @return
     *     possible object is
     *     {@link Template }
     *     
     */
    public Template getRightEye() {
        return rightEye;
    }

    /**
     * Define el valor de la propiedad rightEye.
     * 
     * @param value
     *     allowed object is
     *     {@link Template }
     *     
     */
    public void setRightEye(Template value) {
        this.rightEye = value;
    }

}
