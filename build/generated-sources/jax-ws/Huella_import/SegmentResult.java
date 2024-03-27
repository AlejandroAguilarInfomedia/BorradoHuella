
package Huella_import;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SegmentResult complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SegmentResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="score" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="u" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="v" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="a" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="crampingX" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="crampingY" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="personRefId" type="{http://www.morpho.com/mbss/generic/wsdl}PersonId" minOccurs="0"/&gt;
 *         &lt;element name="personSearchId" type="{http://www.morpho.com/mbss/generic/wsdl}PersonId" minOccurs="0"/&gt;
 *         &lt;element name="dilatation" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="imageTranslationX" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="imageTranslationY" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="imageRotation" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="imageCrampingPointX" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="imageCrampingPointY" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="imageDilatation" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="refACE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="searchACE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="imageRotation8192" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SegmentResult", propOrder = {
    "score",
    "u",
    "v",
    "a",
    "crampingX",
    "crampingY",
    "personRefId",
    "personSearchId",
    "dilatation",
    "imageTranslationX",
    "imageTranslationY",
    "imageRotation",
    "imageCrampingPointX",
    "imageCrampingPointY",
    "imageDilatation",
    "refACE",
    "searchACE",
    "imageRotation8192"
})
public class SegmentResult {

    protected Integer score;
    protected Integer u;
    protected Integer v;
    protected Integer a;
    protected Integer crampingX;
    protected Integer crampingY;
    protected PersonId personRefId;
    protected PersonId personSearchId;
    protected Integer dilatation;
    protected Integer imageTranslationX;
    protected Integer imageTranslationY;
    protected Double imageRotation;
    protected Integer imageCrampingPointX;
    protected Integer imageCrampingPointY;
    protected Integer imageDilatation;
    protected Boolean refACE;
    protected Boolean searchACE;
    protected Integer imageRotation8192;

    /**
     * Obtiene el valor de la propiedad score.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getScore() {
        return score;
    }

    /**
     * Define el valor de la propiedad score.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setScore(Integer value) {
        this.score = value;
    }

    /**
     * Obtiene el valor de la propiedad u.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getU() {
        return u;
    }

    /**
     * Define el valor de la propiedad u.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setU(Integer value) {
        this.u = value;
    }

    /**
     * Obtiene el valor de la propiedad v.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getV() {
        return v;
    }

    /**
     * Define el valor de la propiedad v.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setV(Integer value) {
        this.v = value;
    }

    /**
     * Obtiene el valor de la propiedad a.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getA() {
        return a;
    }

    /**
     * Define el valor de la propiedad a.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setA(Integer value) {
        this.a = value;
    }

    /**
     * Obtiene el valor de la propiedad crampingX.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCrampingX() {
        return crampingX;
    }

    /**
     * Define el valor de la propiedad crampingX.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCrampingX(Integer value) {
        this.crampingX = value;
    }

    /**
     * Obtiene el valor de la propiedad crampingY.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCrampingY() {
        return crampingY;
    }

    /**
     * Define el valor de la propiedad crampingY.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCrampingY(Integer value) {
        this.crampingY = value;
    }

    /**
     * Obtiene el valor de la propiedad personRefId.
     * 
     * @return
     *     possible object is
     *     {@link PersonId }
     *     
     */
    public PersonId getPersonRefId() {
        return personRefId;
    }

    /**
     * Define el valor de la propiedad personRefId.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonId }
     *     
     */
    public void setPersonRefId(PersonId value) {
        this.personRefId = value;
    }

    /**
     * Obtiene el valor de la propiedad personSearchId.
     * 
     * @return
     *     possible object is
     *     {@link PersonId }
     *     
     */
    public PersonId getPersonSearchId() {
        return personSearchId;
    }

    /**
     * Define el valor de la propiedad personSearchId.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonId }
     *     
     */
    public void setPersonSearchId(PersonId value) {
        this.personSearchId = value;
    }

    /**
     * Obtiene el valor de la propiedad dilatation.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDilatation() {
        return dilatation;
    }

    /**
     * Define el valor de la propiedad dilatation.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDilatation(Integer value) {
        this.dilatation = value;
    }

    /**
     * Obtiene el valor de la propiedad imageTranslationX.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getImageTranslationX() {
        return imageTranslationX;
    }

    /**
     * Define el valor de la propiedad imageTranslationX.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setImageTranslationX(Integer value) {
        this.imageTranslationX = value;
    }

    /**
     * Obtiene el valor de la propiedad imageTranslationY.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getImageTranslationY() {
        return imageTranslationY;
    }

    /**
     * Define el valor de la propiedad imageTranslationY.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setImageTranslationY(Integer value) {
        this.imageTranslationY = value;
    }

    /**
     * Obtiene el valor de la propiedad imageRotation.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getImageRotation() {
        return imageRotation;
    }

    /**
     * Define el valor de la propiedad imageRotation.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setImageRotation(Double value) {
        this.imageRotation = value;
    }

    /**
     * Obtiene el valor de la propiedad imageCrampingPointX.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getImageCrampingPointX() {
        return imageCrampingPointX;
    }

    /**
     * Define el valor de la propiedad imageCrampingPointX.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setImageCrampingPointX(Integer value) {
        this.imageCrampingPointX = value;
    }

    /**
     * Obtiene el valor de la propiedad imageCrampingPointY.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getImageCrampingPointY() {
        return imageCrampingPointY;
    }

    /**
     * Define el valor de la propiedad imageCrampingPointY.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setImageCrampingPointY(Integer value) {
        this.imageCrampingPointY = value;
    }

    /**
     * Obtiene el valor de la propiedad imageDilatation.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getImageDilatation() {
        return imageDilatation;
    }

    /**
     * Define el valor de la propiedad imageDilatation.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setImageDilatation(Integer value) {
        this.imageDilatation = value;
    }

    /**
     * Obtiene el valor de la propiedad refACE.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRefACE() {
        return refACE;
    }

    /**
     * Define el valor de la propiedad refACE.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRefACE(Boolean value) {
        this.refACE = value;
    }

    /**
     * Obtiene el valor de la propiedad searchACE.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSearchACE() {
        return searchACE;
    }

    /**
     * Define el valor de la propiedad searchACE.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSearchACE(Boolean value) {
        this.searchACE = value;
    }

    /**
     * Obtiene el valor de la propiedad imageRotation8192.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getImageRotation8192() {
        return imageRotation8192;
    }

    /**
     * Define el valor de la propiedad imageRotation8192.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setImageRotation8192(Integer value) {
        this.imageRotation8192 = value;
    }

}
