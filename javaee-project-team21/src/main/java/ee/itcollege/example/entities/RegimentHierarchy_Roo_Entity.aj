// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package ee.itcollege.example.entities;

import ee.itcollege.example.entities.RegimentHierarchy;
import java.lang.Integer;
import java.lang.Long;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Version;
import org.springframework.transaction.annotation.Transactional;

privileged aspect RegimentHierarchy_Roo_Entity {
    
    @PersistenceContext
    transient EntityManager RegimentHierarchy.entityManager;
    
    @Version
    @Column(name = "version")
    private Integer RegimentHierarchy.version;
    
    public Long RegimentHierarchy.getId() {
        return this.id;
    }
    
    public void RegimentHierarchy.setId(Long id) {
        this.id = id;
    }
    
    public Integer RegimentHierarchy.getVersion() {
        return this.version;
    }
    
    public void RegimentHierarchy.setVersion(Integer version) {
        this.version = version;
    }
    
    @Transactional
    public void RegimentHierarchy.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void RegimentHierarchy.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            RegimentHierarchy attached = RegimentHierarchy.findRegimentHierarchy(this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void RegimentHierarchy.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void RegimentHierarchy.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public RegimentHierarchy RegimentHierarchy.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        RegimentHierarchy merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
    public static final EntityManager RegimentHierarchy.entityManager() {
        EntityManager em = new RegimentHierarchy().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long RegimentHierarchy.countRegimentHierarchys() {
        return entityManager().createQuery("SELECT COUNT(o) FROM RegimentHierarchy o", Long.class).getSingleResult();
    }
    
    public static List<RegimentHierarchy> RegimentHierarchy.findAllRegimentHierarchys() {
        return entityManager().createQuery("SELECT o FROM RegimentHierarchy o", RegimentHierarchy.class).getResultList();
    }
    
    public static RegimentHierarchy RegimentHierarchy.findRegimentHierarchy(Long id) {
        if (id == null) return null;
        return entityManager().find(RegimentHierarchy.class, id);
    }
    
    public static List<RegimentHierarchy> RegimentHierarchy.findRegimentHierarchyEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM RegimentHierarchy o", RegimentHierarchy.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
}
