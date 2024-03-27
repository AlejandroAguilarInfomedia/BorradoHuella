
package Huella_import;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FeaturePoints complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FeaturePoints"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="leftEyebrowInsideCorner" type="{http://www.morpho.com/mbss/generic/wsdl}Point" minOccurs="0"/&gt;
 *         &lt;element name="leftEyebrowOutsideCorner" type="{http://www.morpho.com/mbss/generic/wsdl}Point" minOccurs="0"/&gt;
 *         &lt;element name="rightEyebrowInsideCorner" type="{http://www.morpho.com/mbss/generic/wsdl}Point" minOccurs="0"/&gt;
 *         &lt;element name="rightEyebrowOutsideCorner" type="{http://www.morpho.com/mbss/generic/wsdl}Point" minOccurs="0"/&gt;
 *         &lt;element name="leftEyeInsideCorner" type="{http://www.morpho.com/mbss/generic/wsdl}Point" minOccurs="0"/&gt;
 *         &lt;element name="leftEyeCenter" type="{http://www.morpho.com/mbss/generic/wsdl}Point" minOccurs="0"/&gt;
 *         &lt;element name="leftEyeOutsideCorner" type="{http://www.morpho.com/mbss/generic/wsdl}Point" minOccurs="0"/&gt;
 *         &lt;element name="rightEyeInsideCorner" type="{http://www.morpho.com/mbss/generic/wsdl}Point" minOccurs="0"/&gt;
 *         &lt;element name="rightEyeCenter" type="{http://www.morpho.com/mbss/generic/wsdl}Point" minOccurs="0"/&gt;
 *         &lt;element name="rightEyeOutsideCorner" type="{http://www.morpho.com/mbss/generic/wsdl}Point" minOccurs="0"/&gt;
 *         &lt;element name="noseLeftExtremePoint" type="{http://www.morpho.com/mbss/generic/wsdl}Point" minOccurs="0"/&gt;
 *         &lt;element name="noseRightExtremePoint" type="{http://www.morpho.com/mbss/generic/wsdl}Point" minOccurs="0"/&gt;
 *         &lt;element name="noseTopBridge" type="{http://www.morpho.com/mbss/generic/wsdl}Point" minOccurs="0"/&gt;
 *         &lt;element name="noseEnd" type="{http://www.morpho.com/mbss/generic/wsdl}Point" minOccurs="0"/&gt;
 *         &lt;element name="noseMiddleBasis" type="{http://www.morpho.com/mbss/generic/wsdl}Point" minOccurs="0"/&gt;
 *         &lt;element name="leftEarBottom" type="{http://www.morpho.com/mbss/generic/wsdl}Point" minOccurs="0"/&gt;
 *         &lt;element name="rightEarBottom" type="{http://www.morpho.com/mbss/generic/wsdl}Point" minOccurs="0"/&gt;
 *         &lt;element name="upperLipMiddlePoint" type="{http://www.morpho.com/mbss/generic/wsdl}Point" minOccurs="0"/&gt;
 *         &lt;element name="mouthRightCorner" type="{http://www.morpho.com/mbss/generic/wsdl}Point" minOccurs="0"/&gt;
 *         &lt;element name="mouthLeftCorner" type="{http://www.morpho.com/mbss/generic/wsdl}Point" minOccurs="0"/&gt;
 *         &lt;element name="lowerLipMiddlePoint" type="{http://www.morpho.com/mbss/generic/wsdl}Point" minOccurs="0"/&gt;
 *         &lt;element name="chinBottom" type="{http://www.morpho.com/mbss/generic/wsdl}Point" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeaturePoints", propOrder = {
    "leftEyebrowInsideCorner",
    "leftEyebrowOutsideCorner",
    "rightEyebrowInsideCorner",
    "rightEyebrowOutsideCorner",
    "leftEyeInsideCorner",
    "leftEyeCenter",
    "leftEyeOutsideCorner",
    "rightEyeInsideCorner",
    "rightEyeCenter",
    "rightEyeOutsideCorner",
    "noseLeftExtremePoint",
    "noseRightExtremePoint",
    "noseTopBridge",
    "noseEnd",
    "noseMiddleBasis",
    "leftEarBottom",
    "rightEarBottom",
    "upperLipMiddlePoint",
    "mouthRightCorner",
    "mouthLeftCorner",
    "lowerLipMiddlePoint",
    "chinBottom"
})
public class FeaturePoints {

    protected Point leftEyebrowInsideCorner;
    protected Point leftEyebrowOutsideCorner;
    protected Point rightEyebrowInsideCorner;
    protected Point rightEyebrowOutsideCorner;
    protected Point leftEyeInsideCorner;
    protected Point leftEyeCenter;
    protected Point leftEyeOutsideCorner;
    protected Point rightEyeInsideCorner;
    protected Point rightEyeCenter;
    protected Point rightEyeOutsideCorner;
    protected Point noseLeftExtremePoint;
    protected Point noseRightExtremePoint;
    protected Point noseTopBridge;
    protected Point noseEnd;
    protected Point noseMiddleBasis;
    protected Point leftEarBottom;
    protected Point rightEarBottom;
    protected Point upperLipMiddlePoint;
    protected Point mouthRightCorner;
    protected Point mouthLeftCorner;
    protected Point lowerLipMiddlePoint;
    protected Point chinBottom;

    /**
     * Obtiene el valor de la propiedad leftEyebrowInsideCorner.
     * 
     * @return
     *     possible object is
     *     {@link Point }
     *     
     */
    public Point getLeftEyebrowInsideCorner() {
        return leftEyebrowInsideCorner;
    }

    /**
     * Define el valor de la propiedad leftEyebrowInsideCorner.
     * 
     * @param value
     *     allowed object is
     *     {@link Point }
     *     
     */
    public void setLeftEyebrowInsideCorner(Point value) {
        this.leftEyebrowInsideCorner = value;
    }

    /**
     * Obtiene el valor de la propiedad leftEyebrowOutsideCorner.
     * 
     * @return
     *     possible object is
     *     {@link Point }
     *     
     */
    public Point getLeftEyebrowOutsideCorner() {
        return leftEyebrowOutsideCorner;
    }

    /**
     * Define el valor de la propiedad leftEyebrowOutsideCorner.
     * 
     * @param value
     *     allowed object is
     *     {@link Point }
     *     
     */
    public void setLeftEyebrowOutsideCorner(Point value) {
        this.leftEyebrowOutsideCorner = value;
    }

    /**
     * Obtiene el valor de la propiedad rightEyebrowInsideCorner.
     * 
     * @return
     *     possible object is
     *     {@link Point }
     *     
     */
    public Point getRightEyebrowInsideCorner() {
        return rightEyebrowInsideCorner;
    }

    /**
     * Define el valor de la propiedad rightEyebrowInsideCorner.
     * 
     * @param value
     *     allowed object is
     *     {@link Point }
     *     
     */
    public void setRightEyebrowInsideCorner(Point value) {
        this.rightEyebrowInsideCorner = value;
    }

    /**
     * Obtiene el valor de la propiedad rightEyebrowOutsideCorner.
     * 
     * @return
     *     possible object is
     *     {@link Point }
     *     
     */
    public Point getRightEyebrowOutsideCorner() {
        return rightEyebrowOutsideCorner;
    }

    /**
     * Define el valor de la propiedad rightEyebrowOutsideCorner.
     * 
     * @param value
     *     allowed object is
     *     {@link Point }
     *     
     */
    public void setRightEyebrowOutsideCorner(Point value) {
        this.rightEyebrowOutsideCorner = value;
    }

    /**
     * Obtiene el valor de la propiedad leftEyeInsideCorner.
     * 
     * @return
     *     possible object is
     *     {@link Point }
     *     
     */
    public Point getLeftEyeInsideCorner() {
        return leftEyeInsideCorner;
    }

    /**
     * Define el valor de la propiedad leftEyeInsideCorner.
     * 
     * @param value
     *     allowed object is
     *     {@link Point }
     *     
     */
    public void setLeftEyeInsideCorner(Point value) {
        this.leftEyeInsideCorner = value;
    }

    /**
     * Obtiene el valor de la propiedad leftEyeCenter.
     * 
     * @return
     *     possible object is
     *     {@link Point }
     *     
     */
    public Point getLeftEyeCenter() {
        return leftEyeCenter;
    }

    /**
     * Define el valor de la propiedad leftEyeCenter.
     * 
     * @param value
     *     allowed object is
     *     {@link Point }
     *     
     */
    public void setLeftEyeCenter(Point value) {
        this.leftEyeCenter = value;
    }

    /**
     * Obtiene el valor de la propiedad leftEyeOutsideCorner.
     * 
     * @return
     *     possible object is
     *     {@link Point }
     *     
     */
    public Point getLeftEyeOutsideCorner() {
        return leftEyeOutsideCorner;
    }

    /**
     * Define el valor de la propiedad leftEyeOutsideCorner.
     * 
     * @param value
     *     allowed object is
     *     {@link Point }
     *     
     */
    public void setLeftEyeOutsideCorner(Point value) {
        this.leftEyeOutsideCorner = value;
    }

    /**
     * Obtiene el valor de la propiedad rightEyeInsideCorner.
     * 
     * @return
     *     possible object is
     *     {@link Point }
     *     
     */
    public Point getRightEyeInsideCorner() {
        return rightEyeInsideCorner;
    }

    /**
     * Define el valor de la propiedad rightEyeInsideCorner.
     * 
     * @param value
     *     allowed object is
     *     {@link Point }
     *     
     */
    public void setRightEyeInsideCorner(Point value) {
        this.rightEyeInsideCorner = value;
    }

    /**
     * Obtiene el valor de la propiedad rightEyeCenter.
     * 
     * @return
     *     possible object is
     *     {@link Point }
     *     
     */
    public Point getRightEyeCenter() {
        return rightEyeCenter;
    }

    /**
     * Define el valor de la propiedad rightEyeCenter.
     * 
     * @param value
     *     allowed object is
     *     {@link Point }
     *     
     */
    public void setRightEyeCenter(Point value) {
        this.rightEyeCenter = value;
    }

    /**
     * Obtiene el valor de la propiedad rightEyeOutsideCorner.
     * 
     * @return
     *     possible object is
     *     {@link Point }
     *     
     */
    public Point getRightEyeOutsideCorner() {
        return rightEyeOutsideCorner;
    }

    /**
     * Define el valor de la propiedad rightEyeOutsideCorner.
     * 
     * @param value
     *     allowed object is
     *     {@link Point }
     *     
     */
    public void setRightEyeOutsideCorner(Point value) {
        this.rightEyeOutsideCorner = value;
    }

    /**
     * Obtiene el valor de la propiedad noseLeftExtremePoint.
     * 
     * @return
     *     possible object is
     *     {@link Point }
     *     
     */
    public Point getNoseLeftExtremePoint() {
        return noseLeftExtremePoint;
    }

    /**
     * Define el valor de la propiedad noseLeftExtremePoint.
     * 
     * @param value
     *     allowed object is
     *     {@link Point }
     *     
     */
    public void setNoseLeftExtremePoint(Point value) {
        this.noseLeftExtremePoint = value;
    }

    /**
     * Obtiene el valor de la propiedad noseRightExtremePoint.
     * 
     * @return
     *     possible object is
     *     {@link Point }
     *     
     */
    public Point getNoseRightExtremePoint() {
        return noseRightExtremePoint;
    }

    /**
     * Define el valor de la propiedad noseRightExtremePoint.
     * 
     * @param value
     *     allowed object is
     *     {@link Point }
     *     
     */
    public void setNoseRightExtremePoint(Point value) {
        this.noseRightExtremePoint = value;
    }

    /**
     * Obtiene el valor de la propiedad noseTopBridge.
     * 
     * @return
     *     possible object is
     *     {@link Point }
     *     
     */
    public Point getNoseTopBridge() {
        return noseTopBridge;
    }

    /**
     * Define el valor de la propiedad noseTopBridge.
     * 
     * @param value
     *     allowed object is
     *     {@link Point }
     *     
     */
    public void setNoseTopBridge(Point value) {
        this.noseTopBridge = value;
    }

    /**
     * Obtiene el valor de la propiedad noseEnd.
     * 
     * @return
     *     possible object is
     *     {@link Point }
     *     
     */
    public Point getNoseEnd() {
        return noseEnd;
    }

    /**
     * Define el valor de la propiedad noseEnd.
     * 
     * @param value
     *     allowed object is
     *     {@link Point }
     *     
     */
    public void setNoseEnd(Point value) {
        this.noseEnd = value;
    }

    /**
     * Obtiene el valor de la propiedad noseMiddleBasis.
     * 
     * @return
     *     possible object is
     *     {@link Point }
     *     
     */
    public Point getNoseMiddleBasis() {
        return noseMiddleBasis;
    }

    /**
     * Define el valor de la propiedad noseMiddleBasis.
     * 
     * @param value
     *     allowed object is
     *     {@link Point }
     *     
     */
    public void setNoseMiddleBasis(Point value) {
        this.noseMiddleBasis = value;
    }

    /**
     * Obtiene el valor de la propiedad leftEarBottom.
     * 
     * @return
     *     possible object is
     *     {@link Point }
     *     
     */
    public Point getLeftEarBottom() {
        return leftEarBottom;
    }

    /**
     * Define el valor de la propiedad leftEarBottom.
     * 
     * @param value
     *     allowed object is
     *     {@link Point }
     *     
     */
    public void setLeftEarBottom(Point value) {
        this.leftEarBottom = value;
    }

    /**
     * Obtiene el valor de la propiedad rightEarBottom.
     * 
     * @return
     *     possible object is
     *     {@link Point }
     *     
     */
    public Point getRightEarBottom() {
        return rightEarBottom;
    }

    /**
     * Define el valor de la propiedad rightEarBottom.
     * 
     * @param value
     *     allowed object is
     *     {@link Point }
     *     
     */
    public void setRightEarBottom(Point value) {
        this.rightEarBottom = value;
    }

    /**
     * Obtiene el valor de la propiedad upperLipMiddlePoint.
     * 
     * @return
     *     possible object is
     *     {@link Point }
     *     
     */
    public Point getUpperLipMiddlePoint() {
        return upperLipMiddlePoint;
    }

    /**
     * Define el valor de la propiedad upperLipMiddlePoint.
     * 
     * @param value
     *     allowed object is
     *     {@link Point }
     *     
     */
    public void setUpperLipMiddlePoint(Point value) {
        this.upperLipMiddlePoint = value;
    }

    /**
     * Obtiene el valor de la propiedad mouthRightCorner.
     * 
     * @return
     *     possible object is
     *     {@link Point }
     *     
     */
    public Point getMouthRightCorner() {
        return mouthRightCorner;
    }

    /**
     * Define el valor de la propiedad mouthRightCorner.
     * 
     * @param value
     *     allowed object is
     *     {@link Point }
     *     
     */
    public void setMouthRightCorner(Point value) {
        this.mouthRightCorner = value;
    }

    /**
     * Obtiene el valor de la propiedad mouthLeftCorner.
     * 
     * @return
     *     possible object is
     *     {@link Point }
     *     
     */
    public Point getMouthLeftCorner() {
        return mouthLeftCorner;
    }

    /**
     * Define el valor de la propiedad mouthLeftCorner.
     * 
     * @param value
     *     allowed object is
     *     {@link Point }
     *     
     */
    public void setMouthLeftCorner(Point value) {
        this.mouthLeftCorner = value;
    }

    /**
     * Obtiene el valor de la propiedad lowerLipMiddlePoint.
     * 
     * @return
     *     possible object is
     *     {@link Point }
     *     
     */
    public Point getLowerLipMiddlePoint() {
        return lowerLipMiddlePoint;
    }

    /**
     * Define el valor de la propiedad lowerLipMiddlePoint.
     * 
     * @param value
     *     allowed object is
     *     {@link Point }
     *     
     */
    public void setLowerLipMiddlePoint(Point value) {
        this.lowerLipMiddlePoint = value;
    }

    /**
     * Obtiene el valor de la propiedad chinBottom.
     * 
     * @return
     *     possible object is
     *     {@link Point }
     *     
     */
    public Point getChinBottom() {
        return chinBottom;
    }

    /**
     * Define el valor de la propiedad chinBottom.
     * 
     * @param value
     *     allowed object is
     *     {@link Point }
     *     
     */
    public void setChinBottom(Point value) {
        this.chinBottom = value;
    }

}
