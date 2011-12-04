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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.tostring.RooToString;

@Entity
@RooToString
@RooEntity

public class AdminUnit {
	// private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Size(min=2, max=30)
	@NotNull
	private String name;
    
	@Size(min=1, max=10)
	@NotNull
	private String code;

	@Size(min=2, max=250)
	private String comment;

	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date fromDate;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date untilDate;
    
    @NotNull
	private String openedBy;
    
    @NotNull
	@Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date openedDate;
    
    private String changedBy;
    
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date changedDate;
    
    private String closedBy;
    
   	@Temporal(TemporalType.TIMESTAMP)
    @NotNull
    @DateTimeFormat(style = "M-")
   	private Date closedDate;

	@OneToMany(mappedBy = "adminUnit")
	private Collection<Regiment> regiments;

	@ManyToOne
	private AdminUnitType adminUnitType;

	@OneToMany(mappedBy = "adminUnit")
	private Collection<AdminUnitHierarchy> adminUnitHierarchys;

	@OneToMany(mappedBy = "subUnit")
	private Collection<AdminUnitHierarchy> subUnitHierarchys;

	
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

	protected Date getChangedDate() {
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

	public Collection<AdminUnitHierarchy> getSubUnitHierarchys() {
		return subUnitHierarchys;
	}

	public void setSubUnitHierarchys(
			Collection<AdminUnitHierarchy> subUnitHierarchys) {
		this.subUnitHierarchys = subUnitHierarchys;
	}
	
/*	public static final Date notDeleted = new Date(253402207200000L);

	public static Date effectiveDate() {

	return new Date();

	}*/
}
