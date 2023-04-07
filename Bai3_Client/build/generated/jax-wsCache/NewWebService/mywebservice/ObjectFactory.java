
package mywebservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mywebservice package. 
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

    private final static QName _CheckSanPham_QNAME = new QName("http://MyWebService/", "checkSanPham");
    private final static QName _CheckSanPhamResponse_QNAME = new QName("http://MyWebService/", "checkSanPhamResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mywebservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CheckSanPham }
     * 
     */
    public CheckSanPham createCheckSanPham() {
        return new CheckSanPham();
    }

    /**
     * Create an instance of {@link CheckSanPhamResponse }
     * 
     */
    public CheckSanPhamResponse createCheckSanPhamResponse() {
        return new CheckSanPhamResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckSanPham }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CheckSanPham }{@code >}
     */
    @XmlElementDecl(namespace = "http://MyWebService/", name = "checkSanPham")
    public JAXBElement<CheckSanPham> createCheckSanPham(CheckSanPham value) {
        return new JAXBElement<CheckSanPham>(_CheckSanPham_QNAME, CheckSanPham.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckSanPhamResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CheckSanPhamResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://MyWebService/", name = "checkSanPhamResponse")
    public JAXBElement<CheckSanPhamResponse> createCheckSanPhamResponse(CheckSanPhamResponse value) {
        return new JAXBElement<CheckSanPhamResponse>(_CheckSanPhamResponse_QNAME, CheckSanPhamResponse.class, null, value);
    }

}
