
package Huella_import;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the Huella_import package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Process_QNAME = new QName("http://www.morpho.com/mbss/generic/wsdl", "process");
    private final static QName _ProcessResponse_QNAME = new QName("http://www.morpho.com/mbss/generic/wsdl", "processResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: Huella_import
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Process }
     * 
     */
    public Process createProcess() {
        return new Process();
    }

    /**
     * Create an instance of {@link ProcessResponse }
     * 
     */
    public ProcessResponse createProcessResponse() {
        return new ProcessResponse();
    }

    /**
     * Create an instance of {@link Request }
     * 
     */
    public Request createRequest() {
        return new Request();
    }

    /**
     * Create an instance of {@link Version }
     * 
     */
    public Version createVersion() {
        return new Version();
    }

    /**
     * Create an instance of {@link EncodePersonRequest }
     * 
     */
    public EncodePersonRequest createEncodePersonRequest() {
        return new EncodePersonRequest();
    }

    /**
     * Create an instance of {@link BasicRequest }
     * 
     */
    public BasicRequest createBasicRequest() {
        return new BasicRequest();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link Registration }
     * 
     */
    public Registration createRegistration() {
        return new Registration();
    }

    /**
     * Create an instance of {@link FingerprintSample }
     * 
     */
    public FingerprintSample createFingerprintSample() {
        return new FingerprintSample();
    }

    /**
     * Create an instance of {@link Tenprint }
     * 
     */
    public Tenprint createTenprint() {
        return new Tenprint();
    }

    /**
     * Create an instance of {@link Image }
     * 
     */
    public Image createImage() {
        return new Image();
    }

    /**
     * Create an instance of {@link Slap442 }
     * 
     */
    public Slap442 createSlap442() {
        return new Slap442();
    }

    /**
     * Create an instance of {@link MissingFingers }
     * 
     */
    public MissingFingers createMissingFingers() {
        return new MissingFingers();
    }

    /**
     * Create an instance of {@link Slap4411 }
     * 
     */
    public Slap4411 createSlap4411() {
        return new Slap4411();
    }

    /**
     * Create an instance of {@link FingerprintSegments }
     * 
     */
    public FingerprintSegments createFingerprintSegments() {
        return new FingerprintSegments();
    }

    /**
     * Create an instance of {@link Box }
     * 
     */
    public Box createBox() {
        return new Box();
    }

    /**
     * Create an instance of {@link FingerprintTemplates }
     * 
     */
    public FingerprintTemplates createFingerprintTemplates() {
        return new FingerprintTemplates();
    }

    /**
     * Create an instance of {@link Template }
     * 
     */
    public Template createTemplate() {
        return new Template();
    }

    /**
     * Create an instance of {@link QualityScore }
     * 
     */
    public QualityScore createQualityScore() {
        return new QualityScore();
    }

    /**
     * Create an instance of {@link SoftBiometricScores }
     * 
     */
    public SoftBiometricScores createSoftBiometricScores() {
        return new SoftBiometricScores();
    }

    /**
     * Create an instance of {@link FacialHairInfo }
     * 
     */
    public FacialHairInfo createFacialHairInfo() {
        return new FacialHairInfo();
    }

    /**
     * Create an instance of {@link FaceAnalysisResult }
     * 
     */
    public FaceAnalysisResult createFaceAnalysisResult() {
        return new FaceAnalysisResult();
    }

    /**
     * Create an instance of {@link IcaoScores }
     * 
     */
    public IcaoScores createIcaoScores() {
        return new IcaoScores();
    }

    /**
     * Create an instance of {@link FeaturePoints }
     * 
     */
    public FeaturePoints createFeaturePoints() {
        return new FeaturePoints();
    }

    /**
     * Create an instance of {@link Point }
     * 
     */
    public Point createPoint() {
        return new Point();
    }

    /**
     * Create an instance of {@link FacialInformation }
     * 
     */
    public FacialInformation createFacialInformation() {
        return new FacialInformation();
    }

    /**
     * Create an instance of {@link BackgroundColorScores }
     * 
     */
    public BackgroundColorScores createBackgroundColorScores() {
        return new BackgroundColorScores();
    }

    /**
     * Create an instance of {@link PedestrianAnalysisResult }
     * 
     */
    public PedestrianAnalysisResult createPedestrianAnalysisResult() {
        return new PedestrianAnalysisResult();
    }

    /**
     * Create an instance of {@link PedestrianGenderAnalysisResult }
     * 
     */
    public PedestrianGenderAnalysisResult createPedestrianGenderAnalysisResult() {
        return new PedestrianGenderAnalysisResult();
    }

    /**
     * Create an instance of {@link PedestrianBagAnalysisResult }
     * 
     */
    public PedestrianBagAnalysisResult createPedestrianBagAnalysisResult() {
        return new PedestrianBagAnalysisResult();
    }

    /**
     * Create an instance of {@link PedestrianColorAnalysisResult }
     * 
     */
    public PedestrianColorAnalysisResult createPedestrianColorAnalysisResult() {
        return new PedestrianColorAnalysisResult();
    }

    /**
     * Create an instance of {@link PedestrianColorScores }
     * 
     */
    public PedestrianColorScores createPedestrianColorScores() {
        return new PedestrianColorScores();
    }

    /**
     * Create an instance of {@link PedestrianHardHatAnalysisResult }
     * 
     */
    public PedestrianHardHatAnalysisResult createPedestrianHardHatAnalysisResult() {
        return new PedestrianHardHatAnalysisResult();
    }

    /**
     * Create an instance of {@link MultipleFingerViewsSegments }
     * 
     */
    public MultipleFingerViewsSegments createMultipleFingerViewsSegments() {
        return new MultipleFingerViewsSegments();
    }

    /**
     * Create an instance of {@link MultipleFingerViewsBoxes }
     * 
     */
    public MultipleFingerViewsBoxes createMultipleFingerViewsBoxes() {
        return new MultipleFingerViewsBoxes();
    }

    /**
     * Create an instance of {@link MultipleFingerViewsTemplates }
     * 
     */
    public MultipleFingerViewsTemplates createMultipleFingerViewsTemplates() {
        return new MultipleFingerViewsTemplates();
    }

    /**
     * Create an instance of {@link MultipleFingerViewsTemplate }
     * 
     */
    public MultipleFingerViewsTemplate createMultipleFingerViewsTemplate() {
        return new MultipleFingerViewsTemplate();
    }

    /**
     * Create an instance of {@link IrisSample }
     * 
     */
    public IrisSample createIrisSample() {
        return new IrisSample();
    }

    /**
     * Create an instance of {@link IrisImage11 }
     * 
     */
    public IrisImage11 createIrisImage11() {
        return new IrisImage11();
    }

    /**
     * Create an instance of {@link IrisImage2 }
     * 
     */
    public IrisImage2 createIrisImage2() {
        return new IrisImage2();
    }

    /**
     * Create an instance of {@link IrisTemplate11 }
     * 
     */
    public IrisTemplate11 createIrisTemplate11() {
        return new IrisTemplate11();
    }

    /**
     * Create an instance of {@link IrisTemplate2 }
     * 
     */
    public IrisTemplate2 createIrisTemplate2() {
        return new IrisTemplate2();
    }

    /**
     * Create an instance of {@link IrisReductionInfo }
     * 
     */
    public IrisReductionInfo createIrisReductionInfo() {
        return new IrisReductionInfo();
    }

    /**
     * Create an instance of {@link FaceSample }
     * 
     */
    public FaceSample createFaceSample() {
        return new FaceSample();
    }

    /**
     * Create an instance of {@link StillImage }
     * 
     */
    public StillImage createStillImage() {
        return new StillImage();
    }

    /**
     * Create an instance of {@link Video }
     * 
     */
    public Video createVideo() {
        return new Video();
    }

    /**
     * Create an instance of {@link EyePositions }
     * 
     */
    public EyePositions createEyePositions() {
        return new EyePositions();
    }

    /**
     * Create an instance of {@link PalmprintSample }
     * 
     */
    public PalmprintSample createPalmprintSample() {
        return new PalmprintSample();
    }

    /**
     * Create an instance of {@link SplitHand }
     * 
     */
    public SplitHand createSplitHand() {
        return new SplitHand();
    }

    /**
     * Create an instance of {@link FullHand }
     * 
     */
    public FullHand createFullHand() {
        return new FullHand();
    }

    /**
     * Create an instance of {@link PalmprintTemplates }
     * 
     */
    public PalmprintTemplates createPalmprintTemplates() {
        return new PalmprintTemplates();
    }

    /**
     * Create an instance of {@link PalmprintSegments }
     * 
     */
    public PalmprintSegments createPalmprintSegments() {
        return new PalmprintSegments();
    }

    /**
     * Create an instance of {@link TattooSample }
     * 
     */
    public TattooSample createTattooSample() {
        return new TattooSample();
    }

    /**
     * Create an instance of {@link PedestrianSample }
     * 
     */
    public PedestrianSample createPedestrianSample() {
        return new PedestrianSample();
    }

    /**
     * Create an instance of {@link BoundingBox }
     * 
     */
    public BoundingBox createBoundingBox() {
        return new BoundingBox();
    }

    /**
     * Create an instance of {@link SpatioTemporal }
     * 
     */
    public SpatioTemporal createSpatioTemporal() {
        return new SpatioTemporal();
    }

    /**
     * Create an instance of {@link PlanCoordinate }
     * 
     */
    public PlanCoordinate createPlanCoordinate() {
        return new PlanCoordinate();
    }

    /**
     * Create an instance of {@link VerticalCoordinate }
     * 
     */
    public VerticalCoordinate createVerticalCoordinate() {
        return new VerticalCoordinate();
    }

    /**
     * Create an instance of {@link TimingReference }
     * 
     */
    public TimingReference createTimingReference() {
        return new TimingReference();
    }

    /**
     * Create an instance of {@link BagSample }
     * 
     */
    public BagSample createBagSample() {
        return new BagSample();
    }

    /**
     * Create an instance of {@link FilterSet }
     * 
     */
    public FilterSet createFilterSet() {
        return new FilterSet();
    }

    /**
     * Create an instance of {@link NumericFilter }
     * 
     */
    public NumericFilter createNumericFilter() {
        return new NumericFilter();
    }

    /**
     * Create an instance of {@link BinaryFilter }
     * 
     */
    public BinaryFilter createBinaryFilter() {
        return new BinaryFilter();
    }

    /**
     * Create an instance of {@link FaceAnalysisConfig }
     * 
     */
    public FaceAnalysisConfig createFaceAnalysisConfig() {
        return new FaceAnalysisConfig();
    }

    /**
     * Create an instance of {@link IcaoConfig }
     * 
     */
    public IcaoConfig createIcaoConfig() {
        return new IcaoConfig();
    }

    /**
     * Create an instance of {@link PedestrianAnalysisConfig }
     * 
     */
    public PedestrianAnalysisConfig createPedestrianAnalysisConfig() {
        return new PedestrianAnalysisConfig();
    }

    /**
     * Create an instance of {@link InsertPersonRequest }
     * 
     */
    public InsertPersonRequest createInsertPersonRequest() {
        return new InsertPersonRequest();
    }

    /**
     * Create an instance of {@link UpdatePersonRequest }
     * 
     */
    public UpdatePersonRequest createUpdatePersonRequest() {
        return new UpdatePersonRequest();
    }

    /**
     * Create an instance of {@link DeletePersonRequest }
     * 
     */
    public DeletePersonRequest createDeletePersonRequest() {
        return new DeletePersonRequest();
    }

    /**
     * Create an instance of {@link ExistPersonRequest }
     * 
     */
    public ExistPersonRequest createExistPersonRequest() {
        return new ExistPersonRequest();
    }

    /**
     * Create an instance of {@link GetPersonRequest }
     * 
     */
    public GetPersonRequest createGetPersonRequest() {
        return new GetPersonRequest();
    }

    /**
     * Create an instance of {@link CountPersonRequest }
     * 
     */
    public CountPersonRequest createCountPersonRequest() {
        return new CountPersonRequest();
    }

    /**
     * Create an instance of {@link PartialUpdatePersonRequest }
     * 
     */
    public PartialUpdatePersonRequest createPartialUpdatePersonRequest() {
        return new PartialUpdatePersonRequest();
    }

    /**
     * Create an instance of {@link PartialUpdatePerson }
     * 
     */
    public PartialUpdatePerson createPartialUpdatePerson() {
        return new PartialUpdatePerson();
    }

    /**
     * Create an instance of {@link GetTemplatesRequest }
     * 
     */
    public GetTemplatesRequest createGetTemplatesRequest() {
        return new GetTemplatesRequest();
    }

    /**
     * Create an instance of {@link TemplatePosition }
     * 
     */
    public TemplatePosition createTemplatePosition() {
        return new TemplatePosition();
    }

    /**
     * Create an instance of {@link GetPersonInfoListNumberRequest }
     * 
     */
    public GetPersonInfoListNumberRequest createGetPersonInfoListNumberRequest() {
        return new GetPersonInfoListNumberRequest();
    }

    /**
     * Create an instance of {@link GetPersonInfoListRequest }
     * 
     */
    public GetPersonInfoListRequest createGetPersonInfoListRequest() {
        return new GetPersonInfoListRequest();
    }

    /**
     * Create an instance of {@link AuthenticatePersonRequest }
     * 
     */
    public AuthenticatePersonRequest createAuthenticatePersonRequest() {
        return new AuthenticatePersonRequest();
    }

    /**
     * Create an instance of {@link PersonToPersonAuthenticateRequest }
     * 
     */
    public PersonToPersonAuthenticateRequest createPersonToPersonAuthenticateRequest() {
        return new PersonToPersonAuthenticateRequest();
    }

    /**
     * Create an instance of {@link PersonToPersonMatchRequest }
     * 
     */
    public PersonToPersonMatchRequest createPersonToPersonMatchRequest() {
        return new PersonToPersonMatchRequest();
    }

    /**
     * Create an instance of {@link LatentToPersonMatchRequest }
     * 
     */
    public LatentToPersonMatchRequest createLatentToPersonMatchRequest() {
        return new LatentToPersonMatchRequest();
    }

    /**
     * Create an instance of {@link LatentPrint }
     * 
     */
    public LatentPrint createLatentPrint() {
        return new LatentPrint();
    }

    /**
     * Create an instance of {@link LatentPosition }
     * 
     */
    public LatentPosition createLatentPosition() {
        return new LatentPosition();
    }

    /**
     * Create an instance of {@link FingerLatentPosition }
     * 
     */
    public FingerLatentPosition createFingerLatentPosition() {
        return new FingerLatentPosition();
    }

    /**
     * Create an instance of {@link PalmOrSupplementalsLatentPosition }
     * 
     */
    public PalmOrSupplementalsLatentPosition createPalmOrSupplementalsLatentPosition() {
        return new PalmOrSupplementalsLatentPosition();
    }

    /**
     * Create an instance of {@link Minutia }
     * 
     */
    public Minutia createMinutia() {
        return new Minutia();
    }

    /**
     * Create an instance of {@link Core }
     * 
     */
    public Core createCore() {
        return new Core();
    }

    /**
     * Create an instance of {@link Delta }
     * 
     */
    public Delta createDelta() {
        return new Delta();
    }

    /**
     * Create an instance of {@link Skeleton }
     * 
     */
    public Skeleton createSkeleton() {
        return new Skeleton();
    }

    /**
     * Create an instance of {@link MaskImage }
     * 
     */
    public MaskImage createMaskImage() {
        return new MaskImage();
    }

    /**
     * Create an instance of {@link InsertWithFilterThenMatchWithoutFilterPersonRequest }
     * 
     */
    public InsertWithFilterThenMatchWithoutFilterPersonRequest createInsertWithFilterThenMatchWithoutFilterPersonRequest() {
        return new InsertWithFilterThenMatchWithoutFilterPersonRequest();
    }

    /**
     * Create an instance of {@link EncodeLatentRequest }
     * 
     */
    public EncodeLatentRequest createEncodeLatentRequest() {
        return new EncodeLatentRequest();
    }

    /**
     * Create an instance of {@link InsertLatentRequest }
     * 
     */
    public InsertLatentRequest createInsertLatentRequest() {
        return new InsertLatentRequest();
    }

    /**
     * Create an instance of {@link UpdateLatentRequest }
     * 
     */
    public UpdateLatentRequest createUpdateLatentRequest() {
        return new UpdateLatentRequest();
    }

    /**
     * Create an instance of {@link DeleteLatentRequest }
     * 
     */
    public DeleteLatentRequest createDeleteLatentRequest() {
        return new DeleteLatentRequest();
    }

    /**
     * Create an instance of {@link ExistLatentRequest }
     * 
     */
    public ExistLatentRequest createExistLatentRequest() {
        return new ExistLatentRequest();
    }

    /**
     * Create an instance of {@link GetLatentRequest }
     * 
     */
    public GetLatentRequest createGetLatentRequest() {
        return new GetLatentRequest();
    }

    /**
     * Create an instance of {@link CountLatentRequest }
     * 
     */
    public CountLatentRequest createCountLatentRequest() {
        return new CountLatentRequest();
    }

    /**
     * Create an instance of {@link GetLatentInfoListNumberRequest }
     * 
     */
    public GetLatentInfoListNumberRequest createGetLatentInfoListNumberRequest() {
        return new GetLatentInfoListNumberRequest();
    }

    /**
     * Create an instance of {@link GetLatentInfoListRequest }
     * 
     */
    public GetLatentInfoListRequest createGetLatentInfoListRequest() {
        return new GetLatentInfoListRequest();
    }

    /**
     * Create an instance of {@link PersonToLatentMatchRequest }
     * 
     */
    public PersonToLatentMatchRequest createPersonToLatentMatchRequest() {
        return new PersonToLatentMatchRequest();
    }

    /**
     * Create an instance of {@link LatentToLatentMatchRequest }
     * 
     */
    public LatentToLatentMatchRequest createLatentToLatentMatchRequest() {
        return new LatentToLatentMatchRequest();
    }

    /**
     * Create an instance of {@link ReplacePersonSampleRequest }
     * 
     */
    public ReplacePersonSampleRequest createReplacePersonSampleRequest() {
        return new ReplacePersonSampleRequest();
    }

    /**
     * Create an instance of {@link GetPersonInfoListForConsistencyRequest }
     * 
     */
    public GetPersonInfoListForConsistencyRequest createGetPersonInfoListForConsistencyRequest() {
        return new GetPersonInfoListForConsistencyRequest();
    }

    /**
     * Create an instance of {@link GetPersonListForConsistencyRequest }
     * 
     */
    public GetPersonListForConsistencyRequest createGetPersonListForConsistencyRequest() {
        return new GetPersonListForConsistencyRequest();
    }

    /**
     * Create an instance of {@link DetectFacesRequest }
     * 
     */
    public DetectFacesRequest createDetectFacesRequest() {
        return new DetectFacesRequest();
    }

    /**
     * Create an instance of {@link GetLatentInfoListForConsistencyRequest }
     * 
     */
    public GetLatentInfoListForConsistencyRequest createGetLatentInfoListForConsistencyRequest() {
        return new GetLatentInfoListForConsistencyRequest();
    }

    /**
     * Create an instance of {@link GetLatentListForConsistencyRequest }
     * 
     */
    public GetLatentListForConsistencyRequest createGetLatentListForConsistencyRequest() {
        return new GetLatentListForConsistencyRequest();
    }

    /**
     * Create an instance of {@link RoutingData }
     * 
     */
    public RoutingData createRoutingData() {
        return new RoutingData();
    }

    /**
     * Create an instance of {@link Response }
     * 
     */
    public Response createResponse() {
        return new Response();
    }

    /**
     * Create an instance of {@link EncodePersonResponse }
     * 
     */
    public EncodePersonResponse createEncodePersonResponse() {
        return new EncodePersonResponse();
    }

    /**
     * Create an instance of {@link BasicResponse }
     * 
     */
    public BasicResponse createBasicResponse() {
        return new BasicResponse();
    }

    /**
     * Create an instance of {@link Error }
     * 
     */
    public Error createError() {
        return new Error();
    }

    /**
     * Create an instance of {@link EncodeError }
     * 
     */
    public EncodeError createEncodeError() {
        return new EncodeError();
    }

    /**
     * Create an instance of {@link SampleReference }
     * 
     */
    public SampleReference createSampleReference() {
        return new SampleReference();
    }

    /**
     * Create an instance of {@link DecodedPosition }
     * 
     */
    public DecodedPosition createDecodedPosition() {
        return new DecodedPosition();
    }

    /**
     * Create an instance of {@link PrintPosition }
     * 
     */
    public PrintPosition createPrintPosition() {
        return new PrintPosition();
    }

    /**
     * Create an instance of {@link SequenceCheckError }
     * 
     */
    public SequenceCheckError createSequenceCheckError() {
        return new SequenceCheckError();
    }

    /**
     * Create an instance of {@link SequenceCheckErrorItem }
     * 
     */
    public SequenceCheckErrorItem createSequenceCheckErrorItem() {
        return new SequenceCheckErrorItem();
    }

    /**
     * Create an instance of {@link EncodeLatentResponse }
     * 
     */
    public EncodeLatentResponse createEncodeLatentResponse() {
        return new EncodeLatentResponse();
    }

    /**
     * Create an instance of {@link SegmentationResult }
     * 
     */
    public SegmentationResult createSegmentationResult() {
        return new SegmentationResult();
    }

    /**
     * Create an instance of {@link InsertPersonResponse }
     * 
     */
    public InsertPersonResponse createInsertPersonResponse() {
        return new InsertPersonResponse();
    }

    /**
     * Create an instance of {@link DeletePersonResponse }
     * 
     */
    public DeletePersonResponse createDeletePersonResponse() {
        return new DeletePersonResponse();
    }

    /**
     * Create an instance of {@link GetPersonResponse }
     * 
     */
    public GetPersonResponse createGetPersonResponse() {
        return new GetPersonResponse();
    }

    /**
     * Create an instance of {@link CountPersonResponse }
     * 
     */
    public CountPersonResponse createCountPersonResponse() {
        return new CountPersonResponse();
    }

    /**
     * Create an instance of {@link ExistPersonResponse }
     * 
     */
    public ExistPersonResponse createExistPersonResponse() {
        return new ExistPersonResponse();
    }

    /**
     * Create an instance of {@link InsertLatentResponse }
     * 
     */
    public InsertLatentResponse createInsertLatentResponse() {
        return new InsertLatentResponse();
    }

    /**
     * Create an instance of {@link DeleteLatentResponse }
     * 
     */
    public DeleteLatentResponse createDeleteLatentResponse() {
        return new DeleteLatentResponse();
    }

    /**
     * Create an instance of {@link GetLatentResponse }
     * 
     */
    public GetLatentResponse createGetLatentResponse() {
        return new GetLatentResponse();
    }

    /**
     * Create an instance of {@link InsertWithFilterThenMatchWithoutFilterPersonResponse }
     * 
     */
    public InsertWithFilterThenMatchWithoutFilterPersonResponse createInsertWithFilterThenMatchWithoutFilterPersonResponse() {
        return new InsertWithFilterThenMatchWithoutFilterPersonResponse();
    }

    /**
     * Create an instance of {@link Candidate }
     * 
     */
    public Candidate createCandidate() {
        return new Candidate();
    }

    /**
     * Create an instance of {@link Group }
     * 
     */
    public Group createGroup() {
        return new Group();
    }

    /**
     * Create an instance of {@link SegmentResult }
     * 
     */
    public SegmentResult createSegmentResult() {
        return new SegmentResult();
    }

    /**
     * Create an instance of {@link PersonId }
     * 
     */
    public PersonId createPersonId() {
        return new PersonId();
    }

    /**
     * Create an instance of {@link MissAnalysis }
     * 
     */
    public MissAnalysis createMissAnalysis() {
        return new MissAnalysis();
    }

    /**
     * Create an instance of {@link GetTemplatesResponse }
     * 
     */
    public GetTemplatesResponse createGetTemplatesResponse() {
        return new GetTemplatesResponse();
    }

    /**
     * Create an instance of {@link TemplateError }
     * 
     */
    public TemplateError createTemplateError() {
        return new TemplateError();
    }

    /**
     * Create an instance of {@link AuthenticatePersonResponse }
     * 
     */
    public AuthenticatePersonResponse createAuthenticatePersonResponse() {
        return new AuthenticatePersonResponse();
    }

    /**
     * Create an instance of {@link PersonToPersonAuthenticateResponse }
     * 
     */
    public PersonToPersonAuthenticateResponse createPersonToPersonAuthenticateResponse() {
        return new PersonToPersonAuthenticateResponse();
    }

    /**
     * Create an instance of {@link PersonToPersonAuthenticateError }
     * 
     */
    public PersonToPersonAuthenticateError createPersonToPersonAuthenticateError() {
        return new PersonToPersonAuthenticateError();
    }

    /**
     * Create an instance of {@link PersonToPersonMatchResponse }
     * 
     */
    public PersonToPersonMatchResponse createPersonToPersonMatchResponse() {
        return new PersonToPersonMatchResponse();
    }

    /**
     * Create an instance of {@link PersonToLatentMatchResponse }
     * 
     */
    public PersonToLatentMatchResponse createPersonToLatentMatchResponse() {
        return new PersonToLatentMatchResponse();
    }

    /**
     * Create an instance of {@link LatentToPersonMatchResponse }
     * 
     */
    public LatentToPersonMatchResponse createLatentToPersonMatchResponse() {
        return new LatentToPersonMatchResponse();
    }

    /**
     * Create an instance of {@link LatentToLatentMatchResponse }
     * 
     */
    public LatentToLatentMatchResponse createLatentToLatentMatchResponse() {
        return new LatentToLatentMatchResponse();
    }

    /**
     * Create an instance of {@link UpdatePersonResponse }
     * 
     */
    public UpdatePersonResponse createUpdatePersonResponse() {
        return new UpdatePersonResponse();
    }

    /**
     * Create an instance of {@link UpdateLatentResponse }
     * 
     */
    public UpdateLatentResponse createUpdateLatentResponse() {
        return new UpdateLatentResponse();
    }

    /**
     * Create an instance of {@link CountLatentResponse }
     * 
     */
    public CountLatentResponse createCountLatentResponse() {
        return new CountLatentResponse();
    }

    /**
     * Create an instance of {@link ExistLatentResponse }
     * 
     */
    public ExistLatentResponse createExistLatentResponse() {
        return new ExistLatentResponse();
    }

    /**
     * Create an instance of {@link PartialUpdatePersonResponse }
     * 
     */
    public PartialUpdatePersonResponse createPartialUpdatePersonResponse() {
        return new PartialUpdatePersonResponse();
    }

    /**
     * Create an instance of {@link GetPersonInfoListNumberResponse }
     * 
     */
    public GetPersonInfoListNumberResponse createGetPersonInfoListNumberResponse() {
        return new GetPersonInfoListNumberResponse();
    }

    /**
     * Create an instance of {@link GetPersonInfoListResponse }
     * 
     */
    public GetPersonInfoListResponse createGetPersonInfoListResponse() {
        return new GetPersonInfoListResponse();
    }

    /**
     * Create an instance of {@link ItemInfo }
     * 
     */
    public ItemInfo createItemInfo() {
        return new ItemInfo();
    }

    /**
     * Create an instance of {@link GetLatentInfoListNumberResponse }
     * 
     */
    public GetLatentInfoListNumberResponse createGetLatentInfoListNumberResponse() {
        return new GetLatentInfoListNumberResponse();
    }

    /**
     * Create an instance of {@link GetLatentInfoListResponse }
     * 
     */
    public GetLatentInfoListResponse createGetLatentInfoListResponse() {
        return new GetLatentInfoListResponse();
    }

    /**
     * Create an instance of {@link ReplacePersonSampleResponse }
     * 
     */
    public ReplacePersonSampleResponse createReplacePersonSampleResponse() {
        return new ReplacePersonSampleResponse();
    }

    /**
     * Create an instance of {@link GetPersonInfoListForConsistencyResponse }
     * 
     */
    public GetPersonInfoListForConsistencyResponse createGetPersonInfoListForConsistencyResponse() {
        return new GetPersonInfoListForConsistencyResponse();
    }

    /**
     * Create an instance of {@link ItemInfoForConsistency }
     * 
     */
    public ItemInfoForConsistency createItemInfoForConsistency() {
        return new ItemInfoForConsistency();
    }

    /**
     * Create an instance of {@link GetPersonListForConsistencyResponse }
     * 
     */
    public GetPersonListForConsistencyResponse createGetPersonListForConsistencyResponse() {
        return new GetPersonListForConsistencyResponse();
    }

    /**
     * Create an instance of {@link DetectFacesResponse }
     * 
     */
    public DetectFacesResponse createDetectFacesResponse() {
        return new DetectFacesResponse();
    }

    /**
     * Create an instance of {@link DetectFacesResult }
     * 
     */
    public DetectFacesResult createDetectFacesResult() {
        return new DetectFacesResult();
    }

    /**
     * Create an instance of {@link GetLatentInfoListForConsistencyResponse }
     * 
     */
    public GetLatentInfoListForConsistencyResponse createGetLatentInfoListForConsistencyResponse() {
        return new GetLatentInfoListForConsistencyResponse();
    }

    /**
     * Create an instance of {@link GetLatentListForConsistencyResponse }
     * 
     */
    public GetLatentListForConsistencyResponse createGetLatentListForConsistencyResponse() {
        return new GetLatentListForConsistencyResponse();
    }

    /**
     * Create an instance of {@link ErrorResponse }
     * 
     */
    public ErrorResponse createErrorResponse() {
        return new ErrorResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Process }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Process }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.morpho.com/mbss/generic/wsdl", name = "process")
    public JAXBElement<Process> createProcess(Process value) {
        return new JAXBElement<Process>(_Process_QNAME, Process.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProcessResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.morpho.com/mbss/generic/wsdl", name = "processResponse")
    public JAXBElement<ProcessResponse> createProcessResponse(ProcessResponse value) {
        return new JAXBElement<ProcessResponse>(_ProcessResponse_QNAME, ProcessResponse.class, null, value);
    }

}
