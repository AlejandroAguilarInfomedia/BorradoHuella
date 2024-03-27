
package Huella_import;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Version complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Version"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="requestedInterfaceVersion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Version", propOrder = {
    "requestedInterfaceVersion"
})
public class Version {

    @XmlElement(required = true)
    protected String requestedInterfaceVersion;

    /**
     * Obtiene el valor de la propiedad requestedInterfaceVersion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestedInterfaceVersion() {
        return requestedInterfaceVersion;
    }

    /**
     * Define el valor de la propiedad requestedInterfaceVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestedInterfaceVersion(String value) {
        this.requestedInterfaceVersion = value;
    }

}
