
package Huella_import;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SpatioTemporal complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SpatioTemporal"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="planCoordinate" type="{http://www.morpho.com/mbss/generic/wsdl}PlanCoordinate" minOccurs="0"/&gt;
 *         &lt;element name="verticaleCoordinate" type="{http://www.morpho.com/mbss/generic/wsdl}VerticalCoordinate" minOccurs="0"/&gt;
 *         &lt;element name="timingReference" type="{http://www.morpho.com/mbss/generic/wsdl}TimingReference" minOccurs="0"/&gt;
 *         &lt;element name="otherInformation" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpatioTemporal", propOrder = {
    "planCoordinate",
    "verticaleCoordinate",
    "timingReference",
    "otherInformation"
})
public class SpatioTemporal {

    protected PlanCoordinate planCoordinate;
    protected VerticalCoordinate verticaleCoordinate;
    protected TimingReference timingReference;
    protected byte[] otherInformation;

    /**
     * Obtiene el valor de la propiedad planCoordinate.
     * 
     * @return
     *     possible object is
     *     {@link PlanCoordinate }
     *     
     */
    public PlanCoordinate getPlanCoordinate() {
        return planCoordinate;
    }

    /**
     * Define el valor de la propiedad planCoordinate.
     * 
     * @param value
     *     allowed object is
     *     {@link PlanCoordinate }
     *     
     */
    public void setPlanCoordinate(PlanCoordinate value) {
        this.planCoordinate = value;
    }

    /**
     * Obtiene el valor de la propiedad verticaleCoordinate.
     * 
     * @return
     *     possible object is
     *     {@link VerticalCoordinate }
     *     
     */
    public VerticalCoordinate getVerticaleCoordinate() {
        return verticaleCoordinate;
    }

    /**
     * Define el valor de la propiedad verticaleCoordinate.
     * 
     * @param value
     *     allowed object is
     *     {@link VerticalCoordinate }
     *     
     */
    public void setVerticaleCoordinate(VerticalCoordinate value) {
        this.verticaleCoordinate = value;
    }

    /**
     * Obtiene el valor de la propiedad timingReference.
     * 
     * @return
     *     possible object is
     *     {@link TimingReference }
     *     
     */
    public TimingReference getTimingReference() {
        return timingReference;
    }

    /**
     * Define el valor de la propiedad timingReference.
     * 
     * @param value
     *     allowed object is
     *     {@link TimingReference }
     *     
     */
    public void setTimingReference(TimingReference value) {
        this.timingReference = value;
    }

    /**
     * Obtiene el valor de la propiedad otherInformation.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getOtherInformation() {
        return otherInformation;
    }

    /**
     * Define el valor de la propiedad otherInformation.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setOtherInformation(byte[] value) {
        this.otherInformation = value;
    }

}
