
package Huella_import;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Response complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Response"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="responseType" type="{http://www.morpho.com/mbss/generic/wsdl}RequestType"/&gt;
 *         &lt;element name="encodePersonResponse" type="{http://www.morpho.com/mbss/generic/wsdl}EncodePersonResponse" minOccurs="0"/&gt;
 *         &lt;element name="encodeLatentResponse" type="{http://www.morpho.com/mbss/generic/wsdl}EncodeLatentResponse" minOccurs="0"/&gt;
 *         &lt;element name="insertPersonResponse" type="{http://www.morpho.com/mbss/generic/wsdl}InsertPersonResponse" minOccurs="0"/&gt;
 *         &lt;element name="deletePersonResponse" type="{http://www.morpho.com/mbss/generic/wsdl}DeletePersonResponse" minOccurs="0"/&gt;
 *         &lt;element name="getPersonResponse" type="{http://www.morpho.com/mbss/generic/wsdl}GetPersonResponse" minOccurs="0"/&gt;
 *         &lt;element name="countPersonResponse" type="{http://www.morpho.com/mbss/generic/wsdl}CountPersonResponse" minOccurs="0"/&gt;
 *         &lt;element name="existPersonResponse" type="{http://www.morpho.com/mbss/generic/wsdl}ExistPersonResponse" minOccurs="0"/&gt;
 *         &lt;element name="insertLatentResponse" type="{http://www.morpho.com/mbss/generic/wsdl}InsertLatentResponse" minOccurs="0"/&gt;
 *         &lt;element name="deleteLatentResponse" type="{http://www.morpho.com/mbss/generic/wsdl}DeleteLatentResponse" minOccurs="0"/&gt;
 *         &lt;element name="getLatentResponse" type="{http://www.morpho.com/mbss/generic/wsdl}GetLatentResponse" minOccurs="0"/&gt;
 *         &lt;element name="insertWithFilterThenMatchWithoutFilterPersonResponse" type="{http://www.morpho.com/mbss/generic/wsdl}InsertWithFilterThenMatchWithoutFilterPersonResponse" minOccurs="0"/&gt;
 *         &lt;element name="getTemplatesResponse" type="{http://www.morpho.com/mbss/generic/wsdl}GetTemplatesResponse" minOccurs="0"/&gt;
 *         &lt;element name="authenticatePersonResponse" type="{http://www.morpho.com/mbss/generic/wsdl}AuthenticatePersonResponse" minOccurs="0"/&gt;
 *         &lt;element name="personToPersonAuthResponse" type="{http://www.morpho.com/mbss/generic/wsdl}PersonToPersonAuthenticateResponse" minOccurs="0"/&gt;
 *         &lt;element name="personToPersonMatchResponse" type="{http://www.morpho.com/mbss/generic/wsdl}PersonToPersonMatchResponse" minOccurs="0"/&gt;
 *         &lt;element name="personToLatentMatchResponse" type="{http://www.morpho.com/mbss/generic/wsdl}PersonToLatentMatchResponse" minOccurs="0"/&gt;
 *         &lt;element name="latentToPersonMatchResponse" type="{http://www.morpho.com/mbss/generic/wsdl}LatentToPersonMatchResponse" minOccurs="0"/&gt;
 *         &lt;element name="latentToLatentMatchResponse" type="{http://www.morpho.com/mbss/generic/wsdl}LatentToLatentMatchResponse" minOccurs="0"/&gt;
 *         &lt;element name="updatePersonResponse" type="{http://www.morpho.com/mbss/generic/wsdl}UpdatePersonResponse" minOccurs="0"/&gt;
 *         &lt;element name="updateLatentResponse" type="{http://www.morpho.com/mbss/generic/wsdl}UpdateLatentResponse" minOccurs="0"/&gt;
 *         &lt;element name="countLatentResponse" type="{http://www.morpho.com/mbss/generic/wsdl}CountLatentResponse" minOccurs="0"/&gt;
 *         &lt;element name="existLatentResponse" type="{http://www.morpho.com/mbss/generic/wsdl}ExistLatentResponse" minOccurs="0"/&gt;
 *         &lt;element name="partialUpdatePersonResponse" type="{http://www.morpho.com/mbss/generic/wsdl}PartialUpdatePersonResponse" minOccurs="0"/&gt;
 *         &lt;element name="getPersonInfoListNumberResponse" type="{http://www.morpho.com/mbss/generic/wsdl}GetPersonInfoListNumberResponse" minOccurs="0"/&gt;
 *         &lt;element name="getPersonInfoListResponse" type="{http://www.morpho.com/mbss/generic/wsdl}GetPersonInfoListResponse" minOccurs="0"/&gt;
 *         &lt;element name="getLatentInfoListNumberResponse" type="{http://www.morpho.com/mbss/generic/wsdl}GetLatentInfoListNumberResponse" minOccurs="0"/&gt;
 *         &lt;element name="getLatentInfoListResponse" type="{http://www.morpho.com/mbss/generic/wsdl}GetLatentInfoListResponse" minOccurs="0"/&gt;
 *         &lt;element name="replacePersonSampleResponse" type="{http://www.morpho.com/mbss/generic/wsdl}ReplacePersonSampleResponse" minOccurs="0"/&gt;
 *         &lt;element name="getPersonInfoListForConsistencyResponse" type="{http://www.morpho.com/mbss/generic/wsdl}GetPersonInfoListForConsistencyResponse" minOccurs="0"/&gt;
 *         &lt;element name="getPersonListForConsistencyResponse" type="{http://www.morpho.com/mbss/generic/wsdl}GetPersonListForConsistencyResponse" minOccurs="0"/&gt;
 *         &lt;element name="detectFacesResponse" type="{http://www.morpho.com/mbss/generic/wsdl}DetectFacesResponse" minOccurs="0"/&gt;
 *         &lt;element name="getLatentInfoListForConsistencyResponse" type="{http://www.morpho.com/mbss/generic/wsdl}GetLatentInfoListForConsistencyResponse" minOccurs="0"/&gt;
 *         &lt;element name="getLatentListForConsistencyResponse" type="{http://www.morpho.com/mbss/generic/wsdl}GetLatentListForConsistencyResponse" minOccurs="0"/&gt;
 *         &lt;element name="errorResponse" type="{http://www.morpho.com/mbss/generic/wsdl}ErrorResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Response", propOrder = {
    "responseType",
    "encodePersonResponse",
    "encodeLatentResponse",
    "insertPersonResponse",
    "deletePersonResponse",
    "getPersonResponse",
    "countPersonResponse",
    "existPersonResponse",
    "insertLatentResponse",
    "deleteLatentResponse",
    "getLatentResponse",
    "insertWithFilterThenMatchWithoutFilterPersonResponse",
    "getTemplatesResponse",
    "authenticatePersonResponse",
    "personToPersonAuthResponse",
    "personToPersonMatchResponse",
    "personToLatentMatchResponse",
    "latentToPersonMatchResponse",
    "latentToLatentMatchResponse",
    "updatePersonResponse",
    "updateLatentResponse",
    "countLatentResponse",
    "existLatentResponse",
    "partialUpdatePersonResponse",
    "getPersonInfoListNumberResponse",
    "getPersonInfoListResponse",
    "getLatentInfoListNumberResponse",
    "getLatentInfoListResponse",
    "replacePersonSampleResponse",
    "getPersonInfoListForConsistencyResponse",
    "getPersonListForConsistencyResponse",
    "detectFacesResponse",
    "getLatentInfoListForConsistencyResponse",
    "getLatentListForConsistencyResponse",
    "errorResponse"
})
public class Response {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected RequestType responseType;
    protected EncodePersonResponse encodePersonResponse;
    protected EncodeLatentResponse encodeLatentResponse;
    protected InsertPersonResponse insertPersonResponse;
    protected DeletePersonResponse deletePersonResponse;
    protected GetPersonResponse getPersonResponse;
    protected CountPersonResponse countPersonResponse;
    protected ExistPersonResponse existPersonResponse;
    protected InsertLatentResponse insertLatentResponse;
    protected DeleteLatentResponse deleteLatentResponse;
    protected GetLatentResponse getLatentResponse;
    protected InsertWithFilterThenMatchWithoutFilterPersonResponse insertWithFilterThenMatchWithoutFilterPersonResponse;
    protected GetTemplatesResponse getTemplatesResponse;
    protected AuthenticatePersonResponse authenticatePersonResponse;
    protected PersonToPersonAuthenticateResponse personToPersonAuthResponse;
    protected PersonToPersonMatchResponse personToPersonMatchResponse;
    protected PersonToLatentMatchResponse personToLatentMatchResponse;
    protected LatentToPersonMatchResponse latentToPersonMatchResponse;
    protected LatentToLatentMatchResponse latentToLatentMatchResponse;
    protected UpdatePersonResponse updatePersonResponse;
    protected UpdateLatentResponse updateLatentResponse;
    protected CountLatentResponse countLatentResponse;
    protected ExistLatentResponse existLatentResponse;
    protected PartialUpdatePersonResponse partialUpdatePersonResponse;
    protected GetPersonInfoListNumberResponse getPersonInfoListNumberResponse;
    protected GetPersonInfoListResponse getPersonInfoListResponse;
    protected GetLatentInfoListNumberResponse getLatentInfoListNumberResponse;
    protected GetLatentInfoListResponse getLatentInfoListResponse;
    protected ReplacePersonSampleResponse replacePersonSampleResponse;
    protected GetPersonInfoListForConsistencyResponse getPersonInfoListForConsistencyResponse;
    protected GetPersonListForConsistencyResponse getPersonListForConsistencyResponse;
    protected DetectFacesResponse detectFacesResponse;
    protected GetLatentInfoListForConsistencyResponse getLatentInfoListForConsistencyResponse;
    protected GetLatentListForConsistencyResponse getLatentListForConsistencyResponse;
    protected ErrorResponse errorResponse;

    /**
     * Obtiene el valor de la propiedad responseType.
     * 
     * @return
     *     possible object is
     *     {@link RequestType }
     *     
     */
    public RequestType getResponseType() {
        return responseType;
    }

    /**
     * Define el valor de la propiedad responseType.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestType }
     *     
     */
    public void setResponseType(RequestType value) {
        this.responseType = value;
    }

    /**
     * Obtiene el valor de la propiedad encodePersonResponse.
     * 
     * @return
     *     possible object is
     *     {@link EncodePersonResponse }
     *     
     */
    public EncodePersonResponse getEncodePersonResponse() {
        return encodePersonResponse;
    }

    /**
     * Define el valor de la propiedad encodePersonResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link EncodePersonResponse }
     *     
     */
    public void setEncodePersonResponse(EncodePersonResponse value) {
        this.encodePersonResponse = value;
    }

    /**
     * Obtiene el valor de la propiedad encodeLatentResponse.
     * 
     * @return
     *     possible object is
     *     {@link EncodeLatentResponse }
     *     
     */
    public EncodeLatentResponse getEncodeLatentResponse() {
        return encodeLatentResponse;
    }

    /**
     * Define el valor de la propiedad encodeLatentResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link EncodeLatentResponse }
     *     
     */
    public void setEncodeLatentResponse(EncodeLatentResponse value) {
        this.encodeLatentResponse = value;
    }

    /**
     * Obtiene el valor de la propiedad insertPersonResponse.
     * 
     * @return
     *     possible object is
     *     {@link InsertPersonResponse }
     *     
     */
    public InsertPersonResponse getInsertPersonResponse() {
        return insertPersonResponse;
    }

    /**
     * Define el valor de la propiedad insertPersonResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link InsertPersonResponse }
     *     
     */
    public void setInsertPersonResponse(InsertPersonResponse value) {
        this.insertPersonResponse = value;
    }

    /**
     * Obtiene el valor de la propiedad deletePersonResponse.
     * 
     * @return
     *     possible object is
     *     {@link DeletePersonResponse }
     *     
     */
    public DeletePersonResponse getDeletePersonResponse() {
        return deletePersonResponse;
    }

    /**
     * Define el valor de la propiedad deletePersonResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link DeletePersonResponse }
     *     
     */
    public void setDeletePersonResponse(DeletePersonResponse value) {
        this.deletePersonResponse = value;
    }

    /**
     * Obtiene el valor de la propiedad getPersonResponse.
     * 
     * @return
     *     possible object is
     *     {@link GetPersonResponse }
     *     
     */
    public GetPersonResponse getGetPersonResponse() {
        return getPersonResponse;
    }

    /**
     * Define el valor de la propiedad getPersonResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link GetPersonResponse }
     *     
     */
    public void setGetPersonResponse(GetPersonResponse value) {
        this.getPersonResponse = value;
    }

    /**
     * Obtiene el valor de la propiedad countPersonResponse.
     * 
     * @return
     *     possible object is
     *     {@link CountPersonResponse }
     *     
     */
    public CountPersonResponse getCountPersonResponse() {
        return countPersonResponse;
    }

    /**
     * Define el valor de la propiedad countPersonResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link CountPersonResponse }
     *     
     */
    public void setCountPersonResponse(CountPersonResponse value) {
        this.countPersonResponse = value;
    }

    /**
     * Obtiene el valor de la propiedad existPersonResponse.
     * 
     * @return
     *     possible object is
     *     {@link ExistPersonResponse }
     *     
     */
    public ExistPersonResponse getExistPersonResponse() {
        return existPersonResponse;
    }

    /**
     * Define el valor de la propiedad existPersonResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link ExistPersonResponse }
     *     
     */
    public void setExistPersonResponse(ExistPersonResponse value) {
        this.existPersonResponse = value;
    }

    /**
     * Obtiene el valor de la propiedad insertLatentResponse.
     * 
     * @return
     *     possible object is
     *     {@link InsertLatentResponse }
     *     
     */
    public InsertLatentResponse getInsertLatentResponse() {
        return insertLatentResponse;
    }

    /**
     * Define el valor de la propiedad insertLatentResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link InsertLatentResponse }
     *     
     */
    public void setInsertLatentResponse(InsertLatentResponse value) {
        this.insertLatentResponse = value;
    }

    /**
     * Obtiene el valor de la propiedad deleteLatentResponse.
     * 
     * @return
     *     possible object is
     *     {@link DeleteLatentResponse }
     *     
     */
    public DeleteLatentResponse getDeleteLatentResponse() {
        return deleteLatentResponse;
    }

    /**
     * Define el valor de la propiedad deleteLatentResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link DeleteLatentResponse }
     *     
     */
    public void setDeleteLatentResponse(DeleteLatentResponse value) {
        this.deleteLatentResponse = value;
    }

    /**
     * Obtiene el valor de la propiedad getLatentResponse.
     * 
     * @return
     *     possible object is
     *     {@link GetLatentResponse }
     *     
     */
    public GetLatentResponse getGetLatentResponse() {
        return getLatentResponse;
    }

    /**
     * Define el valor de la propiedad getLatentResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link GetLatentResponse }
     *     
     */
    public void setGetLatentResponse(GetLatentResponse value) {
        this.getLatentResponse = value;
    }

    /**
     * Obtiene el valor de la propiedad insertWithFilterThenMatchWithoutFilterPersonResponse.
     * 
     * @return
     *     possible object is
     *     {@link InsertWithFilterThenMatchWithoutFilterPersonResponse }
     *     
     */
    public InsertWithFilterThenMatchWithoutFilterPersonResponse getInsertWithFilterThenMatchWithoutFilterPersonResponse() {
        return insertWithFilterThenMatchWithoutFilterPersonResponse;
    }

    /**
     * Define el valor de la propiedad insertWithFilterThenMatchWithoutFilterPersonResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link InsertWithFilterThenMatchWithoutFilterPersonResponse }
     *     
     */
    public void setInsertWithFilterThenMatchWithoutFilterPersonResponse(InsertWithFilterThenMatchWithoutFilterPersonResponse value) {
        this.insertWithFilterThenMatchWithoutFilterPersonResponse = value;
    }

    /**
     * Obtiene el valor de la propiedad getTemplatesResponse.
     * 
     * @return
     *     possible object is
     *     {@link GetTemplatesResponse }
     *     
     */
    public GetTemplatesResponse getGetTemplatesResponse() {
        return getTemplatesResponse;
    }

    /**
     * Define el valor de la propiedad getTemplatesResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link GetTemplatesResponse }
     *     
     */
    public void setGetTemplatesResponse(GetTemplatesResponse value) {
        this.getTemplatesResponse = value;
    }

    /**
     * Obtiene el valor de la propiedad authenticatePersonResponse.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticatePersonResponse }
     *     
     */
    public AuthenticatePersonResponse getAuthenticatePersonResponse() {
        return authenticatePersonResponse;
    }

    /**
     * Define el valor de la propiedad authenticatePersonResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticatePersonResponse }
     *     
     */
    public void setAuthenticatePersonResponse(AuthenticatePersonResponse value) {
        this.authenticatePersonResponse = value;
    }

    /**
     * Obtiene el valor de la propiedad personToPersonAuthResponse.
     * 
     * @return
     *     possible object is
     *     {@link PersonToPersonAuthenticateResponse }
     *     
     */
    public PersonToPersonAuthenticateResponse getPersonToPersonAuthResponse() {
        return personToPersonAuthResponse;
    }

    /**
     * Define el valor de la propiedad personToPersonAuthResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonToPersonAuthenticateResponse }
     *     
     */
    public void setPersonToPersonAuthResponse(PersonToPersonAuthenticateResponse value) {
        this.personToPersonAuthResponse = value;
    }

    /**
     * Obtiene el valor de la propiedad personToPersonMatchResponse.
     * 
     * @return
     *     possible object is
     *     {@link PersonToPersonMatchResponse }
     *     
     */
    public PersonToPersonMatchResponse getPersonToPersonMatchResponse() {
        return personToPersonMatchResponse;
    }

    /**
     * Define el valor de la propiedad personToPersonMatchResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonToPersonMatchResponse }
     *     
     */
    public void setPersonToPersonMatchResponse(PersonToPersonMatchResponse value) {
        this.personToPersonMatchResponse = value;
    }

    /**
     * Obtiene el valor de la propiedad personToLatentMatchResponse.
     * 
     * @return
     *     possible object is
     *     {@link PersonToLatentMatchResponse }
     *     
     */
    public PersonToLatentMatchResponse getPersonToLatentMatchResponse() {
        return personToLatentMatchResponse;
    }

    /**
     * Define el valor de la propiedad personToLatentMatchResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonToLatentMatchResponse }
     *     
     */
    public void setPersonToLatentMatchResponse(PersonToLatentMatchResponse value) {
        this.personToLatentMatchResponse = value;
    }

    /**
     * Obtiene el valor de la propiedad latentToPersonMatchResponse.
     * 
     * @return
     *     possible object is
     *     {@link LatentToPersonMatchResponse }
     *     
     */
    public LatentToPersonMatchResponse getLatentToPersonMatchResponse() {
        return latentToPersonMatchResponse;
    }

    /**
     * Define el valor de la propiedad latentToPersonMatchResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link LatentToPersonMatchResponse }
     *     
     */
    public void setLatentToPersonMatchResponse(LatentToPersonMatchResponse value) {
        this.latentToPersonMatchResponse = value;
    }

    /**
     * Obtiene el valor de la propiedad latentToLatentMatchResponse.
     * 
     * @return
     *     possible object is
     *     {@link LatentToLatentMatchResponse }
     *     
     */
    public LatentToLatentMatchResponse getLatentToLatentMatchResponse() {
        return latentToLatentMatchResponse;
    }

    /**
     * Define el valor de la propiedad latentToLatentMatchResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link LatentToLatentMatchResponse }
     *     
     */
    public void setLatentToLatentMatchResponse(LatentToLatentMatchResponse value) {
        this.latentToLatentMatchResponse = value;
    }

    /**
     * Obtiene el valor de la propiedad updatePersonResponse.
     * 
     * @return
     *     possible object is
     *     {@link UpdatePersonResponse }
     *     
     */
    public UpdatePersonResponse getUpdatePersonResponse() {
        return updatePersonResponse;
    }

    /**
     * Define el valor de la propiedad updatePersonResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatePersonResponse }
     *     
     */
    public void setUpdatePersonResponse(UpdatePersonResponse value) {
        this.updatePersonResponse = value;
    }

    /**
     * Obtiene el valor de la propiedad updateLatentResponse.
     * 
     * @return
     *     possible object is
     *     {@link UpdateLatentResponse }
     *     
     */
    public UpdateLatentResponse getUpdateLatentResponse() {
        return updateLatentResponse;
    }

    /**
     * Define el valor de la propiedad updateLatentResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateLatentResponse }
     *     
     */
    public void setUpdateLatentResponse(UpdateLatentResponse value) {
        this.updateLatentResponse = value;
    }

    /**
     * Obtiene el valor de la propiedad countLatentResponse.
     * 
     * @return
     *     possible object is
     *     {@link CountLatentResponse }
     *     
     */
    public CountLatentResponse getCountLatentResponse() {
        return countLatentResponse;
    }

    /**
     * Define el valor de la propiedad countLatentResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link CountLatentResponse }
     *     
     */
    public void setCountLatentResponse(CountLatentResponse value) {
        this.countLatentResponse = value;
    }

    /**
     * Obtiene el valor de la propiedad existLatentResponse.
     * 
     * @return
     *     possible object is
     *     {@link ExistLatentResponse }
     *     
     */
    public ExistLatentResponse getExistLatentResponse() {
        return existLatentResponse;
    }

    /**
     * Define el valor de la propiedad existLatentResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link ExistLatentResponse }
     *     
     */
    public void setExistLatentResponse(ExistLatentResponse value) {
        this.existLatentResponse = value;
    }

    /**
     * Obtiene el valor de la propiedad partialUpdatePersonResponse.
     * 
     * @return
     *     possible object is
     *     {@link PartialUpdatePersonResponse }
     *     
     */
    public PartialUpdatePersonResponse getPartialUpdatePersonResponse() {
        return partialUpdatePersonResponse;
    }

    /**
     * Define el valor de la propiedad partialUpdatePersonResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link PartialUpdatePersonResponse }
     *     
     */
    public void setPartialUpdatePersonResponse(PartialUpdatePersonResponse value) {
        this.partialUpdatePersonResponse = value;
    }

    /**
     * Obtiene el valor de la propiedad getPersonInfoListNumberResponse.
     * 
     * @return
     *     possible object is
     *     {@link GetPersonInfoListNumberResponse }
     *     
     */
    public GetPersonInfoListNumberResponse getGetPersonInfoListNumberResponse() {
        return getPersonInfoListNumberResponse;
    }

    /**
     * Define el valor de la propiedad getPersonInfoListNumberResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link GetPersonInfoListNumberResponse }
     *     
     */
    public void setGetPersonInfoListNumberResponse(GetPersonInfoListNumberResponse value) {
        this.getPersonInfoListNumberResponse = value;
    }

    /**
     * Obtiene el valor de la propiedad getPersonInfoListResponse.
     * 
     * @return
     *     possible object is
     *     {@link GetPersonInfoListResponse }
     *     
     */
    public GetPersonInfoListResponse getGetPersonInfoListResponse() {
        return getPersonInfoListResponse;
    }

    /**
     * Define el valor de la propiedad getPersonInfoListResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link GetPersonInfoListResponse }
     *     
     */
    public void setGetPersonInfoListResponse(GetPersonInfoListResponse value) {
        this.getPersonInfoListResponse = value;
    }

    /**
     * Obtiene el valor de la propiedad getLatentInfoListNumberResponse.
     * 
     * @return
     *     possible object is
     *     {@link GetLatentInfoListNumberResponse }
     *     
     */
    public GetLatentInfoListNumberResponse getGetLatentInfoListNumberResponse() {
        return getLatentInfoListNumberResponse;
    }

    /**
     * Define el valor de la propiedad getLatentInfoListNumberResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link GetLatentInfoListNumberResponse }
     *     
     */
    public void setGetLatentInfoListNumberResponse(GetLatentInfoListNumberResponse value) {
        this.getLatentInfoListNumberResponse = value;
    }

    /**
     * Obtiene el valor de la propiedad getLatentInfoListResponse.
     * 
     * @return
     *     possible object is
     *     {@link GetLatentInfoListResponse }
     *     
     */
    public GetLatentInfoListResponse getGetLatentInfoListResponse() {
        return getLatentInfoListResponse;
    }

    /**
     * Define el valor de la propiedad getLatentInfoListResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link GetLatentInfoListResponse }
     *     
     */
    public void setGetLatentInfoListResponse(GetLatentInfoListResponse value) {
        this.getLatentInfoListResponse = value;
    }

    /**
     * Obtiene el valor de la propiedad replacePersonSampleResponse.
     * 
     * @return
     *     possible object is
     *     {@link ReplacePersonSampleResponse }
     *     
     */
    public ReplacePersonSampleResponse getReplacePersonSampleResponse() {
        return replacePersonSampleResponse;
    }

    /**
     * Define el valor de la propiedad replacePersonSampleResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link ReplacePersonSampleResponse }
     *     
     */
    public void setReplacePersonSampleResponse(ReplacePersonSampleResponse value) {
        this.replacePersonSampleResponse = value;
    }

    /**
     * Obtiene el valor de la propiedad getPersonInfoListForConsistencyResponse.
     * 
     * @return
     *     possible object is
     *     {@link GetPersonInfoListForConsistencyResponse }
     *     
     */
    public GetPersonInfoListForConsistencyResponse getGetPersonInfoListForConsistencyResponse() {
        return getPersonInfoListForConsistencyResponse;
    }

    /**
     * Define el valor de la propiedad getPersonInfoListForConsistencyResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link GetPersonInfoListForConsistencyResponse }
     *     
     */
    public void setGetPersonInfoListForConsistencyResponse(GetPersonInfoListForConsistencyResponse value) {
        this.getPersonInfoListForConsistencyResponse = value;
    }

    /**
     * Obtiene el valor de la propiedad getPersonListForConsistencyResponse.
     * 
     * @return
     *     possible object is
     *     {@link GetPersonListForConsistencyResponse }
     *     
     */
    public GetPersonListForConsistencyResponse getGetPersonListForConsistencyResponse() {
        return getPersonListForConsistencyResponse;
    }

    /**
     * Define el valor de la propiedad getPersonListForConsistencyResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link GetPersonListForConsistencyResponse }
     *     
     */
    public void setGetPersonListForConsistencyResponse(GetPersonListForConsistencyResponse value) {
        this.getPersonListForConsistencyResponse = value;
    }

    /**
     * Obtiene el valor de la propiedad detectFacesResponse.
     * 
     * @return
     *     possible object is
     *     {@link DetectFacesResponse }
     *     
     */
    public DetectFacesResponse getDetectFacesResponse() {
        return detectFacesResponse;
    }

    /**
     * Define el valor de la propiedad detectFacesResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link DetectFacesResponse }
     *     
     */
    public void setDetectFacesResponse(DetectFacesResponse value) {
        this.detectFacesResponse = value;
    }

    /**
     * Obtiene el valor de la propiedad getLatentInfoListForConsistencyResponse.
     * 
     * @return
     *     possible object is
     *     {@link GetLatentInfoListForConsistencyResponse }
     *     
     */
    public GetLatentInfoListForConsistencyResponse getGetLatentInfoListForConsistencyResponse() {
        return getLatentInfoListForConsistencyResponse;
    }

    /**
     * Define el valor de la propiedad getLatentInfoListForConsistencyResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link GetLatentInfoListForConsistencyResponse }
     *     
     */
    public void setGetLatentInfoListForConsistencyResponse(GetLatentInfoListForConsistencyResponse value) {
        this.getLatentInfoListForConsistencyResponse = value;
    }

    /**
     * Obtiene el valor de la propiedad getLatentListForConsistencyResponse.
     * 
     * @return
     *     possible object is
     *     {@link GetLatentListForConsistencyResponse }
     *     
     */
    public GetLatentListForConsistencyResponse getGetLatentListForConsistencyResponse() {
        return getLatentListForConsistencyResponse;
    }

    /**
     * Define el valor de la propiedad getLatentListForConsistencyResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link GetLatentListForConsistencyResponse }
     *     
     */
    public void setGetLatentListForConsistencyResponse(GetLatentListForConsistencyResponse value) {
        this.getLatentListForConsistencyResponse = value;
    }

    /**
     * Obtiene el valor de la propiedad errorResponse.
     * 
     * @return
     *     possible object is
     *     {@link ErrorResponse }
     *     
     */
    public ErrorResponse getErrorResponse() {
        return errorResponse;
    }

    /**
     * Define el valor de la propiedad errorResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorResponse }
     *     
     */
    public void setErrorResponse(ErrorResponse value) {
        this.errorResponse = value;
    }

}
