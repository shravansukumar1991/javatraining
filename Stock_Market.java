package demo;

import java.io.IOException;

public class Stock_Market {
String Company;
int CurrPrice;
int YestPrice;
int Growth;


Stock_Market(){
	Company="";
	CurrPrice=0;
	YestPrice=0;
	Growth=0;
}

public void setDetails (String Company, int CurrPrice, int YestPrice) {
    this.Company = Company;
	this.CurrPrice = CurrPrice;
    this.YestPrice = YestPrice;
    this.Growth = CurrPrice-YestPrice;
}

public void printSMDetails() {
	System.out.println (this.Company+","+ this.CurrPrice+","+ this.YestPrice+","+this.Growth);
}

}