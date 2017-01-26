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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.intuit.sb.cdm.util.v3.DateAdapter;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * Defines Company Accounting Prefs details
 * 			
 * 
 * <p>Java class for CompanyAccountingPrefs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompanyAccountingPrefs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UseAccountNumbers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DefaultARAccount" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/>
 *         &lt;element name="DefaultAPAccount" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/>
 *         &lt;element name="RequiresAccounts" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TrackDepartments" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DepartmentTerminology" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClassTrackingPerTxn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ClassTrackingPerTxnLine" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AutoJournalEntryNumber" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FirstMonthOfFiscalYear" type="{http://schema.intuit.com/finance/v3}MonthEnum" minOccurs="0"/>
 *         &lt;element name="TaxYearMonth" type="{http://schema.intuit.com/finance/v3}MonthEnum" minOccurs="0"/>
 *         &lt;element name="TaxForm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BookCloseDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="OtherContactInfo" type="{http://schema.intuit.com/finance/v3}ContactInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CustomerTerminology" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanyAccountingPrefs", propOrder = {
    "useAccountNumbers",
    "defaultARAccount",
    "defaultAPAccount",
    "requiresAccounts",
    "trackDepartments",
    "departmentTerminology",
    "classTrackingPerTxn",
    "classTrackingPerTxnLine",
    "autoJournalEntryNumber",
    "firstMonthOfFiscalYear",
    "taxYearMonth",
    "taxForm",
    "bookCloseDate",
    "otherContactInfo",
    "customerTerminology"
})
public class CompanyAccountingPrefs
    implements Serializable, Equals, HashCode
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "UseAccountNumbers")
    protected Boolean useAccountNumbers;
    @XmlElement(name = "DefaultARAccount")
    protected ReferenceType defaultARAccount;
    @XmlElement(name = "DefaultAPAccount")
    protected ReferenceType defaultAPAccount;
    @XmlElement(name = "RequiresAccounts")
    protected Boolean requiresAccounts;
    @XmlElement(name = "TrackDepartments")
    protected Boolean trackDepartments;
    @XmlElement(name = "DepartmentTerminology")
    protected String departmentTerminology;
    @XmlElement(name = "ClassTrackingPerTxn")
    protected Boolean classTrackingPerTxn;
    @XmlElement(name = "ClassTrackingPerTxnLine")
    protected Boolean classTrackingPerTxnLine;
    @XmlElement(name = "AutoJournalEntryNumber")
    protected Boolean autoJournalEntryNumber;
    @XmlElement(name = "FirstMonthOfFiscalYear")
    protected MonthEnum firstMonthOfFiscalYear;
    @XmlElement(name = "TaxYearMonth")
    protected MonthEnum taxYearMonth;
    @XmlElement(name = "TaxForm")
    protected String taxForm;
    @XmlElement(name = "BookCloseDate", type = String.class)
    @XmlJavaTypeAdapter(DateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date bookCloseDate;
    @XmlElement(name = "OtherContactInfo")
    protected List<ContactInfo> otherContactInfo;
    @XmlElement(name = "CustomerTerminology")
    protected String customerTerminology;

    /**
     * Gets the value of the useAccountNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseAccountNumbers() {
        return useAccountNumbers;
    }

    /**
     * Sets the value of the useAccountNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseAccountNumbers(Boolean value) {
        this.useAccountNumbers = value;
    }

    /**
     * Gets the value of the defaultARAccount property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getDefaultARAccount() {
        return defaultARAccount;
    }

    /**
     * Sets the value of the defaultARAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setDefaultARAccount(ReferenceType value) {
        this.defaultARAccount = value;
    }

    /**
     * Gets the value of the defaultAPAccount property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getDefaultAPAccount() {
        return defaultAPAccount;
    }

    /**
     * Sets the value of the defaultAPAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setDefaultAPAccount(ReferenceType value) {
        this.defaultAPAccount = value;
    }

    /**
     * Gets the value of the requiresAccounts property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequiresAccounts() {
        return requiresAccounts;
    }

    /**
     * Sets the value of the requiresAccounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequiresAccounts(Boolean value) {
        this.requiresAccounts = value;
    }

    /**
     * Gets the value of the trackDepartments property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTrackDepartments() {
        return trackDepartments;
    }

    /**
     * Sets the value of the trackDepartments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTrackDepartments(Boolean value) {
        this.trackDepartments = value;
    }

    /**
     * Gets the value of the departmentTerminology property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartmentTerminology() {
        return departmentTerminology;
    }

    /**
     * Sets the value of the departmentTerminology property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartmentTerminology(String value) {
        this.departmentTerminology = value;
    }

    /**
     * Gets the value of the classTrackingPerTxn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClassTrackingPerTxn() {
        return classTrackingPerTxn;
    }

    /**
     * Sets the value of the classTrackingPerTxn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClassTrackingPerTxn(Boolean value) {
        this.classTrackingPerTxn = value;
    }

    /**
     * Gets the value of the classTrackingPerTxnLine property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClassTrackingPerTxnLine() {
        return classTrackingPerTxnLine;
    }

    /**
     * Sets the value of the classTrackingPerTxnLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClassTrackingPerTxnLine(Boolean value) {
        this.classTrackingPerTxnLine = value;
    }

    /**
     * Gets the value of the autoJournalEntryNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoJournalEntryNumber() {
        return autoJournalEntryNumber;
    }

    /**
     * Sets the value of the autoJournalEntryNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoJournalEntryNumber(Boolean value) {
        this.autoJournalEntryNumber = value;
    }

    /**
     * Gets the value of the firstMonthOfFiscalYear property.
     * 
     * @return
     *     possible object is
     *     {@link MonthEnum }
     *     
     */
    public MonthEnum getFirstMonthOfFiscalYear() {
        return firstMonthOfFiscalYear;
    }

    /**
     * Sets the value of the firstMonthOfFiscalYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonthEnum }
     *     
     */
    public void setFirstMonthOfFiscalYear(MonthEnum value) {
        this.firstMonthOfFiscalYear = value;
    }

    /**
     * Gets the value of the taxYearMonth property.
     * 
     * @return
     *     possible object is
     *     {@link MonthEnum }
     *     
     */
    public MonthEnum getTaxYearMonth() {
        return taxYearMonth;
    }

    /**
     * Sets the value of the taxYearMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonthEnum }
     *     
     */
    public void setTaxYearMonth(MonthEnum value) {
        this.taxYearMonth = value;
    }

    /**
     * Gets the value of the taxForm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxForm() {
        return taxForm;
    }

    /**
     * Sets the value of the taxForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxForm(String value) {
        this.taxForm = value;
    }

    /**
     * Gets the value of the bookCloseDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getBookCloseDate() {
        return bookCloseDate;
    }

    /**
     * Sets the value of the bookCloseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookCloseDate(Date value) {
        this.bookCloseDate = value;
    }

    /**
     * Gets the value of the otherContactInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherContactInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherContactInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactInfo }
     * 
     * 
     */
    public List<ContactInfo> getOtherContactInfo() {
        if (otherContactInfo == null) {
            otherContactInfo = new ArrayList<ContactInfo>();
        }
        return this.otherContactInfo;
    }

    /**
     * Gets the value of the customerTerminology property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerTerminology() {
        return customerTerminology;
    }

    /**
     * Sets the value of the customerTerminology property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerTerminology(String value) {
        this.customerTerminology = value;
    }

    /**
     * Sets the value of the otherContactInfo property.
     * 
     * @param otherContactInfo
     *     allowed object is
     *     {@link ContactInfo }
     *     
     */
    public void setOtherContactInfo(List<ContactInfo> otherContactInfo) {
        this.otherContactInfo = otherContactInfo;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof CompanyAccountingPrefs)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final CompanyAccountingPrefs that = ((CompanyAccountingPrefs) object);
        {
            Boolean lhsUseAccountNumbers;
            lhsUseAccountNumbers = this.isUseAccountNumbers();
            Boolean rhsUseAccountNumbers;
            rhsUseAccountNumbers = that.isUseAccountNumbers();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "useAccountNumbers", lhsUseAccountNumbers), LocatorUtils.property(thatLocator, "useAccountNumbers", rhsUseAccountNumbers), lhsUseAccountNumbers, rhsUseAccountNumbers)) {
                return false;
            }
        }
        {
            ReferenceType lhsDefaultARAccount;
            lhsDefaultARAccount = this.getDefaultARAccount();
            ReferenceType rhsDefaultARAccount;
            rhsDefaultARAccount = that.getDefaultARAccount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "defaultARAccount", lhsDefaultARAccount), LocatorUtils.property(thatLocator, "defaultARAccount", rhsDefaultARAccount), lhsDefaultARAccount, rhsDefaultARAccount)) {
                return false;
            }
        }
        {
            ReferenceType lhsDefaultAPAccount;
            lhsDefaultAPAccount = this.getDefaultAPAccount();
            ReferenceType rhsDefaultAPAccount;
            rhsDefaultAPAccount = that.getDefaultAPAccount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "defaultAPAccount", lhsDefaultAPAccount), LocatorUtils.property(thatLocator, "defaultAPAccount", rhsDefaultAPAccount), lhsDefaultAPAccount, rhsDefaultAPAccount)) {
                return false;
            }
        }
        {
            Boolean lhsRequiresAccounts;
            lhsRequiresAccounts = this.isRequiresAccounts();
            Boolean rhsRequiresAccounts;
            rhsRequiresAccounts = that.isRequiresAccounts();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requiresAccounts", lhsRequiresAccounts), LocatorUtils.property(thatLocator, "requiresAccounts", rhsRequiresAccounts), lhsRequiresAccounts, rhsRequiresAccounts)) {
                return false;
            }
        }
        {
            Boolean lhsTrackDepartments;
            lhsTrackDepartments = this.isTrackDepartments();
            Boolean rhsTrackDepartments;
            rhsTrackDepartments = that.isTrackDepartments();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "trackDepartments", lhsTrackDepartments), LocatorUtils.property(thatLocator, "trackDepartments", rhsTrackDepartments), lhsTrackDepartments, rhsTrackDepartments)) {
                return false;
            }
        }
        {
            String lhsDepartmentTerminology;
            lhsDepartmentTerminology = this.getDepartmentTerminology();
            String rhsDepartmentTerminology;
            rhsDepartmentTerminology = that.getDepartmentTerminology();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "departmentTerminology", lhsDepartmentTerminology), LocatorUtils.property(thatLocator, "departmentTerminology", rhsDepartmentTerminology), lhsDepartmentTerminology, rhsDepartmentTerminology)) {
                return false;
            }
        }
        {
            Boolean lhsClassTrackingPerTxn;
            lhsClassTrackingPerTxn = this.isClassTrackingPerTxn();
            Boolean rhsClassTrackingPerTxn;
            rhsClassTrackingPerTxn = that.isClassTrackingPerTxn();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "classTrackingPerTxn", lhsClassTrackingPerTxn), LocatorUtils.property(thatLocator, "classTrackingPerTxn", rhsClassTrackingPerTxn), lhsClassTrackingPerTxn, rhsClassTrackingPerTxn)) {
                return false;
            }
        }
        {
            Boolean lhsClassTrackingPerTxnLine;
            lhsClassTrackingPerTxnLine = this.isClassTrackingPerTxnLine();
            Boolean rhsClassTrackingPerTxnLine;
            rhsClassTrackingPerTxnLine = that.isClassTrackingPerTxnLine();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "classTrackingPerTxnLine", lhsClassTrackingPerTxnLine), LocatorUtils.property(thatLocator, "classTrackingPerTxnLine", rhsClassTrackingPerTxnLine), lhsClassTrackingPerTxnLine, rhsClassTrackingPerTxnLine)) {
                return false;
            }
        }
        {
            Boolean lhsAutoJournalEntryNumber;
            lhsAutoJournalEntryNumber = this.isAutoJournalEntryNumber();
            Boolean rhsAutoJournalEntryNumber;
            rhsAutoJournalEntryNumber = that.isAutoJournalEntryNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "autoJournalEntryNumber", lhsAutoJournalEntryNumber), LocatorUtils.property(thatLocator, "autoJournalEntryNumber", rhsAutoJournalEntryNumber), lhsAutoJournalEntryNumber, rhsAutoJournalEntryNumber)) {
                return false;
            }
        }
        {
            MonthEnum lhsFirstMonthOfFiscalYear;
            lhsFirstMonthOfFiscalYear = this.getFirstMonthOfFiscalYear();
            MonthEnum rhsFirstMonthOfFiscalYear;
            rhsFirstMonthOfFiscalYear = that.getFirstMonthOfFiscalYear();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "firstMonthOfFiscalYear", lhsFirstMonthOfFiscalYear), LocatorUtils.property(thatLocator, "firstMonthOfFiscalYear", rhsFirstMonthOfFiscalYear), lhsFirstMonthOfFiscalYear, rhsFirstMonthOfFiscalYear)) {
                return false;
            }
        }
        {
            MonthEnum lhsTaxYearMonth;
            lhsTaxYearMonth = this.getTaxYearMonth();
            MonthEnum rhsTaxYearMonth;
            rhsTaxYearMonth = that.getTaxYearMonth();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxYearMonth", lhsTaxYearMonth), LocatorUtils.property(thatLocator, "taxYearMonth", rhsTaxYearMonth), lhsTaxYearMonth, rhsTaxYearMonth)) {
                return false;
            }
        }
        {
            String lhsTaxForm;
            lhsTaxForm = this.getTaxForm();
            String rhsTaxForm;
            rhsTaxForm = that.getTaxForm();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxForm", lhsTaxForm), LocatorUtils.property(thatLocator, "taxForm", rhsTaxForm), lhsTaxForm, rhsTaxForm)) {
                return false;
            }
        }
        {
            Date lhsBookCloseDate;
            lhsBookCloseDate = this.getBookCloseDate();
            Date rhsBookCloseDate;
            rhsBookCloseDate = that.getBookCloseDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bookCloseDate", lhsBookCloseDate), LocatorUtils.property(thatLocator, "bookCloseDate", rhsBookCloseDate), lhsBookCloseDate, rhsBookCloseDate)) {
                return false;
            }
        }
        {
            List<ContactInfo> lhsOtherContactInfo;
            lhsOtherContactInfo = (((this.otherContactInfo!= null)&&(!this.otherContactInfo.isEmpty()))?this.getOtherContactInfo():null);
            List<ContactInfo> rhsOtherContactInfo;
            rhsOtherContactInfo = (((that.otherContactInfo!= null)&&(!that.otherContactInfo.isEmpty()))?that.getOtherContactInfo():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "otherContactInfo", lhsOtherContactInfo), LocatorUtils.property(thatLocator, "otherContactInfo", rhsOtherContactInfo), lhsOtherContactInfo, rhsOtherContactInfo)) {
                return false;
            }
        }
        {
            String lhsCustomerTerminology;
            lhsCustomerTerminology = this.getCustomerTerminology();
            String rhsCustomerTerminology;
            rhsCustomerTerminology = that.getCustomerTerminology();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "customerTerminology", lhsCustomerTerminology), LocatorUtils.property(thatLocator, "customerTerminology", rhsCustomerTerminology), lhsCustomerTerminology, rhsCustomerTerminology)) {
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
            Boolean theUseAccountNumbers;
            theUseAccountNumbers = this.isUseAccountNumbers();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "useAccountNumbers", theUseAccountNumbers), currentHashCode, theUseAccountNumbers);
        }
        {
            ReferenceType theDefaultARAccount;
            theDefaultARAccount = this.getDefaultARAccount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "defaultARAccount", theDefaultARAccount), currentHashCode, theDefaultARAccount);
        }
        {
            ReferenceType theDefaultAPAccount;
            theDefaultAPAccount = this.getDefaultAPAccount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "defaultAPAccount", theDefaultAPAccount), currentHashCode, theDefaultAPAccount);
        }
        {
            Boolean theRequiresAccounts;
            theRequiresAccounts = this.isRequiresAccounts();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requiresAccounts", theRequiresAccounts), currentHashCode, theRequiresAccounts);
        }
        {
            Boolean theTrackDepartments;
            theTrackDepartments = this.isTrackDepartments();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "trackDepartments", theTrackDepartments), currentHashCode, theTrackDepartments);
        }
        {
            String theDepartmentTerminology;
            theDepartmentTerminology = this.getDepartmentTerminology();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "departmentTerminology", theDepartmentTerminology), currentHashCode, theDepartmentTerminology);
        }
        {
            Boolean theClassTrackingPerTxn;
            theClassTrackingPerTxn = this.isClassTrackingPerTxn();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "classTrackingPerTxn", theClassTrackingPerTxn), currentHashCode, theClassTrackingPerTxn);
        }
        {
            Boolean theClassTrackingPerTxnLine;
            theClassTrackingPerTxnLine = this.isClassTrackingPerTxnLine();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "classTrackingPerTxnLine", theClassTrackingPerTxnLine), currentHashCode, theClassTrackingPerTxnLine);
        }
        {
            Boolean theAutoJournalEntryNumber;
            theAutoJournalEntryNumber = this.isAutoJournalEntryNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "autoJournalEntryNumber", theAutoJournalEntryNumber), currentHashCode, theAutoJournalEntryNumber);
        }
        {
            MonthEnum theFirstMonthOfFiscalYear;
            theFirstMonthOfFiscalYear = this.getFirstMonthOfFiscalYear();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "firstMonthOfFiscalYear", theFirstMonthOfFiscalYear), currentHashCode, theFirstMonthOfFiscalYear);
        }
        {
            MonthEnum theTaxYearMonth;
            theTaxYearMonth = this.getTaxYearMonth();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxYearMonth", theTaxYearMonth), currentHashCode, theTaxYearMonth);
        }
        {
            String theTaxForm;
            theTaxForm = this.getTaxForm();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxForm", theTaxForm), currentHashCode, theTaxForm);
        }
        {
            Date theBookCloseDate;
            theBookCloseDate = this.getBookCloseDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bookCloseDate", theBookCloseDate), currentHashCode, theBookCloseDate);
        }
        {
            List<ContactInfo> theOtherContactInfo;
            theOtherContactInfo = (((this.otherContactInfo!= null)&&(!this.otherContactInfo.isEmpty()))?this.getOtherContactInfo():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "otherContactInfo", theOtherContactInfo), currentHashCode, theOtherContactInfo);
        }
        {
            String theCustomerTerminology;
            theCustomerTerminology = this.getCustomerTerminology();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "customerTerminology", theCustomerTerminology), currentHashCode, theCustomerTerminology);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
