package com.mani.pcfrest;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;


	@Entity
	@Table(name = "orders")
	@XmlRootElement
	/*@NamedQueries({
	    @NamedQuery(name = "Orders.findAll", query = "SELECT u FROM orders u"),
	    @NamedQuery(name = "Orders.findByUserId", query = "SELECT u FROM orders u WHERE u.userId = :userId")
	})*/
	public class Orders implements Serializable {
	    private static final long serialVersionUID = 1L;
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "order_id")
	    private Integer orderId;
	    
	    @NotNull
	    @Size(min = 1, max = 50)
	    @Column(name = "ordername")
	    private String orderName;
	    
	    @NotNull	   
	    @Column(name = "quantity")
	    private Integer quantity;

	    public Orders() {
	    }

	    public Orders(Integer orderId) {
	        this.orderId = orderId;
	    }

	    public Orders(Integer orderId, String orderName) {
	        this.orderId = orderId;
	        this.orderName = orderName;
	    }

	    public Integer getOrderId() {
	        return orderId;
	    }

	    public void setOrderId(Integer orderId) {
	        this.orderId = orderId;
	    }

		public String getOrderName() {
			return orderName;
		}

		public void setOrderName(String orderName) {
			this.orderName = orderName;
		}

		public Integer getQuantity() {
			return quantity;
		}
		
		public void setQuantity(Integer quantity){
			this.quantity=quantity;
			
		}

		
		

	}



