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
 * Transaction recording a payment from the customer
 * 				held in the Undeposited Funds account into the Bank account.
 * 			
 * 
 * <p>Java class for Deposit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Deposit">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.intuit.com/finance/v3}Transaction">
 *       &lt;sequence>
 *         &lt;element name="DepositToAccountRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/>
 *         &lt;element name="CashBack" type="{http://schema.intuit.com/finance/v3}CashBackInfo" minOccurs="0"/>
 *         &lt;element name="GlobalTaxCalculation" type="{http://schema.intuit.com/finance/v3}GlobalTaxCalculationEnum" minOccurs="0"/>
 *         &lt;element name="TotalAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="HomeTotalAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DepositEx" type="{http://schema.intuit.com/finance/v3}IntuitAnyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Deposit", propOrder = {
    "depositToAccountRef",
    "cashBack",
    "globalTaxCalculation",
    "totalAmt",
    "homeTotalAmt",
    "depositEx"
})
public class Deposit
    extends Transaction
    implements Serializable, Equals, HashCode
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "DepositToAccountRef")
    protected ReferenceType depositToAccountRef;
    @XmlElement(name = "CashBack")
    protected CashBackInfo cashBack;
    @XmlElement(name = "GlobalTaxCalculation")
    protected GlobalTaxCalculationEnum globalTaxCalculation;
    @XmlElement(name = "TotalAmt")
    protected BigDecimal totalAmt;
    @XmlElement(name = "HomeTotalAmt")
    protected BigDecimal homeTotalAmt;
    @XmlElement(name = "DepositEx")
    protected IntuitAnyType depositEx;

    /**
     * Gets the value of the depositToAccountRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getDepositToAccountRef() {
        return depositToAccountRef;
    }

    /**
     * Sets the value of the depositToAccountRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setDepositToAccountRef(ReferenceType value) {
        this.depositToAccountRef = value;
    }

    /**
     * Gets the value of the cashBack property.
     * 
     * @return
     *     possible object is
     *     {@link CashBackInfo }
     *     
     */
    public CashBackInfo getCashBack() {
        return cashBack;
    }

    /**
     * Sets the value of the cashBack property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashBackInfo }
     *     
     */
    public void setCashBack(CashBackInfo value) {
        this.cashBack = value;
    }

    /**
     * Gets the value of the globalTaxCalculation property.
     * 
     * @return
     *     possible object is
     *     {@link GlobalTaxCalculationEnum }
     *     
     */
    public GlobalTaxCalculationEnum getGlobalTaxCalculation() {
        return globalTaxCalculation;
    }

    /**
     * Sets the value of the globalTaxCalculation property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalTaxCalculationEnum }
     *     
     */
    public void setGlobalTaxCalculation(GlobalTaxCalculationEnum value) {
        this.globalTaxCalculation = value;
    }

    /**
     * Gets the value of the totalAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalAmt() {
        return totalAmt;
    }

    /**
     * Sets the value of the totalAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalAmt(BigDecimal value) {
        this.totalAmt = value;
    }

    /**
     * Gets the value of the homeTotalAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHomeTotalAmt() {
        return homeTotalAmt;
    }

    /**
     * Sets the value of the homeTotalAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHomeTotalAmt(BigDecimal value) {
        this.homeTotalAmt = value;
    }

    /**
     * Gets the value of the depositEx property.
     * 
     * @return
     *     possible object is
     *     {@link IntuitAnyType }
     *     
     */
    public IntuitAnyType getDepositEx() {
        return depositEx;
    }

    /**
     * Sets the value of the depositEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntuitAnyType }
     *     
     */
    public void setDepositEx(IntuitAnyType value) {
        this.depositEx = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Deposit)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final Deposit that = ((Deposit) object);
        {
            ReferenceType lhsDepositToAccountRef;
            lhsDepositToAccountRef = this.getDepositToAccountRef();
            ReferenceType rhsDepositToAccountRef;
            rhsDepositToAccountRef = that.getDepositToAccountRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "depositToAccountRef", lhsDepositToAccountRef), LocatorUtils.property(thatLocator, "depositToAccountRef", rhsDepositToAccountRef), lhsDepositToAccountRef, rhsDepositToAccountRef)) {
                return false;
            }
        }
        {
            CashBackInfo lhsCashBack;
            lhsCashBack = this.getCashBack();
            CashBackInfo rhsCashBack;
            rhsCashBack = that.getCashBack();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cashBack", lhsCashBack), LocatorUtils.property(thatLocator, "cashBack", rhsCashBack), lhsCashBack, rhsCashBack)) {
                return false;
            }
        }
        {
            GlobalTaxCalculationEnum lhsGlobalTaxCalculation;
            lhsGlobalTaxCalculation = this.getGlobalTaxCalculation();
            GlobalTaxCalculationEnum rhsGlobalTaxCalculation;
            rhsGlobalTaxCalculation = that.getGlobalTaxCalculation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "globalTaxCalculation", lhsGlobalTaxCalculation), LocatorUtils.property(thatLocator, "globalTaxCalculation", rhsGlobalTaxCalculation), lhsGlobalTaxCalculation, rhsGlobalTaxCalculation)) {
                return false;
            }
        }
        {
            BigDecimal lhsTotalAmt;
            lhsTotalAmt = this.getTotalAmt();
            BigDecimal rhsTotalAmt;
            rhsTotalAmt = that.getTotalAmt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "totalAmt", lhsTotalAmt), LocatorUtils.property(thatLocator, "totalAmt", rhsTotalAmt), lhsTotalAmt, rhsTotalAmt)) {
                return false;
            }
        }
        {
            BigDecimal lhsHomeTotalAmt;
            lhsHomeTotalAmt = this.getHomeTotalAmt();
            BigDecimal rhsHomeTotalAmt;
            rhsHomeTotalAmt = that.getHomeTotalAmt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "homeTotalAmt", lhsHomeTotalAmt), LocatorUtils.property(thatLocator, "homeTotalAmt", rhsHomeTotalAmt), lhsHomeTotalAmt, rhsHomeTotalAmt)) {
                return false;
            }
        }
        {
            IntuitAnyType lhsDepositEx;
            lhsDepositEx = this.getDepositEx();
            IntuitAnyType rhsDepositEx;
            rhsDepositEx = that.getDepositEx();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "depositEx", lhsDepositEx), LocatorUtils.property(thatLocator, "depositEx", rhsDepositEx), lhsDepositEx, rhsDepositEx)) {
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
            ReferenceType theDepositToAccountRef;
            theDepositToAccountRef = this.getDepositToAccountRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "depositToAccountRef", theDepositToAccountRef), currentHashCode, theDepositToAccountRef);
        }
        {
            CashBackInfo theCashBack;
            theCashBack = this.getCashBack();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cashBack", theCashBack), currentHashCode, theCashBack);
        }
        {
            GlobalTaxCalculationEnum theGlobalTaxCalculation;
            theGlobalTaxCalculation = this.getGlobalTaxCalculation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "globalTaxCalculation", theGlobalTaxCalculation), currentHashCode, theGlobalTaxCalculation);
        }
        {
            BigDecimal theTotalAmt;
            theTotalAmt = this.getTotalAmt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "totalAmt", theTotalAmt), currentHashCode, theTotalAmt);
        }
        {
            BigDecimal theHomeTotalAmt;
            theHomeTotalAmt = this.getHomeTotalAmt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "homeTotalAmt", theHomeTotalAmt), currentHashCode, theHomeTotalAmt);
        }
        {
            IntuitAnyType theDepositEx;
            theDepositEx = this.getDepositEx();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "depositEx", theDepositEx), currentHashCode, theDepositEx);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
