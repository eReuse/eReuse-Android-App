package org.ereuse.scanner.services.api;

public interface ApiServices {

    String METHOD_LOGIN = "login";
    String METHOD_DEVICE = "device";
    String METHOD_LOCATE = "locate";
    String METHOD_RECEIVE = "receive";
    String METHOD_RECYCLE = "recycle";
    String METHOD_PLACE = "place";
    String METHOD_EVENTS = "events";
    // TODO Add other API methods

    ApiResponse execute(String method, ApiRequest request) throws ApiException;

}