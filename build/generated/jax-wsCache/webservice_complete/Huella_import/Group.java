
package Huella_import;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Group complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Group"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="type" type="{http://www.morpho.com/mbss/generic/wsdl}GroupType"/&gt;
 *         &lt;element name="score" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="segmentResults" type="{http://www.morpho.com/mbss/generic/wsdl}SegmentResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="segmentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Group", propOrder = {
    "type",
    "score",
    "segmentResults",
    "segmentType"
})
public class Group {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected GroupType type;
    protected int score;
    protected List<SegmentResult> segmentResults;
    protected String segmentType;

    /**
     * Obtiene el valor de la propiedad type.
     * 
     * @return
     *     possible object is
     *     {@link GroupType }
     *     
     */
    public GroupType getType() {
        return type;
    }

    /**
     * Define el valor de la propiedad type.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupType }
     *     
     */
    public void setType(GroupType value) {
        this.type = value;
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
     * Gets the value of the segmentResults property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segmentResults property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegmentResults().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SegmentResult }
     * 
     * 
     */
    public List<SegmentResult> getSegmentResults() {
        if (segmentResults == null) {
            segmentResults = new ArrayList<SegmentResult>();
        }
        return this.segmentResults;
    }

    /**
     * Obtiene el valor de la propiedad segmentType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentType() {
        return segmentType;
    }

    /**
     * Define el valor de la propiedad segmentType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmentType(String value) {
        this.segmentType = value;
    }

}
