
package Huella_import;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Image complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Image"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="width" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="xres" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="yres" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="format" type="{http://www.morpho.com/mbss/generic/wsdl}ImageFormatType"/&gt;
 *         &lt;element name="buffer" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *         &lt;element name="imageLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Image", propOrder = {
    "width",
    "height",
    "xres",
    "yres",
    "format",
    "buffer",
    "imageLocation"
})
public class Image {

    protected Integer width;
    protected Integer height;
    protected Integer xres;
    protected Integer yres;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ImageFormatType format;
    @XmlElement(required = true)
    protected byte[] buffer;
    protected String imageLocation;

    /**
     * Obtiene el valor de la propiedad width.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWidth() {
        return width;
    }

    /**
     * Define el valor de la propiedad width.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWidth(Integer value) {
        this.width = value;
    }

    /**
     * Obtiene el valor de la propiedad height.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * Define el valor de la propiedad height.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHeight(Integer value) {
        this.height = value;
    }

    /**
     * Obtiene el valor de la propiedad xres.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getXres() {
        return xres;
    }

    /**
     * Define el valor de la propiedad xres.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setXres(Integer value) {
        this.xres = value;
    }

    /**
     * Obtiene el valor de la propiedad yres.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getYres() {
        return yres;
    }

    /**
     * Define el valor de la propiedad yres.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setYres(Integer value) {
        this.yres = value;
    }

    /**
     * Obtiene el valor de la propiedad format.
     * 
     * @return
     *     possible object is
     *     {@link ImageFormatType }
     *     
     */
    public ImageFormatType getFormat() {
        return format;
    }

    /**
     * Define el valor de la propiedad format.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageFormatType }
     *     
     */
    public void setFormat(ImageFormatType value) {
        this.format = value;
    }

    /**
     * Obtiene el valor de la propiedad buffer.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getBuffer() {
        return buffer;
    }

    /**
     * Define el valor de la propiedad buffer.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setBuffer(byte[] value) {
        this.buffer = value;
    }

    /**
     * Obtiene el valor de la propiedad imageLocation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageLocation() {
        return imageLocation;
    }

    /**
     * Define el valor de la propiedad imageLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageLocation(String value) {
        this.imageLocation = value;
    }

}
