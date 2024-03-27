
package Huella_import;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para IrisImage2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="IrisImage2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="eyes" type="{http://www.morpho.com/mbss/generic/wsdl}Image" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IrisImage2", propOrder = {
    "eyes"
})
public class IrisImage2 {

    protected Image eyes;

    /**
     * Obtiene el valor de la propiedad eyes.
     * 
     * @return
     *     possible object is
     *     {@link Image }
     *     
     */
    public Image getEyes() {
        return eyes;
    }

    /**
     * Define el valor de la propiedad eyes.
     * 
     * @param value
     *     allowed object is
     *     {@link Image }
     *     
     */
    public void setEyes(Image value) {
        this.eyes = value;
    }

}
