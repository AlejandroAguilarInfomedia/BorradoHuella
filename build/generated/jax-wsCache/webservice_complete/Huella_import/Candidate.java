
package Huella_import;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Candidate complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Candidate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="score" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="groups" type="{http://www.morpho.com/mbss/generic/wsdl}Group" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="clientData" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="decision" type="{http://www.morpho.com/mbss/generic/wsdl}Decision"/&gt;
 *         &lt;element name="clientDataVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mbssDataVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "Candidate", propOrder = {
    "id",
    "score",
    "groups",
    "clientData",
    "decision",
    "clientDataVersion",
    "mbssDataVersion",
    "rvid"
})
public class Candidate {

    @XmlElement(required = true)
    protected String id;
    protected int score;
    protected List<Group> groups;
    protected byte[] clientData;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Decision decision;
    protected String clientDataVersion;
    protected String mbssDataVersion;
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
     * Obtiene el valor de la propiedad score.
     * 
     */
    public int getScore() {
        return score;
    }

    /**
     * Define el valor de la propiedad score.
     * 
     */
    public void setScore(int value) {
        this.score = value;
    }

    /**
     * Gets the value of the groups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groups property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Group }
     * 
     * 
     */
    public List<Group> getGroups() {
        if (groups == null) {
            groups = new ArrayList<Group>();
        }
        return this.groups;
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
     * Obtiene el valor de la propiedad decision.
     * 
     * @return
     *     possible object is
     *     {@link Decision }
     *     
     */
    public Decision getDecision() {
        return decision;
    }

    /**
     * Define el valor de la propiedad decision.
     * 
     * @param value
     *     allowed object is
     *     {@link Decision }
     *     
     */
    public void setDecision(Decision value) {
        this.decision = value;
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
