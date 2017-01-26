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
 * 				Product: ALL
 * 				Description: JournalEntry detail for a
 * 				transaction line.
 * 			
 * 
 * <p>Java class for JournalEntryLineDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JournalEntryLineDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PostingType" type="{http://schema.intuit.com/finance/v3}PostingTypeEnum" minOccurs="0"/>
 *         &lt;element name="Entity" type="{http://schema.intuit.com/finance/v3}EntityTypeRef" minOccurs="0"/>
 *         &lt;element name="AccountRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/>
 *         &lt;element name="ClassRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/>
 *         &lt;element name="DepartmentRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/>
 *         &lt;element name="TaxCodeRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/>
 *         &lt;element name="TaxApplicableOn" type="{http://schema.intuit.com/finance/v3}TaxApplicableOnEnum" minOccurs="0"/>
 *         &lt;element name="TaxAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="BillableStatus" type="{http://schema.intuit.com/finance/v3}BillableStatusEnum" minOccurs="0"/>
 *         &lt;element name="JournalCodeRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/>
 *         &lt;element name="JournalEntryLineDetailEx" type="{http://schema.intuit.com/finance/v3}IntuitAnyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JournalEntryLineDetail", propOrder = {
    "postingType",
    "entity",
    "accountRef",
    "classRef",
    "departmentRef",
    "taxCodeRef",
    "taxApplicableOn",
    "taxAmount",
    "billableStatus",
    "journalCodeRef",
    "journalEntryLineDetailEx"
})
public class JournalEntryLineDetail
    implements Serializable, Equals, HashCode
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "PostingType")
    protected PostingTypeEnum postingType;
    @XmlElement(name = "Entity")
    protected EntityTypeRef entity;
    @XmlElement(name = "AccountRef")
    protected ReferenceType accountRef;
    @XmlElement(name = "ClassRef")
    protected ReferenceType classRef;
    @XmlElement(name = "DepartmentRef")
    protected ReferenceType departmentRef;
    @XmlElement(name = "TaxCodeRef")
    protected ReferenceType taxCodeRef;
    @XmlElement(name = "TaxApplicableOn")
    protected TaxApplicableOnEnum taxApplicableOn;
    @XmlElement(name = "TaxAmount")
    protected BigDecimal taxAmount;
    @XmlElement(name = "BillableStatus")
    protected BillableStatusEnum billableStatus;
    @XmlElement(name = "JournalCodeRef")
    protected ReferenceType journalCodeRef;
    @XmlElement(name = "JournalEntryLineDetailEx")
    protected IntuitAnyType journalEntryLineDetailEx;

    /**
     * Gets the value of the postingType property.
     * 
     * @return
     *     possible object is
     *     {@link PostingTypeEnum }
     *     
     */
    public PostingTypeEnum getPostingType() {
        return postingType;
    }

    /**
     * Sets the value of the postingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostingTypeEnum }
     *     
     */
    public void setPostingType(PostingTypeEnum value) {
        this.postingType = value;
    }

    /**
     * Gets the value of the entity property.
     * 
     * @return
     *     possible object is
     *     {@link EntityTypeRef }
     *     
     */
    public EntityTypeRef getEntity() {
        return entity;
    }

    /**
     * Sets the value of the entity property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityTypeRef }
     *     
     */
    public void setEntity(EntityTypeRef value) {
        this.entity = value;
    }

    /**
     * Gets the value of the accountRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getAccountRef() {
        return accountRef;
    }

    /**
     * Sets the value of the accountRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setAccountRef(ReferenceType value) {
        this.accountRef = value;
    }

    /**
     * Gets the value of the classRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getClassRef() {
        return classRef;
    }

    /**
     * Sets the value of the classRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setClassRef(ReferenceType value) {
        this.classRef = value;
    }

    /**
     * Gets the value of the departmentRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getDepartmentRef() {
        return departmentRef;
    }

    /**
     * Sets the value of the departmentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setDepartmentRef(ReferenceType value) {
        this.departmentRef = value;
    }

    /**
     * Gets the value of the taxCodeRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getTaxCodeRef() {
        return taxCodeRef;
    }

    /**
     * Sets the value of the taxCodeRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setTaxCodeRef(ReferenceType value) {
        this.taxCodeRef = value;
    }

    /**
     * Gets the value of the taxApplicableOn property.
     * 
     * @return
     *     possible object is
     *     {@link TaxApplicableOnEnum }
     *     
     */
    public TaxApplicableOnEnum getTaxApplicableOn() {
        return taxApplicableOn;
    }

    /**
     * Sets the value of the taxApplicableOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxApplicableOnEnum }
     *     
     */
    public void setTaxApplicableOn(TaxApplicableOnEnum value) {
        this.taxApplicableOn = value;
    }

    /**
     * Gets the value of the taxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxAmount() {
        return taxAmount;
    }

    /**
     * Sets the value of the taxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxAmount(BigDecimal value) {
        this.taxAmount = value;
    }

    /**
     * Gets the value of the billableStatus property.
     * 
     * @return
     *     possible object is
     *     {@link BillableStatusEnum }
     *     
     */
    public BillableStatusEnum getBillableStatus() {
        return billableStatus;
    }

    /**
     * Sets the value of the billableStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillableStatusEnum }
     *     
     */
    public void setBillableStatus(BillableStatusEnum value) {
        this.billableStatus = value;
    }

    /**
     * Gets the value of the journalCodeRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getJournalCodeRef() {
        return journalCodeRef;
    }

    /**
     * Sets the value of the journalCodeRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setJournalCodeRef(ReferenceType value) {
        this.journalCodeRef = value;
    }

    /**
     * Gets the value of the journalEntryLineDetailEx property.
     * 
     * @return
     *     possible object is
     *     {@link IntuitAnyType }
     *     
     */
    public IntuitAnyType getJournalEntryLineDetailEx() {
        return journalEntryLineDetailEx;
    }

    /**
     * Sets the value of the journalEntryLineDetailEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntuitAnyType }
     *     
     */
    public void setJournalEntryLineDetailEx(IntuitAnyType value) {
        this.journalEntryLineDetailEx = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof JournalEntryLineDetail)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final JournalEntryLineDetail that = ((JournalEntryLineDetail) object);
        {
            PostingTypeEnum lhsPostingType;
            lhsPostingType = this.getPostingType();
            PostingTypeEnum rhsPostingType;
            rhsPostingType = that.getPostingType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "postingType", lhsPostingType), LocatorUtils.property(thatLocator, "postingType", rhsPostingType), lhsPostingType, rhsPostingType)) {
                return false;
            }
        }
        {
            EntityTypeRef lhsEntity;
            lhsEntity = this.getEntity();
            EntityTypeRef rhsEntity;
            rhsEntity = that.getEntity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "entity", lhsEntity), LocatorUtils.property(thatLocator, "entity", rhsEntity), lhsEntity, rhsEntity)) {
                return false;
            }
        }
        {
            ReferenceType lhsAccountRef;
            lhsAccountRef = this.getAccountRef();
            ReferenceType rhsAccountRef;
            rhsAccountRef = that.getAccountRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "accountRef", lhsAccountRef), LocatorUtils.property(thatLocator, "accountRef", rhsAccountRef), lhsAccountRef, rhsAccountRef)) {
                return false;
            }
        }
        {
            ReferenceType lhsClassRef;
            lhsClassRef = this.getClassRef();
            ReferenceType rhsClassRef;
            rhsClassRef = that.getClassRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "classRef", lhsClassRef), LocatorUtils.property(thatLocator, "classRef", rhsClassRef), lhsClassRef, rhsClassRef)) {
                return false;
            }
        }
        {
            ReferenceType lhsDepartmentRef;
            lhsDepartmentRef = this.getDepartmentRef();
            ReferenceType rhsDepartmentRef;
            rhsDepartmentRef = that.getDepartmentRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "departmentRef", lhsDepartmentRef), LocatorUtils.property(thatLocator, "departmentRef", rhsDepartmentRef), lhsDepartmentRef, rhsDepartmentRef)) {
                return false;
            }
        }
        {
            ReferenceType lhsTaxCodeRef;
            lhsTaxCodeRef = this.getTaxCodeRef();
            ReferenceType rhsTaxCodeRef;
            rhsTaxCodeRef = that.getTaxCodeRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxCodeRef", lhsTaxCodeRef), LocatorUtils.property(thatLocator, "taxCodeRef", rhsTaxCodeRef), lhsTaxCodeRef, rhsTaxCodeRef)) {
                return false;
            }
        }
        {
            TaxApplicableOnEnum lhsTaxApplicableOn;
            lhsTaxApplicableOn = this.getTaxApplicableOn();
            TaxApplicableOnEnum rhsTaxApplicableOn;
            rhsTaxApplicableOn = that.getTaxApplicableOn();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxApplicableOn", lhsTaxApplicableOn), LocatorUtils.property(thatLocator, "taxApplicableOn", rhsTaxApplicableOn), lhsTaxApplicableOn, rhsTaxApplicableOn)) {
                return false;
            }
        }
        {
            BigDecimal lhsTaxAmount;
            lhsTaxAmount = this.getTaxAmount();
            BigDecimal rhsTaxAmount;
            rhsTaxAmount = that.getTaxAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxAmount", lhsTaxAmount), LocatorUtils.property(thatLocator, "taxAmount", rhsTaxAmount), lhsTaxAmount, rhsTaxAmount)) {
                return false;
            }
        }
        {
            BillableStatusEnum lhsBillableStatus;
            lhsBillableStatus = this.getBillableStatus();
            BillableStatusEnum rhsBillableStatus;
            rhsBillableStatus = that.getBillableStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "billableStatus", lhsBillableStatus), LocatorUtils.property(thatLocator, "billableStatus", rhsBillableStatus), lhsBillableStatus, rhsBillableStatus)) {
                return false;
            }
        }
        {
            ReferenceType lhsJournalCodeRef;
            lhsJournalCodeRef = this.getJournalCodeRef();
            ReferenceType rhsJournalCodeRef;
            rhsJournalCodeRef = that.getJournalCodeRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "journalCodeRef", lhsJournalCodeRef), LocatorUtils.property(thatLocator, "journalCodeRef", rhsJournalCodeRef), lhsJournalCodeRef, rhsJournalCodeRef)) {
                return false;
            }
        }
        {
            IntuitAnyType lhsJournalEntryLineDetailEx;
            lhsJournalEntryLineDetailEx = this.getJournalEntryLineDetailEx();
            IntuitAnyType rhsJournalEntryLineDetailEx;
            rhsJournalEntryLineDetailEx = that.getJournalEntryLineDetailEx();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "journalEntryLineDetailEx", lhsJournalEntryLineDetailEx), LocatorUtils.property(thatLocator, "journalEntryLineDetailEx", rhsJournalEntryLineDetailEx), lhsJournalEntryLineDetailEx, rhsJournalEntryLineDetailEx)) {
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
            PostingTypeEnum thePostingType;
            thePostingType = this.getPostingType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "postingType", thePostingType), currentHashCode, thePostingType);
        }
        {
            EntityTypeRef theEntity;
            theEntity = this.getEntity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "entity", theEntity), currentHashCode, theEntity);
        }
        {
            ReferenceType theAccountRef;
            theAccountRef = this.getAccountRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "accountRef", theAccountRef), currentHashCode, theAccountRef);
        }
        {
            ReferenceType theClassRef;
            theClassRef = this.getClassRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "classRef", theClassRef), currentHashCode, theClassRef);
        }
        {
            ReferenceType theDepartmentRef;
            theDepartmentRef = this.getDepartmentRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "departmentRef", theDepartmentRef), currentHashCode, theDepartmentRef);
        }
        {
            ReferenceType theTaxCodeRef;
            theTaxCodeRef = this.getTaxCodeRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxCodeRef", theTaxCodeRef), currentHashCode, theTaxCodeRef);
        }
        {
            TaxApplicableOnEnum theTaxApplicableOn;
            theTaxApplicableOn = this.getTaxApplicableOn();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxApplicableOn", theTaxApplicableOn), currentHashCode, theTaxApplicableOn);
        }
        {
            BigDecimal theTaxAmount;
            theTaxAmount = this.getTaxAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxAmount", theTaxAmount), currentHashCode, theTaxAmount);
        }
        {
            BillableStatusEnum theBillableStatus;
            theBillableStatus = this.getBillableStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "billableStatus", theBillableStatus), currentHashCode, theBillableStatus);
        }
        {
            ReferenceType theJournalCodeRef;
            theJournalCodeRef = this.getJournalCodeRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "journalCodeRef", theJournalCodeRef), currentHashCode, theJournalCodeRef);
        }
        {
            IntuitAnyType theJournalEntryLineDetailEx;
            theJournalEntryLineDetailEx = this.getJournalEntryLineDetailEx();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "journalEntryLineDetailEx", theJournalEntryLineDetailEx), currentHashCode, theJournalEntryLineDetailEx);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
