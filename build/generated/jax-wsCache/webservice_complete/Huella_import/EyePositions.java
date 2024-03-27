
package Huella_import;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EyePositions complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EyePositions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="leftEye" type="{http://www.morpho.com/mbss/generic/wsdl}Point"/&gt;
 *         &lt;element name="rightEye" type="{http://www.morpho.com/mbss/generic/wsdl}Point"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EyePositions", propOrder = {
    "leftEye",
    "rightEye"
})
public class EyePositions {

    @XmlElement(required = true)
    protected Point leftEye;
    @XmlElement(required = true)
    protected Point rightEye;

    /**
     * Obtiene el valor de la propiedad leftEye.
     * 
     * @return
     *     possible object is
     *     {@link Point }
     *     
     */
    public Point getLeftEye() {
        return leftEye;
    }

    /**
     * Define el valor de la propiedad leftEye.
     * 
     * @param value
     *     allowed object is
     *     {@link Point }
     *     
     */
    public void setLeftEye(Point value) {
        this.leftEye = value;
    }

    /**
     * Obtiene el valor de la propiedad rightEye.
     * 
     * @return
     *     possible object is
     *     {@link Point }
     *     
     */
    public Point getRightEye() {
        return rightEye;
    }

    /**
     * Define el valor de la propiedad rightEye.
     * 
     * @param value
     *     allowed object is
     *     {@link Point }
     *     
     */
    public void setRightEye(Point value) {
        this.rightEye = value;
    }

}
