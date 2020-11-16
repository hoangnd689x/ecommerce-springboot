package vn.bosch.ecommerce.service;

public interface SecurityService {
    String findLoggedInUsername();

    void autoLogin(String username, String password);
}