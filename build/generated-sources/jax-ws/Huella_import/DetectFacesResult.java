
package Huella_import;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DetectFacesResult complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DetectFacesResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="featurePoints" type="{http://www.morpho.com/mbss/generic/wsdl}FeaturePoints" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetectFacesResult", propOrder = {
    "featurePoints"
})
public class DetectFacesResult {

    protected FeaturePoints featurePoints;

    /**
     * Obtiene el valor de la propiedad featurePoints.
     * 
     * @return
     *     possible object is
     *     {@link FeaturePoints }
     *     
     */
    public FeaturePoints getFeaturePoints() {
        return featurePoints;
    }

    /**
     * Define el valor de la propiedad featurePoints.
     * 
     * @param value
     *     allowed object is
     *     {@link FeaturePoints }
     *     
     */
    public void setFeaturePoints(FeaturePoints value) {
        this.featurePoints = value;
    }

}
