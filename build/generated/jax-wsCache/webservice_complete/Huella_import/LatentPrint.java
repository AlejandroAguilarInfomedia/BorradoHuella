
package Huella_import;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para LatentPrint complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="LatentPrint"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="image" type="{http://www.morpho.com/mbss/generic/wsdl}Image" minOccurs="0"/&gt;
 *         &lt;element name="box" type="{http://www.morpho.com/mbss/generic/wsdl}Box" minOccurs="0"/&gt;
 *         &lt;element name="template" type="{http://www.morpho.com/mbss/generic/wsdl}Template" minOccurs="0"/&gt;
 *         &lt;element name="oriented" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="position" type="{http://www.morpho.com/mbss/generic/wsdl}LatentPosition"/&gt;
 *         &lt;element name="filterSet" type="{http://www.morpho.com/mbss/generic/wsdl}FilterSet" minOccurs="0"/&gt;
 *         &lt;element name="minutiae" type="{http://www.morpho.com/mbss/generic/wsdl}Minutia" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="cores" type="{http://www.morpho.com/mbss/generic/wsdl}Core" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="deltas" type="{http://www.morpho.com/mbss/generic/wsdl}Delta" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="polygonVertices" type="{http://www.morpho.com/mbss/generic/wsdl}Point" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="skeleton" type="{http://www.morpho.com/mbss/generic/wsdl}Skeleton" minOccurs="0"/&gt;
 *         &lt;element name="maskImage" type="{http://www.morpho.com/mbss/generic/wsdl}MaskImage" minOccurs="0"/&gt;
 *         &lt;element name="patterns" type="{http://www.morpho.com/mbss/generic/wsdl}Pattern" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "LatentPrint", propOrder = {
    "id",
    "image",
    "box",
    "template",
    "oriented",
    "position",
    "filterSet",
    "minutiae",
    "cores",
    "deltas",
    "polygonVertices",
    "skeleton",
    "maskImage",
    "patterns",
    "clientData",
    "clientDataVersion",
    "mbssDataVersion",
    "lastModificationTime",
    "rvid"
})
public class LatentPrint {

    @XmlElement(required = true)
    protected String id;
    protected Image image;
    protected Box box;
    protected Template template;
    protected boolean oriented;
    @XmlElement(required = true)
    protected LatentPosition position;
    protected FilterSet filterSet;
    protected List<Minutia> minutiae;
    protected List<Core> cores;
    protected List<Delta> deltas;
    protected List<Point> polygonVertices;
    protected Skeleton skeleton;
    protected MaskImage maskImage;
    @XmlSchemaType(name = "string")
    protected List<Pattern> patterns;
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
     * Obtiene el valor de la propiedad image.
     * 
     * @return
     *     possible object is
     *     {@link Image }
     *     
     */
    public Image getImage() {
        return image;
    }

    /**
     * Define el valor de la propiedad image.
     * 
     * @param value
     *     allowed object is
     *     {@link Image }
     *     
     */
    public void setImage(Image value) {
        this.image = value;
    }

    /**
     * Obtiene el valor de la propiedad box.
     * 
     * @return
     *     possible object is
     *     {@link Box }
     *     
     */
    public Box getBox() {
        return box;
    }

    /**
     * Define el valor de la propiedad box.
     * 
     * @param value
     *     allowed object is
     *     {@link Box }
     *     
     */
    public void setBox(Box value) {
        this.box = value;
    }

    /**
     * Obtiene el valor de la propiedad template.
     * 
     * @return
     *     possible object is
     *     {@link Template }
     *     
     */
    public Template getTemplate() {
        return template;
    }

    /**
     * Define el valor de la propiedad template.
     * 
     * @param value
     *     allowed object is
     *     {@link Template }
     *     
     */
    public void setTemplate(Template value) {
        this.template = value;
    }

    /**
     * Obtiene el valor de la propiedad oriented.
     * 
     */
    public boolean isOriented() {
        return oriented;
    }

    /**
     * Define el valor de la propiedad oriented.
     * 
     */
    public void setOriented(boolean value) {
        this.oriented = value;
    }

    /**
     * Obtiene el valor de la propiedad position.
     * 
     * @return
     *     possible object is
     *     {@link LatentPosition }
     *     
     */
    public LatentPosition getPosition() {
        return position;
    }

    /**
     * Define el valor de la propiedad position.
     * 
     * @param value
     *     allowed object is
     *     {@link LatentPosition }
     *     
     */
    public void setPosition(LatentPosition value) {
        this.position = value;
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
     * Gets the value of the minutiae property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the minutiae property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMinutiae().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Minutia }
     * 
     * 
     */
    public List<Minutia> getMinutiae() {
        if (minutiae == null) {
            minutiae = new ArrayList<Minutia>();
        }
        return this.minutiae;
    }

    /**
     * Gets the value of the cores property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cores property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCores().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Core }
     * 
     * 
     */
    public List<Core> getCores() {
        if (cores == null) {
            cores = new ArrayList<Core>();
        }
        return this.cores;
    }

    /**
     * Gets the value of the deltas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deltas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeltas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Delta }
     * 
     * 
     */
    public List<Delta> getDeltas() {
        if (deltas == null) {
            deltas = new ArrayList<Delta>();
        }
        return this.deltas;
    }

    /**
     * Gets the value of the polygonVertices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the polygonVertices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolygonVertices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Point }
     * 
     * 
     */
    public List<Point> getPolygonVertices() {
        if (polygonVertices == null) {
            polygonVertices = new ArrayList<Point>();
        }
        return this.polygonVertices;
    }

    /**
     * Obtiene el valor de la propiedad skeleton.
     * 
     * @return
     *     possible object is
     *     {@link Skeleton }
     *     
     */
    public Skeleton getSkeleton() {
        return skeleton;
    }

    /**
     * Define el valor de la propiedad skeleton.
     * 
     * @param value
     *     allowed object is
     *     {@link Skeleton }
     *     
     */
    public void setSkeleton(Skeleton value) {
        this.skeleton = value;
    }

    /**
     * Obtiene el valor de la propiedad maskImage.
     * 
     * @return
     *     possible object is
     *     {@link MaskImage }
     *     
     */
    public MaskImage getMaskImage() {
        return maskImage;
    }

    /**
     * Define el valor de la propiedad maskImage.
     * 
     * @param value
     *     allowed object is
     *     {@link MaskImage }
     *     
     */
    public void setMaskImage(MaskImage value) {
        this.maskImage = value;
    }

    /**
     * Gets the value of the patterns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the patterns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPatterns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Pattern }
     * 
     * 
     */
    public List<Pattern> getPatterns() {
        if (patterns == null) {
            patterns = new ArrayList<Pattern>();
        }
        return this.patterns;
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
