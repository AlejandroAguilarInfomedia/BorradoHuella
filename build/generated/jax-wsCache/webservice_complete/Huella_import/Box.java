
package Huella_import;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Box complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Box"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="xcentre" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ycentre" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="width" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="angle" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Box", propOrder = {
    "xcentre",
    "ycentre",
    "width",
    "height",
    "angle"
})
public class Box {

    protected int xcentre;
    protected int ycentre;
    protected int width;
    protected int height;
    protected Float angle;

    /**
     * Obtiene el valor de la propiedad xcentre.
     * 
     */
    public int getXcentre() {
        return xcentre;
    }

    /**
     * Define el valor de la propiedad xcentre.
     * 
     */
    public void setXcentre(int value) {
        this.xcentre = value;
    }

    /**
     * Obtiene el valor de la propiedad ycentre.
     * 
     */
    public int getYcentre() {
        return ycentre;
    }

    /**
     * Define el valor de la propiedad ycentre.
     * 
     */
    public void setYcentre(int value) {
        this.ycentre = value;
    }

    /**
     * Obtiene el valor de la propiedad width.
     * 
     */
    public int getWidth() {
        return width;
    }

    /**
     * Define el valor de la propiedad width.
     * 
     */
    public void setWidth(int value) {
        this.width = value;
    }

    /**
     * Obtiene el valor de la propiedad height.
     * 
     */
    public int getHeight() {
        return height;
    }

    /**
     * Define el valor de la propiedad height.
     * 
     */
    public void setHeight(int value) {
        this.height = value;
    }

    /**
     * Obtiene el valor de la propiedad angle.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAngle() {
        return angle;
    }

    /**
     * Define el valor de la propiedad angle.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAngle(Float value) {
        this.angle = value;
    }

}
