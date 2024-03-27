
package Huella_import;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FilterSet complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FilterSet"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numericFilters" type="{http://www.morpho.com/mbss/generic/wsdl}NumericFilter" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="binaryFilters" type="{http://www.morpho.com/mbss/generic/wsdl}BinaryFilter" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FilterSet", propOrder = {
    "numericFilters",
    "binaryFilters"
})
public class FilterSet {

    protected List<NumericFilter> numericFilters;
    protected List<BinaryFilter> binaryFilters;

    /**
     * Gets the value of the numericFilters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the numericFilters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNumericFilters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NumericFilter }
     * 
     * 
     */
    public List<NumericFilter> getNumericFilters() {
        if (numericFilters == null) {
            numericFilters = new ArrayList<NumericFilter>();
        }
        return this.numericFilters;
    }

    /**
     * Gets the value of the binaryFilters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the binaryFilters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBinaryFilters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BinaryFilter }
     * 
     * 
     */
    public List<BinaryFilter> getBinaryFilters() {
        if (binaryFilters == null) {
            binaryFilters = new ArrayList<BinaryFilter>();
        }
        return this.binaryFilters;
    }

}
