package com.thisteam.dangdangeat.vo;

import java.sql.Date;

/*
create view order_product_review_view as
	select ov.order_code order_code, ov.member_id member_id, ov.order_date order_date, ov.pay_number pay_number, op.pro_code pro_code, op.order_stock order_stock, op.review_status review_status, op.review_code review_code
		from admin_order_list_view ov
		    left outer join order_product op
		    on ov.order_code = op.order_code
			where order_status = 1
		    order by order_code, pro_code;

order_code	int	NO			
member_id	varchar(20)	YES			
order_date	date	YES			
pay_number	int	NO			
pro_code	int	YES			
order_stock	int	YES			
review_status	int	YES		0	
review_code	int	YES			

 */

public class Order_product_review_viewVO {

	private int order_code;
	private String member_id;
	private Date order_date;
	private int pay_number;
	private int pro_code;
	private int order_stock;
	private int review_status;
	private int review_code;
	
	public int getOrder_code() {
		return order_code;
	}
	public void setOrder_code(int order_code) {
		this.order_code = order_code;
	}
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public Date getOrder_date() {
		return order_date;
	}
	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
	}
	public int getPay_number() {
		return pay_number;
	}
	public void setPay_number(int pay_number) {
		this.pay_number = pay_number;
	}
	public int getPro_code() {
		return pro_code;
	}
	public void setPro_code(int pro_code) {
		this.pro_code = pro_code;
	}
	public int getOrder_stock() {
		return order_stock;
	}
	public void setOrder_stock(int order_stock) {
		this.order_stock = order_stock;
	}
	public int getReview_status() {
		return review_status;
	}
	public void setReview_status(int review_status) {
		this.review_status = review_status;
	}
	public int getReview_code() {
		return review_code;
	}
	public void setReview_code(int review_code) {
		this.review_code = review_code;
	}
	
	@Override
	public String toString() {
		return "Order_product_review_viewVO [order_code=" + order_code + ", member_id=" + member_id + ", order_date="
				+ order_date + ", pay_number=" + pay_number + ", pro_code=" + pro_code + ", order_stock=" + order_stock
				+ ", review_status=" + review_status + ", review_code=" + review_code + "]";
	}
	
}
