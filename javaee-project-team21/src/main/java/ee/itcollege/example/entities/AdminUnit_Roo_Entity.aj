// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package ee.itcollege.example.entities;

import ee.itcollege.example.entities.AdminUnit;
import java.lang.Integer;
import java.lang.Long;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Version;
import org.springframework.transaction.annotation.Transactional;

privileged aspect AdminUnit_Roo_Entity {
    
    @PersistenceContext
    transient EntityManager AdminUnit.entityManager;
    
    @Version
    @Column(name = "version")
    private Integer AdminUnit.version;
    
    public Long AdminUnit.getId() {
        return this.id;
    }
    
    public void AdminUnit.setId(Long id) {
        this.id = id;
    }
    
    public Integer AdminUnit.getVersion() {
        return this.version;
    }
    
    public void AdminUnit.setVersion(Integer version) {
        this.version = version;
    }
    
    @Transactional
    public void AdminUnit.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void AdminUnit.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            AdminUnit attached = AdminUnit.findAdminUnit(this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void AdminUnit.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void AdminUnit.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public AdminUnit AdminUnit.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        AdminUnit merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
    public static final EntityManager AdminUnit.entityManager() {
        EntityManager em = new AdminUnit().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long AdminUnit.countAdminUnits() {
        return entityManager().createQuery("SELECT COUNT(o) FROM AdminUnit o", Long.class).getSingleResult();
    }
    
    public static List<AdminUnit> AdminUnit.findAllAdminUnits() {
        return entityManager().createQuery("SELECT o FROM AdminUnit o", AdminUnit.class).getResultList();
    }
    
    public static AdminUnit AdminUnit.findAdminUnit(Long id) {
        if (id == null) return null;
        return entityManager().find(AdminUnit.class, id);
    }
    
    public static List<AdminUnit> AdminUnit.findAdminUnitEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM AdminUnit o", AdminUnit.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
}
