
package Huella_import;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DecodedPosition complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DecodedPosition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="printPosition" type="{http://www.morpho.com/mbss/generic/wsdl}PrintPosition" minOccurs="0"/&gt;
 *         &lt;element name="irisPosition" type="{http://www.morpho.com/mbss/generic/wsdl}IrisPosition" minOccurs="0"/&gt;
 *         &lt;element name="facePosition" type="{http://www.morpho.com/mbss/generic/wsdl}FacePosition" minOccurs="0"/&gt;
 *         &lt;element name="tattooPosition" type="{http://www.morpho.com/mbss/generic/wsdl}TattooPosition" minOccurs="0"/&gt;
 *         &lt;element name="pedestrianPosition" type="{http://www.morpho.com/mbss/generic/wsdl}PedestrianPosition" minOccurs="0"/&gt;
 *         &lt;element name="bagPosition" type="{http://www.morpho.com/mbss/generic/wsdl}BagPosition" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DecodedPosition", propOrder = {
    "printPosition",
    "irisPosition",
    "facePosition",
    "tattooPosition",
    "pedestrianPosition",
    "bagPosition"
})
public class DecodedPosition {

    protected PrintPosition printPosition;
    @XmlSchemaType(name = "string")
    protected IrisPosition irisPosition;
    @XmlSchemaType(name = "string")
    protected FacePosition facePosition;
    @XmlSchemaType(name = "string")
    protected TattooPosition tattooPosition;
    @XmlSchemaType(name = "string")
    protected PedestrianPosition pedestrianPosition;
    @XmlSchemaType(name = "string")
    protected BagPosition bagPosition;

    /**
     * Obtiene el valor de la propiedad printPosition.
     * 
     * @return
     *     possible object is
     *     {@link PrintPosition }
     *     
     */
    public PrintPosition getPrintPosition() {
        return printPosition;
    }

    /**
     * Define el valor de la propiedad printPosition.
     * 
     * @param value
     *     allowed object is
     *     {@link PrintPosition }
     *     
     */
    public void setPrintPosition(PrintPosition value) {
        this.printPosition = value;
    }

    /**
     * Obtiene el valor de la propiedad irisPosition.
     * 
     * @return
     *     possible object is
     *     {@link IrisPosition }
     *     
     */
    public IrisPosition getIrisPosition() {
        return irisPosition;
    }

    /**
     * Define el valor de la propiedad irisPosition.
     * 
     * @param value
     *     allowed object is
     *     {@link IrisPosition }
     *     
     */
    public void setIrisPosition(IrisPosition value) {
        this.irisPosition = value;
    }

    /**
     * Obtiene el valor de la propiedad facePosition.
     * 
     * @return
     *     possible object is
     *     {@link FacePosition }
     *     
     */
    public FacePosition getFacePosition() {
        return facePosition;
    }

    /**
     * Define el valor de la propiedad facePosition.
     * 
     * @param value
     *     allowed object is
     *     {@link FacePosition }
     *     
     */
    public void setFacePosition(FacePosition value) {
        this.facePosition = value;
    }

    /**
     * Obtiene el valor de la propiedad tattooPosition.
     * 
     * @return
     *     possible object is
     *     {@link TattooPosition }
     *     
     */
    public TattooPosition getTattooPosition() {
        return tattooPosition;
    }

    /**
     * Define el valor de la propiedad tattooPosition.
     * 
     * @param value
     *     allowed object is
     *     {@link TattooPosition }
     *     
     */
    public void setTattooPosition(TattooPosition value) {
        this.tattooPosition = value;
    }

    /**
     * Obtiene el valor de la propiedad pedestrianPosition.
     * 
     * @return
     *     possible object is
     *     {@link PedestrianPosition }
     *     
     */
    public PedestrianPosition getPedestrianPosition() {
        return pedestrianPosition;
    }

    /**
     * Define el valor de la propiedad pedestrianPosition.
     * 
     * @param value
     *     allowed object is
     *     {@link PedestrianPosition }
     *     
     */
    public void setPedestrianPosition(PedestrianPosition value) {
        this.pedestrianPosition = value;
    }

    /**
     * Obtiene el valor de la propiedad bagPosition.
     * 
     * @return
     *     possible object is
     *     {@link BagPosition }
     *     
     */
    public BagPosition getBagPosition() {
        return bagPosition;
    }

    /**
     * Define el valor de la propiedad bagPosition.
     * 
     * @param value
     *     allowed object is
     *     {@link BagPosition }
     *     
     */
    public void setBagPosition(BagPosition value) {
        this.bagPosition = value;
    }

}
