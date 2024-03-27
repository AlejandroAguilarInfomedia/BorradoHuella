
package Huella_import;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para BoundingBox complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BoundingBox"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="topLeftX" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="topLeftY" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="width" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BoundingBox", propOrder = {
    "topLeftX",
    "topLeftY",
    "width",
    "height"
})
public class BoundingBox {

    protected int topLeftX;
    protected int topLeftY;
    protected int width;
    protected int height;

    /**
     * Obtiene el valor de la propiedad topLeftX.
     * 
     */
    public int getTopLeftX() {
        return topLeftX;
    }

    /**
     * Define el valor de la propiedad topLeftX.
     * 
     */
    public void setTopLeftX(int value) {
        this.topLeftX = value;
    }

    /**
     * Obtiene el valor de la propiedad topLeftY.
     * 
     */
    public int getTopLeftY() {
        return topLeftY;
    }

    /**
     * Define el valor de la propiedad topLeftY.
     * 
     */
    public void setTopLeftY(int value) {
        this.topLeftY = value;
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

}
