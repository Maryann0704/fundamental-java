//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.13 at 11:52:19 AM MSK 
//


package by.it.narushevich.jd02_09.beans;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;


/**
 * <p>Java class for TeaTag complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TeaTag">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="trademark" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="originCountry" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="purchaseCountry" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="material" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="width" type="{http://beans.jd02_09.narushevich.it.by/}Width"/>
 *         &lt;element name="height" type="{http://beans.jd02_09.narushevich.it.by/}Height"/>
 *         &lt;element name="corners" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="inCollectionSince" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="exchange" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TeaTag", propOrder = {

})
public class TeaTag {

    @XmlElement(required = true)
    protected String trademark;
    @XmlElement(required = true)
    protected String originCountry;
    @XmlElement(required = true)
    protected String purchaseCountry;
    @XmlElement(required = true)
    protected String material;
    @XmlElement(required = true)
    protected Width width;
    @XmlElement(required = true)
    protected Height height;
    @XmlElement(required = true)
    protected String corners;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger inCollectionSince;
    protected boolean exchange;

    /**
     * Gets the value of the trademark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrademark() {
        return trademark;
    }

    /**
     * Sets the value of the trademark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrademark(String value) {
        this.trademark = value;
    }

    /**
     * Gets the value of the originCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginCountry() {
        return originCountry;
    }

    /**
     * Sets the value of the originCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginCountry(String value) {
        this.originCountry = value;
    }

    /**
     * Gets the value of the purchaseCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseCountry() {
        return purchaseCountry;
    }

    /**
     * Sets the value of the purchaseCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseCountry(String value) {
        this.purchaseCountry = value;
    }

    /**
     * Gets the value of the material property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaterial() {
        return material;
    }

    /**
     * Sets the value of the material property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaterial(String value) {
        this.material = value;
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link Width }
     *     
     */
    public Width getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link Width }
     *     
     */
    public void setWidth(Width value) {
        this.width = value;
    }

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link Height }
     *     
     */
    public Height getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link Height }
     *     
     */
    public void setHeight(Height value) {
        this.height = value;
    }

    /**
     * Gets the value of the corners property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorners() {
        return corners;
    }

    /**
     * Sets the value of the corners property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorners(String value) {
        this.corners = value;
    }

    /**
     * Gets the value of the inCollectionSince property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInCollectionSince() {
        return inCollectionSince;
    }

    /**
     * Sets the value of the inCollectionSince property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInCollectionSince(BigInteger value) {
        this.inCollectionSince = value;
    }

    /**
     * Gets the value of the exchange property.
     * 
     */
    public boolean isExchange() {
        return exchange;
    }

    /**
     * Sets the value of the exchange property.
     * 
     */
    public void setExchange(boolean value) {
        this.exchange = value;
    }

    @Override
    public String toString() {
        return "\n\t\t\t\t\tTeaTag\n" +
                "\t\t\t\t\t\ttrademark = " + trademark + ",\n" +
                "\t\t\t\t\t\toriginCountry = " + originCountry + ",\n" +
                "\t\t\t\t\t\tpurchaseCountry = " + purchaseCountry + ",\n" +
                "\t\t\t\t\t\tmaterial = " + material + ",\n" +
                "\t\t\t\t\t\twidth = " + width +
                "\t\t\t\t\t\theight = " + height +
                "\t\t\t\t\t\tcorners = " + corners + ",\n" +
                "\t\t\t\t\t\tinCollectionSince = " + inCollectionSince + ",\n"+
                "\t\t\t\t\t\texchange = " + exchange;
    }
}