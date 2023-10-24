package it.umana.demo.jee.calcolatore;

        import javax.xml.bind.annotation.XmlAccessType;
        import javax.xml.bind.annotation.XmlAccessorType;
        import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SommaResponse complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="SommaResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://xsd.base.wrapper.dms.z.cata1}ResponseBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="somma" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MoltiplicaResponse", namespace = "https://v1.calcolatore.jee.demo.umana.it", propOrder = {
        "moltiplica"
})
public class MoltiplicaResponse
        extends ResponseBase
{

    protected int prodotto;

    /**
     * Gets the value of the somma property.
     *
     */
    public int getProdotto() {
        return prodotto;
    }

    /**
     * Sets the value of the somma property.
     *
     */
    public void setProdotto(int value) {
        this.prodotto = value;
    }

}
