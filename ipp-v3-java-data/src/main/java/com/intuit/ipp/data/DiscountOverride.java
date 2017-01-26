/*******************************************************************************
 * Copyright (c) 2017 Intuit
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.14 at 04:24:27 PM PST 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for DiscountOverride complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiscountOverride">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DiscountRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/>
 *         &lt;element name="PercentBased" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DiscountPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DiscountAccountRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscountOverride", propOrder = {
    "discountRef",
    "percentBased",
    "discountPercent",
    "discountAccountRef"
})
@XmlSeeAlso({
    DiscountLineDetail.class
})
public class DiscountOverride
    implements Serializable, Equals, HashCode
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "DiscountRef")
    protected ReferenceType discountRef;
    @XmlElement(name = "PercentBased")
    protected Boolean percentBased;
    @XmlElement(name = "DiscountPercent")
    protected BigDecimal discountPercent;
    @XmlElement(name = "DiscountAccountRef")
    protected ReferenceType discountAccountRef;

    /**
     * Gets the value of the discountRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getDiscountRef() {
        return discountRef;
    }

    /**
     * Sets the value of the discountRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setDiscountRef(ReferenceType value) {
        this.discountRef = value;
    }

    /**
     * Gets the value of the percentBased property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPercentBased() {
        return percentBased;
    }

    /**
     * Sets the value of the percentBased property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPercentBased(Boolean value) {
        this.percentBased = value;
    }

    /**
     * Gets the value of the discountPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscountPercent() {
        return discountPercent;
    }

    /**
     * Sets the value of the discountPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscountPercent(BigDecimal value) {
        this.discountPercent = value;
    }

    /**
     * Gets the value of the discountAccountRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getDiscountAccountRef() {
        return discountAccountRef;
    }

    /**
     * Sets the value of the discountAccountRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setDiscountAccountRef(ReferenceType value) {
        this.discountAccountRef = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DiscountOverride)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DiscountOverride that = ((DiscountOverride) object);
        {
            ReferenceType lhsDiscountRef;
            lhsDiscountRef = this.getDiscountRef();
            ReferenceType rhsDiscountRef;
            rhsDiscountRef = that.getDiscountRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "discountRef", lhsDiscountRef), LocatorUtils.property(thatLocator, "discountRef", rhsDiscountRef), lhsDiscountRef, rhsDiscountRef)) {
                return false;
            }
        }
        {
            Boolean lhsPercentBased;
            lhsPercentBased = this.isPercentBased();
            Boolean rhsPercentBased;
            rhsPercentBased = that.isPercentBased();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "percentBased", lhsPercentBased), LocatorUtils.property(thatLocator, "percentBased", rhsPercentBased), lhsPercentBased, rhsPercentBased)) {
                return false;
            }
        }
        {
            BigDecimal lhsDiscountPercent;
            lhsDiscountPercent = this.getDiscountPercent();
            BigDecimal rhsDiscountPercent;
            rhsDiscountPercent = that.getDiscountPercent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "discountPercent", lhsDiscountPercent), LocatorUtils.property(thatLocator, "discountPercent", rhsDiscountPercent), lhsDiscountPercent, rhsDiscountPercent)) {
                return false;
            }
        }
        {
            ReferenceType lhsDiscountAccountRef;
            lhsDiscountAccountRef = this.getDiscountAccountRef();
            ReferenceType rhsDiscountAccountRef;
            rhsDiscountAccountRef = that.getDiscountAccountRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "discountAccountRef", lhsDiscountAccountRef), LocatorUtils.property(thatLocator, "discountAccountRef", rhsDiscountAccountRef), lhsDiscountAccountRef, rhsDiscountAccountRef)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            ReferenceType theDiscountRef;
            theDiscountRef = this.getDiscountRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "discountRef", theDiscountRef), currentHashCode, theDiscountRef);
        }
        {
            Boolean thePercentBased;
            thePercentBased = this.isPercentBased();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "percentBased", thePercentBased), currentHashCode, thePercentBased);
        }
        {
            BigDecimal theDiscountPercent;
            theDiscountPercent = this.getDiscountPercent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "discountPercent", theDiscountPercent), currentHashCode, theDiscountPercent);
        }
        {
            ReferenceType theDiscountAccountRef;
            theDiscountAccountRef = this.getDiscountAccountRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "discountAccountRef", theDiscountAccountRef), currentHashCode, theDiscountAccountRef);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
