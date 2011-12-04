package ee.itcollege.example.entities;

import java.util.Date;

/*
import javax.persistence.EntityManager;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.MappedSuperclass;
import javax.persistence.PersistenceContext;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.tostring.RooToString;
import org.springframework.transaction.annotation.Transactional;


@MappedSuperclass
@RooToString
@Transactional
@RooEntity(mappedSuperclass = true)
*/

	public class GeneralFunctions {
	
		public static final Date notDeleted = new Date(253402207200000L);
		
		public static Date effectiveDate() {
		return new Date();

	}
    
		public Date getDateTime() {
			//DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			Date dateNow = new Date();
			return dateNow;
        }
    
	
	
	
	
	/*
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
    protected String closedBy;
    
    //@Temporal(TemporalType.TIMESTAMP)
    @NotNull
    @DateTimeFormat(style = "M-")
    protected Date closedDate = notDeleted;
    
    protected String getClosedBy() {
		return closedBy;
	}

    protected void setClosedBy(String closedBy) {
		this.closedBy = closedBy;
	}

    protected Date getClosedDate() {
		return closedDate;
	}

    protected void setClosedDate(Date closedDate) {
		this.closedDate = closedDate;
	}
		
    @PersistenceContext
    transient EntityManager entityManager;
	
	@Transactional
	public GeneralFunctions merge() {
		if (this.entityManager == null)
			this.entityManager = entityManager();

		if (this.id != null && !entityManager.contains(this)) {
			GeneralFunctions oldEntity = entityManager().find(getClass(), id);
//	if (getCreated() == null)
//	setCreated(oldEntity.getCreated());
//	if (getCreatedBy() == null)
//	setCreatedBy(oldEntity.getCreatedBy());
			if (getClosedDate() == null)
				setClosedDate(oldEntity.getClosedDate());
			if (getClosedBy() == null)
				setClosedBy(oldEntity.getClosedBy());

		}
		GeneralFunctions merged = this.entityManager.merge(this);
		this.entityManager.flush();
		return merged;
	}
	
	*/
	

	
	
	
}
