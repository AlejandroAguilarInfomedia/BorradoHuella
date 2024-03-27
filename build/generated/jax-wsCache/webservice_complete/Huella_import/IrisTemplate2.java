
package Huella_import;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para IrisTemplate2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="IrisTemplate2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="eyes" type="{http://www.morpho.com/mbss/generic/wsdl}Template" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IrisTemplate2", propOrder = {
    "eyes"
})
public class IrisTemplate2 {

    protected Template eyes;

    /**
     * Obtiene el valor de la propiedad eyes.
     * 
     * @return
     *     possible object is
     *     {@link Template }
     *     
     */
    public Template getEyes() {
        return eyes;
    }

    /**
     * Define el valor de la propiedad eyes.
     * 
     * @param value
     *     allowed object is
     *     {@link Template }
     *     
     */
    public void setEyes(Template value) {
        this.eyes = value;
    }

}
