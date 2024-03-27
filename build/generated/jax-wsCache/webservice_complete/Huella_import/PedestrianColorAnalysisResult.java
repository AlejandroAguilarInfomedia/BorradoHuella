
package Huella_import;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PedestrianColorAnalysisResult complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PedestrianColorAnalysisResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="topColorScores" type="{http://www.morpho.com/mbss/generic/wsdl}PedestrianColorScores" minOccurs="0"/&gt;
 *         &lt;element name="bottomColorScores" type="{http://www.morpho.com/mbss/generic/wsdl}PedestrianColorScores" minOccurs="0"/&gt;
 *         &lt;element name="shoesColorScores" type="{http://www.morpho.com/mbss/generic/wsdl}PedestrianColorScores" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PedestrianColorAnalysisResult", propOrder = {
    "topColorScores",
    "bottomColorScores",
    "shoesColorScores"
})
public class PedestrianColorAnalysisResult {

    protected PedestrianColorScores topColorScores;
    protected PedestrianColorScores bottomColorScores;
    protected PedestrianColorScores shoesColorScores;

    /**
     * Obtiene el valor de la propiedad topColorScores.
     * 
     * @return
     *     possible object is
     *     {@link PedestrianColorScores }
     *     
     */
    public PedestrianColorScores getTopColorScores() {
        return topColorScores;
    }

    /**
     * Define el valor de la propiedad topColorScores.
     * 
     * @param value
     *     allowed object is
     *     {@link PedestrianColorScores }
     *     
     */
    public void setTopColorScores(PedestrianColorScores value) {
        this.topColorScores = value;
    }

    /**
     * Obtiene el valor de la propiedad bottomColorScores.
     * 
     * @return
     *     possible object is
     *     {@link PedestrianColorScores }
     *     
     */
    public PedestrianColorScores getBottomColorScores() {
        return bottomColorScores;
    }

    /**
     * Define el valor de la propiedad bottomColorScores.
     * 
     * @param value
     *     allowed object is
     *     {@link PedestrianColorScores }
     *     
     */
    public void setBottomColorScores(PedestrianColorScores value) {
        this.bottomColorScores = value;
    }

    /**
     * Obtiene el valor de la propiedad shoesColorScores.
     * 
     * @return
     *     possible object is
     *     {@link PedestrianColorScores }
     *     
     */
    public PedestrianColorScores getShoesColorScores() {
        return shoesColorScores;
    }

    /**
     * Define el valor de la propiedad shoesColorScores.
     * 
     * @param value
     *     allowed object is
     *     {@link PedestrianColorScores }
     *     
     */
    public void setShoesColorScores(PedestrianColorScores value) {
        this.shoesColorScores = value;
    }

}
