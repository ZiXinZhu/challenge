package com.zzx.insert.curl;

import org.apache.commons.codec.binary.Base64;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

/**
 *
 */
public class CurlReplace {
    public static void main(String[] args) {
        String encoding = Base64.encodeBase64String("username:password".getBytes());
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Basic " + encoding);
        headers.setContentType(MediaType.APPLICATION_JSON);

        String data = "{ \"name\": \"TestSystem\", \"auto_init\": true, \"private\": true, \"gitignore_template\": \"nanoc\" }";
        String url = "http://192.168.11.187:8080/users/sign_in";

        HttpEntity<String> entity = new HttpEntity<>(data, headers);
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
        System.out.println(response.getBody());
    }
}
