
package Huella_import;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para process complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="process"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="request" type="{http://www.morpho.com/mbss/generic/wsdl}Request"/&gt;
 *         &lt;element name="routingData" type="{http://www.morpho.com/mbss/generic/wsdl}RoutingData"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "process", propOrder = {
    "request",
    "routingData"
})
public class Process {

    @XmlElement(required = true)
    protected Request request;
    @XmlElement(required = true)
    protected RoutingData routingData;

    /**
     * Obtiene el valor de la propiedad request.
     * 
     * @return
     *     possible object is
     *     {@link Request }
     *     
     */
    public Request getRequest() {
        return request;
    }

    /**
     * Define el valor de la propiedad request.
     * 
     * @param value
     *     allowed object is
     *     {@link Request }
     *     
     */
    public void setRequest(Request value) {
        this.request = value;
    }

    /**
     * Obtiene el valor de la propiedad routingData.
     * 
     * @return
     *     possible object is
     *     {@link RoutingData }
     *     
     */
    public RoutingData getRoutingData() {
        return routingData;
    }

    /**
     * Define el valor de la propiedad routingData.
     * 
     * @param value
     *     allowed object is
     *     {@link RoutingData }
     *     
     */
    public void setRoutingData(RoutingData value) {
        this.routingData = value;
    }

}
