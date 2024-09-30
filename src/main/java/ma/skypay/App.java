package ma.skypay;

import ma.skypay.service.serviceImpl.AccountServiceImpl;

public class App 
{
    public static void main( String[] args )
    {
		AccountServiceImpl accountService = new AccountServiceImpl();
		accountService.deposit(1000);
		accountService.deposit(2000);
		accountService.withdrow(500);
		accountService.printStatement();
    }
}
