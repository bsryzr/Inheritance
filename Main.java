package inheritance;

public class Main {
       //bir class ne yapabiliyorsa sadece onu yapmalı
	public static void main(String[] args) {
		// iki tane sınıfın var,ikisinde de ortak bazı özellikler var,iki kere ayrı ayrı sınıflara yazmayız
        //Customer customer = new Customer();
       // customer.id=1;
        //customer.firstName="Engin";
        //customer.nationalIdentity="100000";
      //  customer.customerNumber="1323";
        //customer.companyName=... bir kişinin şirket ismi olamaz,kod buna izin veriyorsa hatalıdır.
        
		
		IndividualCustomer engin = new IndividualCustomer();
		
		
		CorporateCustomer hepsiburada = new CorporateCustomer();
		
		
		
		
		
		
		
		
		
	}

}
