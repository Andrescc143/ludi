package co.com.ludi.model.sportsCenter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SportsCenter {
    private String id;
    private String name;
    private String description;
    private int statusCode;
    private String address;
    private String phone;
    private String website;
    private String facebook;
    private String instagram;
    private String whatsapp;
}
