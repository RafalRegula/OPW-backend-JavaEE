/*
 * The MIT License
 *
 * Copyright 2015 Adam Kowalewski.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.adamkowalewski.opw.webservice.dto;

import com.google.common.base.MoreObjects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * DTO
 *
 * @author Adam Kowalewski
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class KandydatDto implements Serializable {

    private int pkwId;
    private String firstname, lastname;
    private int glosow;

    public KandydatDto() {
    }

    public KandydatDto(int pkwId, String firstname, String lastname) {
        this.pkwId = pkwId;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public KandydatDto(int pkwId, String firstname, String lastname, int glosow) {
        this.pkwId = pkwId;
        this.firstname = firstname;
        this.lastname = lastname;
        this.glosow = glosow;
    }

    public int getPkwId() {
        return pkwId;
    }

    public void setPkwId(int pkwId) {
        this.pkwId = pkwId;
    }

    public int getGlosow() {
        return glosow;
    }

    public void setGlosow(int glosow) {
        this.glosow = glosow;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "KandydatDto{" + "pkwId=" + pkwId
                + ", firstname=" + firstname
                + ", lastname=" + lastname
                + ", glosow=" + glosow + '}';
    }

}
