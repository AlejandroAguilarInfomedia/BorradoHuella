
package Huella_import;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GetLatentResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GetLatentResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basicResponse" type="{http://www.morpho.com/mbss/generic/wsdl}BasicResponse"/&gt;
 *         &lt;element name="latentPrint" type="{http://www.morpho.com/mbss/generic/wsdl}LatentPrint" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetLatentResponse", propOrder = {
    "basicResponse",
    "latentPrint"
})
public class GetLatentResponse {

    @XmlElement(required = true)
    protected BasicResponse basicResponse;
    protected LatentPrint latentPrint;

    /**
     * Obtiene el valor de la propiedad basicResponse.
     * 
     * @return
     *     possible object is
     *     {@link BasicResponse }
     *     
     */
    public BasicResponse getBasicResponse() {
        return basicResponse;
    }

    /**
     * Define el valor de la propiedad basicResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicResponse }
     *     
     */
    public void setBasicResponse(BasicResponse value) {
        this.basicResponse = value;
    }

    /**
     * Obtiene el valor de la propiedad latentPrint.
     * 
     * @return
     *     possible object is
     *     {@link LatentPrint }
     *     
     */
    public LatentPrint getLatentPrint() {
        return latentPrint;
    }

    /**
     * Define el valor de la propiedad latentPrint.
     * 
     * @param value
     *     allowed object is
     *     {@link LatentPrint }
     *     
     */
    public void setLatentPrint(LatentPrint value) {
        this.latentPrint = value;
    }

}
