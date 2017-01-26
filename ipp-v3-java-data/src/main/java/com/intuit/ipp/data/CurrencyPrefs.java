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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 * <p>Java class for CurrencyPrefs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CurrencyPrefs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MultiCurrencyEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HomeCurrency" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyPrefs", propOrder = {
    "multiCurrencyEnabled",
    "homeCurrency"
})
public class CurrencyPrefs
    implements Serializable, Equals, HashCode
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "MultiCurrencyEnabled")
    protected Boolean multiCurrencyEnabled;
    @XmlElement(name = "HomeCurrency")
    protected ReferenceType homeCurrency;

    /**
     * Gets the value of the multiCurrencyEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMultiCurrencyEnabled() {
        return multiCurrencyEnabled;
    }

    /**
     * Sets the value of the multiCurrencyEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMultiCurrencyEnabled(Boolean value) {
        this.multiCurrencyEnabled = value;
    }

    /**
     * Gets the value of the homeCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getHomeCurrency() {
        return homeCurrency;
    }

    /**
     * Sets the value of the homeCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setHomeCurrency(ReferenceType value) {
        this.homeCurrency = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof CurrencyPrefs)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final CurrencyPrefs that = ((CurrencyPrefs) object);
        {
            Boolean lhsMultiCurrencyEnabled;
            lhsMultiCurrencyEnabled = this.isMultiCurrencyEnabled();
            Boolean rhsMultiCurrencyEnabled;
            rhsMultiCurrencyEnabled = that.isMultiCurrencyEnabled();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "multiCurrencyEnabled", lhsMultiCurrencyEnabled), LocatorUtils.property(thatLocator, "multiCurrencyEnabled", rhsMultiCurrencyEnabled), lhsMultiCurrencyEnabled, rhsMultiCurrencyEnabled)) {
                return false;
            }
        }
        {
            ReferenceType lhsHomeCurrency;
            lhsHomeCurrency = this.getHomeCurrency();
            ReferenceType rhsHomeCurrency;
            rhsHomeCurrency = that.getHomeCurrency();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "homeCurrency", lhsHomeCurrency), LocatorUtils.property(thatLocator, "homeCurrency", rhsHomeCurrency), lhsHomeCurrency, rhsHomeCurrency)) {
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
            Boolean theMultiCurrencyEnabled;
            theMultiCurrencyEnabled = this.isMultiCurrencyEnabled();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "multiCurrencyEnabled", theMultiCurrencyEnabled), currentHashCode, theMultiCurrencyEnabled);
        }
        {
            ReferenceType theHomeCurrency;
            theHomeCurrency = this.getHomeCurrency();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "homeCurrency", theHomeCurrency), currentHashCode, theHomeCurrency);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
