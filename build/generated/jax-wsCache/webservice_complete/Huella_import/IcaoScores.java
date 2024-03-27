
package Huella_import;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para IcaoScores complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="IcaoScores"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nonFrontal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="blurred" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="badLighting" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="hotSpots" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="unnaturalColor" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="lowDynamic" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="redEyes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="eyeClosed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="badExposure" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="eyesLookingAway" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="nonUniformBackground" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="mouthOpen" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="glassesFramesOnEyes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="glassesReflections" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="hairOnEyes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="verticalPos" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="horizontalPos" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="faceLengthRatio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="faceWidthRatio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="tiltedFace" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="minResolution" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="imageRatio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="shadowsFacial" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="shadowsEyeSocket" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="uniformLighting" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IcaoScores", propOrder = {
    "nonFrontal",
    "blurred",
    "badLighting",
    "hotSpots",
    "unnaturalColor",
    "lowDynamic",
    "redEyes",
    "eyeClosed",
    "badExposure",
    "eyesLookingAway",
    "nonUniformBackground",
    "mouthOpen",
    "glassesFramesOnEyes",
    "glassesReflections",
    "hairOnEyes",
    "verticalPos",
    "horizontalPos",
    "faceLengthRatio",
    "faceWidthRatio",
    "tiltedFace",
    "minResolution",
    "imageRatio",
    "shadowsFacial",
    "shadowsEyeSocket",
    "uniformLighting"
})
public class IcaoScores {

    protected Integer nonFrontal;
    protected Integer blurred;
    protected Integer badLighting;
    protected Integer hotSpots;
    protected Integer unnaturalColor;
    protected Integer lowDynamic;
    protected Integer redEyes;
    protected Integer eyeClosed;
    protected Integer badExposure;
    protected Integer eyesLookingAway;
    protected Integer nonUniformBackground;
    protected Integer mouthOpen;
    protected Integer glassesFramesOnEyes;
    protected Integer glassesReflections;
    protected Integer hairOnEyes;
    protected Integer verticalPos;
    protected Integer horizontalPos;
    protected Integer faceLengthRatio;
    protected Integer faceWidthRatio;
    protected Integer tiltedFace;
    protected Integer minResolution;
    protected Integer imageRatio;
    protected Integer shadowsFacial;
    protected Integer shadowsEyeSocket;
    protected Integer uniformLighting;

    /**
     * Obtiene el valor de la propiedad nonFrontal.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNonFrontal() {
        return nonFrontal;
    }

    /**
     * Define el valor de la propiedad nonFrontal.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNonFrontal(Integer value) {
        this.nonFrontal = value;
    }

    /**
     * Obtiene el valor de la propiedad blurred.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBlurred() {
        return blurred;
    }

    /**
     * Define el valor de la propiedad blurred.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBlurred(Integer value) {
        this.blurred = value;
    }

    /**
     * Obtiene el valor de la propiedad badLighting.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBadLighting() {
        return badLighting;
    }

    /**
     * Define el valor de la propiedad badLighting.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBadLighting(Integer value) {
        this.badLighting = value;
    }

    /**
     * Obtiene el valor de la propiedad hotSpots.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHotSpots() {
        return hotSpots;
    }

    /**
     * Define el valor de la propiedad hotSpots.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHotSpots(Integer value) {
        this.hotSpots = value;
    }

    /**
     * Obtiene el valor de la propiedad unnaturalColor.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUnnaturalColor() {
        return unnaturalColor;
    }

    /**
     * Define el valor de la propiedad unnaturalColor.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUnnaturalColor(Integer value) {
        this.unnaturalColor = value;
    }

    /**
     * Obtiene el valor de la propiedad lowDynamic.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLowDynamic() {
        return lowDynamic;
    }

    /**
     * Define el valor de la propiedad lowDynamic.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLowDynamic(Integer value) {
        this.lowDynamic = value;
    }

    /**
     * Obtiene el valor de la propiedad redEyes.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRedEyes() {
        return redEyes;
    }

    /**
     * Define el valor de la propiedad redEyes.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRedEyes(Integer value) {
        this.redEyes = value;
    }

    /**
     * Obtiene el valor de la propiedad eyeClosed.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEyeClosed() {
        return eyeClosed;
    }

    /**
     * Define el valor de la propiedad eyeClosed.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEyeClosed(Integer value) {
        this.eyeClosed = value;
    }

    /**
     * Obtiene el valor de la propiedad badExposure.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBadExposure() {
        return badExposure;
    }

    /**
     * Define el valor de la propiedad badExposure.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBadExposure(Integer value) {
        this.badExposure = value;
    }

    /**
     * Obtiene el valor de la propiedad eyesLookingAway.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEyesLookingAway() {
        return eyesLookingAway;
    }

    /**
     * Define el valor de la propiedad eyesLookingAway.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEyesLookingAway(Integer value) {
        this.eyesLookingAway = value;
    }

    /**
     * Obtiene el valor de la propiedad nonUniformBackground.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNonUniformBackground() {
        return nonUniformBackground;
    }

    /**
     * Define el valor de la propiedad nonUniformBackground.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNonUniformBackground(Integer value) {
        this.nonUniformBackground = value;
    }

    /**
     * Obtiene el valor de la propiedad mouthOpen.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMouthOpen() {
        return mouthOpen;
    }

    /**
     * Define el valor de la propiedad mouthOpen.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMouthOpen(Integer value) {
        this.mouthOpen = value;
    }

    /**
     * Obtiene el valor de la propiedad glassesFramesOnEyes.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGlassesFramesOnEyes() {
        return glassesFramesOnEyes;
    }

    /**
     * Define el valor de la propiedad glassesFramesOnEyes.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGlassesFramesOnEyes(Integer value) {
        this.glassesFramesOnEyes = value;
    }

    /**
     * Obtiene el valor de la propiedad glassesReflections.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGlassesReflections() {
        return glassesReflections;
    }

    /**
     * Define el valor de la propiedad glassesReflections.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGlassesReflections(Integer value) {
        this.glassesReflections = value;
    }

    /**
     * Obtiene el valor de la propiedad hairOnEyes.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHairOnEyes() {
        return hairOnEyes;
    }

    /**
     * Define el valor de la propiedad hairOnEyes.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHairOnEyes(Integer value) {
        this.hairOnEyes = value;
    }

    /**
     * Obtiene el valor de la propiedad verticalPos.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVerticalPos() {
        return verticalPos;
    }

    /**
     * Define el valor de la propiedad verticalPos.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVerticalPos(Integer value) {
        this.verticalPos = value;
    }

    /**
     * Obtiene el valor de la propiedad horizontalPos.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHorizontalPos() {
        return horizontalPos;
    }

    /**
     * Define el valor de la propiedad horizontalPos.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHorizontalPos(Integer value) {
        this.horizontalPos = value;
    }

    /**
     * Obtiene el valor de la propiedad faceLengthRatio.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFaceLengthRatio() {
        return faceLengthRatio;
    }

    /**
     * Define el valor de la propiedad faceLengthRatio.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFaceLengthRatio(Integer value) {
        this.faceLengthRatio = value;
    }

    /**
     * Obtiene el valor de la propiedad faceWidthRatio.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFaceWidthRatio() {
        return faceWidthRatio;
    }

    /**
     * Define el valor de la propiedad faceWidthRatio.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFaceWidthRatio(Integer value) {
        this.faceWidthRatio = value;
    }

    /**
     * Obtiene el valor de la propiedad tiltedFace.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTiltedFace() {
        return tiltedFace;
    }

    /**
     * Define el valor de la propiedad tiltedFace.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTiltedFace(Integer value) {
        this.tiltedFace = value;
    }

    /**
     * Obtiene el valor de la propiedad minResolution.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinResolution() {
        return minResolution;
    }

    /**
     * Define el valor de la propiedad minResolution.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinResolution(Integer value) {
        this.minResolution = value;
    }

    /**
     * Obtiene el valor de la propiedad imageRatio.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getImageRatio() {
        return imageRatio;
    }

    /**
     * Define el valor de la propiedad imageRatio.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setImageRatio(Integer value) {
        this.imageRatio = value;
    }

    /**
     * Obtiene el valor de la propiedad shadowsFacial.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getShadowsFacial() {
        return shadowsFacial;
    }

    /**
     * Define el valor de la propiedad shadowsFacial.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setShadowsFacial(Integer value) {
        this.shadowsFacial = value;
    }

    /**
     * Obtiene el valor de la propiedad shadowsEyeSocket.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getShadowsEyeSocket() {
        return shadowsEyeSocket;
    }

    /**
     * Define el valor de la propiedad shadowsEyeSocket.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setShadowsEyeSocket(Integer value) {
        this.shadowsEyeSocket = value;
    }

    /**
     * Obtiene el valor de la propiedad uniformLighting.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUniformLighting() {
        return uniformLighting;
    }

    /**
     * Define el valor de la propiedad uniformLighting.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUniformLighting(Integer value) {
        this.uniformLighting = value;
    }

}
