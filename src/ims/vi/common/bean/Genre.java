/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ims.vi.common.bean;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Alex
 */
@Entity
@Table(name = "VI_GENRE_T")
@XmlType(name = "Genre", namespace = "http://www.pccw.com/")
@XmlRootElement(name = "Genre", namespace = "http://www.pccw.com/")
public class Genre implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "GENRE_CODE", nullable = false)
    private String genreCode;
    @Column(name = "NAME_ENG", nullable = false)
    private String nameEng;
    @Column(name = "NAME_CHI", nullable = false)
    private String nameChi;
    @Column(name = "DESC_ENG")
    private String descEng;
    @Column(name = "DESC_CHI")
    private String descChi;
    @Column(name = "IMAGE_FILENAME_ENG", nullable = false)
    private String imageFilenameEng;
    @Column(name = "IMAGE_FILENAME_CHI", nullable = false)
    private String imageFilenameChi;
    @Column(name = "STATUS", nullable = false)
    private String status;
    @Column(name = "MODIFIED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;
    @Column(name = "MODIFIED_BY")
    private String modifiedBy;
    @Column(name = "CREATED_DATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
    @Column(name = "CREATED_BY", nullable = false)
    private String createdBy;
    @Column(name = "DISPLAY_ORDER")
    private Short displayOrder;
    @Column(name = "DISPLAY_ZONE_FIRST")
    private String displayZoneFirst;
    @Column(name = "IS_RESTRICTED")
    private String isRestricted;

    public Genre() {
    }

    public Genre(String genreCode) {
        this.genreCode = genreCode;
    }

    public Genre(String genreCode, String nameEng, String nameChi, String imageFilenameEng, String imageFilenameChi, String status, Date createdDate, String createdBy) {
        this.genreCode = genreCode;
        this.nameEng = nameEng;
        this.nameChi = nameChi;
        this.imageFilenameEng = imageFilenameEng;
        this.imageFilenameChi = imageFilenameChi;
        this.status = status;
        this.createdDate = createdDate;
        this.createdBy = createdBy;
    }

    public String getGenreCode() {
        return genreCode;
    }

    public void setGenreCode(String genreCode) {
        this.genreCode = genreCode;
    }

    public String getNameEng() {
        return nameEng;
    }

    public void setNameEng(String nameEng) {
        this.nameEng = nameEng;
    }

    public String getNameChi() {
        return nameChi;
    }

    public void setNameChi(String nameChi) {
        this.nameChi = nameChi;
    }

    public String getDescEng() {
        return descEng;
    }

    public void setDescEng(String descEng) {
        this.descEng = descEng;
    }

    public String getDescChi() {
        return descChi;
    }

    public void setDescChi(String descChi) {
        this.descChi = descChi;
    }

    public String getImageFilenameEng() {
        return imageFilenameEng;
    }

    public void setImageFilenameEng(String imageFilenameEng) {
        this.imageFilenameEng = imageFilenameEng;
    }

    public String getImageFilenameChi() {
        return imageFilenameChi;
    }

    public void setImageFilenameChi(String imageFilenameChi) {
        this.imageFilenameChi = imageFilenameChi;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Short getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(Short displayOrder) {
        this.displayOrder = displayOrder;
    }

    public String getDisplayZoneFirst() {
        return displayZoneFirst;
    }

    public void setDisplayZoneFirst(String displayZoneFirst) {
        this.displayZoneFirst = displayZoneFirst;
    }

    public String getIsRestricted() {
        return isRestricted;
    }

    public void setIsRestricted(String isRestricted) {
        this.isRestricted = isRestricted;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (genreCode != null ? genreCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Genre)) {
            return false;
        }
        Genre other = (Genre) object;
        if ((this.genreCode == null && other.genreCode != null) || (this.genreCode != null && !this.genreCode.equals(other.genreCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.ViGenreT[genreCode=" + genreCode + "]";
    }

}
