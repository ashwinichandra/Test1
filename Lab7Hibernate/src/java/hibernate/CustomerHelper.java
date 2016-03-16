/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author ashwiniramachandra
 */
public class CustomerHelper {
    
    
    
    Session session = null;

    public CustomerHelper() {
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
    }

public List getCustomerNames() {
    List<Customer> custList = null;
    try {
        org.hibernate.Transaction tx = session.beginTransaction();
        Query q = session.createQuery ("from Customer as cs ");
        custList = (List<Customer>) q.list();
    } catch (Exception e) {
        e.printStackTrace();
    }
    return custList;
}

    
}
