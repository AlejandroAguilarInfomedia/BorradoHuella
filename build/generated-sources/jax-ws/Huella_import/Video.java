
package Huella_import;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Video complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Video"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="miniVideo" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *         &lt;element name="bioData" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Video", propOrder = {
    "miniVideo",
    "bioData"
})
public class Video {

    @XmlElement(required = true)
    protected byte[] miniVideo;
    @XmlElement(required = true)
    protected byte[] bioData;

    /**
     * Obtiene el valor de la propiedad miniVideo.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getMiniVideo() {
        return miniVideo;
    }

    /**
     * Define el valor de la propiedad miniVideo.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setMiniVideo(byte[] value) {
        this.miniVideo = value;
    }

    /**
     * Obtiene el valor de la propiedad bioData.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getBioData() {
        return bioData;
    }

    /**
     * Define el valor de la propiedad bioData.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setBioData(byte[] value) {
        this.bioData = value;
    }

}
