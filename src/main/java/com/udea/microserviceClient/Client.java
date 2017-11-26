package com.udea.microserviceClient;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
class Client implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    private String clientName;
    private String clientLastName;
    private String clientEmail;
    

    @Override
    public String toString() {
        return "A client{"
                + "id:" + id
                + ", clientnName='" + clientName + '\''
                + ", clientnName='" + clientLastName + '\''
                + ", clientnName='" + clientEmail + '\''
                + '}';
    }

    public Client() {
    }

    public Client(String clientName, String clientLastName, String clientEmail) {
        this.clientName = clientName;
        this.clientLastName = clientLastName;
        this.clientEmail = clientEmail;
    }

    public String getClientLastName() {
        return clientLastName;
    }

    public void setClientLastName(String clientLastName) {
        this.clientLastName = clientLastName;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

   
    public Long getId() {
        return id;
    }

    public String getClientName() {
        return clientName;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }
}
