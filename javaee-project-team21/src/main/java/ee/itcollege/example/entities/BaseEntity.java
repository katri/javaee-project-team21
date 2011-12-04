 package ee.itcollege.example.entities;

import java.util.Date;

import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.tostring.RooToString;
import org.springframework.security.core.context.SecurityContextHolder;

 @MappedSuperclass
 @RooToString
 @RooEntity(mappedSuperclass = true)
 //public class BaseEntity {
public abstract class BaseEntity {

	private String openedBy;

	@Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date openedDate = getDateTime();
	

	// getter & setter - ei muuda!
	
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

	
	@PrePersist
	public void setCreated() {
		String currentUser = SecurityContextHolder.getContext().getAuthentication().getName();
		setOpen(currentUser);
		//setModified(currentUser, now);
		//setTemporaryClosedDate();
	}
 
	private void setOpen(String user) {
		this.openedBy = user;
	}

	public Date getDateTime() {
		//DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date dateNow = new Date();
		return dateNow;
    }

	
	


	
	
}

    