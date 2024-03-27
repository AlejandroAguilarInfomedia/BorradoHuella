
package Huella_import;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para NumericFilter complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="NumericFilter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="operation" type="{http://www.morpho.com/mbss/generic/wsdl}NumericOperation"/&gt;
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="interval" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumericFilter", propOrder = {
    "id",
    "operation",
    "value",
    "interval"
})
public class NumericFilter {

    protected int id;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected NumericOperation operation;
    protected long value;
    protected Long interval;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad operation.
     * 
     * @return
     *     possible object is
     *     {@link NumericOperation }
     *     
     */
    public NumericOperation getOperation() {
        return operation;
    }

    /**
     * Define el valor de la propiedad operation.
     * 
     * @param value
     *     allowed object is
     *     {@link NumericOperation }
     *     
     */
    public void setOperation(NumericOperation value) {
        this.operation = value;
    }

    /**
     * Obtiene el valor de la propiedad value.
     * 
     */
    public long getValue() {
        return value;
    }

    /**
     * Define el valor de la propiedad value.
     * 
     */
    public void setValue(long value) {
        this.value = value;
    }

    /**
     * Obtiene el valor de la propiedad interval.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInterval() {
        return interval;
    }

    /**
     * Define el valor de la propiedad interval.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInterval(Long value) {
        this.interval = value;
    }

}
