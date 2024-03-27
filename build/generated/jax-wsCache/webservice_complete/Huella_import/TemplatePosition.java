
package Huella_import;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TemplatePosition complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TemplatePosition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="registrationId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="sampleId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="position" type="{http://www.morpho.com/mbss/generic/wsdl}Position"/&gt;
 *         &lt;element name="template" type="{http://www.morpho.com/mbss/generic/wsdl}Template" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TemplatePosition", propOrder = {
    "registrationId",
    "sampleId",
    "position",
    "template"
})
public class TemplatePosition {

    protected long registrationId;
    protected long sampleId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Position position;
    protected Template template;

    /**
     * Obtiene el valor de la propiedad registrationId.
     * 
     */
    public long getRegistrationId() {
        return registrationId;
    }

    /**
     * Define el valor de la propiedad registrationId.
     * 
     */
    public void setRegistrationId(long value) {
        this.registrationId = value;
    }

    /**
     * Obtiene el valor de la propiedad sampleId.
     * 
     */
    public long getSampleId() {
        return sampleId;
    }

    /**
     * Define el valor de la propiedad sampleId.
     * 
     */
    public void setSampleId(long value) {
        this.sampleId = value;
    }

    /**
     * Obtiene el valor de la propiedad position.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getPosition() {
        return position;
    }

    /**
     * Define el valor de la propiedad position.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setPosition(Position value) {
        this.position = value;
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

}
