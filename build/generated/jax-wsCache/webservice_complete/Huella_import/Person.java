
package Huella_import;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Person complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Person"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="registration" type="{http://www.morpho.com/mbss/generic/wsdl}Registration" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="filterSet" type="{http://www.morpho.com/mbss/generic/wsdl}FilterSet" minOccurs="0"/&gt;
 *         &lt;element name="clientData" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="clientDataVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mbssDataVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastModificationTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rvid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Person", propOrder = {
    "id",
    "registration",
    "filterSet",
    "clientData",
    "clientDataVersion",
    "mbssDataVersion",
    "lastModificationTime",
    "rvid"
})
public class Person {

    @XmlElement(required = true)
    protected String id;
    protected List<Registration> registration;
    protected FilterSet filterSet;
    protected byte[] clientData;
    protected String clientDataVersion;
    protected String mbssDataVersion;
    protected String lastModificationTime;
    protected String rvid;

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
     * Gets the value of the registration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the registration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegistration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Registration }
     * 
     * 
     */
    public List<Registration> getRegistration() {
        if (registration == null) {
            registration = new ArrayList<Registration>();
        }
        return this.registration;
    }

    /**
     * Obtiene el valor de la propiedad filterSet.
     * 
     * @return
     *     possible object is
     *     {@link FilterSet }
     *     
     */
    public FilterSet getFilterSet() {
        return filterSet;
    }

    /**
     * Define el valor de la propiedad filterSet.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterSet }
     *     
     */
    public void setFilterSet(FilterSet value) {
        this.filterSet = value;
    }

    /**
     * Obtiene el valor de la propiedad clientData.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getClientData() {
        return clientData;
    }

    /**
     * Define el valor de la propiedad clientData.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setClientData(byte[] value) {
        this.clientData = value;
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

    /**
     * Obtiene el valor de la propiedad rvid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRvid() {
        return rvid;
    }

    /**
     * Define el valor de la propiedad rvid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRvid(String value) {
        this.rvid = value;
    }

}
