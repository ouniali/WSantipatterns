
package tns;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the tns package. 
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

    private final static QName _GetAnnotationsFromUniprotAccResponse_QNAME = new QName("tns", "get_annotations_from_uniprot_accResponse");
    private final static QName _Info_QNAME = new QName("tns", "info");
    private final static QName _GetAnnotationsFromCidResponse_QNAME = new QName("tns", "get_annotations_from_cidResponse");
    private final static QName _CountDistinctPmidsFromCid_QNAME = new QName("tns", "count_distinct_pmids_from_cid");
    private final static QName _ProlificNucleotidesequence_QNAME = new QName("tns", "prolific_nucleotidesequence");
    private final static QName _ProlificProteinsequenceResponse_QNAME = new QName("tns", "prolific_proteinsequenceResponse");
    private final static QName _CountDistinctPmidsFromCidResponse_QNAME = new QName("tns", "count_distinct_pmids_from_cidResponse");
    private final static QName _CountDistinctPmidsFromUniprotAccResponse_QNAME = new QName("tns", "count_distinct_pmids_from_uniprot_accResponse");
    private final static QName _ProlificNucleotidesequenceResponse_QNAME = new QName("tns", "prolific_nucleotidesequenceResponse");
    private final static QName _CountDistinctPmidsFromUniprotAcc_QNAME = new QName("tns", "count_distinct_pmids_from_uniprot_acc");
    private final static QName _ProlificProteinsequence_QNAME = new QName("tns", "prolific_proteinsequence");
    private final static QName _GetPmidsFromUniprotAcc_QNAME = new QName("tns", "get_pmids_from_uniprot_acc");
    private final static QName _GetSimilarProteinsProteinsequence_QNAME = new QName("tns", "get_similar_proteins_proteinsequence");
    private final static QName _InfoResponse_QNAME = new QName("tns", "infoResponse");
    private final static QName _GetAnnotationsFromUniprotAcc_QNAME = new QName("tns", "get_annotations_from_uniprot_acc");
    private final static QName _GetPmidsFromCid_QNAME = new QName("tns", "get_pmids_from_cid");
    private final static QName _GetSimilarProteinsNucleotidesequence_QNAME = new QName("tns", "get_similar_proteins_nucleotidesequence");
    private final static QName _GetSimilarProteinsProteinsequenceResponse_QNAME = new QName("tns", "get_similar_proteins_proteinsequenceResponse");
    private final static QName _GetAnnotationsFromCid_QNAME = new QName("tns", "get_annotations_from_cid");
    private final static QName _GetPmidsFromUniprotAccResponse_QNAME = new QName("tns", "get_pmids_from_uniprot_accResponse");
    private final static QName _GetSimilarProteinsNucleotidesequenceResponse_QNAME = new QName("tns", "get_similar_proteins_nucleotidesequenceResponse");
    private final static QName _GetPmidsFromCidResponse_QNAME = new QName("tns", "get_pmids_from_cidResponse");
    private final static QName _InfoResponseInfoResult_QNAME = new QName("tns", "infoResult");
    private final static QName _ProlificProteinsequenceSequence_QNAME = new QName("tns", "sequence");
    private final static QName _CountDistinctPmidsFromUniprotAccResponseCountDistinctPmidsFromUniprotAccResult_QNAME = new QName("tns", "count_distinct_pmids_from_uniprot_accResult");
    private final static QName _GetPmidsFromCidCid_QNAME = new QName("tns", "cid");
    private final static QName _GetPmidsFromCidResponseGetPmidsFromCidResult_QNAME = new QName("tns", "get_pmids_from_cidResult");
    private final static QName _GetAnnotationsFromCidResponseGetAnnotationsFromCidResult_QNAME = new QName("tns", "get_annotations_from_cidResult");
    private final static QName _ProlificNucleotidesequenceResponseProlificNucleotidesequenceResult_QNAME = new QName("tns", "prolific_nucleotidesequenceResult");
    private final static QName _CountDistinctPmidsFromCidResponseCountDistinctPmidsFromCidResult_QNAME = new QName("tns", "count_distinct_pmids_from_cidResult");
    private final static QName _GetPmidsFromUniprotAccResponseGetPmidsFromUniprotAccResult_QNAME = new QName("tns", "get_pmids_from_uniprot_accResult");
    private final static QName _GetAnnotationsFromUniprotAccResponseGetAnnotationsFromUniprotAccResult_QNAME = new QName("tns", "get_annotations_from_uniprot_accResult");
    private final static QName _CountDistinctPmidsFromUniprotAccPid_QNAME = new QName("tns", "pid");
    private final static QName _GetSimilarProteinsNucleotidesequenceResponseGetSimilarProteinsNucleotidesequenceResult_QNAME = new QName("tns", "get_similar_proteins_nucleotidesequenceResult");
    private final static QName _GetAnnotationsFromUniprotAccAccs_QNAME = new QName("tns", "accs");
    private final static QName _GetSimilarProteinsProteinsequenceResponseGetSimilarProteinsProteinsequenceResult_QNAME = new QName("tns", "get_similar_proteins_proteinsequenceResult");
    private final static QName _ProlificProteinsequenceResponseProlificProteinsequenceResult_QNAME = new QName("tns", "prolific_proteinsequenceResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: tns
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetSimilarProteinsProteinsequenceResponse }
     * 
     */
    public GetSimilarProteinsProteinsequenceResponse createGetSimilarProteinsProteinsequenceResponse() {
        return new GetSimilarProteinsProteinsequenceResponse();
    }

    /**
     * Create an instance of {@link GetAnnotationsFromCid }
     * 
     */
    public GetAnnotationsFromCid createGetAnnotationsFromCid() {
        return new GetAnnotationsFromCid();
    }

    /**
     * Create an instance of {@link GetPmidsFromUniprotAccResponse }
     * 
     */
    public GetPmidsFromUniprotAccResponse createGetPmidsFromUniprotAccResponse() {
        return new GetPmidsFromUniprotAccResponse();
    }

    /**
     * Create an instance of {@link GetSimilarProteinsNucleotidesequenceResponse }
     * 
     */
    public GetSimilarProteinsNucleotidesequenceResponse createGetSimilarProteinsNucleotidesequenceResponse() {
        return new GetSimilarProteinsNucleotidesequenceResponse();
    }

    /**
     * Create an instance of {@link GetPmidsFromCidResponse }
     * 
     */
    public GetPmidsFromCidResponse createGetPmidsFromCidResponse() {
        return new GetPmidsFromCidResponse();
    }

    /**
     * Create an instance of {@link CountDistinctPmidsFromCidResponse }
     * 
     */
    public CountDistinctPmidsFromCidResponse createCountDistinctPmidsFromCidResponse() {
        return new CountDistinctPmidsFromCidResponse();
    }

    /**
     * Create an instance of {@link CountDistinctPmidsFromUniprotAccResponse }
     * 
     */
    public CountDistinctPmidsFromUniprotAccResponse createCountDistinctPmidsFromUniprotAccResponse() {
        return new CountDistinctPmidsFromUniprotAccResponse();
    }

    /**
     * Create an instance of {@link ProlificNucleotidesequenceResponse }
     * 
     */
    public ProlificNucleotidesequenceResponse createProlificNucleotidesequenceResponse() {
        return new ProlificNucleotidesequenceResponse();
    }

    /**
     * Create an instance of {@link CountDistinctPmidsFromUniprotAcc }
     * 
     */
    public CountDistinctPmidsFromUniprotAcc createCountDistinctPmidsFromUniprotAcc() {
        return new CountDistinctPmidsFromUniprotAcc();
    }

    /**
     * Create an instance of {@link ProlificProteinsequence }
     * 
     */
    public ProlificProteinsequence createProlificProteinsequence() {
        return new ProlificProteinsequence();
    }

    /**
     * Create an instance of {@link GetPmidsFromUniprotAcc }
     * 
     */
    public GetPmidsFromUniprotAcc createGetPmidsFromUniprotAcc() {
        return new GetPmidsFromUniprotAcc();
    }

    /**
     * Create an instance of {@link GetSimilarProteinsProteinsequence }
     * 
     */
    public GetSimilarProteinsProteinsequence createGetSimilarProteinsProteinsequence() {
        return new GetSimilarProteinsProteinsequence();
    }

    /**
     * Create an instance of {@link InfoResponse }
     * 
     */
    public InfoResponse createInfoResponse() {
        return new InfoResponse();
    }

    /**
     * Create an instance of {@link GetAnnotationsFromUniprotAcc }
     * 
     */
    public GetAnnotationsFromUniprotAcc createGetAnnotationsFromUniprotAcc() {
        return new GetAnnotationsFromUniprotAcc();
    }

    /**
     * Create an instance of {@link GetPmidsFromCid }
     * 
     */
    public GetPmidsFromCid createGetPmidsFromCid() {
        return new GetPmidsFromCid();
    }

    /**
     * Create an instance of {@link GetSimilarProteinsNucleotidesequence }
     * 
     */
    public GetSimilarProteinsNucleotidesequence createGetSimilarProteinsNucleotidesequence() {
        return new GetSimilarProteinsNucleotidesequence();
    }

    /**
     * Create an instance of {@link GetAnnotationsFromCidResponse }
     * 
     */
    public GetAnnotationsFromCidResponse createGetAnnotationsFromCidResponse() {
        return new GetAnnotationsFromCidResponse();
    }

    /**
     * Create an instance of {@link CountDistinctPmidsFromCid }
     * 
     */
    public CountDistinctPmidsFromCid createCountDistinctPmidsFromCid() {
        return new CountDistinctPmidsFromCid();
    }

    /**
     * Create an instance of {@link ProlificNucleotidesequence }
     * 
     */
    public ProlificNucleotidesequence createProlificNucleotidesequence() {
        return new ProlificNucleotidesequence();
    }

    /**
     * Create an instance of {@link ProlificProteinsequenceResponse }
     * 
     */
    public ProlificProteinsequenceResponse createProlificProteinsequenceResponse() {
        return new ProlificProteinsequenceResponse();
    }

    /**
     * Create an instance of {@link GetAnnotationsFromUniprotAccResponse }
     * 
     */
    public GetAnnotationsFromUniprotAccResponse createGetAnnotationsFromUniprotAccResponse() {
        return new GetAnnotationsFromUniprotAccResponse();
    }

    /**
     * Create an instance of {@link Info }
     * 
     */
    public Info createInfo() {
        return new Info();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAnnotationsFromUniprotAccResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "tns", name = "get_annotations_from_uniprot_accResponse")
    public JAXBElement<GetAnnotationsFromUniprotAccResponse> createGetAnnotationsFromUniprotAccResponse(GetAnnotationsFromUniprotAccResponse value) {
        return new JAXBElement<GetAnnotationsFromUniprotAccResponse>(_GetAnnotationsFromUniprotAccResponse_QNAME, GetAnnotationsFromUniprotAccResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Info }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "tns", name = "info")
    public JAXBElement<Info> createInfo(Info value) {
        return new JAXBElement<Info>(_Info_QNAME, Info.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAnnotationsFromCidResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "tns", name = "get_annotations_from_cidResponse")
    public JAXBElement<GetAnnotationsFromCidResponse> createGetAnnotationsFromCidResponse(GetAnnotationsFromCidResponse value) {
        return new JAXBElement<GetAnnotationsFromCidResponse>(_GetAnnotationsFromCidResponse_QNAME, GetAnnotationsFromCidResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountDistinctPmidsFromCid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "tns", name = "count_distinct_pmids_from_cid")
    public JAXBElement<CountDistinctPmidsFromCid> createCountDistinctPmidsFromCid(CountDistinctPmidsFromCid value) {
        return new JAXBElement<CountDistinctPmidsFromCid>(_CountDistinctPmidsFromCid_QNAME, CountDistinctPmidsFromCid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProlificNucleotidesequence }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "tns", name = "prolific_nucleotidesequence")
    public JAXBElement<ProlificNucleotidesequence> createProlificNucleotidesequence(ProlificNucleotidesequence value) {
        return new JAXBElement<ProlificNucleotidesequence>(_ProlificNucleotidesequence_QNAME, ProlificNucleotidesequence.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProlificProteinsequenceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "tns", name = "prolific_proteinsequenceResponse")
    public JAXBElement<ProlificProteinsequenceResponse> createProlificProteinsequenceResponse(ProlificProteinsequenceResponse value) {
        return new JAXBElement<ProlificProteinsequenceResponse>(_ProlificProteinsequenceResponse_QNAME, ProlificProteinsequenceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountDistinctPmidsFromCidResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "tns", name = "count_distinct_pmids_from_cidResponse")
    public JAXBElement<CountDistinctPmidsFromCidResponse> createCountDistinctPmidsFromCidResponse(CountDistinctPmidsFromCidResponse value) {
        return new JAXBElement<CountDistinctPmidsFromCidResponse>(_CountDistinctPmidsFromCidResponse_QNAME, CountDistinctPmidsFromCidResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountDistinctPmidsFromUniprotAccResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "tns", name = "count_distinct_pmids_from_uniprot_accResponse")
    public JAXBElement<CountDistinctPmidsFromUniprotAccResponse> createCountDistinctPmidsFromUniprotAccResponse(CountDistinctPmidsFromUniprotAccResponse value) {
        return new JAXBElement<CountDistinctPmidsFromUniprotAccResponse>(_CountDistinctPmidsFromUniprotAccResponse_QNAME, CountDistinctPmidsFromUniprotAccResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProlificNucleotidesequenceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "tns", name = "prolific_nucleotidesequenceResponse")
    public JAXBElement<ProlificNucleotidesequenceResponse> createProlificNucleotidesequenceResponse(ProlificNucleotidesequenceResponse value) {
        return new JAXBElement<ProlificNucleotidesequenceResponse>(_ProlificNucleotidesequenceResponse_QNAME, ProlificNucleotidesequenceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountDistinctPmidsFromUniprotAcc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "tns", name = "count_distinct_pmids_from_uniprot_acc")
    public JAXBElement<CountDistinctPmidsFromUniprotAcc> createCountDistinctPmidsFromUniprotAcc(CountDistinctPmidsFromUniprotAcc value) {
        return new JAXBElement<CountDistinctPmidsFromUniprotAcc>(_CountDistinctPmidsFromUniprotAcc_QNAME, CountDistinctPmidsFromUniprotAcc.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProlificProteinsequence }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "tns", name = "prolific_proteinsequence")
    public JAXBElement<ProlificProteinsequence> createProlificProteinsequence(ProlificProteinsequence value) {
        return new JAXBElement<ProlificProteinsequence>(_ProlificProteinsequence_QNAME, ProlificProteinsequence.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPmidsFromUniprotAcc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "tns", name = "get_pmids_from_uniprot_acc")
    public JAXBElement<GetPmidsFromUniprotAcc> createGetPmidsFromUniprotAcc(GetPmidsFromUniprotAcc value) {
        return new JAXBElement<GetPmidsFromUniprotAcc>(_GetPmidsFromUniprotAcc_QNAME, GetPmidsFromUniprotAcc.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSimilarProteinsProteinsequence }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "tns", name = "get_similar_proteins_proteinsequence")
    public JAXBElement<GetSimilarProteinsProteinsequence> createGetSimilarProteinsProteinsequence(GetSimilarProteinsProteinsequence value) {
        return new JAXBElement<GetSimilarProteinsProteinsequence>(_GetSimilarProteinsProteinsequence_QNAME, GetSimilarProteinsProteinsequence.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "tns", name = "infoResponse")
    public JAXBElement<InfoResponse> createInfoResponse(InfoResponse value) {
        return new JAXBElement<InfoResponse>(_InfoResponse_QNAME, InfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAnnotationsFromUniprotAcc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "tns", name = "get_annotations_from_uniprot_acc")
    public JAXBElement<GetAnnotationsFromUniprotAcc> createGetAnnotationsFromUniprotAcc(GetAnnotationsFromUniprotAcc value) {
        return new JAXBElement<GetAnnotationsFromUniprotAcc>(_GetAnnotationsFromUniprotAcc_QNAME, GetAnnotationsFromUniprotAcc.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPmidsFromCid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "tns", name = "get_pmids_from_cid")
    public JAXBElement<GetPmidsFromCid> createGetPmidsFromCid(GetPmidsFromCid value) {
        return new JAXBElement<GetPmidsFromCid>(_GetPmidsFromCid_QNAME, GetPmidsFromCid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSimilarProteinsNucleotidesequence }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "tns", name = "get_similar_proteins_nucleotidesequence")
    public JAXBElement<GetSimilarProteinsNucleotidesequence> createGetSimilarProteinsNucleotidesequence(GetSimilarProteinsNucleotidesequence value) {
        return new JAXBElement<GetSimilarProteinsNucleotidesequence>(_GetSimilarProteinsNucleotidesequence_QNAME, GetSimilarProteinsNucleotidesequence.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSimilarProteinsProteinsequenceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "tns", name = "get_similar_proteins_proteinsequenceResponse")
    public JAXBElement<GetSimilarProteinsProteinsequenceResponse> createGetSimilarProteinsProteinsequenceResponse(GetSimilarProteinsProteinsequenceResponse value) {
        return new JAXBElement<GetSimilarProteinsProteinsequenceResponse>(_GetSimilarProteinsProteinsequenceResponse_QNAME, GetSimilarProteinsProteinsequenceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAnnotationsFromCid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "tns", name = "get_annotations_from_cid")
    public JAXBElement<GetAnnotationsFromCid> createGetAnnotationsFromCid(GetAnnotationsFromCid value) {
        return new JAXBElement<GetAnnotationsFromCid>(_GetAnnotationsFromCid_QNAME, GetAnnotationsFromCid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPmidsFromUniprotAccResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "tns", name = "get_pmids_from_uniprot_accResponse")
    public JAXBElement<GetPmidsFromUniprotAccResponse> createGetPmidsFromUniprotAccResponse(GetPmidsFromUniprotAccResponse value) {
        return new JAXBElement<GetPmidsFromUniprotAccResponse>(_GetPmidsFromUniprotAccResponse_QNAME, GetPmidsFromUniprotAccResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSimilarProteinsNucleotidesequenceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "tns", name = "get_similar_proteins_nucleotidesequenceResponse")
    public JAXBElement<GetSimilarProteinsNucleotidesequenceResponse> createGetSimilarProteinsNucleotidesequenceResponse(GetSimilarProteinsNucleotidesequenceResponse value) {
        return new JAXBElement<GetSimilarProteinsNucleotidesequenceResponse>(_GetSimilarProteinsNucleotidesequenceResponse_QNAME, GetSimilarProteinsNucleotidesequenceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPmidsFromCidResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "tns", name = "get_pmids_from_cidResponse")
    public JAXBElement<GetPmidsFromCidResponse> createGetPmidsFromCidResponse(GetPmidsFromCidResponse value) {
        return new JAXBElement<GetPmidsFromCidResponse>(_GetPmidsFromCidResponse_QNAME, GetPmidsFromCidResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "tns", name = "infoResult", scope = InfoResponse.class)
    public JAXBElement<String> createInfoResponseInfoResult(String value) {
        return new JAXBElement<String>(_InfoResponseInfoResult_QNAME, String.class, InfoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "tns", name = "sequence", scope = ProlificProteinsequence.class)
    public JAXBElement<String> createProlificProteinsequenceSequence(String value) {
        return new JAXBElement<String>(_ProlificProteinsequenceSequence_QNAME, String.class, ProlificProteinsequence.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "tns", name = "count_distinct_pmids_from_uniprot_accResult", scope = CountDistinctPmidsFromUniprotAccResponse.class)
    public JAXBElement<BigInteger> createCountDistinctPmidsFromUniprotAccResponseCountDistinctPmidsFromUniprotAccResult(BigInteger value) {
        return new JAXBElement<BigInteger>(_CountDistinctPmidsFromUniprotAccResponseCountDistinctPmidsFromUniprotAccResult_QNAME, BigInteger.class, CountDistinctPmidsFromUniprotAccResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "tns", name = "sequence", scope = ProlificNucleotidesequence.class)
    public JAXBElement<String> createProlificNucleotidesequenceSequence(String value) {
        return new JAXBElement<String>(_ProlificProteinsequenceSequence_QNAME, String.class, ProlificNucleotidesequence.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "tns", name = "cid", scope = GetPmidsFromCid.class)
    public JAXBElement<String> createGetPmidsFromCidCid(String value) {
        return new JAXBElement<String>(_GetPmidsFromCidCid_QNAME, String.class, GetPmidsFromCid.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "tns", name = "get_pmids_from_cidResult", scope = GetPmidsFromCidResponse.class)
    public JAXBElement<String> createGetPmidsFromCidResponseGetPmidsFromCidResult(String value) {
        return new JAXBElement<String>(_GetPmidsFromCidResponseGetPmidsFromCidResult_QNAME, String.class, GetPmidsFromCidResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "tns", name = "get_annotations_from_cidResult", scope = GetAnnotationsFromCidResponse.class)
    public JAXBElement<String> createGetAnnotationsFromCidResponseGetAnnotationsFromCidResult(String value) {
        return new JAXBElement<String>(_GetAnnotationsFromCidResponseGetAnnotationsFromCidResult_QNAME, String.class, GetAnnotationsFromCidResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "tns", name = "cid", scope = CountDistinctPmidsFromCid.class)
    public JAXBElement<String> createCountDistinctPmidsFromCidCid(String value) {
        return new JAXBElement<String>(_GetPmidsFromCidCid_QNAME, String.class, CountDistinctPmidsFromCid.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "tns", name = "prolific_nucleotidesequenceResult", scope = ProlificNucleotidesequenceResponse.class)
    public JAXBElement<String> createProlificNucleotidesequenceResponseProlificNucleotidesequenceResult(String value) {
        return new JAXBElement<String>(_ProlificNucleotidesequenceResponseProlificNucleotidesequenceResult_QNAME, String.class, ProlificNucleotidesequenceResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "tns", name = "count_distinct_pmids_from_cidResult", scope = CountDistinctPmidsFromCidResponse.class)
    public JAXBElement<BigInteger> createCountDistinctPmidsFromCidResponseCountDistinctPmidsFromCidResult(BigInteger value) {
        return new JAXBElement<BigInteger>(_CountDistinctPmidsFromCidResponseCountDistinctPmidsFromCidResult_QNAME, BigInteger.class, CountDistinctPmidsFromCidResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "tns", name = "sequence", scope = GetSimilarProteinsNucleotidesequence.class)
    public JAXBElement<String> createGetSimilarProteinsNucleotidesequenceSequence(String value) {
        return new JAXBElement<String>(_ProlificProteinsequenceSequence_QNAME, String.class, GetSimilarProteinsNucleotidesequence.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "tns", name = "get_pmids_from_uniprot_accResult", scope = GetPmidsFromUniprotAccResponse.class)
    public JAXBElement<String> createGetPmidsFromUniprotAccResponseGetPmidsFromUniprotAccResult(String value) {
        return new JAXBElement<String>(_GetPmidsFromUniprotAccResponseGetPmidsFromUniprotAccResult_QNAME, String.class, GetPmidsFromUniprotAccResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "tns", name = "get_annotations_from_uniprot_accResult", scope = GetAnnotationsFromUniprotAccResponse.class)
    public JAXBElement<String> createGetAnnotationsFromUniprotAccResponseGetAnnotationsFromUniprotAccResult(String value) {
        return new JAXBElement<String>(_GetAnnotationsFromUniprotAccResponseGetAnnotationsFromUniprotAccResult_QNAME, String.class, GetAnnotationsFromUniprotAccResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "tns", name = "cid", scope = GetAnnotationsFromCid.class)
    public JAXBElement<String> createGetAnnotationsFromCidCid(String value) {
        return new JAXBElement<String>(_GetPmidsFromCidCid_QNAME, String.class, GetAnnotationsFromCid.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "tns", name = "pid", scope = CountDistinctPmidsFromUniprotAcc.class)
    public JAXBElement<String> createCountDistinctPmidsFromUniprotAccPid(String value) {
        return new JAXBElement<String>(_CountDistinctPmidsFromUniprotAccPid_QNAME, String.class, CountDistinctPmidsFromUniprotAcc.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "tns", name = "sequence", scope = GetSimilarProteinsProteinsequence.class)
    public JAXBElement<String> createGetSimilarProteinsProteinsequenceSequence(String value) {
        return new JAXBElement<String>(_ProlificProteinsequenceSequence_QNAME, String.class, GetSimilarProteinsProteinsequence.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "tns", name = "get_similar_proteins_nucleotidesequenceResult", scope = GetSimilarProteinsNucleotidesequenceResponse.class)
    public JAXBElement<String> createGetSimilarProteinsNucleotidesequenceResponseGetSimilarProteinsNucleotidesequenceResult(String value) {
        return new JAXBElement<String>(_GetSimilarProteinsNucleotidesequenceResponseGetSimilarProteinsNucleotidesequenceResult_QNAME, String.class, GetSimilarProteinsNucleotidesequenceResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "tns", name = "pid", scope = GetPmidsFromUniprotAcc.class)
    public JAXBElement<String> createGetPmidsFromUniprotAccPid(String value) {
        return new JAXBElement<String>(_CountDistinctPmidsFromUniprotAccPid_QNAME, String.class, GetPmidsFromUniprotAcc.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "tns", name = "accs", scope = GetAnnotationsFromUniprotAcc.class)
    public JAXBElement<String> createGetAnnotationsFromUniprotAccAccs(String value) {
        return new JAXBElement<String>(_GetAnnotationsFromUniprotAccAccs_QNAME, String.class, GetAnnotationsFromUniprotAcc.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "tns", name = "get_similar_proteins_proteinsequenceResult", scope = GetSimilarProteinsProteinsequenceResponse.class)
    public JAXBElement<String> createGetSimilarProteinsProteinsequenceResponseGetSimilarProteinsProteinsequenceResult(String value) {
        return new JAXBElement<String>(_GetSimilarProteinsProteinsequenceResponseGetSimilarProteinsProteinsequenceResult_QNAME, String.class, GetSimilarProteinsProteinsequenceResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "tns", name = "prolific_proteinsequenceResult", scope = ProlificProteinsequenceResponse.class)
    public JAXBElement<String> createProlificProteinsequenceResponseProlificProteinsequenceResult(String value) {
        return new JAXBElement<String>(_ProlificProteinsequenceResponseProlificProteinsequenceResult_QNAME, String.class, ProlificProteinsequenceResponse.class, value);
    }

}
