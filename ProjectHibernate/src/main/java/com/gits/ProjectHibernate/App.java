package com.gits.ProjectHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App 
{
    public static void main( String[] args )
    {
        EmployeeD detail = new EmployeeD();
        detail.setEid(104);
        detail.setEname("Sanjay");
        detail.setEnative("Kerela");
        
        Configuration con = new Configuration().configure().addAnnotatedClass(EmployeeD.class);
        
        
        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
        SessionFactory sf = con.buildSessionFactory(reg);
        
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        session.save(detail);
        tx.commit();
    }
}
