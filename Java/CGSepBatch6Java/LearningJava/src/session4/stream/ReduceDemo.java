package session4.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class Invoice
{
	String invoiceNo;
	Double price;
	Double qty;
	public Invoice(String invoiceNo, Double price, Double qty) {
		super();
		this.invoiceNo = invoiceNo;
		this.price = price;
		this.qty = qty;
	}
	public String getInvoiceNo() {
		return invoiceNo;
	}
	public Double getPrice() {
		return price;
	}
	public Double getQty() {
		return qty;
	}
	
	
}
public class ReduceDemo {

	public static void main(String[] args) {
		List<Invoice> invoices=Arrays.asList(
				new Invoice("A001",567.23,2.0),
				new Invoice("A002",50.23,12.0),
				new Invoice("A003",67.23,20.0));
		Optional<Double> sum=invoices.stream().map(x->x.getQty()*x.getPrice())
				.reduce((a,b)->a+b);
		System.out.println(sum);

	}

}
