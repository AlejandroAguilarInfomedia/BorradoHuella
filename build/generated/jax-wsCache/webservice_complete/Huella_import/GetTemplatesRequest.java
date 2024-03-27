
package Huella_import;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GetTemplatesRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GetTemplatesRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basicRequest" type="{http://www.morpho.com/mbss/generic/wsdl}BasicRequest"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="templatePosition" type="{http://www.morpho.com/mbss/generic/wsdl}TemplatePosition" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="templateFormat" type="{http://www.morpho.com/mbss/generic/wsdl}TemplateFormatType" minOccurs="0"/&gt;
 *         &lt;element name="templateMaxSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="minutiaeOrder" type="{http://www.morpho.com/mbss/generic/wsdl}MinutiaeOrderType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetTemplatesRequest", propOrder = {
    "basicRequest",
    "id",
    "templatePosition",
    "templateFormat",
    "templateMaxSize",
    "minutiaeOrder"
})
public class GetTemplatesRequest {

    @XmlElement(required = true)
    protected BasicRequest basicRequest;
    @XmlElement(required = true)
    protected String id;
    protected List<TemplatePosition> templatePosition;
    @XmlSchemaType(name = "string")
    protected TemplateFormatType templateFormat;
    protected Integer templateMaxSize;
    @XmlSchemaType(name = "string")
    protected MinutiaeOrderType minutiaeOrder;

    /**
     * Obtiene el valor de la propiedad basicRequest.
     * 
     * @return
     *     possible object is
     *     {@link BasicRequest }
     *     
     */
    public BasicRequest getBasicRequest() {
        return basicRequest;
    }

    /**
     * Define el valor de la propiedad basicRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicRequest }
     *     
     */
    public void setBasicRequest(BasicRequest value) {
        this.basicRequest = value;
    }

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
     * Gets the value of the templatePosition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the templatePosition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTemplatePosition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TemplatePosition }
     * 
     * 
     */
    public List<TemplatePosition> getTemplatePosition() {
        if (templatePosition == null) {
            templatePosition = new ArrayList<TemplatePosition>();
        }
        return this.templatePosition;
    }

    /**
     * Obtiene el valor de la propiedad templateFormat.
     * 
     * @return
     *     possible object is
     *     {@link TemplateFormatType }
     *     
     */
    public TemplateFormatType getTemplateFormat() {
        return templateFormat;
    }

    /**
     * Define el valor de la propiedad templateFormat.
     * 
     * @param value
     *     allowed object is
     *     {@link TemplateFormatType }
     *     
     */
    public void setTemplateFormat(TemplateFormatType value) {
        this.templateFormat = value;
    }

    /**
     * Obtiene el valor de la propiedad templateMaxSize.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTemplateMaxSize() {
        return templateMaxSize;
    }

    /**
     * Define el valor de la propiedad templateMaxSize.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTemplateMaxSize(Integer value) {
        this.templateMaxSize = value;
    }

    /**
     * Obtiene el valor de la propiedad minutiaeOrder.
     * 
     * @return
     *     possible object is
     *     {@link MinutiaeOrderType }
     *     
     */
    public MinutiaeOrderType getMinutiaeOrder() {
        return minutiaeOrder;
    }

    /**
     * Define el valor de la propiedad minutiaeOrder.
     * 
     * @param value
     *     allowed object is
     *     {@link MinutiaeOrderType }
     *     
     */
    public void setMinutiaeOrder(MinutiaeOrderType value) {
        this.minutiaeOrder = value;
    }

}
