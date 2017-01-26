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
 * 
 * 				Product: QBW
 * 				Description: The SalesRep entity allows
 * 				you to identify sales representatives and track their transactions.
 * 				A sales representative can be an employee, a vendor, or an
 * 				independent contractor. You can associate sales representatives with
 * 				sales deals to track their transactions.
 * 			
 * 
 * <p>Java class for SalesRep complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesRep">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.intuit.com/finance/v3}IntuitEntity">
 *       &lt;sequence>
 *         &lt;element name="NameOf" type="{http://schema.intuit.com/finance/v3}SalesRepTypeEnum" minOccurs="0"/>
 *         &lt;element name="Active" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="EmployeeRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/>
 *           &lt;element name="VendorRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/>
 *           &lt;element name="OtherNameRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="Initials" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesRepEx" type="{http://schema.intuit.com/finance/v3}IntuitAnyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesRep", propOrder = {
    "nameOf",
    "active",
    "employeeRef",
    "vendorRef",
    "otherNameRef",
    "initials",
    "salesRepEx"
})
public class SalesRep
    extends IntuitEntity
    implements Serializable, Equals, HashCode
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "NameOf")
    protected SalesRepTypeEnum nameOf;
    @XmlElement(name = "Active")
    protected Boolean active;
    @XmlElement(name = "EmployeeRef")
    protected ReferenceType employeeRef;
    @XmlElement(name = "VendorRef")
    protected ReferenceType vendorRef;
    @XmlElement(name = "OtherNameRef")
    protected ReferenceType otherNameRef;
    @XmlElement(name = "Initials")
    protected String initials;
    @XmlElement(name = "SalesRepEx")
    protected IntuitAnyType salesRepEx;

    /**
     * Gets the value of the nameOf property.
     * 
     * @return
     *     possible object is
     *     {@link SalesRepTypeEnum }
     *     
     */
    public SalesRepTypeEnum getNameOf() {
        return nameOf;
    }

    /**
     * Sets the value of the nameOf property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesRepTypeEnum }
     *     
     */
    public void setNameOf(SalesRepTypeEnum value) {
        this.nameOf = value;
    }

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActive(Boolean value) {
        this.active = value;
    }

    /**
     * Gets the value of the employeeRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getEmployeeRef() {
        return employeeRef;
    }

    /**
     * Sets the value of the employeeRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setEmployeeRef(ReferenceType value) {
        this.employeeRef = value;
    }

    /**
     * Gets the value of the vendorRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getVendorRef() {
        return vendorRef;
    }

    /**
     * Sets the value of the vendorRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setVendorRef(ReferenceType value) {
        this.vendorRef = value;
    }

    /**
     * Gets the value of the otherNameRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getOtherNameRef() {
        return otherNameRef;
    }

    /**
     * Sets the value of the otherNameRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setOtherNameRef(ReferenceType value) {
        this.otherNameRef = value;
    }

    /**
     * Gets the value of the initials property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitials() {
        return initials;
    }

    /**
     * Sets the value of the initials property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitials(String value) {
        this.initials = value;
    }

    /**
     * Gets the value of the salesRepEx property.
     * 
     * @return
     *     possible object is
     *     {@link IntuitAnyType }
     *     
     */
    public IntuitAnyType getSalesRepEx() {
        return salesRepEx;
    }

    /**
     * Sets the value of the salesRepEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntuitAnyType }
     *     
     */
    public void setSalesRepEx(IntuitAnyType value) {
        this.salesRepEx = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SalesRep)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final SalesRep that = ((SalesRep) object);
        {
            SalesRepTypeEnum lhsNameOf;
            lhsNameOf = this.getNameOf();
            SalesRepTypeEnum rhsNameOf;
            rhsNameOf = that.getNameOf();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nameOf", lhsNameOf), LocatorUtils.property(thatLocator, "nameOf", rhsNameOf), lhsNameOf, rhsNameOf)) {
                return false;
            }
        }
        {
            Boolean lhsActive;
            lhsActive = this.isActive();
            Boolean rhsActive;
            rhsActive = that.isActive();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "active", lhsActive), LocatorUtils.property(thatLocator, "active", rhsActive), lhsActive, rhsActive)) {
                return false;
            }
        }
        {
            ReferenceType lhsEmployeeRef;
            lhsEmployeeRef = this.getEmployeeRef();
            ReferenceType rhsEmployeeRef;
            rhsEmployeeRef = that.getEmployeeRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "employeeRef", lhsEmployeeRef), LocatorUtils.property(thatLocator, "employeeRef", rhsEmployeeRef), lhsEmployeeRef, rhsEmployeeRef)) {
                return false;
            }
        }
        {
            ReferenceType lhsVendorRef;
            lhsVendorRef = this.getVendorRef();
            ReferenceType rhsVendorRef;
            rhsVendorRef = that.getVendorRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vendorRef", lhsVendorRef), LocatorUtils.property(thatLocator, "vendorRef", rhsVendorRef), lhsVendorRef, rhsVendorRef)) {
                return false;
            }
        }
        {
            ReferenceType lhsOtherNameRef;
            lhsOtherNameRef = this.getOtherNameRef();
            ReferenceType rhsOtherNameRef;
            rhsOtherNameRef = that.getOtherNameRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "otherNameRef", lhsOtherNameRef), LocatorUtils.property(thatLocator, "otherNameRef", rhsOtherNameRef), lhsOtherNameRef, rhsOtherNameRef)) {
                return false;
            }
        }
        {
            String lhsInitials;
            lhsInitials = this.getInitials();
            String rhsInitials;
            rhsInitials = that.getInitials();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "initials", lhsInitials), LocatorUtils.property(thatLocator, "initials", rhsInitials), lhsInitials, rhsInitials)) {
                return false;
            }
        }
        {
            IntuitAnyType lhsSalesRepEx;
            lhsSalesRepEx = this.getSalesRepEx();
            IntuitAnyType rhsSalesRepEx;
            rhsSalesRepEx = that.getSalesRepEx();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "salesRepEx", lhsSalesRepEx), LocatorUtils.property(thatLocator, "salesRepEx", rhsSalesRepEx), lhsSalesRepEx, rhsSalesRepEx)) {
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
        int currentHashCode = super.hashCode(locator, strategy);
        {
            SalesRepTypeEnum theNameOf;
            theNameOf = this.getNameOf();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "nameOf", theNameOf), currentHashCode, theNameOf);
        }
        {
            Boolean theActive;
            theActive = this.isActive();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "active", theActive), currentHashCode, theActive);
        }
        {
            ReferenceType theEmployeeRef;
            theEmployeeRef = this.getEmployeeRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "employeeRef", theEmployeeRef), currentHashCode, theEmployeeRef);
        }
        {
            ReferenceType theVendorRef;
            theVendorRef = this.getVendorRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vendorRef", theVendorRef), currentHashCode, theVendorRef);
        }
        {
            ReferenceType theOtherNameRef;
            theOtherNameRef = this.getOtherNameRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "otherNameRef", theOtherNameRef), currentHashCode, theOtherNameRef);
        }
        {
            String theInitials;
            theInitials = this.getInitials();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "initials", theInitials), currentHashCode, theInitials);
        }
        {
            IntuitAnyType theSalesRepEx;
            theSalesRepEx = this.getSalesRepEx();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "salesRepEx", theSalesRepEx), currentHashCode, theSalesRepEx);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
