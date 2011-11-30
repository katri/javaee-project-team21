package ee.itcollege.example.entities;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.tostring.RooToString;

@Entity
@RooToString
@RooEntity
public class AdminUnit {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

    private String name;
    
    private String code;

    private String comment;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date fromDate;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date untilDate;
    
    private String openedBy;
    
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date openedDate;
    
    private String changedBy;
    
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date changedDate;
    
    private String closedBy;
    
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date closedDate;

	@OneToMany(mappedBy = "adminUnit")
	private Collection<Regiment> regiments;

	@ManyToOne
	private AdminUnitType adminUnitType;

	@OneToMany(mappedBy = "adminUnit")
	private Collection<AdminUnitHierarchy> adminUnitHierarchys;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getUntilDate() {
		return untilDate;
	}

	public void setUntilDate(Date untilDate) {
		this.untilDate = untilDate;
	}

	public String getOpenedBy() {
		return openedBy;
	}

	public void setOpenedBy(String openedBy) {
		this.openedBy = openedBy;
	}

	public Date getOpenedDate() {
		return openedDate;
	}

	public void setOpenedDate(Date openedDate) {
		this.openedDate = openedDate;
	}

	public String getChangedBy() {
		return changedBy;
	}

	public void setChangedBy(String changedBy) {
		this.changedBy = changedBy;
	}

	public Date getChangedDate() {
		return changedDate;
	}

	public void setChangedDate(Date changedDate) {
		this.changedDate = changedDate;
	}

	public String getClosedBy() {
		return closedBy;
	}

	public void setClosedBy(String closedBy) {
		this.closedBy = closedBy;
	}

	public Date getClosedDate() {
		return closedDate;
	}

	public void setClosedDate(Date closedDate) {
		this.closedDate = closedDate;
	}

	public Collection<Regiment> getRegiments() {
	    return regiments;
	}

	public void setRegiments(Collection<Regiment> param) {
	    this.regiments = param;
	}

	public AdminUnitType getAdminUnitType() {
	    return adminUnitType;
	}

	public void setAdminUnitType(AdminUnitType param) {
	    this.adminUnitType = param;
	}

	public Collection<AdminUnitHierarchy> getAdminUnitHierarchys() {
	    return adminUnitHierarchys;
	}

	public void setAdminUnitHierarchys(Collection<AdminUnitHierarchy> param) {
	    this.adminUnitHierarchys = param;
	}
}
