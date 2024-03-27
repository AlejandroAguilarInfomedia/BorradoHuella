
package Huella_import;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para MissAnalysis complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MissAnalysis"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="diagnosticBuffer" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="rankBuffer" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="searchDump" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="refDump" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="algoParam" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="baseParam" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MissAnalysis", propOrder = {
    "diagnosticBuffer",
    "rankBuffer",
    "searchDump",
    "refDump",
    "algoParam",
    "baseParam"
})
public class MissAnalysis {

    protected byte[] diagnosticBuffer;
    protected byte[] rankBuffer;
    protected byte[] searchDump;
    protected byte[] refDump;
    protected byte[] algoParam;
    protected byte[] baseParam;

    /**
     * Obtiene el valor de la propiedad diagnosticBuffer.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getDiagnosticBuffer() {
        return diagnosticBuffer;
    }

    /**
     * Define el valor de la propiedad diagnosticBuffer.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setDiagnosticBuffer(byte[] value) {
        this.diagnosticBuffer = value;
    }

    /**
     * Obtiene el valor de la propiedad rankBuffer.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getRankBuffer() {
        return rankBuffer;
    }

    /**
     * Define el valor de la propiedad rankBuffer.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setRankBuffer(byte[] value) {
        this.rankBuffer = value;
    }

    /**
     * Obtiene el valor de la propiedad searchDump.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getSearchDump() {
        return searchDump;
    }

    /**
     * Define el valor de la propiedad searchDump.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setSearchDump(byte[] value) {
        this.searchDump = value;
    }

    /**
     * Obtiene el valor de la propiedad refDump.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getRefDump() {
        return refDump;
    }

    /**
     * Define el valor de la propiedad refDump.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setRefDump(byte[] value) {
        this.refDump = value;
    }

    /**
     * Obtiene el valor de la propiedad algoParam.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getAlgoParam() {
        return algoParam;
    }

    /**
     * Define el valor de la propiedad algoParam.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setAlgoParam(byte[] value) {
        this.algoParam = value;
    }

    /**
     * Obtiene el valor de la propiedad baseParam.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getBaseParam() {
        return baseParam;
    }

    /**
     * Define el valor de la propiedad baseParam.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setBaseParam(byte[] value) {
        this.baseParam = value;
    }

}
