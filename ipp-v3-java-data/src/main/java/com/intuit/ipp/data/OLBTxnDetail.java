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
import java.util.Date;
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
 * Describes OLBTransaction instance - one per
 * 				transaction downloaded
 * 
 * <p>Java class for OLBTxnDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OLBTxnDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PostDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="TxnDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TxnStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OLBTxnDetail", propOrder = {
    "postDate",
    "txnDate",
    "amount",
    "referenceNumber",
    "txnStatus"
})
public class OLBTxnDetail
    implements Serializable, Equals, HashCode
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "PostDate", type = String.class)
    @XmlJavaTypeAdapter(DateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date postDate;
    @XmlElement(name = "TxnDate", type = String.class)
    @XmlJavaTypeAdapter(DateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date txnDate;
    @XmlElement(name = "Amount")
    protected BigDecimal amount;
    @XmlElement(name = "ReferenceNumber")
    protected String referenceNumber;
    @XmlElement(name = "TxnStatus")
    protected String txnStatus;

    /**
     * Gets the value of the postDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getPostDate() {
        return postDate;
    }

    /**
     * Sets the value of the postDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostDate(Date value) {
        this.postDate = value;
    }

    /**
     * Gets the value of the txnDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getTxnDate() {
        return txnDate;
    }

    /**
     * Sets the value of the txnDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxnDate(Date value) {
        this.txnDate = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the referenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceNumber() {
        return referenceNumber;
    }

    /**
     * Sets the value of the referenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceNumber(String value) {
        this.referenceNumber = value;
    }

    /**
     * Gets the value of the txnStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxnStatus() {
        return txnStatus;
    }

    /**
     * Sets the value of the txnStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxnStatus(String value) {
        this.txnStatus = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof OLBTxnDetail)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final OLBTxnDetail that = ((OLBTxnDetail) object);
        {
            Date lhsPostDate;
            lhsPostDate = this.getPostDate();
            Date rhsPostDate;
            rhsPostDate = that.getPostDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "postDate", lhsPostDate), LocatorUtils.property(thatLocator, "postDate", rhsPostDate), lhsPostDate, rhsPostDate)) {
                return false;
            }
        }
        {
            Date lhsTxnDate;
            lhsTxnDate = this.getTxnDate();
            Date rhsTxnDate;
            rhsTxnDate = that.getTxnDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "txnDate", lhsTxnDate), LocatorUtils.property(thatLocator, "txnDate", rhsTxnDate), lhsTxnDate, rhsTxnDate)) {
                return false;
            }
        }
        {
            BigDecimal lhsAmount;
            lhsAmount = this.getAmount();
            BigDecimal rhsAmount;
            rhsAmount = that.getAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "amount", lhsAmount), LocatorUtils.property(thatLocator, "amount", rhsAmount), lhsAmount, rhsAmount)) {
                return false;
            }
        }
        {
            String lhsReferenceNumber;
            lhsReferenceNumber = this.getReferenceNumber();
            String rhsReferenceNumber;
            rhsReferenceNumber = that.getReferenceNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "referenceNumber", lhsReferenceNumber), LocatorUtils.property(thatLocator, "referenceNumber", rhsReferenceNumber), lhsReferenceNumber, rhsReferenceNumber)) {
                return false;
            }
        }
        {
            String lhsTxnStatus;
            lhsTxnStatus = this.getTxnStatus();
            String rhsTxnStatus;
            rhsTxnStatus = that.getTxnStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "txnStatus", lhsTxnStatus), LocatorUtils.property(thatLocator, "txnStatus", rhsTxnStatus), lhsTxnStatus, rhsTxnStatus)) {
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
            Date thePostDate;
            thePostDate = this.getPostDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "postDate", thePostDate), currentHashCode, thePostDate);
        }
        {
            Date theTxnDate;
            theTxnDate = this.getTxnDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "txnDate", theTxnDate), currentHashCode, theTxnDate);
        }
        {
            BigDecimal theAmount;
            theAmount = this.getAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "amount", theAmount), currentHashCode, theAmount);
        }
        {
            String theReferenceNumber;
            theReferenceNumber = this.getReferenceNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "referenceNumber", theReferenceNumber), currentHashCode, theReferenceNumber);
        }
        {
            String theTxnStatus;
            theTxnStatus = this.getTxnStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "txnStatus", theTxnStatus), currentHashCode, theTxnStatus);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
