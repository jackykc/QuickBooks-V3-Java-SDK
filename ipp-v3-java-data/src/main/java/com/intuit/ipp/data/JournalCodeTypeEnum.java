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

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JournalCodeTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="JournalCodeTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Expenses"/>
 *     &lt;enumeration value="Sales"/>
 *     &lt;enumeration value="Bank"/>
 *     &lt;enumeration value="Nouveaux"/>
 *     &lt;enumeration value="Wages"/>
 *     &lt;enumeration value="Cash"/>
 *     &lt;enumeration value="Others"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "JournalCodeTypeEnum")
@XmlEnum
public enum JournalCodeTypeEnum {

    @XmlEnumValue("Expenses")
    EXPENSES("Expenses"),
    @XmlEnumValue("Sales")
    SALES("Sales"),
    @XmlEnumValue("Bank")
    BANK("Bank"),
    @XmlEnumValue("Nouveaux")
    NOUVEAUX("Nouveaux"),
    @XmlEnumValue("Wages")
    WAGES("Wages"),
    @XmlEnumValue("Cash")
    CASH("Cash"),
    @XmlEnumValue("Others")
    OTHERS("Others");
    private final String value;

    JournalCodeTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static JournalCodeTypeEnum fromValue(String v) {
        for (JournalCodeTypeEnum c: JournalCodeTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
