
package Huella_import;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PartialUpdatePerson complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PartialUpdatePerson"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="insertRegistration" type="{http://www.morpho.com/mbss/generic/wsdl}Registration" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="updateRegistration" type="{http://www.morpho.com/mbss/generic/wsdl}Registration" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="deleteRegistrationId" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="filterSet" type="{http://www.morpho.com/mbss/generic/wsdl}FilterSet" minOccurs="0"/&gt;
 *         &lt;element name="clientData" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="clientDataVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartialUpdatePerson", propOrder = {
    "id",
    "insertRegistration",
    "updateRegistration",
    "deleteRegistrationId",
    "filterSet",
    "clientData",
    "clientDataVersion"
})
public class PartialUpdatePerson {

    @XmlElement(required = true)
    protected String id;
    protected List<Registration> insertRegistration;
    protected List<Registration> updateRegistration;
    @XmlElement(type = Long.class)
    protected List<Long> deleteRegistrationId;
    protected FilterSet filterSet;
    protected byte[] clientData;
    protected String clientDataVersion;

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
     * Gets the value of the insertRegistration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the insertRegistration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInsertRegistration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Registration }
     * 
     * 
     */
    public List<Registration> getInsertRegistration() {
        if (insertRegistration == null) {
            insertRegistration = new ArrayList<Registration>();
        }
        return this.insertRegistration;
    }

    /**
     * Gets the value of the updateRegistration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the updateRegistration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUpdateRegistration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Registration }
     * 
     * 
     */
    public List<Registration> getUpdateRegistration() {
        if (updateRegistration == null) {
            updateRegistration = new ArrayList<Registration>();
        }
        return this.updateRegistration;
    }

    /**
     * Gets the value of the deleteRegistrationId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deleteRegistrationId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeleteRegistrationId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getDeleteRegistrationId() {
        if (deleteRegistrationId == null) {
            deleteRegistrationId = new ArrayList<Long>();
        }
        return this.deleteRegistrationId;
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

}
