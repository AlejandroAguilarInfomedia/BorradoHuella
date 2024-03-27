
package Huella_import;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Point complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Point"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="x" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="y" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Point", propOrder = {
    "x",
    "y"
})
public class Point {

    protected float x;
    protected float y;

    /**
     * Obtiene el valor de la propiedad x.
     * 
     */
    public float getX() {
        return x;
    }

    /**
     * Define el valor de la propiedad x.
     * 
     */
    public void setX(float value) {
        this.x = value;
    }

    /**
     * Obtiene el valor de la propiedad y.
     * 
     */
    public float getY() {
        return y;
    }

    /**
     * Define el valor de la propiedad y.
     * 
     */
    public void setY(float value) {
        this.y = value;
    }

}
