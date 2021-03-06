/**
 * This file is part of mycollab-services.
 *
 * mycollab-services is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * mycollab-services is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with mycollab-services.  If not, see <http://www.gnu.org/licenses/>.
 */
/*Domain class of table s_tag*/
package com.mycollab.common.domain;

import com.mycollab.core.arguments.ValuedBean;
import com.mycollab.db.metadata.Column;
import com.mycollab.db.metadata.Table;
import java.util.Date;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Length;

@SuppressWarnings("ucd")
@Table("s_tag")
public class Tag extends ValuedBean {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_tag.id
     *
     * @mbg.generated Sun Dec 25 21:30:02 ICT 2016
     */
    @Column("id")
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_tag.name
     *
     * @mbg.generated Sun Dec 25 21:30:02 ICT 2016
     */
    @Length(max=100, message="Field value is too long")
    @Column("name")
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_tag.type
     *
     * @mbg.generated Sun Dec 25 21:30:02 ICT 2016
     */
    @Length(max=45, message="Field value is too long")
    @Column("type")
    private String type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_tag.typeid
     *
     * @mbg.generated Sun Dec 25 21:30:02 ICT 2016
     */
    @Length(max=100, message="Field value is too long")
    @Column("typeid")
    private String typeid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_tag.sAccountId
     *
     * @mbg.generated Sun Dec 25 21:30:02 ICT 2016
     */
    @Column("sAccountId")
    private Integer saccountid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_tag.extraTypeId
     *
     * @mbg.generated Sun Dec 25 21:30:02 ICT 2016
     */
    @Column("extraTypeId")
    private Integer extratypeid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_tag.createdTime
     *
     * @mbg.generated Sun Dec 25 21:30:02 ICT 2016
     */
    @Column("createdTime")
    private Date createdtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_tag.createdUser
     *
     * @mbg.generated Sun Dec 25 21:30:02 ICT 2016
     */
    @Length(max=45, message="Field value is too long")
    @Column("createdUser")
    private String createduser;

    private static final long serialVersionUID = 1;

    public final boolean equals(Object obj) {
        if (obj == null) { return false;}
        if (obj == this) { return true;}
        if (!obj.getClass().isAssignableFrom(getClass())) { return false;}
        Tag item = (Tag)obj;
        return new EqualsBuilder().append(id, item.id).build();
    }

    public final int hashCode() {
        return new HashCodeBuilder(1891, 1253).append(id).build();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_tag.id
     *
     * @return the value of s_tag.id
     *
     * @mbg.generated Sun Dec 25 21:30:02 ICT 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_tag.id
     *
     * @param id the value for s_tag.id
     *
     * @mbg.generated Sun Dec 25 21:30:02 ICT 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_tag.name
     *
     * @return the value of s_tag.name
     *
     * @mbg.generated Sun Dec 25 21:30:02 ICT 2016
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_tag.name
     *
     * @param name the value for s_tag.name
     *
     * @mbg.generated Sun Dec 25 21:30:02 ICT 2016
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_tag.type
     *
     * @return the value of s_tag.type
     *
     * @mbg.generated Sun Dec 25 21:30:02 ICT 2016
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_tag.type
     *
     * @param type the value for s_tag.type
     *
     * @mbg.generated Sun Dec 25 21:30:02 ICT 2016
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_tag.typeid
     *
     * @return the value of s_tag.typeid
     *
     * @mbg.generated Sun Dec 25 21:30:02 ICT 2016
     */
    public String getTypeid() {
        return typeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_tag.typeid
     *
     * @param typeid the value for s_tag.typeid
     *
     * @mbg.generated Sun Dec 25 21:30:02 ICT 2016
     */
    public void setTypeid(String typeid) {
        this.typeid = typeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_tag.sAccountId
     *
     * @return the value of s_tag.sAccountId
     *
     * @mbg.generated Sun Dec 25 21:30:02 ICT 2016
     */
    public Integer getSaccountid() {
        return saccountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_tag.sAccountId
     *
     * @param saccountid the value for s_tag.sAccountId
     *
     * @mbg.generated Sun Dec 25 21:30:02 ICT 2016
     */
    public void setSaccountid(Integer saccountid) {
        this.saccountid = saccountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_tag.extraTypeId
     *
     * @return the value of s_tag.extraTypeId
     *
     * @mbg.generated Sun Dec 25 21:30:02 ICT 2016
     */
    public Integer getExtratypeid() {
        return extratypeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_tag.extraTypeId
     *
     * @param extratypeid the value for s_tag.extraTypeId
     *
     * @mbg.generated Sun Dec 25 21:30:02 ICT 2016
     */
    public void setExtratypeid(Integer extratypeid) {
        this.extratypeid = extratypeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_tag.createdTime
     *
     * @return the value of s_tag.createdTime
     *
     * @mbg.generated Sun Dec 25 21:30:02 ICT 2016
     */
    public Date getCreatedtime() {
        return createdtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_tag.createdTime
     *
     * @param createdtime the value for s_tag.createdTime
     *
     * @mbg.generated Sun Dec 25 21:30:02 ICT 2016
     */
    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_tag.createdUser
     *
     * @return the value of s_tag.createdUser
     *
     * @mbg.generated Sun Dec 25 21:30:02 ICT 2016
     */
    public String getCreateduser() {
        return createduser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_tag.createdUser
     *
     * @param createduser the value for s_tag.createdUser
     *
     * @mbg.generated Sun Dec 25 21:30:02 ICT 2016
     */
    public void setCreateduser(String createduser) {
        this.createduser = createduser;
    }

    public enum Field {
        id,
        name,
        type,
        typeid,
        saccountid,
        extratypeid,
        createdtime,
        createduser;

        public boolean equalTo(Object value) {
            return name().equals(value);
        }
    }
}