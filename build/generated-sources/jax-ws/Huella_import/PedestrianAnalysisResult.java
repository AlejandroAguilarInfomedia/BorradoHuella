
package Huella_import;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PedestrianAnalysisResult complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PedestrianAnalysisResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="genderAnalysisResult" type="{http://www.morpho.com/mbss/generic/wsdl}PedestrianGenderAnalysisResult" minOccurs="0"/&gt;
 *         &lt;element name="bagAnalysisResult" type="{http://www.morpho.com/mbss/generic/wsdl}PedestrianBagAnalysisResult" minOccurs="0"/&gt;
 *         &lt;element name="colorAnalysisResult" type="{http://www.morpho.com/mbss/generic/wsdl}PedestrianColorAnalysisResult" minOccurs="0"/&gt;
 *         &lt;element name="hardHatAnalysisResult" type="{http://www.morpho.com/mbss/generic/wsdl}PedestrianHardHatAnalysisResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PedestrianAnalysisResult", propOrder = {
    "genderAnalysisResult",
    "bagAnalysisResult",
    "colorAnalysisResult",
    "hardHatAnalysisResult"
})
public class PedestrianAnalysisResult {

    protected PedestrianGenderAnalysisResult genderAnalysisResult;
    protected PedestrianBagAnalysisResult bagAnalysisResult;
    protected PedestrianColorAnalysisResult colorAnalysisResult;
    protected PedestrianHardHatAnalysisResult hardHatAnalysisResult;

    /**
     * Obtiene el valor de la propiedad genderAnalysisResult.
     * 
     * @return
     *     possible object is
     *     {@link PedestrianGenderAnalysisResult }
     *     
     */
    public PedestrianGenderAnalysisResult getGenderAnalysisResult() {
        return genderAnalysisResult;
    }

    /**
     * Define el valor de la propiedad genderAnalysisResult.
     * 
     * @param value
     *     allowed object is
     *     {@link PedestrianGenderAnalysisResult }
     *     
     */
    public void setGenderAnalysisResult(PedestrianGenderAnalysisResult value) {
        this.genderAnalysisResult = value;
    }

    /**
     * Obtiene el valor de la propiedad bagAnalysisResult.
     * 
     * @return
     *     possible object is
     *     {@link PedestrianBagAnalysisResult }
     *     
     */
    public PedestrianBagAnalysisResult getBagAnalysisResult() {
        return bagAnalysisResult;
    }

    /**
     * Define el valor de la propiedad bagAnalysisResult.
     * 
     * @param value
     *     allowed object is
     *     {@link PedestrianBagAnalysisResult }
     *     
     */
    public void setBagAnalysisResult(PedestrianBagAnalysisResult value) {
        this.bagAnalysisResult = value;
    }

    /**
     * Obtiene el valor de la propiedad colorAnalysisResult.
     * 
     * @return
     *     possible object is
     *     {@link PedestrianColorAnalysisResult }
     *     
     */
    public PedestrianColorAnalysisResult getColorAnalysisResult() {
        return colorAnalysisResult;
    }

    /**
     * Define el valor de la propiedad colorAnalysisResult.
     * 
     * @param value
     *     allowed object is
     *     {@link PedestrianColorAnalysisResult }
     *     
     */
    public void setColorAnalysisResult(PedestrianColorAnalysisResult value) {
        this.colorAnalysisResult = value;
    }

    /**
     * Obtiene el valor de la propiedad hardHatAnalysisResult.
     * 
     * @return
     *     possible object is
     *     {@link PedestrianHardHatAnalysisResult }
     *     
     */
    public PedestrianHardHatAnalysisResult getHardHatAnalysisResult() {
        return hardHatAnalysisResult;
    }

    /**
     * Define el valor de la propiedad hardHatAnalysisResult.
     * 
     * @param value
     *     allowed object is
     *     {@link PedestrianHardHatAnalysisResult }
     *     
     */
    public void setHardHatAnalysisResult(PedestrianHardHatAnalysisResult value) {
        this.hardHatAnalysisResult = value;
    }

}
