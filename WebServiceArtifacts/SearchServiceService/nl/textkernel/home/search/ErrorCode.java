
package nl.textkernel.home.search;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for errorCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="errorCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EMPTY_ARGUMENT"/>
 *     &lt;enumeration value="INVALID_PASSWORD"/>
 *     &lt;enumeration value="INVALID_ACCESS_TOKEN"/>
 *     &lt;enumeration value="INVALID_EXTERNAL_TOKEN"/>
 *     &lt;enumeration value="ENVIRONMENT_NOT_AVAILABLE"/>
 *     &lt;enumeration value="DOCUMENT_FORMAT_ERROR"/>
 *     &lt;enumeration value="DOCUMENT_STORAGE_ERROR"/>
 *     &lt;enumeration value="INVALID_ACCESS_ROLES"/>
 *     &lt;enumeration value="INVALID_SEARCH_REQUEST"/>
 *     &lt;enumeration value="SEARCH_EXECUTION_ERROR"/>
 *     &lt;enumeration value="QUERY_EXTRACTION_CONFIGURATION_ERROR"/>
 *     &lt;enumeration value="URL_NOT_FOUND"/>
 *     &lt;enumeration value="QUERY_EXTRACTION_EXECUTION_ERROR"/>
 *     &lt;enumeration value="EXTERNAL_LOGIN_ERROR"/>
 *     &lt;enumeration value="INVALID_ACTION"/>
 *     &lt;enumeration value="DATABASE_ERROR"/>
 *     &lt;enumeration value="INVALID_SEARCH_STATE"/>
 *     &lt;enumeration value="SAVED_SEARCH_NOT_FOUND"/>
 *     &lt;enumeration value="SAVED_RESULT_NOT_FOUND"/>
 *     &lt;enumeration value="PROJECT_NOT_FOUND"/>
 *     &lt;enumeration value="INVALID_EMAIL_ADDRESSES"/>
 *     &lt;enumeration value="NOT_ENOUGH_CHARACTERS"/>
 *     &lt;enumeration value="NO_DICTIONARY_FOR_FIELD"/>
 *     &lt;enumeration value="PROJECT_ACCESS_DENIED"/>
 *     &lt;enumeration value="INVALID_SAVE_RESULTS_REQUEST"/>
 *     &lt;enumeration value="INVALID_LOGGING_REQUEST"/>
 *     &lt;enumeration value="METHOD_NOT_AVAILABLE"/>
 *     &lt;enumeration value="PROJECT_DATA_NOT_UNIQUE"/>
 *     &lt;enumeration value="FILE_ACCESS_DENIED"/>
 *     &lt;enumeration value="SEARCHER_NOT_FOUND"/>
 *     &lt;enumeration value="INVALID_KNOWLEDGE_FILE"/>
 *     &lt;enumeration value="SEARCHER_ACCESS_DENIED"/>
 *     &lt;enumeration value="INVALID_DATE"/>
 *     &lt;enumeration value="EXTERNAL_ERROR"/>
 *     &lt;enumeration value="USER_NOT_AUTHORIZED"/>
 *     &lt;enumeration value="SESSION_TIMEOUT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "errorCode")
@XmlEnum
public enum ErrorCode {

    EMPTY_ARGUMENT,
    INVALID_PASSWORD,
    INVALID_ACCESS_TOKEN,
    INVALID_EXTERNAL_TOKEN,
    ENVIRONMENT_NOT_AVAILABLE,
    DOCUMENT_FORMAT_ERROR,
    DOCUMENT_STORAGE_ERROR,
    INVALID_ACCESS_ROLES,
    INVALID_SEARCH_REQUEST,
    SEARCH_EXECUTION_ERROR,
    QUERY_EXTRACTION_CONFIGURATION_ERROR,
    URL_NOT_FOUND,
    QUERY_EXTRACTION_EXECUTION_ERROR,
    EXTERNAL_LOGIN_ERROR,
    INVALID_ACTION,
    DATABASE_ERROR,
    INVALID_SEARCH_STATE,
    SAVED_SEARCH_NOT_FOUND,
    SAVED_RESULT_NOT_FOUND,
    PROJECT_NOT_FOUND,
    INVALID_EMAIL_ADDRESSES,
    NOT_ENOUGH_CHARACTERS,
    NO_DICTIONARY_FOR_FIELD,
    PROJECT_ACCESS_DENIED,
    INVALID_SAVE_RESULTS_REQUEST,
    INVALID_LOGGING_REQUEST,
    METHOD_NOT_AVAILABLE,
    PROJECT_DATA_NOT_UNIQUE,
    FILE_ACCESS_DENIED,
    SEARCHER_NOT_FOUND,
    INVALID_KNOWLEDGE_FILE,
    SEARCHER_ACCESS_DENIED,
    INVALID_DATE,
    EXTERNAL_ERROR,
    USER_NOT_AUTHORIZED,
    SESSION_TIMEOUT;

    public String value() {
        return name();
    }

    public static ErrorCode fromValue(String v) {
        return valueOf(v);
    }

}
