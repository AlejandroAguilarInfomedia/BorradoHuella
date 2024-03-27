
package Huella_import;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Registration complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Registration"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="fingerprintSample" type="{http://www.morpho.com/mbss/generic/wsdl}FingerprintSample" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="irisSample" type="{http://www.morpho.com/mbss/generic/wsdl}IrisSample" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="faceSample" type="{http://www.morpho.com/mbss/generic/wsdl}FaceSample" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="palmprintSample" type="{http://www.morpho.com/mbss/generic/wsdl}PalmprintSample" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tattooSample" type="{http://www.morpho.com/mbss/generic/wsdl}TattooSample" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="pedestrianSample" type="{http://www.morpho.com/mbss/generic/wsdl}PedestrianSample" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="spatioTemporal" type="{http://www.morpho.com/mbss/generic/wsdl}SpatioTemporal" minOccurs="0"/&gt;
 *         &lt;element name="bagSample" type="{http://www.morpho.com/mbss/generic/wsdl}BagSample" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Registration", propOrder = {
    "id",
    "fingerprintSample",
    "irisSample",
    "faceSample",
    "palmprintSample",
    "tattooSample",
    "pedestrianSample",
    "spatioTemporal",
    "bagSample"
})
public class Registration {

    protected long id;
    protected List<FingerprintSample> fingerprintSample;
    protected List<IrisSample> irisSample;
    protected List<FaceSample> faceSample;
    protected List<PalmprintSample> palmprintSample;
    protected List<TattooSample> tattooSample;
    protected List<PedestrianSample> pedestrianSample;
    protected SpatioTemporal spatioTemporal;
    protected List<BagSample> bagSample;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the fingerprintSample property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fingerprintSample property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFingerprintSample().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FingerprintSample }
     * 
     * 
     */
    public List<FingerprintSample> getFingerprintSample() {
        if (fingerprintSample == null) {
            fingerprintSample = new ArrayList<FingerprintSample>();
        }
        return this.fingerprintSample;
    }

    /**
     * Gets the value of the irisSample property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the irisSample property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIrisSample().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IrisSample }
     * 
     * 
     */
    public List<IrisSample> getIrisSample() {
        if (irisSample == null) {
            irisSample = new ArrayList<IrisSample>();
        }
        return this.irisSample;
    }

    /**
     * Gets the value of the faceSample property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the faceSample property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFaceSample().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FaceSample }
     * 
     * 
     */
    public List<FaceSample> getFaceSample() {
        if (faceSample == null) {
            faceSample = new ArrayList<FaceSample>();
        }
        return this.faceSample;
    }

    /**
     * Gets the value of the palmprintSample property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the palmprintSample property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPalmprintSample().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PalmprintSample }
     * 
     * 
     */
    public List<PalmprintSample> getPalmprintSample() {
        if (palmprintSample == null) {
            palmprintSample = new ArrayList<PalmprintSample>();
        }
        return this.palmprintSample;
    }

    /**
     * Gets the value of the tattooSample property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tattooSample property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTattooSample().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TattooSample }
     * 
     * 
     */
    public List<TattooSample> getTattooSample() {
        if (tattooSample == null) {
            tattooSample = new ArrayList<TattooSample>();
        }
        return this.tattooSample;
    }

    /**
     * Gets the value of the pedestrianSample property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pedestrianSample property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPedestrianSample().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PedestrianSample }
     * 
     * 
     */
    public List<PedestrianSample> getPedestrianSample() {
        if (pedestrianSample == null) {
            pedestrianSample = new ArrayList<PedestrianSample>();
        }
        return this.pedestrianSample;
    }

    /**
     * Obtiene el valor de la propiedad spatioTemporal.
     * 
     * @return
     *     possible object is
     *     {@link SpatioTemporal }
     *     
     */
    public SpatioTemporal getSpatioTemporal() {
        return spatioTemporal;
    }

    /**
     * Define el valor de la propiedad spatioTemporal.
     * 
     * @param value
     *     allowed object is
     *     {@link SpatioTemporal }
     *     
     */
    public void setSpatioTemporal(SpatioTemporal value) {
        this.spatioTemporal = value;
    }

    /**
     * Gets the value of the bagSample property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bagSample property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBagSample().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BagSample }
     * 
     * 
     */
    public List<BagSample> getBagSample() {
        if (bagSample == null) {
            bagSample = new ArrayList<BagSample>();
        }
        return this.bagSample;
    }

}
