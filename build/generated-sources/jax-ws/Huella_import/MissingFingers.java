
package Huella_import;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para MissingFingers complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MissingFingers"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rightThumb" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="rightIndex" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="rightMiddle" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="rightRing" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="rightLittle" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="leftThumb" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="leftIndex" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="leftMiddle" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="leftRing" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="leftLittle" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MissingFingers", propOrder = {
    "rightThumb",
    "rightIndex",
    "rightMiddle",
    "rightRing",
    "rightLittle",
    "leftThumb",
    "leftIndex",
    "leftMiddle",
    "leftRing",
    "leftLittle"
})
public class MissingFingers {

    protected boolean rightThumb;
    protected boolean rightIndex;
    protected boolean rightMiddle;
    protected boolean rightRing;
    protected boolean rightLittle;
    protected boolean leftThumb;
    protected boolean leftIndex;
    protected boolean leftMiddle;
    protected boolean leftRing;
    protected boolean leftLittle;

    /**
     * Obtiene el valor de la propiedad rightThumb.
     * 
     */
    public boolean isRightThumb() {
        return rightThumb;
    }

    /**
     * Define el valor de la propiedad rightThumb.
     * 
     */
    public void setRightThumb(boolean value) {
        this.rightThumb = value;
    }

    /**
     * Obtiene el valor de la propiedad rightIndex.
     * 
     */
    public boolean isRightIndex() {
        return rightIndex;
    }

    /**
     * Define el valor de la propiedad rightIndex.
     * 
     */
    public void setRightIndex(boolean value) {
        this.rightIndex = value;
    }

    /**
     * Obtiene el valor de la propiedad rightMiddle.
     * 
     */
    public boolean isRightMiddle() {
        return rightMiddle;
    }

    /**
     * Define el valor de la propiedad rightMiddle.
     * 
     */
    public void setRightMiddle(boolean value) {
        this.rightMiddle = value;
    }

    /**
     * Obtiene el valor de la propiedad rightRing.
     * 
     */
    public boolean isRightRing() {
        return rightRing;
    }

    /**
     * Define el valor de la propiedad rightRing.
     * 
     */
    public void setRightRing(boolean value) {
        this.rightRing = value;
    }

    /**
     * Obtiene el valor de la propiedad rightLittle.
     * 
     */
    public boolean isRightLittle() {
        return rightLittle;
    }

    /**
     * Define el valor de la propiedad rightLittle.
     * 
     */
    public void setRightLittle(boolean value) {
        this.rightLittle = value;
    }

    /**
     * Obtiene el valor de la propiedad leftThumb.
     * 
     */
    public boolean isLeftThumb() {
        return leftThumb;
    }

    /**
     * Define el valor de la propiedad leftThumb.
     * 
     */
    public void setLeftThumb(boolean value) {
        this.leftThumb = value;
    }

    /**
     * Obtiene el valor de la propiedad leftIndex.
     * 
     */
    public boolean isLeftIndex() {
        return leftIndex;
    }

    /**
     * Define el valor de la propiedad leftIndex.
     * 
     */
    public void setLeftIndex(boolean value) {
        this.leftIndex = value;
    }

    /**
     * Obtiene el valor de la propiedad leftMiddle.
     * 
     */
    public boolean isLeftMiddle() {
        return leftMiddle;
    }

    /**
     * Define el valor de la propiedad leftMiddle.
     * 
     */
    public void setLeftMiddle(boolean value) {
        this.leftMiddle = value;
    }

    /**
     * Obtiene el valor de la propiedad leftRing.
     * 
     */
    public boolean isLeftRing() {
        return leftRing;
    }

    /**
     * Define el valor de la propiedad leftRing.
     * 
     */
    public void setLeftRing(boolean value) {
        this.leftRing = value;
    }

    /**
     * Obtiene el valor de la propiedad leftLittle.
     * 
     */
    public boolean isLeftLittle() {
        return leftLittle;
    }

    /**
     * Define el valor de la propiedad leftLittle.
     * 
     */
    public void setLeftLittle(boolean value) {
        this.leftLittle = value;
    }

}
