
package Huella_import;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SequenceCheckError complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SequenceCheckError"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="type" type="{http://www.morpho.com/mbss/generic/wsdl}SequenceCheckErrorType"/&gt;
 *         &lt;element name="confidence" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="items" type="{http://www.morpho.com/mbss/generic/wsdl}SequenceCheckErrorItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SequenceCheckError", propOrder = {
    "type",
    "confidence",
    "items"
})
public class SequenceCheckError {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected SequenceCheckErrorType type;
    protected int confidence;
    protected List<SequenceCheckErrorItem> items;

    /**
     * Obtiene el valor de la propiedad type.
     * 
     * @return
     *     possible object is
     *     {@link SequenceCheckErrorType }
     *     
     */
    public SequenceCheckErrorType getType() {
        return type;
    }

    /**
     * Define el valor de la propiedad type.
     * 
     * @param value
     *     allowed object is
     *     {@link SequenceCheckErrorType }
     *     
     */
    public void setType(SequenceCheckErrorType value) {
        this.type = value;
    }

    /**
     * Obtiene el valor de la propiedad confidence.
     * 
     */
    public int getConfidence() {
        return confidence;
    }

    /**
     * Define el valor de la propiedad confidence.
     * 
     */
    public void setConfidence(int value) {
        this.confidence = value;
    }

    /**
     * Gets the value of the items property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the items property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SequenceCheckErrorItem }
     * 
     * 
     */
    public List<SequenceCheckErrorItem> getItems() {
        if (items == null) {
            items = new ArrayList<SequenceCheckErrorItem>();
        }
        return this.items;
    }

}
