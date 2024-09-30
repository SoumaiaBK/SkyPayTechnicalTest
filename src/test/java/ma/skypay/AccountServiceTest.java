package ma.skypay;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import ma.skypay.service.serviceImpl.AccountServiceImpl;

class AccountServiceTest {

	@InjectMocks
	private AccountServiceImpl accountServiceImpl;

	@BeforeEach
	public void init() {
		MockitoAnnotations.openMocks(this);
	}

	@Test
	void depositTest() {
		// Given
		int initialBalance = 0;
		int depositAmount = 1000;

		// When
		accountServiceImpl.deposit(depositAmount);

		// Then
		int expectedBalance = initialBalance + depositAmount;
		assertEquals(expectedBalance, accountServiceImpl.getBalance());

	}

	@Test
	void withdrowTest() {
		// Given
		accountServiceImpl.deposit(2000);
		int withdrowAmount = 500;

		// When
		accountServiceImpl.withdrow(withdrowAmount);

		// Then
		int expectedBalance = 1500;
		assertEquals(expectedBalance, accountServiceImpl.getBalance());

	}

}
