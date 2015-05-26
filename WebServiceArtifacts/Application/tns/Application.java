
package tns;

import java.math.BigInteger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Application", targetNamespace = "tns")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Application {


    /**
     * 
     * @param cid
     * @return
     *     returns java.math.BigInteger
     */
    @WebMethod(operationName = "count_distinct_pmids_from_cid", action = "count_distinct_pmids_from_cid")
    @WebResult(name = "count_distinct_pmids_from_cidResult", targetNamespace = "tns")
    @RequestWrapper(localName = "count_distinct_pmids_from_cid", targetNamespace = "tns", className = "tns.CountDistinctPmidsFromCid")
    @ResponseWrapper(localName = "count_distinct_pmids_from_cidResponse", targetNamespace = "tns", className = "tns.CountDistinctPmidsFromCidResponse")
    public BigInteger countDistinctPmidsFromCid(
        @WebParam(name = "cid", targetNamespace = "tns")
        String cid);

    /**
     * 
     * @param pid
     * @return
     *     returns java.math.BigInteger
     */
    @WebMethod(operationName = "count_distinct_pmids_from_uniprot_acc", action = "count_distinct_pmids_from_uniprot_acc")
    @WebResult(name = "count_distinct_pmids_from_uniprot_accResult", targetNamespace = "tns")
    @RequestWrapper(localName = "count_distinct_pmids_from_uniprot_acc", targetNamespace = "tns", className = "tns.CountDistinctPmidsFromUniprotAcc")
    @ResponseWrapper(localName = "count_distinct_pmids_from_uniprot_accResponse", targetNamespace = "tns", className = "tns.CountDistinctPmidsFromUniprotAccResponse")
    public BigInteger countDistinctPmidsFromUniprotAcc(
        @WebParam(name = "pid", targetNamespace = "tns")
        String pid);

    /**
     * 
     *             Will return all uniprot-ids and pubmed-ids associated with the PubChem ID
     *         
     * 
     * @param cid
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "get_annotations_from_cid", action = "get_annotations_from_cid")
    @WebResult(name = "get_annotations_from_cidResult", targetNamespace = "tns")
    @RequestWrapper(localName = "get_annotations_from_cid", targetNamespace = "tns", className = "tns.GetAnnotationsFromCid")
    @ResponseWrapper(localName = "get_annotations_from_cidResponse", targetNamespace = "tns", className = "tns.GetAnnotationsFromCidResponse")
    public String getAnnotationsFromCid(
        @WebParam(name = "cid", targetNamespace = "tns")
        String cid);

    /**
     * 
     * @param accs
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "get_annotations_from_uniprot_acc", action = "get_annotations_from_uniprot_acc")
    @WebResult(name = "get_annotations_from_uniprot_accResult", targetNamespace = "tns")
    @RequestWrapper(localName = "get_annotations_from_uniprot_acc", targetNamespace = "tns", className = "tns.GetAnnotationsFromUniprotAcc")
    @ResponseWrapper(localName = "get_annotations_from_uniprot_accResponse", targetNamespace = "tns", className = "tns.GetAnnotationsFromUniprotAccResponse")
    public String getAnnotationsFromUniprotAcc(
        @WebParam(name = "accs", targetNamespace = "tns")
        String accs);

    /**
     * 
     * @param cid
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "get_pmids_from_cid", action = "get_pmids_from_cid")
    @WebResult(name = "get_pmids_from_cidResult", targetNamespace = "tns")
    @RequestWrapper(localName = "get_pmids_from_cid", targetNamespace = "tns", className = "tns.GetPmidsFromCid")
    @ResponseWrapper(localName = "get_pmids_from_cidResponse", targetNamespace = "tns", className = "tns.GetPmidsFromCidResponse")
    public String getPmidsFromCid(
        @WebParam(name = "cid", targetNamespace = "tns")
        String cid);

    /**
     * 
     * @param pid
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "get_pmids_from_uniprot_acc", action = "get_pmids_from_uniprot_acc")
    @WebResult(name = "get_pmids_from_uniprot_accResult", targetNamespace = "tns")
    @RequestWrapper(localName = "get_pmids_from_uniprot_acc", targetNamespace = "tns", className = "tns.GetPmidsFromUniprotAcc")
    @ResponseWrapper(localName = "get_pmids_from_uniprot_accResponse", targetNamespace = "tns", className = "tns.GetPmidsFromUniprotAccResponse")
    public String getPmidsFromUniprotAcc(
        @WebParam(name = "pid", targetNamespace = "tns")
        String pid);

    /**
     * 
     * @param sequence
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "get_similar_proteins_nucleotidesequence", action = "get_similar_proteins_nucleotidesequence")
    @WebResult(name = "get_similar_proteins_nucleotidesequenceResult", targetNamespace = "tns")
    @RequestWrapper(localName = "get_similar_proteins_nucleotidesequence", targetNamespace = "tns", className = "tns.GetSimilarProteinsNucleotidesequence")
    @ResponseWrapper(localName = "get_similar_proteins_nucleotidesequenceResponse", targetNamespace = "tns", className = "tns.GetSimilarProteinsNucleotidesequenceResponse")
    public String getSimilarProteinsNucleotidesequence(
        @WebParam(name = "sequence", targetNamespace = "tns")
        String sequence);

    /**
     * 
     * @param sequence
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "get_similar_proteins_proteinsequence", action = "get_similar_proteins_proteinsequence")
    @WebResult(name = "get_similar_proteins_proteinsequenceResult", targetNamespace = "tns")
    @RequestWrapper(localName = "get_similar_proteins_proteinsequence", targetNamespace = "tns", className = "tns.GetSimilarProteinsProteinsequence")
    @ResponseWrapper(localName = "get_similar_proteins_proteinsequenceResponse", targetNamespace = "tns", className = "tns.GetSimilarProteinsProteinsequenceResponse")
    public String getSimilarProteinsProteinsequence(
        @WebParam(name = "sequence", targetNamespace = "tns")
        String sequence);

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "info")
    @WebResult(name = "infoResult", targetNamespace = "tns")
    @RequestWrapper(localName = "info", targetNamespace = "tns", className = "tns.Info")
    @ResponseWrapper(localName = "infoResponse", targetNamespace = "tns", className = "tns.InfoResponse")
    public String info();

    /**
     * 
     * @param sequence
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "prolific_nucleotidesequence", action = "prolific_nucleotidesequence")
    @WebResult(name = "prolific_nucleotidesequenceResult", targetNamespace = "tns")
    @RequestWrapper(localName = "prolific_nucleotidesequence", targetNamespace = "tns", className = "tns.ProlificNucleotidesequence")
    @ResponseWrapper(localName = "prolific_nucleotidesequenceResponse", targetNamespace = "tns", className = "tns.ProlificNucleotidesequenceResponse")
    public String prolificNucleotidesequence(
        @WebParam(name = "sequence", targetNamespace = "tns")
        String sequence);

    /**
     * 
     * @param sequence
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "prolific_proteinsequence", action = "prolific_proteinsequence")
    @WebResult(name = "prolific_proteinsequenceResult", targetNamespace = "tns")
    @RequestWrapper(localName = "prolific_proteinsequence", targetNamespace = "tns", className = "tns.ProlificProteinsequence")
    @ResponseWrapper(localName = "prolific_proteinsequenceResponse", targetNamespace = "tns", className = "tns.ProlificProteinsequenceResponse")
    public String prolificProteinsequence(
        @WebParam(name = "sequence", targetNamespace = "tns")
        String sequence);

}
