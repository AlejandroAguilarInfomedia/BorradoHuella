
package Huella_import;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ItemInfo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ItemInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="clientDataVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mbssDataVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastModificationTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemInfo", propOrder = {
    "id",
    "clientDataVersion",
    "mbssDataVersion",
    "lastModificationTime"
})
public class ItemInfo {

    protected String id;
    protected String clientDataVersion;
    protected String mbssDataVersion;
    protected String lastModificationTime;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad clientDataVersion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientDataVersion() {
        return clientDataVersion;
    }

    /**
     * Define el valor de la propiedad clientDataVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientDataVersion(String value) {
        this.clientDataVersion = value;
    }

    /**
     * Obtiene el valor de la propiedad mbssDataVersion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMbssDataVersion() {
        return mbssDataVersion;
    }

    /**
     * Define el valor de la propiedad mbssDataVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMbssDataVersion(String value) {
        this.mbssDataVersion = value;
    }

    /**
     * Obtiene el valor de la propiedad lastModificationTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastModificationTime() {
        return lastModificationTime;
    }

    /**
     * Define el valor de la propiedad lastModificationTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastModificationTime(String value) {
        this.lastModificationTime = value;
    }

}
