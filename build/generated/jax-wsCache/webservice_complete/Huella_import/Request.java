
package Huella_import;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Request complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Request"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="requestType" type="{http://www.morpho.com/mbss/generic/wsdl}RequestType"/&gt;
 *         &lt;element name="version" type="{http://www.morpho.com/mbss/generic/wsdl}Version" minOccurs="0"/&gt;
 *         &lt;element name="encodePersonRequest" type="{http://www.morpho.com/mbss/generic/wsdl}EncodePersonRequest" minOccurs="0"/&gt;
 *         &lt;element name="insertPersonRequest" type="{http://www.morpho.com/mbss/generic/wsdl}InsertPersonRequest" minOccurs="0"/&gt;
 *         &lt;element name="updatePersonRequest" type="{http://www.morpho.com/mbss/generic/wsdl}UpdatePersonRequest" minOccurs="0"/&gt;
 *         &lt;element name="deletePersonRequest" type="{http://www.morpho.com/mbss/generic/wsdl}DeletePersonRequest" minOccurs="0"/&gt;
 *         &lt;element name="existPersonRequest" type="{http://www.morpho.com/mbss/generic/wsdl}ExistPersonRequest" minOccurs="0"/&gt;
 *         &lt;element name="getPersonRequest" type="{http://www.morpho.com/mbss/generic/wsdl}GetPersonRequest" minOccurs="0"/&gt;
 *         &lt;element name="countPersonRequest" type="{http://www.morpho.com/mbss/generic/wsdl}CountPersonRequest" minOccurs="0"/&gt;
 *         &lt;element name="partialUpdatePersonRequest" type="{http://www.morpho.com/mbss/generic/wsdl}PartialUpdatePersonRequest" minOccurs="0"/&gt;
 *         &lt;element name="getTemplatesRequest" type="{http://www.morpho.com/mbss/generic/wsdl}GetTemplatesRequest" minOccurs="0"/&gt;
 *         &lt;element name="getPersonInfoListNumberRequest" type="{http://www.morpho.com/mbss/generic/wsdl}GetPersonInfoListNumberRequest" minOccurs="0"/&gt;
 *         &lt;element name="getPersonInfoListRequest" type="{http://www.morpho.com/mbss/generic/wsdl}GetPersonInfoListRequest" minOccurs="0"/&gt;
 *         &lt;element name="authenticatePersonRequest" type="{http://www.morpho.com/mbss/generic/wsdl}AuthenticatePersonRequest" minOccurs="0"/&gt;
 *         &lt;element name="personToPersonAuthRequest" type="{http://www.morpho.com/mbss/generic/wsdl}PersonToPersonAuthenticateRequest" minOccurs="0"/&gt;
 *         &lt;element name="personToPersonMatchRequest" type="{http://www.morpho.com/mbss/generic/wsdl}PersonToPersonMatchRequest" minOccurs="0"/&gt;
 *         &lt;element name="latentToPersonMatchRequest" type="{http://www.morpho.com/mbss/generic/wsdl}LatentToPersonMatchRequest" minOccurs="0"/&gt;
 *         &lt;element name="insertWithFilterThenMatchWithoutFilterPersonRequest" type="{http://www.morpho.com/mbss/generic/wsdl}InsertWithFilterThenMatchWithoutFilterPersonRequest" minOccurs="0"/&gt;
 *         &lt;element name="encodeLatentRequest" type="{http://www.morpho.com/mbss/generic/wsdl}EncodeLatentRequest" minOccurs="0"/&gt;
 *         &lt;element name="insertLatentRequest" type="{http://www.morpho.com/mbss/generic/wsdl}InsertLatentRequest" minOccurs="0"/&gt;
 *         &lt;element name="updateLatentRequest" type="{http://www.morpho.com/mbss/generic/wsdl}UpdateLatentRequest" minOccurs="0"/&gt;
 *         &lt;element name="deleteLatentRequest" type="{http://www.morpho.com/mbss/generic/wsdl}DeleteLatentRequest" minOccurs="0"/&gt;
 *         &lt;element name="existLatentRequest" type="{http://www.morpho.com/mbss/generic/wsdl}ExistLatentRequest" minOccurs="0"/&gt;
 *         &lt;element name="getLatentRequest" type="{http://www.morpho.com/mbss/generic/wsdl}GetLatentRequest" minOccurs="0"/&gt;
 *         &lt;element name="countLatentRequest" type="{http://www.morpho.com/mbss/generic/wsdl}CountLatentRequest" minOccurs="0"/&gt;
 *         &lt;element name="getLatentInfoListNumberRequest" type="{http://www.morpho.com/mbss/generic/wsdl}GetLatentInfoListNumberRequest" minOccurs="0"/&gt;
 *         &lt;element name="getLatentInfoListRequest" type="{http://www.morpho.com/mbss/generic/wsdl}GetLatentInfoListRequest" minOccurs="0"/&gt;
 *         &lt;element name="personToLatentMatchRequest" type="{http://www.morpho.com/mbss/generic/wsdl}PersonToLatentMatchRequest" minOccurs="0"/&gt;
 *         &lt;element name="latentToLatentMatchRequest" type="{http://www.morpho.com/mbss/generic/wsdl}LatentToLatentMatchRequest" minOccurs="0"/&gt;
 *         &lt;element name="replacePersonSampleRequest" type="{http://www.morpho.com/mbss/generic/wsdl}ReplacePersonSampleRequest" minOccurs="0"/&gt;
 *         &lt;element name="getPersonInfoListForConsistencyRequest" type="{http://www.morpho.com/mbss/generic/wsdl}GetPersonInfoListForConsistencyRequest" minOccurs="0"/&gt;
 *         &lt;element name="getPersonListForConsistencyRequest" type="{http://www.morpho.com/mbss/generic/wsdl}GetPersonListForConsistencyRequest" minOccurs="0"/&gt;
 *         &lt;element name="detectFacesRequest" type="{http://www.morpho.com/mbss/generic/wsdl}DetectFacesRequest" minOccurs="0"/&gt;
 *         &lt;element name="getLatentInfoListForConsistencyRequest" type="{http://www.morpho.com/mbss/generic/wsdl}GetLatentInfoListForConsistencyRequest" minOccurs="0"/&gt;
 *         &lt;element name="getLatentListForConsistencyRequest" type="{http://www.morpho.com/mbss/generic/wsdl}GetLatentListForConsistencyRequest" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Request", propOrder = {
    "requestType",
    "version",
    "encodePersonRequest",
    "insertPersonRequest",
    "updatePersonRequest",
    "deletePersonRequest",
    "existPersonRequest",
    "getPersonRequest",
    "countPersonRequest",
    "partialUpdatePersonRequest",
    "getTemplatesRequest",
    "getPersonInfoListNumberRequest",
    "getPersonInfoListRequest",
    "authenticatePersonRequest",
    "personToPersonAuthRequest",
    "personToPersonMatchRequest",
    "latentToPersonMatchRequest",
    "insertWithFilterThenMatchWithoutFilterPersonRequest",
    "encodeLatentRequest",
    "insertLatentRequest",
    "updateLatentRequest",
    "deleteLatentRequest",
    "existLatentRequest",
    "getLatentRequest",
    "countLatentRequest",
    "getLatentInfoListNumberRequest",
    "getLatentInfoListRequest",
    "personToLatentMatchRequest",
    "latentToLatentMatchRequest",
    "replacePersonSampleRequest",
    "getPersonInfoListForConsistencyRequest",
    "getPersonListForConsistencyRequest",
    "detectFacesRequest",
    "getLatentInfoListForConsistencyRequest",
    "getLatentListForConsistencyRequest"
})
public class Request {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected RequestType requestType;
    protected Version version;
    protected EncodePersonRequest encodePersonRequest;
    protected InsertPersonRequest insertPersonRequest;
    protected UpdatePersonRequest updatePersonRequest;
    protected DeletePersonRequest deletePersonRequest;
    protected ExistPersonRequest existPersonRequest;
    protected GetPersonRequest getPersonRequest;
    protected CountPersonRequest countPersonRequest;
    protected PartialUpdatePersonRequest partialUpdatePersonRequest;
    protected GetTemplatesRequest getTemplatesRequest;
    protected GetPersonInfoListNumberRequest getPersonInfoListNumberRequest;
    protected GetPersonInfoListRequest getPersonInfoListRequest;
    protected AuthenticatePersonRequest authenticatePersonRequest;
    protected PersonToPersonAuthenticateRequest personToPersonAuthRequest;
    protected PersonToPersonMatchRequest personToPersonMatchRequest;
    protected LatentToPersonMatchRequest latentToPersonMatchRequest;
    protected InsertWithFilterThenMatchWithoutFilterPersonRequest insertWithFilterThenMatchWithoutFilterPersonRequest;
    protected EncodeLatentRequest encodeLatentRequest;
    protected InsertLatentRequest insertLatentRequest;
    protected UpdateLatentRequest updateLatentRequest;
    protected DeleteLatentRequest deleteLatentRequest;
    protected ExistLatentRequest existLatentRequest;
    protected GetLatentRequest getLatentRequest;
    protected CountLatentRequest countLatentRequest;
    protected GetLatentInfoListNumberRequest getLatentInfoListNumberRequest;
    protected GetLatentInfoListRequest getLatentInfoListRequest;
    protected PersonToLatentMatchRequest personToLatentMatchRequest;
    protected LatentToLatentMatchRequest latentToLatentMatchRequest;
    protected ReplacePersonSampleRequest replacePersonSampleRequest;
    protected GetPersonInfoListForConsistencyRequest getPersonInfoListForConsistencyRequest;
    protected GetPersonListForConsistencyRequest getPersonListForConsistencyRequest;
    protected DetectFacesRequest detectFacesRequest;
    protected GetLatentInfoListForConsistencyRequest getLatentInfoListForConsistencyRequest;
    protected GetLatentListForConsistencyRequest getLatentListForConsistencyRequest;

    /**
     * Obtiene el valor de la propiedad requestType.
     * 
     * @return
     *     possible object is
     *     {@link RequestType }
     *     
     */
    public RequestType getRequestType() {
        return requestType;
    }

    /**
     * Define el valor de la propiedad requestType.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestType }
     *     
     */
    public void setRequestType(RequestType value) {
        this.requestType = value;
    }

    /**
     * Obtiene el valor de la propiedad version.
     * 
     * @return
     *     possible object is
     *     {@link Version }
     *     
     */
    public Version getVersion() {
        return version;
    }

    /**
     * Define el valor de la propiedad version.
     * 
     * @param value
     *     allowed object is
     *     {@link Version }
     *     
     */
    public void setVersion(Version value) {
        this.version = value;
    }

    /**
     * Obtiene el valor de la propiedad encodePersonRequest.
     * 
     * @return
     *     possible object is
     *     {@link EncodePersonRequest }
     *     
     */
    public EncodePersonRequest getEncodePersonRequest() {
        return encodePersonRequest;
    }

    /**
     * Define el valor de la propiedad encodePersonRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link EncodePersonRequest }
     *     
     */
    public void setEncodePersonRequest(EncodePersonRequest value) {
        this.encodePersonRequest = value;
    }

    /**
     * Obtiene el valor de la propiedad insertPersonRequest.
     * 
     * @return
     *     possible object is
     *     {@link InsertPersonRequest }
     *     
     */
    public InsertPersonRequest getInsertPersonRequest() {
        return insertPersonRequest;
    }

    /**
     * Define el valor de la propiedad insertPersonRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link InsertPersonRequest }
     *     
     */
    public void setInsertPersonRequest(InsertPersonRequest value) {
        this.insertPersonRequest = value;
    }

    /**
     * Obtiene el valor de la propiedad updatePersonRequest.
     * 
     * @return
     *     possible object is
     *     {@link UpdatePersonRequest }
     *     
     */
    public UpdatePersonRequest getUpdatePersonRequest() {
        return updatePersonRequest;
    }

    /**
     * Define el valor de la propiedad updatePersonRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatePersonRequest }
     *     
     */
    public void setUpdatePersonRequest(UpdatePersonRequest value) {
        this.updatePersonRequest = value;
    }

    /**
     * Obtiene el valor de la propiedad deletePersonRequest.
     * 
     * @return
     *     possible object is
     *     {@link DeletePersonRequest }
     *     
     */
    public DeletePersonRequest getDeletePersonRequest() {
        return deletePersonRequest;
    }

    /**
     * Define el valor de la propiedad deletePersonRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeletePersonRequest }
     *     
     */
    public void setDeletePersonRequest(DeletePersonRequest value) {
        this.deletePersonRequest = value;
    }

    /**
     * Obtiene el valor de la propiedad existPersonRequest.
     * 
     * @return
     *     possible object is
     *     {@link ExistPersonRequest }
     *     
     */
    public ExistPersonRequest getExistPersonRequest() {
        return existPersonRequest;
    }

    /**
     * Define el valor de la propiedad existPersonRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExistPersonRequest }
     *     
     */
    public void setExistPersonRequest(ExistPersonRequest value) {
        this.existPersonRequest = value;
    }

    /**
     * Obtiene el valor de la propiedad getPersonRequest.
     * 
     * @return
     *     possible object is
     *     {@link GetPersonRequest }
     *     
     */
    public GetPersonRequest getGetPersonRequest() {
        return getPersonRequest;
    }

    /**
     * Define el valor de la propiedad getPersonRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link GetPersonRequest }
     *     
     */
    public void setGetPersonRequest(GetPersonRequest value) {
        this.getPersonRequest = value;
    }

    /**
     * Obtiene el valor de la propiedad countPersonRequest.
     * 
     * @return
     *     possible object is
     *     {@link CountPersonRequest }
     *     
     */
    public CountPersonRequest getCountPersonRequest() {
        return countPersonRequest;
    }

    /**
     * Define el valor de la propiedad countPersonRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link CountPersonRequest }
     *     
     */
    public void setCountPersonRequest(CountPersonRequest value) {
        this.countPersonRequest = value;
    }

    /**
     * Obtiene el valor de la propiedad partialUpdatePersonRequest.
     * 
     * @return
     *     possible object is
     *     {@link PartialUpdatePersonRequest }
     *     
     */
    public PartialUpdatePersonRequest getPartialUpdatePersonRequest() {
        return partialUpdatePersonRequest;
    }

    /**
     * Define el valor de la propiedad partialUpdatePersonRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link PartialUpdatePersonRequest }
     *     
     */
    public void setPartialUpdatePersonRequest(PartialUpdatePersonRequest value) {
        this.partialUpdatePersonRequest = value;
    }

    /**
     * Obtiene el valor de la propiedad getTemplatesRequest.
     * 
     * @return
     *     possible object is
     *     {@link GetTemplatesRequest }
     *     
     */
    public GetTemplatesRequest getGetTemplatesRequest() {
        return getTemplatesRequest;
    }

    /**
     * Define el valor de la propiedad getTemplatesRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link GetTemplatesRequest }
     *     
     */
    public void setGetTemplatesRequest(GetTemplatesRequest value) {
        this.getTemplatesRequest = value;
    }

    /**
     * Obtiene el valor de la propiedad getPersonInfoListNumberRequest.
     * 
     * @return
     *     possible object is
     *     {@link GetPersonInfoListNumberRequest }
     *     
     */
    public GetPersonInfoListNumberRequest getGetPersonInfoListNumberRequest() {
        return getPersonInfoListNumberRequest;
    }

    /**
     * Define el valor de la propiedad getPersonInfoListNumberRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link GetPersonInfoListNumberRequest }
     *     
     */
    public void setGetPersonInfoListNumberRequest(GetPersonInfoListNumberRequest value) {
        this.getPersonInfoListNumberRequest = value;
    }

    /**
     * Obtiene el valor de la propiedad getPersonInfoListRequest.
     * 
     * @return
     *     possible object is
     *     {@link GetPersonInfoListRequest }
     *     
     */
    public GetPersonInfoListRequest getGetPersonInfoListRequest() {
        return getPersonInfoListRequest;
    }

    /**
     * Define el valor de la propiedad getPersonInfoListRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link GetPersonInfoListRequest }
     *     
     */
    public void setGetPersonInfoListRequest(GetPersonInfoListRequest value) {
        this.getPersonInfoListRequest = value;
    }

    /**
     * Obtiene el valor de la propiedad authenticatePersonRequest.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticatePersonRequest }
     *     
     */
    public AuthenticatePersonRequest getAuthenticatePersonRequest() {
        return authenticatePersonRequest;
    }

    /**
     * Define el valor de la propiedad authenticatePersonRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticatePersonRequest }
     *     
     */
    public void setAuthenticatePersonRequest(AuthenticatePersonRequest value) {
        this.authenticatePersonRequest = value;
    }

    /**
     * Obtiene el valor de la propiedad personToPersonAuthRequest.
     * 
     * @return
     *     possible object is
     *     {@link PersonToPersonAuthenticateRequest }
     *     
     */
    public PersonToPersonAuthenticateRequest getPersonToPersonAuthRequest() {
        return personToPersonAuthRequest;
    }

    /**
     * Define el valor de la propiedad personToPersonAuthRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonToPersonAuthenticateRequest }
     *     
     */
    public void setPersonToPersonAuthRequest(PersonToPersonAuthenticateRequest value) {
        this.personToPersonAuthRequest = value;
    }

    /**
     * Obtiene el valor de la propiedad personToPersonMatchRequest.
     * 
     * @return
     *     possible object is
     *     {@link PersonToPersonMatchRequest }
     *     
     */
    public PersonToPersonMatchRequest getPersonToPersonMatchRequest() {
        return personToPersonMatchRequest;
    }

    /**
     * Define el valor de la propiedad personToPersonMatchRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonToPersonMatchRequest }
     *     
     */
    public void setPersonToPersonMatchRequest(PersonToPersonMatchRequest value) {
        this.personToPersonMatchRequest = value;
    }

    /**
     * Obtiene el valor de la propiedad latentToPersonMatchRequest.
     * 
     * @return
     *     possible object is
     *     {@link LatentToPersonMatchRequest }
     *     
     */
    public LatentToPersonMatchRequest getLatentToPersonMatchRequest() {
        return latentToPersonMatchRequest;
    }

    /**
     * Define el valor de la propiedad latentToPersonMatchRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link LatentToPersonMatchRequest }
     *     
     */
    public void setLatentToPersonMatchRequest(LatentToPersonMatchRequest value) {
        this.latentToPersonMatchRequest = value;
    }

    /**
     * Obtiene el valor de la propiedad insertWithFilterThenMatchWithoutFilterPersonRequest.
     * 
     * @return
     *     possible object is
     *     {@link InsertWithFilterThenMatchWithoutFilterPersonRequest }
     *     
     */
    public InsertWithFilterThenMatchWithoutFilterPersonRequest getInsertWithFilterThenMatchWithoutFilterPersonRequest() {
        return insertWithFilterThenMatchWithoutFilterPersonRequest;
    }

    /**
     * Define el valor de la propiedad insertWithFilterThenMatchWithoutFilterPersonRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link InsertWithFilterThenMatchWithoutFilterPersonRequest }
     *     
     */
    public void setInsertWithFilterThenMatchWithoutFilterPersonRequest(InsertWithFilterThenMatchWithoutFilterPersonRequest value) {
        this.insertWithFilterThenMatchWithoutFilterPersonRequest = value;
    }

    /**
     * Obtiene el valor de la propiedad encodeLatentRequest.
     * 
     * @return
     *     possible object is
     *     {@link EncodeLatentRequest }
     *     
     */
    public EncodeLatentRequest getEncodeLatentRequest() {
        return encodeLatentRequest;
    }

    /**
     * Define el valor de la propiedad encodeLatentRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link EncodeLatentRequest }
     *     
     */
    public void setEncodeLatentRequest(EncodeLatentRequest value) {
        this.encodeLatentRequest = value;
    }

    /**
     * Obtiene el valor de la propiedad insertLatentRequest.
     * 
     * @return
     *     possible object is
     *     {@link InsertLatentRequest }
     *     
     */
    public InsertLatentRequest getInsertLatentRequest() {
        return insertLatentRequest;
    }

    /**
     * Define el valor de la propiedad insertLatentRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link InsertLatentRequest }
     *     
     */
    public void setInsertLatentRequest(InsertLatentRequest value) {
        this.insertLatentRequest = value;
    }

    /**
     * Obtiene el valor de la propiedad updateLatentRequest.
     * 
     * @return
     *     possible object is
     *     {@link UpdateLatentRequest }
     *     
     */
    public UpdateLatentRequest getUpdateLatentRequest() {
        return updateLatentRequest;
    }

    /**
     * Define el valor de la propiedad updateLatentRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateLatentRequest }
     *     
     */
    public void setUpdateLatentRequest(UpdateLatentRequest value) {
        this.updateLatentRequest = value;
    }

    /**
     * Obtiene el valor de la propiedad deleteLatentRequest.
     * 
     * @return
     *     possible object is
     *     {@link DeleteLatentRequest }
     *     
     */
    public DeleteLatentRequest getDeleteLatentRequest() {
        return deleteLatentRequest;
    }

    /**
     * Define el valor de la propiedad deleteLatentRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeleteLatentRequest }
     *     
     */
    public void setDeleteLatentRequest(DeleteLatentRequest value) {
        this.deleteLatentRequest = value;
    }

    /**
     * Obtiene el valor de la propiedad existLatentRequest.
     * 
     * @return
     *     possible object is
     *     {@link ExistLatentRequest }
     *     
     */
    public ExistLatentRequest getExistLatentRequest() {
        return existLatentRequest;
    }

    /**
     * Define el valor de la propiedad existLatentRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExistLatentRequest }
     *     
     */
    public void setExistLatentRequest(ExistLatentRequest value) {
        this.existLatentRequest = value;
    }

    /**
     * Obtiene el valor de la propiedad getLatentRequest.
     * 
     * @return
     *     possible object is
     *     {@link GetLatentRequest }
     *     
     */
    public GetLatentRequest getGetLatentRequest() {
        return getLatentRequest;
    }

    /**
     * Define el valor de la propiedad getLatentRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link GetLatentRequest }
     *     
     */
    public void setGetLatentRequest(GetLatentRequest value) {
        this.getLatentRequest = value;
    }

    /**
     * Obtiene el valor de la propiedad countLatentRequest.
     * 
     * @return
     *     possible object is
     *     {@link CountLatentRequest }
     *     
     */
    public CountLatentRequest getCountLatentRequest() {
        return countLatentRequest;
    }

    /**
     * Define el valor de la propiedad countLatentRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link CountLatentRequest }
     *     
     */
    public void setCountLatentRequest(CountLatentRequest value) {
        this.countLatentRequest = value;
    }

    /**
     * Obtiene el valor de la propiedad getLatentInfoListNumberRequest.
     * 
     * @return
     *     possible object is
     *     {@link GetLatentInfoListNumberRequest }
     *     
     */
    public GetLatentInfoListNumberRequest getGetLatentInfoListNumberRequest() {
        return getLatentInfoListNumberRequest;
    }

    /**
     * Define el valor de la propiedad getLatentInfoListNumberRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link GetLatentInfoListNumberRequest }
     *     
     */
    public void setGetLatentInfoListNumberRequest(GetLatentInfoListNumberRequest value) {
        this.getLatentInfoListNumberRequest = value;
    }

    /**
     * Obtiene el valor de la propiedad getLatentInfoListRequest.
     * 
     * @return
     *     possible object is
     *     {@link GetLatentInfoListRequest }
     *     
     */
    public GetLatentInfoListRequest getGetLatentInfoListRequest() {
        return getLatentInfoListRequest;
    }

    /**
     * Define el valor de la propiedad getLatentInfoListRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link GetLatentInfoListRequest }
     *     
     */
    public void setGetLatentInfoListRequest(GetLatentInfoListRequest value) {
        this.getLatentInfoListRequest = value;
    }

    /**
     * Obtiene el valor de la propiedad personToLatentMatchRequest.
     * 
     * @return
     *     possible object is
     *     {@link PersonToLatentMatchRequest }
     *     
     */
    public PersonToLatentMatchRequest getPersonToLatentMatchRequest() {
        return personToLatentMatchRequest;
    }

    /**
     * Define el valor de la propiedad personToLatentMatchRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonToLatentMatchRequest }
     *     
     */
    public void setPersonToLatentMatchRequest(PersonToLatentMatchRequest value) {
        this.personToLatentMatchRequest = value;
    }

    /**
     * Obtiene el valor de la propiedad latentToLatentMatchRequest.
     * 
     * @return
     *     possible object is
     *     {@link LatentToLatentMatchRequest }
     *     
     */
    public LatentToLatentMatchRequest getLatentToLatentMatchRequest() {
        return latentToLatentMatchRequest;
    }

    /**
     * Define el valor de la propiedad latentToLatentMatchRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link LatentToLatentMatchRequest }
     *     
     */
    public void setLatentToLatentMatchRequest(LatentToLatentMatchRequest value) {
        this.latentToLatentMatchRequest = value;
    }

    /**
     * Obtiene el valor de la propiedad replacePersonSampleRequest.
     * 
     * @return
     *     possible object is
     *     {@link ReplacePersonSampleRequest }
     *     
     */
    public ReplacePersonSampleRequest getReplacePersonSampleRequest() {
        return replacePersonSampleRequest;
    }

    /**
     * Define el valor de la propiedad replacePersonSampleRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReplacePersonSampleRequest }
     *     
     */
    public void setReplacePersonSampleRequest(ReplacePersonSampleRequest value) {
        this.replacePersonSampleRequest = value;
    }

    /**
     * Obtiene el valor de la propiedad getPersonInfoListForConsistencyRequest.
     * 
     * @return
     *     possible object is
     *     {@link GetPersonInfoListForConsistencyRequest }
     *     
     */
    public GetPersonInfoListForConsistencyRequest getGetPersonInfoListForConsistencyRequest() {
        return getPersonInfoListForConsistencyRequest;
    }

    /**
     * Define el valor de la propiedad getPersonInfoListForConsistencyRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link GetPersonInfoListForConsistencyRequest }
     *     
     */
    public void setGetPersonInfoListForConsistencyRequest(GetPersonInfoListForConsistencyRequest value) {
        this.getPersonInfoListForConsistencyRequest = value;
    }

    /**
     * Obtiene el valor de la propiedad getPersonListForConsistencyRequest.
     * 
     * @return
     *     possible object is
     *     {@link GetPersonListForConsistencyRequest }
     *     
     */
    public GetPersonListForConsistencyRequest getGetPersonListForConsistencyRequest() {
        return getPersonListForConsistencyRequest;
    }

    /**
     * Define el valor de la propiedad getPersonListForConsistencyRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link GetPersonListForConsistencyRequest }
     *     
     */
    public void setGetPersonListForConsistencyRequest(GetPersonListForConsistencyRequest value) {
        this.getPersonListForConsistencyRequest = value;
    }

    /**
     * Obtiene el valor de la propiedad detectFacesRequest.
     * 
     * @return
     *     possible object is
     *     {@link DetectFacesRequest }
     *     
     */
    public DetectFacesRequest getDetectFacesRequest() {
        return detectFacesRequest;
    }

    /**
     * Define el valor de la propiedad detectFacesRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link DetectFacesRequest }
     *     
     */
    public void setDetectFacesRequest(DetectFacesRequest value) {
        this.detectFacesRequest = value;
    }

    /**
     * Obtiene el valor de la propiedad getLatentInfoListForConsistencyRequest.
     * 
     * @return
     *     possible object is
     *     {@link GetLatentInfoListForConsistencyRequest }
     *     
     */
    public GetLatentInfoListForConsistencyRequest getGetLatentInfoListForConsistencyRequest() {
        return getLatentInfoListForConsistencyRequest;
    }

    /**
     * Define el valor de la propiedad getLatentInfoListForConsistencyRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link GetLatentInfoListForConsistencyRequest }
     *     
     */
    public void setGetLatentInfoListForConsistencyRequest(GetLatentInfoListForConsistencyRequest value) {
        this.getLatentInfoListForConsistencyRequest = value;
    }

    /**
     * Obtiene el valor de la propiedad getLatentListForConsistencyRequest.
     * 
     * @return
     *     possible object is
     *     {@link GetLatentListForConsistencyRequest }
     *     
     */
    public GetLatentListForConsistencyRequest getGetLatentListForConsistencyRequest() {
        return getLatentListForConsistencyRequest;
    }

    /**
     * Define el valor de la propiedad getLatentListForConsistencyRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link GetLatentListForConsistencyRequest }
     *     
     */
    public void setGetLatentListForConsistencyRequest(GetLatentListForConsistencyRequest value) {
        this.getLatentListForConsistencyRequest = value;
    }

}
