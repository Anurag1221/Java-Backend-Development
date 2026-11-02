package com.kodewala.interfacee;
//Functional interface
public interface IInvoice {
	
	public abstract void doinvoice(); //public
}

class InvoiceIMP implements IInvoice{
	
	public void doinvoice() {
		
		System.out.println("InvoiceIMP.doinvoice()");
	}
}
