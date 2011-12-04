package ee.itcollege.example.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.tostring.RooToString;
import ee.itcollege.example.entities.AdminUnit;
import java.util.Collection;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import ee.itcollege.example.entities.AdminUnitTypeHierarchy;

@Entity
@RooToString
@RooEntity
public class AdminUnitType extends BaseEntity implements Serializable {
private static final long serialVersionUID = 1L;


//@Id
//@GeneratedValue(strategy = GenerationType.AUTO)
//private Long id;

	@Size(min=2, max=30)
	@NotNull
	private String name;
    
	@Size(min=1, max=10)
	@NotNull
	private String code;

	@Size(max=250)
	@NotNull
	private String comment;

	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date fromDate;

	@Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date untilDate;
       
    private String changedBy;
    
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date changedDate;
    
    private String closedBy;
    
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(style = "M-")
	private Date closedDate = GeneralFunctions.notDeleted;
	
	public Date getClosedDate() {
		return closedDate;
	}

	public void setClosedDate(Date closedDate) {
		this.closedDate = closedDate;
	}
	
  
	@OneToMany(mappedBy = "adminUnitType")
	private Collection<AdminUnit> adminUnits;

	@OneToMany(mappedBy = "adminUnitType")
	private Collection<AdminUnitTypeHierarchy> adminUnitTypeHierarchys;

	@OneToMany(mappedBy = "subAdminUnitType")
	private Collection<AdminUnitTypeHierarchy> subAdminUnitTypeHierarchys;


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


	public Collection<AdminUnit> getAdminUnits() {
	    return adminUnits;
	}

	public void setAdminUnits(Collection<AdminUnit> param) {
	    this.adminUnits = param;
	}

	public Collection<AdminUnitTypeHierarchy> getAdminUnitTypeHierarchys() {
	    return adminUnitTypeHierarchys;
	}

	public void setAdminUnitTypeHierarchys(Collection<AdminUnitTypeHierarchy> param) {
	    this.adminUnitTypeHierarchys = param;
	}
	

	public Collection<AdminUnitTypeHierarchy> getSubAdminUnitTypeHierarchys() {
	    return subAdminUnitTypeHierarchys;
	}

	public void setSubAdminUnitTypeHierarchys(Collection<AdminUnitTypeHierarchy> param) {
	    this.subAdminUnitTypeHierarchys = param;
	}
}
