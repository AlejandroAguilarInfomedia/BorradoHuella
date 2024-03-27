
package Huella_import;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PalmOrSupplementalsLatentPosition complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PalmOrSupplementalsLatentPosition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hasRightThumbTips" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hasRightIndexTips" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hasRightMiddleTips" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hasRightRingTips" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hasRightLittleTips" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hasLeftThumbTips" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hasLeftIndexTips" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hasLeftMiddleTips" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hasLeftRingTips" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hasLeftLittleTips" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hasRightThumbDistal" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hasRightIndexDistal" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hasRightMiddleDistal" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hasRightRingDistal" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hasRightLittleDistal" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hasLeftThumbDistal" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hasLeftIndexDistal" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hasLeftMiddleDistal" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hasLeftRingDistal" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hasLeftLittleDistal" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hasRightIndexMedial" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hasRightMiddleMedial" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hasRightRingMedial" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hasRightLittleMedial" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hasLeftIndexMedial" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hasLeftMiddleMedial" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hasLeftRingMedial" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hasLeftLittleMedial" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hasRightThumbProximal" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hasRightIndexProximal" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hasRightMiddleProximal" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hasRightRingProximal" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hasRightLittleProximal" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hasLeftThumbProximal" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hasLeftIndexProximal" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hasLeftMiddleProximal" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hasLeftRingProximal" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hasLeftLittleProximal" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hasRightPalmTopInterior" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hasRightPalmTopCenter" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hasRightPalmTopExterior" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hasRightPalmMiddleInterior" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hasRightPalmMiddleCenter" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hasRightPalmMiddleExterior" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hasRightPalmBottomInterior" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hasRightPalmBottomExterior" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hasLeftPalmTopInterior" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hasLeftPalmTopCenter" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hasLeftPalmTopExterior" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hasLeftPalmMiddleInterior" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hasLeftPalmMiddleCenter" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hasLeftPalmMiddleExterior" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hasLeftPalmBottomInterior" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hasLeftPalmBottomExterior" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hasRightPalmTopExteriorSide" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hasRightPalmMiddleExteriorSide" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hasRightPalmBottomExteriorSide" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hasLeftPalmTopExteriorSide" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hasLeftPalmMiddleExteriorSide" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hasLeftPalmBottomExteriorSide" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PalmOrSupplementalsLatentPosition", propOrder = {
    "hasRightThumbTips",
    "hasRightIndexTips",
    "hasRightMiddleTips",
    "hasRightRingTips",
    "hasRightLittleTips",
    "hasLeftThumbTips",
    "hasLeftIndexTips",
    "hasLeftMiddleTips",
    "hasLeftRingTips",
    "hasLeftLittleTips",
    "hasRightThumbDistal",
    "hasRightIndexDistal",
    "hasRightMiddleDistal",
    "hasRightRingDistal",
    "hasRightLittleDistal",
    "hasLeftThumbDistal",
    "hasLeftIndexDistal",
    "hasLeftMiddleDistal",
    "hasLeftRingDistal",
    "hasLeftLittleDistal",
    "hasRightIndexMedial",
    "hasRightMiddleMedial",
    "hasRightRingMedial",
    "hasRightLittleMedial",
    "hasLeftIndexMedial",
    "hasLeftMiddleMedial",
    "hasLeftRingMedial",
    "hasLeftLittleMedial",
    "hasRightThumbProximal",
    "hasRightIndexProximal",
    "hasRightMiddleProximal",
    "hasRightRingProximal",
    "hasRightLittleProximal",
    "hasLeftThumbProximal",
    "hasLeftIndexProximal",
    "hasLeftMiddleProximal",
    "hasLeftRingProximal",
    "hasLeftLittleProximal",
    "hasRightPalmTopInterior",
    "hasRightPalmTopCenter",
    "hasRightPalmTopExterior",
    "hasRightPalmMiddleInterior",
    "hasRightPalmMiddleCenter",
    "hasRightPalmMiddleExterior",
    "hasRightPalmBottomInterior",
    "hasRightPalmBottomExterior",
    "hasLeftPalmTopInterior",
    "hasLeftPalmTopCenter",
    "hasLeftPalmTopExterior",
    "hasLeftPalmMiddleInterior",
    "hasLeftPalmMiddleCenter",
    "hasLeftPalmMiddleExterior",
    "hasLeftPalmBottomInterior",
    "hasLeftPalmBottomExterior",
    "hasRightPalmTopExteriorSide",
    "hasRightPalmMiddleExteriorSide",
    "hasRightPalmBottomExteriorSide",
    "hasLeftPalmTopExteriorSide",
    "hasLeftPalmMiddleExteriorSide",
    "hasLeftPalmBottomExteriorSide"
})
public class PalmOrSupplementalsLatentPosition {

    protected boolean hasRightThumbTips;
    protected boolean hasRightIndexTips;
    protected boolean hasRightMiddleTips;
    protected boolean hasRightRingTips;
    protected boolean hasRightLittleTips;
    protected boolean hasLeftThumbTips;
    protected boolean hasLeftIndexTips;
    protected boolean hasLeftMiddleTips;
    protected boolean hasLeftRingTips;
    protected boolean hasLeftLittleTips;
    protected boolean hasRightThumbDistal;
    protected boolean hasRightIndexDistal;
    protected boolean hasRightMiddleDistal;
    protected boolean hasRightRingDistal;
    protected boolean hasRightLittleDistal;
    protected boolean hasLeftThumbDistal;
    protected boolean hasLeftIndexDistal;
    protected boolean hasLeftMiddleDistal;
    protected boolean hasLeftRingDistal;
    protected boolean hasLeftLittleDistal;
    protected boolean hasRightIndexMedial;
    protected boolean hasRightMiddleMedial;
    protected boolean hasRightRingMedial;
    protected boolean hasRightLittleMedial;
    protected boolean hasLeftIndexMedial;
    protected boolean hasLeftMiddleMedial;
    protected boolean hasLeftRingMedial;
    protected boolean hasLeftLittleMedial;
    protected boolean hasRightThumbProximal;
    protected boolean hasRightIndexProximal;
    protected boolean hasRightMiddleProximal;
    protected boolean hasRightRingProximal;
    protected boolean hasRightLittleProximal;
    protected boolean hasLeftThumbProximal;
    protected boolean hasLeftIndexProximal;
    protected boolean hasLeftMiddleProximal;
    protected boolean hasLeftRingProximal;
    protected boolean hasLeftLittleProximal;
    protected boolean hasRightPalmTopInterior;
    protected boolean hasRightPalmTopCenter;
    protected boolean hasRightPalmTopExterior;
    protected boolean hasRightPalmMiddleInterior;
    protected boolean hasRightPalmMiddleCenter;
    protected boolean hasRightPalmMiddleExterior;
    protected boolean hasRightPalmBottomInterior;
    protected boolean hasRightPalmBottomExterior;
    protected boolean hasLeftPalmTopInterior;
    protected boolean hasLeftPalmTopCenter;
    protected boolean hasLeftPalmTopExterior;
    protected boolean hasLeftPalmMiddleInterior;
    protected boolean hasLeftPalmMiddleCenter;
    protected boolean hasLeftPalmMiddleExterior;
    protected boolean hasLeftPalmBottomInterior;
    protected boolean hasLeftPalmBottomExterior;
    protected boolean hasRightPalmTopExteriorSide;
    protected boolean hasRightPalmMiddleExteriorSide;
    protected boolean hasRightPalmBottomExteriorSide;
    protected boolean hasLeftPalmTopExteriorSide;
    protected boolean hasLeftPalmMiddleExteriorSide;
    protected boolean hasLeftPalmBottomExteriorSide;

    /**
     * Obtiene el valor de la propiedad hasRightThumbTips.
     * 
     */
    public boolean isHasRightThumbTips() {
        return hasRightThumbTips;
    }

    /**
     * Define el valor de la propiedad hasRightThumbTips.
     * 
     */
    public void setHasRightThumbTips(boolean value) {
        this.hasRightThumbTips = value;
    }

    /**
     * Obtiene el valor de la propiedad hasRightIndexTips.
     * 
     */
    public boolean isHasRightIndexTips() {
        return hasRightIndexTips;
    }

    /**
     * Define el valor de la propiedad hasRightIndexTips.
     * 
     */
    public void setHasRightIndexTips(boolean value) {
        this.hasRightIndexTips = value;
    }

    /**
     * Obtiene el valor de la propiedad hasRightMiddleTips.
     * 
     */
    public boolean isHasRightMiddleTips() {
        return hasRightMiddleTips;
    }

    /**
     * Define el valor de la propiedad hasRightMiddleTips.
     * 
     */
    public void setHasRightMiddleTips(boolean value) {
        this.hasRightMiddleTips = value;
    }

    /**
     * Obtiene el valor de la propiedad hasRightRingTips.
     * 
     */
    public boolean isHasRightRingTips() {
        return hasRightRingTips;
    }

    /**
     * Define el valor de la propiedad hasRightRingTips.
     * 
     */
    public void setHasRightRingTips(boolean value) {
        this.hasRightRingTips = value;
    }

    /**
     * Obtiene el valor de la propiedad hasRightLittleTips.
     * 
     */
    public boolean isHasRightLittleTips() {
        return hasRightLittleTips;
    }

    /**
     * Define el valor de la propiedad hasRightLittleTips.
     * 
     */
    public void setHasRightLittleTips(boolean value) {
        this.hasRightLittleTips = value;
    }

    /**
     * Obtiene el valor de la propiedad hasLeftThumbTips.
     * 
     */
    public boolean isHasLeftThumbTips() {
        return hasLeftThumbTips;
    }

    /**
     * Define el valor de la propiedad hasLeftThumbTips.
     * 
     */
    public void setHasLeftThumbTips(boolean value) {
        this.hasLeftThumbTips = value;
    }

    /**
     * Obtiene el valor de la propiedad hasLeftIndexTips.
     * 
     */
    public boolean isHasLeftIndexTips() {
        return hasLeftIndexTips;
    }

    /**
     * Define el valor de la propiedad hasLeftIndexTips.
     * 
     */
    public void setHasLeftIndexTips(boolean value) {
        this.hasLeftIndexTips = value;
    }

    /**
     * Obtiene el valor de la propiedad hasLeftMiddleTips.
     * 
     */
    public boolean isHasLeftMiddleTips() {
        return hasLeftMiddleTips;
    }

    /**
     * Define el valor de la propiedad hasLeftMiddleTips.
     * 
     */
    public void setHasLeftMiddleTips(boolean value) {
        this.hasLeftMiddleTips = value;
    }

    /**
     * Obtiene el valor de la propiedad hasLeftRingTips.
     * 
     */
    public boolean isHasLeftRingTips() {
        return hasLeftRingTips;
    }

    /**
     * Define el valor de la propiedad hasLeftRingTips.
     * 
     */
    public void setHasLeftRingTips(boolean value) {
        this.hasLeftRingTips = value;
    }

    /**
     * Obtiene el valor de la propiedad hasLeftLittleTips.
     * 
     */
    public boolean isHasLeftLittleTips() {
        return hasLeftLittleTips;
    }

    /**
     * Define el valor de la propiedad hasLeftLittleTips.
     * 
     */
    public void setHasLeftLittleTips(boolean value) {
        this.hasLeftLittleTips = value;
    }

    /**
     * Obtiene el valor de la propiedad hasRightThumbDistal.
     * 
     */
    public boolean isHasRightThumbDistal() {
        return hasRightThumbDistal;
    }

    /**
     * Define el valor de la propiedad hasRightThumbDistal.
     * 
     */
    public void setHasRightThumbDistal(boolean value) {
        this.hasRightThumbDistal = value;
    }

    /**
     * Obtiene el valor de la propiedad hasRightIndexDistal.
     * 
     */
    public boolean isHasRightIndexDistal() {
        return hasRightIndexDistal;
    }

    /**
     * Define el valor de la propiedad hasRightIndexDistal.
     * 
     */
    public void setHasRightIndexDistal(boolean value) {
        this.hasRightIndexDistal = value;
    }

    /**
     * Obtiene el valor de la propiedad hasRightMiddleDistal.
     * 
     */
    public boolean isHasRightMiddleDistal() {
        return hasRightMiddleDistal;
    }

    /**
     * Define el valor de la propiedad hasRightMiddleDistal.
     * 
     */
    public void setHasRightMiddleDistal(boolean value) {
        this.hasRightMiddleDistal = value;
    }

    /**
     * Obtiene el valor de la propiedad hasRightRingDistal.
     * 
     */
    public boolean isHasRightRingDistal() {
        return hasRightRingDistal;
    }

    /**
     * Define el valor de la propiedad hasRightRingDistal.
     * 
     */
    public void setHasRightRingDistal(boolean value) {
        this.hasRightRingDistal = value;
    }

    /**
     * Obtiene el valor de la propiedad hasRightLittleDistal.
     * 
     */
    public boolean isHasRightLittleDistal() {
        return hasRightLittleDistal;
    }

    /**
     * Define el valor de la propiedad hasRightLittleDistal.
     * 
     */
    public void setHasRightLittleDistal(boolean value) {
        this.hasRightLittleDistal = value;
    }

    /**
     * Obtiene el valor de la propiedad hasLeftThumbDistal.
     * 
     */
    public boolean isHasLeftThumbDistal() {
        return hasLeftThumbDistal;
    }

    /**
     * Define el valor de la propiedad hasLeftThumbDistal.
     * 
     */
    public void setHasLeftThumbDistal(boolean value) {
        this.hasLeftThumbDistal = value;
    }

    /**
     * Obtiene el valor de la propiedad hasLeftIndexDistal.
     * 
     */
    public boolean isHasLeftIndexDistal() {
        return hasLeftIndexDistal;
    }

    /**
     * Define el valor de la propiedad hasLeftIndexDistal.
     * 
     */
    public void setHasLeftIndexDistal(boolean value) {
        this.hasLeftIndexDistal = value;
    }

    /**
     * Obtiene el valor de la propiedad hasLeftMiddleDistal.
     * 
     */
    public boolean isHasLeftMiddleDistal() {
        return hasLeftMiddleDistal;
    }

    /**
     * Define el valor de la propiedad hasLeftMiddleDistal.
     * 
     */
    public void setHasLeftMiddleDistal(boolean value) {
        this.hasLeftMiddleDistal = value;
    }

    /**
     * Obtiene el valor de la propiedad hasLeftRingDistal.
     * 
     */
    public boolean isHasLeftRingDistal() {
        return hasLeftRingDistal;
    }

    /**
     * Define el valor de la propiedad hasLeftRingDistal.
     * 
     */
    public void setHasLeftRingDistal(boolean value) {
        this.hasLeftRingDistal = value;
    }

    /**
     * Obtiene el valor de la propiedad hasLeftLittleDistal.
     * 
     */
    public boolean isHasLeftLittleDistal() {
        return hasLeftLittleDistal;
    }

    /**
     * Define el valor de la propiedad hasLeftLittleDistal.
     * 
     */
    public void setHasLeftLittleDistal(boolean value) {
        this.hasLeftLittleDistal = value;
    }

    /**
     * Obtiene el valor de la propiedad hasRightIndexMedial.
     * 
     */
    public boolean isHasRightIndexMedial() {
        return hasRightIndexMedial;
    }

    /**
     * Define el valor de la propiedad hasRightIndexMedial.
     * 
     */
    public void setHasRightIndexMedial(boolean value) {
        this.hasRightIndexMedial = value;
    }

    /**
     * Obtiene el valor de la propiedad hasRightMiddleMedial.
     * 
     */
    public boolean isHasRightMiddleMedial() {
        return hasRightMiddleMedial;
    }

    /**
     * Define el valor de la propiedad hasRightMiddleMedial.
     * 
     */
    public void setHasRightMiddleMedial(boolean value) {
        this.hasRightMiddleMedial = value;
    }

    /**
     * Obtiene el valor de la propiedad hasRightRingMedial.
     * 
     */
    public boolean isHasRightRingMedial() {
        return hasRightRingMedial;
    }

    /**
     * Define el valor de la propiedad hasRightRingMedial.
     * 
     */
    public void setHasRightRingMedial(boolean value) {
        this.hasRightRingMedial = value;
    }

    /**
     * Obtiene el valor de la propiedad hasRightLittleMedial.
     * 
     */
    public boolean isHasRightLittleMedial() {
        return hasRightLittleMedial;
    }

    /**
     * Define el valor de la propiedad hasRightLittleMedial.
     * 
     */
    public void setHasRightLittleMedial(boolean value) {
        this.hasRightLittleMedial = value;
    }

    /**
     * Obtiene el valor de la propiedad hasLeftIndexMedial.
     * 
     */
    public boolean isHasLeftIndexMedial() {
        return hasLeftIndexMedial;
    }

    /**
     * Define el valor de la propiedad hasLeftIndexMedial.
     * 
     */
    public void setHasLeftIndexMedial(boolean value) {
        this.hasLeftIndexMedial = value;
    }

    /**
     * Obtiene el valor de la propiedad hasLeftMiddleMedial.
     * 
     */
    public boolean isHasLeftMiddleMedial() {
        return hasLeftMiddleMedial;
    }

    /**
     * Define el valor de la propiedad hasLeftMiddleMedial.
     * 
     */
    public void setHasLeftMiddleMedial(boolean value) {
        this.hasLeftMiddleMedial = value;
    }

    /**
     * Obtiene el valor de la propiedad hasLeftRingMedial.
     * 
     */
    public boolean isHasLeftRingMedial() {
        return hasLeftRingMedial;
    }

    /**
     * Define el valor de la propiedad hasLeftRingMedial.
     * 
     */
    public void setHasLeftRingMedial(boolean value) {
        this.hasLeftRingMedial = value;
    }

    /**
     * Obtiene el valor de la propiedad hasLeftLittleMedial.
     * 
     */
    public boolean isHasLeftLittleMedial() {
        return hasLeftLittleMedial;
    }

    /**
     * Define el valor de la propiedad hasLeftLittleMedial.
     * 
     */
    public void setHasLeftLittleMedial(boolean value) {
        this.hasLeftLittleMedial = value;
    }

    /**
     * Obtiene el valor de la propiedad hasRightThumbProximal.
     * 
     */
    public boolean isHasRightThumbProximal() {
        return hasRightThumbProximal;
    }

    /**
     * Define el valor de la propiedad hasRightThumbProximal.
     * 
     */
    public void setHasRightThumbProximal(boolean value) {
        this.hasRightThumbProximal = value;
    }

    /**
     * Obtiene el valor de la propiedad hasRightIndexProximal.
     * 
     */
    public boolean isHasRightIndexProximal() {
        return hasRightIndexProximal;
    }

    /**
     * Define el valor de la propiedad hasRightIndexProximal.
     * 
     */
    public void setHasRightIndexProximal(boolean value) {
        this.hasRightIndexProximal = value;
    }

    /**
     * Obtiene el valor de la propiedad hasRightMiddleProximal.
     * 
     */
    public boolean isHasRightMiddleProximal() {
        return hasRightMiddleProximal;
    }

    /**
     * Define el valor de la propiedad hasRightMiddleProximal.
     * 
     */
    public void setHasRightMiddleProximal(boolean value) {
        this.hasRightMiddleProximal = value;
    }

    /**
     * Obtiene el valor de la propiedad hasRightRingProximal.
     * 
     */
    public boolean isHasRightRingProximal() {
        return hasRightRingProximal;
    }

    /**
     * Define el valor de la propiedad hasRightRingProximal.
     * 
     */
    public void setHasRightRingProximal(boolean value) {
        this.hasRightRingProximal = value;
    }

    /**
     * Obtiene el valor de la propiedad hasRightLittleProximal.
     * 
     */
    public boolean isHasRightLittleProximal() {
        return hasRightLittleProximal;
    }

    /**
     * Define el valor de la propiedad hasRightLittleProximal.
     * 
     */
    public void setHasRightLittleProximal(boolean value) {
        this.hasRightLittleProximal = value;
    }

    /**
     * Obtiene el valor de la propiedad hasLeftThumbProximal.
     * 
     */
    public boolean isHasLeftThumbProximal() {
        return hasLeftThumbProximal;
    }

    /**
     * Define el valor de la propiedad hasLeftThumbProximal.
     * 
     */
    public void setHasLeftThumbProximal(boolean value) {
        this.hasLeftThumbProximal = value;
    }

    /**
     * Obtiene el valor de la propiedad hasLeftIndexProximal.
     * 
     */
    public boolean isHasLeftIndexProximal() {
        return hasLeftIndexProximal;
    }

    /**
     * Define el valor de la propiedad hasLeftIndexProximal.
     * 
     */
    public void setHasLeftIndexProximal(boolean value) {
        this.hasLeftIndexProximal = value;
    }

    /**
     * Obtiene el valor de la propiedad hasLeftMiddleProximal.
     * 
     */
    public boolean isHasLeftMiddleProximal() {
        return hasLeftMiddleProximal;
    }

    /**
     * Define el valor de la propiedad hasLeftMiddleProximal.
     * 
     */
    public void setHasLeftMiddleProximal(boolean value) {
        this.hasLeftMiddleProximal = value;
    }

    /**
     * Obtiene el valor de la propiedad hasLeftRingProximal.
     * 
     */
    public boolean isHasLeftRingProximal() {
        return hasLeftRingProximal;
    }

    /**
     * Define el valor de la propiedad hasLeftRingProximal.
     * 
     */
    public void setHasLeftRingProximal(boolean value) {
        this.hasLeftRingProximal = value;
    }

    /**
     * Obtiene el valor de la propiedad hasLeftLittleProximal.
     * 
     */
    public boolean isHasLeftLittleProximal() {
        return hasLeftLittleProximal;
    }

    /**
     * Define el valor de la propiedad hasLeftLittleProximal.
     * 
     */
    public void setHasLeftLittleProximal(boolean value) {
        this.hasLeftLittleProximal = value;
    }

    /**
     * Obtiene el valor de la propiedad hasRightPalmTopInterior.
     * 
     */
    public boolean isHasRightPalmTopInterior() {
        return hasRightPalmTopInterior;
    }

    /**
     * Define el valor de la propiedad hasRightPalmTopInterior.
     * 
     */
    public void setHasRightPalmTopInterior(boolean value) {
        this.hasRightPalmTopInterior = value;
    }

    /**
     * Obtiene el valor de la propiedad hasRightPalmTopCenter.
     * 
     */
    public boolean isHasRightPalmTopCenter() {
        return hasRightPalmTopCenter;
    }

    /**
     * Define el valor de la propiedad hasRightPalmTopCenter.
     * 
     */
    public void setHasRightPalmTopCenter(boolean value) {
        this.hasRightPalmTopCenter = value;
    }

    /**
     * Obtiene el valor de la propiedad hasRightPalmTopExterior.
     * 
     */
    public boolean isHasRightPalmTopExterior() {
        return hasRightPalmTopExterior;
    }

    /**
     * Define el valor de la propiedad hasRightPalmTopExterior.
     * 
     */
    public void setHasRightPalmTopExterior(boolean value) {
        this.hasRightPalmTopExterior = value;
    }

    /**
     * Obtiene el valor de la propiedad hasRightPalmMiddleInterior.
     * 
     */
    public boolean isHasRightPalmMiddleInterior() {
        return hasRightPalmMiddleInterior;
    }

    /**
     * Define el valor de la propiedad hasRightPalmMiddleInterior.
     * 
     */
    public void setHasRightPalmMiddleInterior(boolean value) {
        this.hasRightPalmMiddleInterior = value;
    }

    /**
     * Obtiene el valor de la propiedad hasRightPalmMiddleCenter.
     * 
     */
    public boolean isHasRightPalmMiddleCenter() {
        return hasRightPalmMiddleCenter;
    }

    /**
     * Define el valor de la propiedad hasRightPalmMiddleCenter.
     * 
     */
    public void setHasRightPalmMiddleCenter(boolean value) {
        this.hasRightPalmMiddleCenter = value;
    }

    /**
     * Obtiene el valor de la propiedad hasRightPalmMiddleExterior.
     * 
     */
    public boolean isHasRightPalmMiddleExterior() {
        return hasRightPalmMiddleExterior;
    }

    /**
     * Define el valor de la propiedad hasRightPalmMiddleExterior.
     * 
     */
    public void setHasRightPalmMiddleExterior(boolean value) {
        this.hasRightPalmMiddleExterior = value;
    }

    /**
     * Obtiene el valor de la propiedad hasRightPalmBottomInterior.
     * 
     */
    public boolean isHasRightPalmBottomInterior() {
        return hasRightPalmBottomInterior;
    }

    /**
     * Define el valor de la propiedad hasRightPalmBottomInterior.
     * 
     */
    public void setHasRightPalmBottomInterior(boolean value) {
        this.hasRightPalmBottomInterior = value;
    }

    /**
     * Obtiene el valor de la propiedad hasRightPalmBottomExterior.
     * 
     */
    public boolean isHasRightPalmBottomExterior() {
        return hasRightPalmBottomExterior;
    }

    /**
     * Define el valor de la propiedad hasRightPalmBottomExterior.
     * 
     */
    public void setHasRightPalmBottomExterior(boolean value) {
        this.hasRightPalmBottomExterior = value;
    }

    /**
     * Obtiene el valor de la propiedad hasLeftPalmTopInterior.
     * 
     */
    public boolean isHasLeftPalmTopInterior() {
        return hasLeftPalmTopInterior;
    }

    /**
     * Define el valor de la propiedad hasLeftPalmTopInterior.
     * 
     */
    public void setHasLeftPalmTopInterior(boolean value) {
        this.hasLeftPalmTopInterior = value;
    }

    /**
     * Obtiene el valor de la propiedad hasLeftPalmTopCenter.
     * 
     */
    public boolean isHasLeftPalmTopCenter() {
        return hasLeftPalmTopCenter;
    }

    /**
     * Define el valor de la propiedad hasLeftPalmTopCenter.
     * 
     */
    public void setHasLeftPalmTopCenter(boolean value) {
        this.hasLeftPalmTopCenter = value;
    }

    /**
     * Obtiene el valor de la propiedad hasLeftPalmTopExterior.
     * 
     */
    public boolean isHasLeftPalmTopExterior() {
        return hasLeftPalmTopExterior;
    }

    /**
     * Define el valor de la propiedad hasLeftPalmTopExterior.
     * 
     */
    public void setHasLeftPalmTopExterior(boolean value) {
        this.hasLeftPalmTopExterior = value;
    }

    /**
     * Obtiene el valor de la propiedad hasLeftPalmMiddleInterior.
     * 
     */
    public boolean isHasLeftPalmMiddleInterior() {
        return hasLeftPalmMiddleInterior;
    }

    /**
     * Define el valor de la propiedad hasLeftPalmMiddleInterior.
     * 
     */
    public void setHasLeftPalmMiddleInterior(boolean value) {
        this.hasLeftPalmMiddleInterior = value;
    }

    /**
     * Obtiene el valor de la propiedad hasLeftPalmMiddleCenter.
     * 
     */
    public boolean isHasLeftPalmMiddleCenter() {
        return hasLeftPalmMiddleCenter;
    }

    /**
     * Define el valor de la propiedad hasLeftPalmMiddleCenter.
     * 
     */
    public void setHasLeftPalmMiddleCenter(boolean value) {
        this.hasLeftPalmMiddleCenter = value;
    }

    /**
     * Obtiene el valor de la propiedad hasLeftPalmMiddleExterior.
     * 
     */
    public boolean isHasLeftPalmMiddleExterior() {
        return hasLeftPalmMiddleExterior;
    }

    /**
     * Define el valor de la propiedad hasLeftPalmMiddleExterior.
     * 
     */
    public void setHasLeftPalmMiddleExterior(boolean value) {
        this.hasLeftPalmMiddleExterior = value;
    }

    /**
     * Obtiene el valor de la propiedad hasLeftPalmBottomInterior.
     * 
     */
    public boolean isHasLeftPalmBottomInterior() {
        return hasLeftPalmBottomInterior;
    }

    /**
     * Define el valor de la propiedad hasLeftPalmBottomInterior.
     * 
     */
    public void setHasLeftPalmBottomInterior(boolean value) {
        this.hasLeftPalmBottomInterior = value;
    }

    /**
     * Obtiene el valor de la propiedad hasLeftPalmBottomExterior.
     * 
     */
    public boolean isHasLeftPalmBottomExterior() {
        return hasLeftPalmBottomExterior;
    }

    /**
     * Define el valor de la propiedad hasLeftPalmBottomExterior.
     * 
     */
    public void setHasLeftPalmBottomExterior(boolean value) {
        this.hasLeftPalmBottomExterior = value;
    }

    /**
     * Obtiene el valor de la propiedad hasRightPalmTopExteriorSide.
     * 
     */
    public boolean isHasRightPalmTopExteriorSide() {
        return hasRightPalmTopExteriorSide;
    }

    /**
     * Define el valor de la propiedad hasRightPalmTopExteriorSide.
     * 
     */
    public void setHasRightPalmTopExteriorSide(boolean value) {
        this.hasRightPalmTopExteriorSide = value;
    }

    /**
     * Obtiene el valor de la propiedad hasRightPalmMiddleExteriorSide.
     * 
     */
    public boolean isHasRightPalmMiddleExteriorSide() {
        return hasRightPalmMiddleExteriorSide;
    }

    /**
     * Define el valor de la propiedad hasRightPalmMiddleExteriorSide.
     * 
     */
    public void setHasRightPalmMiddleExteriorSide(boolean value) {
        this.hasRightPalmMiddleExteriorSide = value;
    }

    /**
     * Obtiene el valor de la propiedad hasRightPalmBottomExteriorSide.
     * 
     */
    public boolean isHasRightPalmBottomExteriorSide() {
        return hasRightPalmBottomExteriorSide;
    }

    /**
     * Define el valor de la propiedad hasRightPalmBottomExteriorSide.
     * 
     */
    public void setHasRightPalmBottomExteriorSide(boolean value) {
        this.hasRightPalmBottomExteriorSide = value;
    }

    /**
     * Obtiene el valor de la propiedad hasLeftPalmTopExteriorSide.
     * 
     */
    public boolean isHasLeftPalmTopExteriorSide() {
        return hasLeftPalmTopExteriorSide;
    }

    /**
     * Define el valor de la propiedad hasLeftPalmTopExteriorSide.
     * 
     */
    public void setHasLeftPalmTopExteriorSide(boolean value) {
        this.hasLeftPalmTopExteriorSide = value;
    }

    /**
     * Obtiene el valor de la propiedad hasLeftPalmMiddleExteriorSide.
     * 
     */
    public boolean isHasLeftPalmMiddleExteriorSide() {
        return hasLeftPalmMiddleExteriorSide;
    }

    /**
     * Define el valor de la propiedad hasLeftPalmMiddleExteriorSide.
     * 
     */
    public void setHasLeftPalmMiddleExteriorSide(boolean value) {
        this.hasLeftPalmMiddleExteriorSide = value;
    }

    /**
     * Obtiene el valor de la propiedad hasLeftPalmBottomExteriorSide.
     * 
     */
    public boolean isHasLeftPalmBottomExteriorSide() {
        return hasLeftPalmBottomExteriorSide;
    }

    /**
     * Define el valor de la propiedad hasLeftPalmBottomExteriorSide.
     * 
     */
    public void setHasLeftPalmBottomExteriorSide(boolean value) {
        this.hasLeftPalmBottomExteriorSide = value;
    }

}
