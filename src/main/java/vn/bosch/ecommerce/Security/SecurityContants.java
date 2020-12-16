package vn.bosch.ecommerce.Security;

public interface SecurityContants {
    long EXPIRATION_TIME = 999999999;
    String TOKEN_PREFIX = "Bearer ";
    String HEADER_STRING = "Authorization";
    String SIGN_UP_URL = "/api/account/register";
    String TOKEN_SECRET = "HELLO_WORLD";
}
