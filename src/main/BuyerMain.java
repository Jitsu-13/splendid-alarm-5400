package main;

import usecases.BuyItemUseCase;
import usecases.BuyerLoginUsecase;
import usecases.BuyerRegistrationUseCase;
import usecases.SearchItembyCategoryListUseCase;

public class BuyerMain {

    public static boolean BuyerLogin(){
        BuyerLoginUsecase login=new BuyerLoginUsecase();
        boolean result=login.BuyerLogin();
        return result;
    }
    public static void BuyerRegistration(){
        BuyerRegistrationUseCase register=new BuyerRegistrationUseCase();
        register.BuyerRegistraion();
    }
    public static void SearchItemCategory(){
        SearchItembyCategoryListUseCase searchItembyCategoryListUseCase=new SearchItembyCategoryListUseCase();
        searchItembyCategoryListUseCase.searchItemCategory();
    }
    public static void BuyItem(){
        BuyItemUseCase buyItemUseCase=new BuyItemUseCase();
        buyItemUseCase.buyitem();
    }
}
